package utils;

import java.util.List;

public class DisplayText {

    public void printText(String path) throws Exception {
        ReadTextFile readTextFile = new ReadTextFile();
        List<String> listOfText = readTextFile.readFileToList(path);
        for (String sentence: listOfText) {
            System.out.println(sentence);
        }
    }
}
