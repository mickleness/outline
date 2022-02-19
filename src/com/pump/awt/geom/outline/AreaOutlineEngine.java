package com.pump.awt.geom.outline;

import java.awt.geom.Area;
import java.io.*;
import java.util.List;

/**
 * This OutlineEngine uses the Area class to execute each OutlineOperation
 * sequentially in the current thread. This is the plainest / most unoptimized
 * interpretation of an OutlineEngine. This is a good baseline to measure
 * performance of optimizations against.
 * <p>
 * This includes one optimization: it checks for potential null-ops. (As of
 * this writing: if one operand is empty the call to a method like {@link Area#add(Area)}
 * can still be very expensive depending on the complexity of the non-empty
 * operand.)
 * </p>
 */
public class AreaOutlineEngine implements OutlineEngine, Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Override
    public Area calculate(List<OutlineOperation> operationQueue) {
        Area area = new Area();
        for(OutlineOperation operation : operationQueue) {
            Area rhs;
            switch(operation.type) {
                case ADD:
                    rhs = new Area(operation.shape);
                    if (area.isEmpty()) {
                        area = rhs;
                    } else if (rhs.isEmpty()) {
                        // intentionally empty
                    } else {
                        area.add(rhs);
                    }
                    break;
                case SUBTRACT:
                    if (area.isEmpty()) {
                        // intentionally empty
                    } else {
                        rhs = new Area(operation.shape);
                        if (rhs.isEmpty()) {
                            // intentionally empty
                        } else {
                            area.subtract(rhs);
                        }
                    }
                    break;
                case XOR:
                    rhs = new Area(operation.shape);
                    if (area.isEmpty()) {
                        area = rhs;
                    } else if (rhs.isEmpty()) {
                        // intentionally empty
                    } else {
                        area.exclusiveOr(rhs);
                    }
                    break;
                case INTERSECT:
                    if (area.isEmpty()) {
                        // intentionally empty
                    } else {
                        rhs = new Area(operation.shape);
                        if (rhs.isEmpty()) {
                            area = new Area();
                        } else {
                            area.intersect(rhs);
                        }
                    }
                    break;
                case TRANSFORM:
                    if (operation.transform.isIdentity()) {
                        // intentionally empty
                    } else {
                        area.transform(operation.transform);
                    }
                    break;
            }
        }
        return area;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName();
    }

    @Serial
    private void writeObject(ObjectOutputStream out)
            throws IOException {
        out.writeInt(0);
    }

    @Serial
    private void readObject(ObjectInputStream in)
            throws IOException, ClassNotFoundException {
        int internalVersion = in.readInt();
        if (internalVersion == 0) {
            // intentionally empty
        } else {
            throw new IOException("Unsupported internal version: " + internalVersion);
        }
    }
}
