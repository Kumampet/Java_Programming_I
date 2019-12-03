public class TestRelatable {
    public static void main(String[] args) {
	//MyRectangle r1 = new MyRectangle(10, 20);
	//MyRectangle r2 = new MyRectangle(40, 50);
	int bigger=0;
	MyRectangle[] r = {
	    new MyRectangle(10,8),
	    new MyRectangle(20,8),
	    new MyRectangle(4,9),
	    new MyRectangle(9,20)
	};
	for(int i=0; i < r.length; i++){
	    if(r[bigger].isLargerThan(r[i])==-1){
		bigger = i;
	    }
	}
	System.out.println("Bigger figure: r" +bigger+ " Length " + r[bigger].getPerimeter());
    }
}
