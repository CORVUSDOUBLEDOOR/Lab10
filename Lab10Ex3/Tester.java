package Lab10Ex3;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
public class Tester {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner newFile = new Scanner(new File("C:\\Users\\ghost\\IdeaProjects\\untitled\\src\\Lab10Ex3\\student2.txt"));
        ArrayList<String>ID = new ArrayList<String>();
        ArrayList<String>firstname = new ArrayList<String>();
        ArrayList<String>lastname = new ArrayList<String>();
        ArrayList<Double>grade = new ArrayList<Double>();
        ArrayList<String>gradeType = new ArrayList<String>();
        while (newFile.hasNext()){
            String id = newFile.next();
            String firstName = newFile.next();
            String lastName = newFile.next();
            Double Grade = newFile.nextDouble();
            ID.add(id);
            firstname.add(firstName);
            lastname.add(lastName);
            grade.add(Grade);
        }
        for(int i = 0; i < ID.size(); i++){
            if(grade.get(i) >= 2.00){
                gradeType.add("Pass");
            }else if(grade.get(i) >= 1.00 && grade.get(i) < 2.00){
                gradeType.add("Critical");
            }else if(grade.get(i) < 1.00){
                gradeType.add("Retired");
            }
        }
        for(int i = 0; i < ID.size(); i++){
            System.out.println(ID.get(i) + " " + firstname.get(i).charAt(0) + ". " + lastname.get(i) + " " + gradeType.get(i));
        }
    }
}
