class Rectangle{
    private double height;
    private double length;
    
    //cons
    Rectangle(double height, double length){
	this.height = height;
	this.length = length;
    }

    //meth
    public double getheight(){
	return height;
    }
    public double getlength(){
        return length;
    }
    public double get_cirum(){
	return (height*2 + length*2);
    }
}

class Box{
    private double height;
    private double width;
    private double length;

    Box(double height, double length, double width){
	this.height = height;
	this.width = width;
	this.length = length;
    }

    public double get_cirum(){
	return (height*4 + length*4 + width*4);
    }
    public double getheight(){
	return height;
    }
    public double getlength(){
	return length;
    }
    public double getwidth(){
	return width;
    }
}

class TestObject{
    public static void main(String[] args){
	Rectangle rec1 = new Rectangle(5, 8);
	Box box1 = new Box(5, 8, 3);

	System.out.println(rec1.getheight());
	System.out.println(rec1.getlength());
	System.out.println(rec1.get_cirum());
	System.out.println(box1.getheight());
	System.out.println(box1.getlength());
	System.out.println(box1.getwidth());
	System.out.println(box1.get_cirum());
    }
}

//How many fields does the Rectangle have?
//2
//How many fields does the Box have?
//3
//How many methods does the Rectangle have?
//3
//How many methods does the Box have?
//4
//Are there any fields with the same meaning in the Rectangle and Box classes?
//一部かぶっている
//Are there any methods in the Rectangle and Box classes expressing similar behavior?
//似ている部分がある。
