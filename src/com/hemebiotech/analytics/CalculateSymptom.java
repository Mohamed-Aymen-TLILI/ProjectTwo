package com.hemebiotech.analytics;


import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 *
 * Symptom grouped By Key and Values, sort them by alphabetical order
 */
public class CalculateSymptom {

    /**
     * @param list List of Strings from ReadSymptomDataFromFile
     * @return a Map of Strings, Long. sorted List by alphabetical order
     */
    public Map<String, Long> calculateSymptom(List<String> list){


        //Symptom grouped By Key and Values
        Map<String, Long> result =
                list.stream().collect(
                        Collectors.groupingBy(
                                Function.identity(), Collectors.counting()
                        )
                );


        //Sort a map and add to finalMap
            Map<String, Long> finalMap = new LinkedHashMap<>();

                result.entrySet().stream()
                        .sorted(Map.Entry.comparingByKey()
                                ).forEachOrdered(e -> finalMap.put(e.getKey(), e.getValue()));

        return finalMap;
    }
}
