package Lab10Ex2;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
public class Tester {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner newFile = new Scanner(new File("C:\\Users\\ghost\\IdeaProjects\\untitled\\src\\Lab10Ex2\\score.txt"));
        ArrayList<String>ID  = new ArrayList<String>();
        ArrayList<String>scores = new ArrayList<String>();
        int i = 0;
        while (newFile.hasNext()){
            if(i%2 != 0){
                int score = newFile.nextInt();
                if(score >= 60 ){
                    scores.add("S");
                }else{
                    scores.add("U");
                }
                i++;
            }else{
                ID.add(newFile.next());
                i++;
            }
        }
        for(int j = 0 ; j < ID.size() ; j++){
            System.out.print("ID : " + ID.get(j) + " Grade : " + scores.get(j));
            System.out.println();
        }
    }
}
