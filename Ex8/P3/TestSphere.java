
class Sphere{
	    private double radius;
	    private double volume;

	    //constructor
	    Sphere(double radius){
		this.radius = radius;
	    }
	    
	    //method
	    public double getrad(){
		return radius;
	    }
	    public double volume(){
		return 4.0/3.0 * radius * Math.PI;
	    }
	    public double getheight(double h1, double h2){
		return (2 * h1 * h2) / ( h1 + h2);
	    }
	}

	class TestSphere{
	    public static void main(String[] args){
		Sphere sph1 = new Sphere(6);
		Sphere sph2 = new Sphere(6);
		Sphere sph3 = new Sphere(9);

		System.out.println(sph1.volume());
		System.out.println(sph2.volume());
		System.out.println(sph3.volume());

		System.out.println(sph1.getheight(sph1.getrad(), sph2.getrad()));
		System.out.println(sph1.getheight(sph1.getrad(), sph3.getrad()));
		System.out.println(sph1.getheight(sph2.getrad(), sph3.getrad()));
	    }
	    
}


