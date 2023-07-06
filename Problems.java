import java.util.Scanner;
class Calculate{
	int avg(int a,int b,int c) {
		int d=(a+b+c)/3;
		return d;
	}
	int sumOdd(int n) {
		int sum=0;
		for(int i=1;i<=n;i=i+2) {
			sum=sum+i;
			//System.out.println(sum);
		}
		return sum;
	}
	void greater(int a, int b) {
		if(a>b) {
			System.out.println("the greater number is "+ a);
		}
		else if(b>a) {
			System.out.println("the greater number is "+ b);
		}
		else if(a==b) {
			System.out.println("both the numbers are equal");
		}
	}
	double circumference(int r) {
		double a=2*(3.14)*r;
		return a;
	}
	void voting(int age) {
		if(age>18 || age==18) {
			System.out.println("you are eligible to vote.");
		}
		else {
			System.out.println("you are not eligible to vote");
		}
	}
	int power(int x,int n) {
		int a=x;
		for(int i=1;i<=n-1;i++) {	
			a=a*x;
		}
		return a;
		
	}
}
public class Problems {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Calculate f=new Calculate();
		//problem 1-->finding average of three numbers
		/*int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int d=f.avg(a, b, c);
		System.out.println(d);
		sc.close();*/
		//problem 1
		/*int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int d = f.avg(a,b,c);
		System.out.println(d);*/
		
		//problem 2-->write a function to print the sum of all odd numbers from 1 to n.
		/*int n=sc.nextInt();
		System.out.println(f.sumOdd(n));
		*/
		
		//problem 3-->write a function which takes in 2 numbers and returns the greater of those two.
		/*System.out.println("enter number 1");
		int a=sc.nextInt();
		System.out.println("enter number 2");
		int b=sc.nextInt();
		f.greater(a, b);
		*/
		
		//problem 4-->write a function that takes returns the circumference of a circle.
		/*System.out.println("enter the radius to find out the circumference of a circle");
		int r=sc.nextInt();
		System.out.println("the circumference of a circle is "+ f.circumference(r));
		*/
		
		//problem 5-->write a function to check the eligibility of voting.
		/*int n=sc.nextInt();
		f.voting(n);
		*/
		//problem 6-->infinite loop using do while loop.
		/*int n=10;
		int i=n;
		do {
			System.out.println("hi i am increasing." + i);
			i++;
		}while(i>1);
		*/
		
		//problem 7--> counting number of positives,negatives and zeros in the given digits.
		/*
		int a=0;
		int b=0;
		int c=0;
		System.out.println("enter the numbers you want to check.");
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			int d=sc.nextInt();
			if(d==0) {
				a++;
			}
			else if(d>0) {
				b++;
			}
			else {
				c++;
			}
		}
		System.out.println("number of zeros " + a);
		System.out.println("number of positive digits " + b);
		System.out.println("number of negative digits " + c);
		*/
		
		//problem 8-->print x^n.
		System.out.println("enter the value of x & n");
		int x=sc.nextInt();
		int n=sc.nextInt();
		System.out.println("the answer of x^n is " + f.power(x, n));
	}

}
