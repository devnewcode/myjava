package basics;

public class Interfaces implements Cars, Persons{

	public static void main(String[] args) {
		Interfaces t1=new Interfaces();
		t1.start();
		t1.walk();

	}
	@Override
	public void start() {
		System.out.println("my car is starting.");
	}
	@Override
	public void walk() {
		System.out.println("Person is walking.");
	}

}
interface Cars{ //interfaces provide true abstraction.
	void start(); //it is by default abstract.
	//here, we can not create complete functions but it is possible to make complete functions in abstract classes.
	
}
interface Persons{
	void walk();
}