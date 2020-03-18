package utils;

import java.util.List;

public class DisplayText {
    public static void printText(String path) {
        ReadTextFile readTextFile = new ReadTextFile();
        try {
            List<String> listOfText = readTextFile.readFileToList(path);
            System.out.println("=============================================");
            for (String sentence: listOfText) {
                System.out.println(sentence);
            }
            System.out.println("=============================================");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
