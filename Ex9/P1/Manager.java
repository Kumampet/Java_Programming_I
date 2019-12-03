import java.util.*;
public class Manager extends Employee{
    Manager(){
	super(2900);
	generateNumberHours();
    }
    public void generateNumberHours(){
	Random rand = new Random();
	setH(rand.nextInt(6) + 6);
    }
    public String getJob(){
	return "Manager";
    }
}

