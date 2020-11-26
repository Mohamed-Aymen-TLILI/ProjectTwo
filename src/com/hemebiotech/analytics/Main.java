package com.hemebiotech.analytics;


import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 *  @author Mohamed Aymen TLILI
 *  @version 1.0.0
 * Read symptoms from a externe file, calculate their occurency, sort them by alphabetical order and write it to output file.
 */
public class Main  {

    public static void main(String[] args) throws IOException {
        String filepath = "symptoms.txt";
        String outFilepath="result.out";

        //Read symptoms and put them into a list
        ReadSymptomDataFromFile readList = new ReadSymptomDataFromFile(filepath);
        List<String> listSymptoms = readList.GetSymptoms();

        //Calculate symptoms from the List and sort them by alphabetical order
        CalculateSymptom symptoms = new CalculateSymptom();
        Map<String, Long> list = symptoms.calculateSymptom(listSymptoms);


        // Put the sorted List into a outputFile
        OutPutWriter finalResult = new OutPutWriter(outFilepath);
        finalResult.lastFile(list);

    }
}
