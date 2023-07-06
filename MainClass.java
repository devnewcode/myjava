package basics;

import encapsulation.EncapsulationStart;

class Person{
	//properties
	String name;
	//if we make string protected then it will only be visible to its child. But if we use private
	//then it will not be available to any class.(this is actually called data hiding.)
	int age;
	
	static int count; //-->static means it now a property of class not of object.
	
	public Person() {
		count++;
		System.out.println("creating a object.");
	}
	public Person(int age,String name) {    //constructor overloading
		this(); //-->so,here this keyword is basically used with ()-function with no arguments to call the default constructor
		//because here it has no parameters. this keyword is used to call a constructor from a constructor.
		this.name=name;
		this.age=age;
		//so, in this way this keyword is used with name and age to tell to store the values of age,
		//and new in name and age of Person class.
	}
	//behaviour
	void walk() {
		System.out.println(name + " is walking.");
	}
	void eat() {
		System.out.println(name + " is eating.");
	}
	void walk(int steps) {
		System.out.println(name + " walked " + steps + " steps.");
	} //-->here in this method we have used method overloading. here, we also have seen compile time polymorphism.
	void work() {
		System.out.println("Person is working.");
	}
}
class Developer extends Person{
	public Developer(int age, String name) {
		super(age,name);
		//super keyword is basically used to access the properties of its parent.
		//here with super keyword the properties of parent constructor have been called.
	}
	void walk() {
		System.out.println("developer " + name + " is walking.");
	} //this function shows runtime polymorphism.
}
public class MainClass {

	public static void main(String[] args) {
//		Person p1 = new Person();
//		p1.age=35;
//		p1.name="ramesh";
		
//		Person p2 = new Person();
//		p2.age=30;
//		p2.name="kanishk";
		
//		Person p2=new Person(4,"Raghav");
		
//		System.out.println(p1.age + " " + p1.name);
//		System.out.println(p2.age + " " + p2.name);
		
//		p1.walk(5);
//		p2.eat();
//		System.out.println(Person.count);
//		Developer d1=new Developer(54,"mohan");
//		d1.name="rahul";
//		d1.walk();
		
		EncapsulationStart e1=new EncapsulationStart();
//		e1.haribol();
	}

}
