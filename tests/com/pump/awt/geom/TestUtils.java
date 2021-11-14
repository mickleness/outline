package com.pump.awt.geom;

import com.pump.awt.geom.outline.OutlineEngine;
import com.pump.awt.geom.outline.PlainAreaEngine;

import java.io.*;

public class TestUtils {

    public static Writer createLog(String name) throws FileNotFoundException {if (name.contains("/") || name.contains("\\"))
        throw new IllegalArgumentException("illegal name = "+name);
        File file = new File(name+" Output.log");
        FileOutputStream fileOut = new FileOutputStream(file);
        OutputStreamWriter writer = new OutputStreamWriter(fileOut) {
            @Override
            public void write(String str) throws IOException {
                super.write(str);
                System.out.print(str);
            }
        };

        return writer;
    }

    public static OutlineEngine[] getEngines() {
        return new OutlineEngine[] { new PlainAreaEngine() };
    }
}
