import java.util.*;
public class Regular extends Employee{
    Regular(){
	super(2000);
	generateNumberHours();
    }
    public void generateNumberHours(){
	Random rand = new Random();
	setH(rand.nextInt(2) + 8);
    }
    public String getJob(){
	return "Regular";
    }
}
