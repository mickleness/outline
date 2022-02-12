/**
 * This software is released as part of the Pumpernickel project.
 * 
 * All com.pump resources in the Pumpernickel project are distributed under the
 * MIT License:
 * https://raw.githubusercontent.com/mickleness/pumpernickel/master/License.txt
 * 
 * More information about the Pumpernickel project is available here:
 * https://mickleness.github.io/pumpernickel/
 */
package com.pump.math;

import java.util.ArrayList;
import java.util.List;

/**
 * This function evaluates a polynomial expression.
 */
public class PolynomialFunction {

	protected final double[] coeffs;

	/**
	 * Create a new <code>PolynomialFunction</code>.
	 * 
	 * @param coeffs
	 *            the coefficients of this polynomial. The first coefficient
	 *            corresponds to the highest power of x. So if coeffs is [2, 3,
	 *            4] then this function will evaluate as (2*t*t+3*t+4).
	 */
	public PolynomialFunction(double[] coeffs) {
		coeffs = trimLeadingZeroes(coeffs);
		this.coeffs = new double[coeffs.length];
		System.arraycopy(coeffs, 0, this.coeffs, 0, coeffs.length);
	}

	/**
	 * Return an array based on the argument with no trailing zeroes.
	 */
	private double[] trimLeadingZeroes(double[] coeffs) {
		int zeroCtr = 0;
		for(int a = 0; a < coeffs.length; a++) {
			if (coeffs[a] == 0) {
				zeroCtr++;
			} else {
				break;
			}
		}
		if (zeroCtr == 0)
			return coeffs;
		double[] newArray = new double[coeffs.length - zeroCtr];
		System.arraycopy(coeffs, zeroCtr, newArray, 0, newArray.length);
		return newArray;
	}

