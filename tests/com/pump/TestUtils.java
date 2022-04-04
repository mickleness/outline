package com.pump;

import java.io.*;

public class TestUtils {
    /**
     * This OutputStream writes no data.
     */
    private static class EmptyOutputStream extends OutputStream {
        @Override
        public void write(byte[] b) throws IOException {
        }

        @Override
        public void write(byte[] b, int off, int len) throws IOException {
        }

        @Override
        public void write(int b) throws IOException {

        }
    }

    /**
     * Create a Writer that can write data to a .log file and/or to System.out.
     */
    public static Writer createLog(String name, boolean writeFile, boolean writeToSystemOut) throws FileNotFoundException {
        if (name.contains("/") || name.contains("\\"))
            throw new IllegalArgumentException("illegal name = "+name);
        OutputStream out;
        if (writeFile) {
            File file = new File(name + " Output.log");
            FileOutputStream fileOut = new FileOutputStream(file);
            out = fileOut;
        } else {
            out = new EmptyOutputStream();
        }
        OutputStreamWriter writer = new OutputStreamWriter(out) {
            @Override
            public void write(String str) throws IOException {
                super.write(str);
                if (writeToSystemOut)
                    System.out.print(str);
            }
        };

        return writer;
    }
}
