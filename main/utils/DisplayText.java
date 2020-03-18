package utils;

import java.util.List;

public class DisplayText {
    public void printText(String path) {
        ReadTextFile readTextFile = new ReadTextFile();
        try {
            List<String> listOfText = readTextFile.readFileToList(path);
            for (String sentence: listOfText) {
                System.out.println(sentence);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
