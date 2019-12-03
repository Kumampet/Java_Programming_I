import java.util.*;
public class Engineer extends Employee{
    Engineer(){
	super(2500);
	generateNumberHours();
    }
    public void generateNumberHours(){
	Random rand = new Random();
	setH(rand.nextInt(4) + 8);
    }public String getJob(){
	return "Engineer";
    }
}