	public double evaluate(double x) {
		double result = coeffs[0];
		for (int a = 1, n = coeffs.length; a < n; a++) {
			result = result * x + coeffs[a];
		}
		return result;
	}

	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer("y = ");
		if (coeffs.length == 0) {
			sb.append("0");
		} else {
			for (int a = 0; a < coeffs.length; a++) {
				int degree = coeffs.length - a - 1;
				if (degree == 0) {
					sb.append(coeffs[a]);
				} else if (degree == 1) {
					sb.append(coeffs[a] + "*x");
				} else {
					sb.append(coeffs[a] + "*(x^" + (degree) + ")");
				}
				if (a != coeffs.length - 1)
					sb.append("+");
			}
		}
		return sb.toString();
	}

	public PolynomialFunction getDerivative() {
		double[] newCoeffs = new double[coeffs.length - 1];
		System.arraycopy(coeffs, 0, newCoeffs, 0, newCoeffs.length);
		for (int a = 0; a < newCoeffs.length; a++) {
			newCoeffs[a] *= (coeffs.length - a - 1);
		}
		return new PolynomialFunction(newCoeffs);
	}

	/**
	 * Solve this polynomial function by recursive exploring all the derivatives
	 * and strategically applying Newton's Method. This is imperfect, but a
	 * decent analytical guess.
	 */
	public double[] evaluateInverse(double y) {
		if (coeffs.length == 2) {
			double x = (y - coeffs[1]) / coeffs[0];
			return new double[] { x };
		}
		if (y != 0) {
			double[] newCoeffs = new double[coeffs.length];
			System.arraycopy(coeffs, 0, newCoeffs, 0, coeffs.length);
			newCoeffs[newCoeffs.length - 1] -= y;
			PolynomialFunction f = new PolynomialFunction(newCoeffs);
			return f.evaluateInverse(0);
		}

		PolynomialFunction derivative = getDerivative();

		double[] extrema = derivative.solve();
		double[] extremaYs = new double[extrema.length];
		for (int a = 0; a < extrema.length; a++) {
			extremaYs[a] = evaluate(extrema[a]);
		}

		double[] interest = new double[extrema.length + 2];
		double[] interestYs = new double[extrema.length + 2];

		System.arraycopy(extrema, 0, interest, 1, extrema.length);
		System.arraycopy(extremaYs, 0, interestYs, 1, extremaYs.length);

		// seek the first interesting time:
		boolean seekPositive;
		if (coeffs.length % 2 == 0) {
			// an odd-degree polynomial
			if (coeffs[0] < 0) {
				// with a negative leading coefficient

				// f(-infinity) = +infinity && f(+infinity) = -infinity
				seekPositive = true;
			} else {
				seekPositive = false;
			}
		} else {
			// an even-degree polynomial
			if (coeffs[0] < 0) {
				seekPositive = false;
			} else {
				seekPositive = true;
			}
		}

		double initialValue = extrema.length == 0 ? 0 : extrema[0];
		identifyBoundary: for (int power = 1; power < 30; power++) {
			double x = initialValue - Math.pow(10, power);
			double v = evaluate(x);
			if (seekPositive && v > 0) {
				interest[0] = x;
				interestYs[0] = v;
				break identifyBoundary;
			} else if (!seekPositive && v < 0) {
				interest[0] = x;
				interestYs[0] = v;
				break identifyBoundary;
			}
		}

		// seek the last interesting time:

		if (coeffs.length % 2 == 0) {
			// an odd-degree polynomial
			seekPositive = !seekPositive;
		} else {
			// leave seekPos as-is
		}

		initialValue = extrema.length == 0 ? 0 : extrema[extrema.length - 1];
		identifyBoundary: for (int power = 1; power < 30; power++) {
			double x = initialValue + Math.pow(10, power);
			double v = evaluate(x);
			if (seekPositive && v > 0) {
				interest[interest.length - 1] = x;
				interestYs[interest.length - 1] = v;
				break identifyBoundary;
			} else if (!seekPositive && v < 0) {
				interest[interest.length - 1] = x;
				interestYs[interest.length - 1] = v;
				break identifyBoundary;
			}
		}

		List<Double> solutions = new ArrayList<Double>();

		for (int a = 0; a < interest.length - 1; a++) {
			double y1 = interestYs[a];
			double y2 = interestYs[a + 1];
			if ((y1 > 0 && y2 < 0) || (y1 < 0 && y2 > 0)) {
				// TODO: combine newtons search w/ binary search when possible
				Double solution = refineNewtonsMethod(this, derivative, interest[a], interest[a + 1]);
				if (solution != null) {
					solutions.add(solution);
				} else {
					double solution2 = refineBinarySearch(this, interest[a], y1, interest[a + 1], y2);
					solutions.add(solution2);
				}
			} else if (y1 == 0) {
				solutions.add(interest[a]);
			}
		}

		double[] returnArray = new double[solutions.size()];
		for (int a = 0; a < solutions.size(); a++) {
			returnArray[a] = solutions.get(a);
		}
		return returnArray;
	}

	private static Double refineNewtonsMethod(PolynomialFunction function,
			PolynomialFunction derivative, double minX, double maxX) {

		double dx;
		double x = (maxX + minX) / 2;

		int k = 0;

		while (k < 300) { // sometimes .00000000001 is too strict; 300
							// iterations may be our best shot
			dx = derivative.evaluate(x);
			if (dx == 0) {
				k = 300; // abort!
			} else {
				double newX = x - function.evaluate(x) / dx;

				double delta = x - newX;
				if (delta < 0)
					delta = -delta;
				if (delta <= .00000000001) {
					return Double.valueOf(x);
				}

				x = newX;
			}
			k++;
		}
		return null;
	}

	private static double refineBinarySearch(PolynomialFunction function, double x1, double y1, double x2, double y2) {
		int ctr = 0;
		if (y1 < 0 && y2 > 0) {
			// our left Y is negative, our right Y is positive
			while (true) {
				if (x1 == x2)
					return x1;
				double midX = (x1 + x2) / 2.0;
				double midY = function.evaluate(midX);
				if (midY == 0 || ctr > 300) {
					return midX;
				} else if (midY > 0) {
					x2 = midX;
				} else {
					x1 = midX;
				}
				ctr++;
			}
		} else if (y1 > 0 && y2 < 0) {
			// our left Y is positive, our right Y is negative
			while (true) {
				if (x1 == x2)
					return x1;
				double midX = (x1 + x2) / 2.0;
				double midY = function.evaluate(midX);
				if (midY == 0 || ctr > 300) {
					return midX;
				} else if (midY > 0) {
					x1 = midX;
				} else {
					x2 = midX;
				}
				ctr++;
			}
		} else if( y1 == 0 ) {
			return x1;
		} else if( y2 == 0 ) {
			return x2;
		} else {
			throw new IllegalStateException("("+x1+", "+y1+") and ("+x2+", "+y2+") are on the same side of y = 0");
		}
	}

	/**
	 * Calls <code>evaluateInverse(0)</code>
	 * 
	 * @return calls <code>evaluateInverse(0)</code>
	 */
	public double[] solve() {
		return evaluateInverse(0);
	}

	public int getDegree() {
		return coeffs.length;
	}
}