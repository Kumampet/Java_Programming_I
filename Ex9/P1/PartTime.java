import java.util.*;
public class PartTime extends Employee{
    PartTime(){
	super(1000);
	generateNumberHours();
    }
    public void generateNumberHours(){
	Random rand = new Random();
	setH(rand.nextInt(5));
    }
    public String getJob(){
	return "PartTime";
    }
}

    
