class Car {
    // Your algorithm goes here.
    double hp;
    double speed;//km/h
    double flcons;
    double gas;//liter
    double time;//hour
    
    Car(){    //construnctor
	hp = 120;
	speed = 80;
	flcons = 40;
	gas = 35;
	time = 5;
    }
    //method
    void speedUp(double increment){
	speed = speed + increment;
    }
    void applyBrakes(double decrement){
	speed = speed - decrement;
    }
    void travelledTimeUp(double increment){
	time = time + increment;
    }
    void printStateTank(){
	System.out.println("Stste Tank = " + (gas - speed*time/flcons)+ ".");
    }
}

class CarDemo{
    public static void main(String[] args){
        Car car1 = new Car();
        Car car2 = new Car();
        
        car1.speedUp(10.0);
        car1.printStateTank();
        
        car2.travelledTimeUp(10.0);
        car2.applyBrakes(5.0);
        car2.printStateTank();
    }
}
