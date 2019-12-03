public abstract class Employee {
	private int h; // number of hours at work today
	private int w; // hourly wage 

	Employee(int w) { this.w = w; h = 0; }
	public int getH() { return h;};
	public int getW() { return w; }; 
	public void setH(int h) { this.h = h; } 
	abstract public void generateNumberHours();
	public int getDayPayment() { return w * h; };
}

public class CalculatingWorkingHours { 
    public static void main(String[] args) { 
      Employee[] e; 
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
   } // the end of the main method 
}    // the end of the class CalculatingWorkingHours 