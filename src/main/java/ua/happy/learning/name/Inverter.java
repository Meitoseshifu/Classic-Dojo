package ua.happy.learning.name;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Given String with name
 * "John Smith" => "Smith, John"
 * "Mr. John Smith" => "Smith, John"
 * "John Smith Sr. PhD." => "Smith, John Sr. PhD."
 * " John      Smith" => "Smith, John"
 */
public class Inverter {
    private static final String ANY_AMOUNT_OF_WHITESPACE = "\\s+";

    public static String invert(String name) {
        List<String> nameParts = new ArrayList<>(breakIntoPartsIgnoringWhitespace(name));

        if(isHonorific(nameParts.get(0))) nameParts.remove(0);

        return nameParts.size() < 2 ? invertSingleName(nameParts.get(0)) : invertFullName(nameParts);
    }

    private static String invertFullName(List<String> nameParts) {
        return String.format("%s, %s %s", nameParts.get(1), nameParts.get(0), findAndMergePostnominals(nameParts)).trim();
    }

    private static String invertSingleName(String name) {
        return String.format("%s", name);
    }

    private static String findAndMergePostnominals(List<String> nameParts) {
        StringBuilder postnominal = new StringBuilder();
        for (String namePart : nameParts.subList(2, nameParts.size())) {
            postnominal.append(namePart).append(" ");
        }
        return postnominal.toString();
    }

    private static boolean isHonorific(String namePart) {
        List<String> honorifics = List.of("Mr.", "Mrs.");
        return honorifics.contains(namePart);
    }

    private static List<String> breakIntoPartsIgnoringWhitespace(String name) {
        return Arrays.asList(name.trim().split(ANY_AMOUNT_OF_WHITESPACE));
    }
}
