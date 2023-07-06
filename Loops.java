import java.util.Scanner;

public class Loops {

	public static void main(String[] args) {
		//int i=0;
		/*for(i=0;i<4;i++) {
			System.out.println("Hare Krishna");
		}
		*/
		/*for(i=0;i<=10;i++) {
			System.out.println(i);
		}*/
		/*for(i=0;i<=10;i++) {
			System.out.println(i+" ");
		}*/
		/*for(i=0;i<=10;i++) {
			System.out.print(i+" ");
		}*/
		//int i;
		
		/*while(i<11) {
			System.out.println(i);
			i++;
			
		}*/
		/*do {
			System.out.println(i);
			i++;
		}while(i<11);*/
		
		
		//int i=12;
		/*while(i<11) {
		System.out.println(i);
		
	}*/
	/*do {
		System.out.println(i);
		
	}while(i<11);*/
	
		
//Some problems;
		//print the sum of first n natural numbers:
		//n=4:
		/*int i;
		int n=4;
		int sum=0;
		for(i=1;i<=n;i++) {
			sum=sum+i;
			
		}
		System.out.println(sum);
		*/
		//print the table of a number input by the user:
		//n=2
		/*Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=10;i++) {
			System.out.println(n +"*" + i + "=" + n*i);
		}*/
		//print all even number till n.
		/*Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		for(int i=1;i<=n;i++) {
			if(i%2==0) {
				sum+=i;
			}else {
				sum=sum;
			}
			
		}
		System.out.println(sum);*/
		
		//run:
		/*for( ; ; ) {
			System.out.println("Hare Krishna");
		}*/ 
		// it will create infinite loop.
		
		//make a menu driven program.
		Scanner sc=new Scanner(System.in);
		/*int i=sc.nextInt();
		int b=0;
		for(i=0;i<=1;i++) {
			if(i==1) {
				b=sc.nextInt();
			}
			
			if(b>=90) {
				System.out.println("This is Good");
			}
			else if(b<=89 && b>=60) {
				System.out.println("This is also Good");
			}
			else if(b<=59 && b>=0) {
				System.out.println("This is Good as well");
			}
			else {
				System.out.println("Enter valid marks.");
			}
			if(i==0) {
				break;
			}
			else {
				System.out.println("Enter a valid number");
			}
		}*/
		int input;
		do {
			int marks = sc.nextInt();
			if(marks>=90 && marks<=100) {
				System.out.println("this is good");
			}
			else if(marks>=60 && marks<=89) {
				System.out.println("this is also good");
			}
			else if(marks>=0 && marks<=59) {
				System.out.println("this is good as well");
			}
			else {
				System.out.println("invalid");
			}
			System.out.println("Want to continue? (yes(1) or no(0))");
			input=sc.nextInt();
		}while(input==1);
		
	}
}
