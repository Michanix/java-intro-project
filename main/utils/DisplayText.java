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
                Thread.sleep(600);          // play with this to change the speed of displaying msgs
            }
            System.out.println("=============================================");
            Thread.sleep(500);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
