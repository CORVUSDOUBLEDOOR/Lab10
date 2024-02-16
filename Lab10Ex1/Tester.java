package Lab10Ex1;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Tester {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner newFile = new Scanner(new File("C:\\Users\\ghost\\IdeaProjects\\untitled\\src\\Lab10Ex1\\score.txt"));
        int amountIT = 0;
        int amountSE = 0;
        int amountCS = 0;
        while(newFile.hasNext()){
            String studentID = newFile.next();
            String className = newFile.next();
            String firseName = newFile.next();
            String lastname = newFile.next();
            if(className.equalsIgnoreCase("IT")){
                amountIT++;
            }else if(className.equalsIgnoreCase("SE")){
                amountSE++;
            }else if(className.equalsIgnoreCase("CS")){
                amountCS++;
            }
        }
        System.out.println("There are " + amountCS + " persons in Computer Science.");
        System.out.println("There are " + amountIT + " persons in Information Technology.");
        System.out.println("There are " + amountSE + " persons in Software Engineering.");
    }
}
