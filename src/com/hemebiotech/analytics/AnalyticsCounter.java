package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author Mohamed Aymen TLILI
 * @version 1.0.0
 * Correction of Alex's Code
 * Cette classe est une correction du code d'Alex
 */
public class AnalyticsCounter {


    public static void main(String[] args ) throws IOException
{
    BufferedReader reader = new BufferedReader(new FileReader("symptoms.txt"));
    List<String> items = new ArrayList<>();
    String line = reader.readLine();
    while (line != null) {
        items.add(line);
        line = reader.readLine();
    }

    Map<String, Long> result =
            items.stream().collect(
                    Collectors.groupingBy(
                            Function.identity(), Collectors.counting()
                    )
            );

    Map<String, Long> finalMap = new LinkedHashMap<>();
    //Sort a map and add to finalMap
    result.entrySet().stream()
            .sorted(Map.Entry.comparingByKey()
            ).forEachOrdered(e -> finalMap.put(e.getKey(), e.getValue()));


    FileWriter writer = new FileWriter("result3.out");
    for( Map.Entry<String, Long> entry : finalMap.entrySet()){
        writer.write( entry.getKey() + " => " + entry.getValue() + "\n" );
    }
    writer.close();



}}
