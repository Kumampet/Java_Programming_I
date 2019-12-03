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
    public Circle(double r){
	this.r = r;
    }
    public double Getrad(){
	return r;
    }
    public String toString() {
      return getClass().getName() + " " + name;
    }
}
class Rect extends Shape{
    public double side;
    public Rect(double l_side, double s_side){
	side = 2*l_side + 2*s_side;
    }
    public String toString() {
      return getClass().getName() + " " + name;
    }
}

class Parallelogram extends Rect{
    public Parallelogram(double lsi, double ssi){
	side = 2*lsi + 2*ssi;
    }
    public String toString() {
      return getClass().getName() + " " + name;
    }
}

class Square extends Rect{
    public Square(double side){
	this.side = 4*side;
    }
    public String toString() {
      return getClass().getName() + " " + name;
    }
}

class Rhombus extends Square{
    public Rhombus(double side){
	this.side = 4*side;
    }
    public String toString() {
      return getClass().getName() + " " + name;
    }
}

class TestFigure{
    public static void main(String[] args){
	Circle crl1 = new Circle(5.0);
	Rect rect1 = new Rect(3.0,5.0);
	//Square sqr1 = new Square(9.0);
	//Parallelogram paral1 = new Parallelogram(4.0,8.0);
	//Rhombus rho1 = new Rhombus(7.0);
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



