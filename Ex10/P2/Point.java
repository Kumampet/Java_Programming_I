class Point implements inShape{
    private double x=0 ,y=0;
    public Point(double x, double y){
	this.x = x;
	this.y = y;
    }
    public double  getArea (){
	System.out.println(x + ", " + y);
    }
}
