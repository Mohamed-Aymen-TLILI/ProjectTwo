package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;




public class AnalyticsCounterTwo {


        public static void main(String[] args ) throws IOException
        {
            BufferedReader reader = new BufferedReader(new FileReader("symptoms.txt"));
            List<String> items = new ArrayList<>();
            String line = reader.readLine();
            while (line != null) {
                items.add(line);
                line = reader.readLine();
            }

            Map<String, Integer> result = new TreeMap<>();

                for (String symptom : items) {
                    result.put(symptom, result.containsKey(symptom) ? result.get(symptom) + 1 : 1);
                }

        System.out.println(result);
            FileWriter writer = new FileWriter("result2.out");
            Iterator<String> iterator = result.keySet().iterator();
            String symptom;
            Integer value;
            while (iterator.hasNext()) {
                symptom = iterator.next();
                value = result.get(symptom);
                writer.write(symptom + " : " + value + "\n");

            }
            writer.close();

        }
}


