import java.util.*;
/* your code */ 
public class CalculatingWorkingHours {
    
    public static void main(String[] args) { 
      Employee[] e;
      int sumpay=0;
      Random rand = new Random(); 
      e = new Employee[rand.nextInt(10)]; 
      for(int i = 0; i< e.length; i++) { 
         switch (rand.nextInt(4)) {
           case 0: 
            e[i] = new Regular(); 
            break; 
           case 1: 
            e[i] = new PartTime(); 
            break; 
           case 2: 
            e[i] = new Engineer(); 
            break; 
           case 3: 
            e[i] = new Manager();
            break; 
         } 
      } 
/* your code */
      for(int i=0; i<e.length; i++){
	  System.out.println(e[i].getJob());
	  System.out.println("W: " + e[i].getW());
	  System.out.println("H: " + e[i].getH());
	  System.out.println(e[i].getDayPayment());
	  sumpay += e[i].getDayPayment();
      }
      System.out.println("All Payment: " + sumpay + "Yen");
   } // the end of the main method 
}    // the end of the class CalculatingWorkingHours 
