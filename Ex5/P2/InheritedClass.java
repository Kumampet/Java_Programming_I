class Rectangle{
   private double height;
   private double length;
    
    //cons
    Rectangle(double h, double l){
	height = h;
	length = l;
    }

    //meth
    public double getheight(){
	return height;
    }
    public double getlength(){
	return length;
    }
    public double getcirum(){
	return (height*2 + length*2);
    }
}

class Box extends Rectangle{
    private double width;

    Box(double h, double w, double l){
	height = h;
	width = w;
	length = l;
    }

    public double getcirum(){
	return (height*4 + length*4 + width*4);
    }
    public double getwidth(){
        return width;
    }
}

class TestObject{
    public static void main(String[] args){
	Rectangle rec1 = new Rectangle(5,8);
	Box box1 = new Box(5,8,3);

	System.out.println(rec1.getheight());
	System.out.println(rec1.getlength());
	System.out.println(rec1.getcirum());
	System.out.println(box1.getheight());
	System.out.println(box1.getlength());
	Sysetm.out.println(box1.getwidth());
	System.out.println(box1.getcirum();
    }
}

//How many fields does the Rectangle have?
//2
//How many fields does the Box have?
//3
//How many methods does the Rectangle have?
//2
//How many methods does the Box have?
//4
//What are the advantages that the solution to Problem 2 has over the solution to Problem 1.
//名前が同じフィールドやメソッドを継承し、そのまま使えるものはそのまま使用し、オーバーライドが必要なものは上書きをして理容することで、面倒な処理を減らせる。
