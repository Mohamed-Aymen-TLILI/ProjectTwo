package com.hemebiotech.analytics;


import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

/**
 * Put Last List into a new File
 */
public class OutPutWriter  {

    private String outFilepath;


    /**
     * @param outFilepath File to put the last result
     */

    public OutPutWriter(String outFilepath) {
        this.outFilepath = outFilepath;
    }

    /**
     * this method will write input map into a file
     * @param finalMap Map  of String, Integer that will be written in output file
     * @throws IOException for FileWriter
     */
    public void lastFile(Map<String, Long> finalMap) throws IOException {

        FileWriter writer = new FileWriter(outFilepath);
        for (Map.Entry<String, Long> entry : finalMap.entrySet()) {
            writer.write(entry.getKey() + " = " + entry.getValue() + "\n");
        }
        writer.close();
    }
}
