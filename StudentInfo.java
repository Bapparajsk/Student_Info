package Student;

import Student.print;
import java.util.ArrayList;
import java.util.Scanner;


public class StudentInfo {

  public static Scanner input = new Scanner(System.in);
  public static boolean ch = true;
  
  public static void check () {
    System.out.println("NEXT = n : EXIT = e");
    char Check  = input.next().charAt(0);
    switch (Check) {
      case 'n':
          System.out.println("Next => ");
          return;
      case 'e': 
          System.out.println("EXIT :");
          ch = false;
          return;
    }
    
    
  }
  
  
  public static void main(String[] args) {
  
  ArrayList<String> Subject = new ArrayList<String>();
  ArrayList<Integer> Marks = new ArrayList<Integer>();

  System.out.println("Enter Student Name :-");
  String Name = input.nextLine();
  
  System.out.println("Roll NO :-");
  int Roll = input.nextInt();
  
  for (int i = 0; ch; i++) {
  
    System.out.println("Subject Name :-");
    String sub = input.next();
    Subject.add(sub);
    
    System.out.println(Subject.get(i) + " Marks :-");
    int marks = input.nextInt();
    Marks.add(marks);
    
    check();
  }
  
  System.out.println("Student Name :- " + Name + "\nRoll NO :- " + Roll);
 
   print.help(Subject, Marks);
  
  }

}
