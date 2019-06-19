package com.jige003;

import org.apache.hadoop.hive.ql.exec.UDF;
import org.apache.hadoop.io.Text;
import java.io.File;
import java.io.IOException;

public final class Lower extends UDF {
    public Text evaluate(final Text s) {
        if (s == null) { return null; }
	File file = new File("/tmp/", "hello-hive-udf.txt");
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
// TODO Auto-generated catch block
                e.printStackTrace();
            }

        }
        return new Text(s.toString().toLowerCase());
    }
}
