package com.hemebiotech.analytics;


import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
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

        Map<String, Long> result = new TreeMap<>();

        for (String symptom : list) {
            result.put(symptom, result.containsKey(symptom) ? result.get(symptom) + 1 : 1);
        }

        return result;
    }
}
