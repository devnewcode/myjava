package encapsulation;

import java.util.Scanner;

public class EncapsulationStart {

	public static void main(String[] args) {
		
		Laptop l1=new Laptop();
		l1.setPrice();
		l1.ram=8;
		System.out.println(l1.getPrice());
	}
//	public void haribol() {
//		System.out.println("hare krishna.");
//	}
}
class Laptop{
	int ram;
	private int price;
	Scanner sc=new Scanner(System.in);
	public void setPrice() {
		//is  the user an admin
		System.out.println("enter the password ");
		boolean isAdmin=false;
		int n=sc.nextInt();
		if(n==12345) {
		isAdmin=true;
		}
		if(isAdmin==true) {
			System.out.println("you can set the price.");
			System.out.println("enter the price ");
			int y=sc.nextInt();
			this.price=y;
		}else {
			System.out.println("you cannot set the price.");
		}
	}
	public int getPrice() {
		return price;
	}
	
	public void setRam(int ram) {
		this.ram = ram;
	}
	public int getRam() {
		return ram;
	}
	
}
