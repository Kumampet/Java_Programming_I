abstract class Animal {
    private static int count;
    public static int d_count;
    public static int c_count;
    public static void increment(){
	count++;
    }
    public static int getCount(){
	return count;
    }
    abstract void noise();
}
class Dog extends Animal {
    public Dog(){
	d_count = 0;
    }
    public static void increment(){
	d_count++;
    }
    public static int getCount(){
	return d_count;
    }
    public void noise() {
	System.out.println("Woof");
	increment();
    }
}
class Cat extends Animal {
    public Cat(){
	c_count = 0;
    }
    public static void increment(){
	c_count++;
    }
    public static int getCount(){
	return c_count;
    }
    public void noise() {
	System.out.println("Meow");
	increment();
    }
}
public class Noise{
    public static void main(String[] args) {
	Animal[] a = {
	    new Dog(), new Cat(), new Cat(), new Dog(), new Dog()
	};
	for (int i = 0; i < a.length; i++)
	    a[i].noise();
	System.out.println(Dog.getCount() + " woofs and " + Cat.getCount() + " meow");
    }
} 
//abstract classのコントラクターを各クラスにコピー。独自のフィールドを作成して混在させないようにする。
