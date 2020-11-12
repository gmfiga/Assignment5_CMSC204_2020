import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * @author Gabriel Martins Figueiredo
 */
public class MorseCodeConverter {

    private static MorseCodeTree morseCodeTree = new MorseCodeTree();

    public MorseCodeConverter() {
    }

    static String convertToEnglish(File codeFile) throws FileNotFoundException {

        String sentenceInMorse = "";
        String sentenceInEnglish = "";

        Scanner scanner = new Scanner(codeFile);

        while (scanner.hasNext()){
            sentenceInMorse += scanner.nextLine();
        }

        String[] wordsInMorseArray = sentenceInMorse.split("/"); //split sentence into words

        for (String wordInMorse: wordsInMorseArray) {

            String[] lettersInMorseArray = wordInMorse.split(" "); // split words into letters
            String wordInEnglish = "";

            for (String letter: lettersInMorseArray) {
                if (!(letter.equals(("")))) {
                    wordInEnglish += morseCodeTree.fetch(letter);
                }
            }

            wordInEnglish+=" ";
            sentenceInEnglish += wordInEnglish;
        }

        return sentenceInEnglish.substring(0,sentenceInEnglish.length() - 1);
    }

    static String convertToEnglish(String code){

        return "not implemented";
    }

    static String printTree(){

        ArrayList<String> arrayListTree = new ArrayList<>();

        arrayListTree = morseCodeTree.toArrayList();

        String stringTree = "";

        for (String letter:arrayListTree) {
            stringTree += letter + " ";
        }

        return stringTree;
    }


}
