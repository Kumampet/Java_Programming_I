class Shape {
    protected String name;
    public Shape(String name) { 
	this.name = name;
    }
    public Shape() {
	name = "no name";
    }
    public String getName() {
	return name;
    }
    public String toString() {
	return getClass().getName() + " " + name;
    }
}

class Circle extends Shape{
    private double r;
    public Circle(String n, double r){
	super(n);
	this.r = r;
    }
    public double getRad(){
	return r;
    }
    public double getVol(){
	return Math.pow(r, 2) * Math.PI;
    }
    public String toString() {
	return super.toString();
    }
}
class Rect extends Shape{
    protected double side, l_side, s_side;
    public Rect(String n,double a, double b){
	super(n);
	l_side = a;
	s_side = b;
	side = 2*l_side + 2*s_side;
    }
    public double getSide(){
	return side;
    }
    public double getVol(){
	return l_side *s_side;
    }
    public String toString() {
      return getClass().getName() + " " + name;
    }
}

class Para extends Rect{
    public Para(String n, double lsi, double ssi){
	//side = 2*lsi + 2*ssi;
	super(n, lsi, ssi);
    }
    public String toString() {
      return getClass().getName() + " " + name;
    }
}

class Sqr extends Rect{
    public Sqr(String n, double side){
	//this.side = 4*side;
	super(n, side, side);
    }
    public String toString() {
      return getClass().getName() + " " + name;
    }
}

class Rhb extends Para{//継承元を正方形から菱形に変更
    public Rhb(String n, double side){
	//this.side = 4*side;
	super(n, side, side);
    }
    public String toString() {
      return getClass().getName() + " " + name;
    }
}

class TestFigure{
    public static void main(String[] args){
	Circle crl1 = new Circle("Circle", 5.0);//円
	Rect rect1 = new Rect("Rectangle", 3.0,5.0);//長方形
	Sqr sqr1 = new Sqr("Sqare", 9.0);//正方形
	Para para1 = new Para("Parallelogram", 4.0,8.0);//平行四辺形
	Rhb rho1 = new Rhb("Rhombus", 7.0);//菱形

	System.out.println("Radius: " + crl1.getRad() + "cm  " + crl1.getVol() + "㎠ " +crl1.toString());
	System.out.println(rect1.getSide() + "cm "+ rect1.getVol() + "㎠ " +rect1.toString());
	System.out.println(sqr1.getSide() + "cm "+ sqr1.getVol() + "㎠ " +sqr1.toString());
	System.out.println(para1.getSide() + "cm "+ para1.getVol() + "㎠ " +para1.toString());
	System.out.println(rho1.getSide() + "cm "+ rho1.getVol() + "㎠ " +rho1.toString());
    }
}


/*
class Main{
    public static void main(String[] args){
	Shape s = new Shape("Shape");
	System.out.println(s.getName());
    }
}
*/



