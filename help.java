package Student;

import java.util.ArrayList;


class print {
  
 public static void help (ArrayList<String> subject, ArrayList<Integer> marks) {
 
   int total = 0;
   
   for (int i = 0; i<subject.size(); i++) {
     
     System.out.println("|____________________");
     System.out.println("|" + subject.get(i) + " ==>> " + marks.get(i));
     total += marks.get(i);
     
   }
   
   System.out.println("|____________________");
   System.out.println("|Total Marks ==>>" + total);
   System.out.println("|____________________");
   
  }
}
 
public class help {

  public static void main(String[] args) {
  
   
   
  }

}
