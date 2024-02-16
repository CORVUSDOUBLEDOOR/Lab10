package Lab10Ex4;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
public class Tester {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner newFile = new Scanner(new File("C:\\Users\\informatics\\IdeaProjects\\lap8\\src\\Lab10Ex4\\text.txt"));
        ArrayList<String> sentences = new ArrayList<String>();
        while(newFile.hasNextLine()){
            sentences.add(newFile.nextLine());
        }
        for(int i = 0; i < sentences.size() ; i++){
            StringBuilder reverseSentences = new StringBuilder(sentences.get(i)).reverse();
            String senten = sentences.get(i);
            System.out.println(reverseSentences);
        }
    }
}
