class Circle extends Point implements Shape{
    private double r;
    public Circle(double x, double y, double r){
	super(x,y);
	this.r = r;
    }
    public double getRad(){
	return r;
    }
    public double getArea(){
	return Math.pow(r, 2) * Math.PI;
    }
}
