import java.util.Scanner;

public class PatternProblems {

	public static void main(String[] args) {
		//problem1: solid rectangle
		//funny solution
		/*char a='*';
		int n=5;
		for(int i=1;i<n;i++) {
			System.out.println(a+a+a+a+a);
			System.out.println(a+a+a+a+a);
			System.out.println(a+a+a+a+a);
			System.out.println(a+a+a+a+a);
			System.out.println(a+a+a+a+a);
		}*/
		
		Scanner sc=new Scanner(System.in);
		/*System.out.println("enter the character you want to use for making your pattern.");
		String a=sc.nextLine();
		System.out.println("enter the rows needed");
		int n=sc.nextInt();
		System.out.println("enter the columns needed");
		int m=sc.nextInt();
		System.out.println();//this is used for the next line.
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=m;j++) {
				System.out.print(a);
			}
			System.out.println();
		}*/
		
		//hollow rectangle
		/*System.out.println("enter the character you want to use for making your pattern.");
		String a=sc.nextLine();
		System.out.println("enter the rows needed");
		int n=sc.nextInt();
		System.out.println("enter the columns needed");
		int m=sc.nextInt();
		System.out.println();//this is used for the next line.
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=m;j++) {
				if(i==1 || j==1 || i==n || j==m) {
					System.out.print(a);
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}*/
		
		//half pyramid
		/*System.out.println("enter the character you want to use for making your pattern.");
		String a=sc.nextLine();
		System.out.println("enter the rows needed");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(a);
			}
			System.out.println();
		}*/
		
		//inverted half pyramid
		/*System.out.println("enter the character you want to use for making your pattern.");
		String a=sc.nextLine();
		System.out.println("enter the rows needed");
		int n=sc.nextInt();
		for(int i=n;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print(a);
			}
			System.out.println();
		}*/
		
		//inverted half pyramid (rotated by 180 degree)
		/*System.out.println("enter the character you want to use for making your pattern.");
		String a=sc.nextLine();
		System.out.println("enter the rows needed");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) { 			
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(a);
			}
			System.out.println();
		}*/
		
		//half pyramid with numbers
		/*System.out.println("enter the rows needed");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}*/
		
		//inverted half pyramid with numbers:
		//logic 1
		/*System.out.println("enter the rows needed");
		int n=sc.nextInt();
		for(int i=n;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}*/
		//logic 2
		/*
		1 2 3 4 5
		1 2 3 4
		1 2 3
		1 2
		1
		*/
		/*System.out.println("enter the rows needed");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {						//i=1	//i=2
			for(int j=1;j<=n-i+1;j++) {				//j=5	//j=4
				System.out.print(j + " ");			//1 2 3 4 5	//1 2 3 4
			}										// "_" // "_" and so on.
			System.out.println();
		}*/
		
		//floyd's triangle
		/*
		1
		2 3
		4 5 6
		7 8 9 10
		11 12 13 14 15
		*/
		/*System.out.println("enter the rows needed");
		int n=sc.nextInt();
		int number=1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(number+" ");
				number++;
			}
			System.out.println();
		}*/
		
		//0-1 triangle
		/*
		1
		0 1
		1 0 1
		0 1 0 1
		1 0 1 0 1
		*/
		/*
		System.out.println("enter the rows needed");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				int sum=i+j;
				if(sum%2==0) {	//even
					System.out.print("1 ");
				}
				else {	//odd
					System.out.print("0 ");
				}
			}
			System.out.println();
		}
		*/
		//butterfly pattern
		/*
		
		*      *
		**    **
		***  ***
		********
		********
		***  ***
		**    **
		*      *
		
		*/
		/*System.out.println("enter the character you want to use for making your pattern.");
		String a=sc.nextLine();
		System.out.println("enter the rows needed");
		int n=sc.nextInt();
		//upper half
		for(int i=1;i<=n;i++) {
			//1st part stars
			for(int j=1;j<=i;j++) {
				System.out.print(a);
			}
			//spaces
			int spaces=2*(n-i);
			for(int j=1;j<=spaces;j++) {
				System.out.print(" ");
			}
			//2nd part
			for(int j=1;j<=i;j++) {
				System.out.print(a);
			}
			System.out.println();
		}
			//lower half
			for(int i=n;i>=1;i--) {
				//1st part stars
				for(int j=1;j<=i;j++) {
					System.out.print(a);
				}
				//spaces
				int spaces=2*(n-i);
				for(int j=1;j<=spaces;j++) {
					System.out.print(" ");
				}
				//2nd part
				for(int j=1;j<=i;j++) {
					System.out.print(a);
				}
				System.out.println();
		}
		*/
		//solid rhombus
		/*System.out.println("enter the character you want to use for making your pattern.");
		String a=sc.nextLine();
		System.out.println("enter the rows needed");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			int spaces=n-i;
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=5;j++) {
				System.out.print(a);
			}
			System.out.println();
		}
		*/
		//number pyramid
		/*
		    1    
		   2 2   
		  3 3 3  
		 4 4 4 4 
		5 5 5 5 5
		*/
		
		/*System.out.println("enter the rows needed");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(i +" ");
			}
			System.out.println();
		}
		*/
		//palindromic pattern
		/*
		System.out.println("enter the rows needed");
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			//spaces
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			//1st half
			for(int j=i;j>=1;j--) {
				System.out.print(j);
			}
			//2nd half
			for(int j=2;j<=i;j++) {
					System.out.print(j);
				}
			System.out.println();
		}
		*/
		//diamond pattern
		//logic 1
		System.out.println("enter the character you want to use for making your pattern.");
		String a=sc.nextLine();
		System.out.println("enter the rows needed");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			//spaces
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			//1st half
			for(int j=1;j<=2*i-1;j++) {
				System.out.print(a);
			}
			System.out.println();
		}
		//lower half
		for(int i=n;i>=1;i--) {
			//spaces
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			//1st half
			for(int j=1;j<=2*i-1;j++) {
				System.out.print(a);
			}
			System.out.println();
		}
		
		//logic 2
		/*System.out.println("enter the character you want to use for making your pattern.");
		String a=sc.nextLine();
		System.out.println("enter the rows needed");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			//spaces
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			//1st half
			for(int j=1;j<=i;j++) {
				System.out.print(a);
			}
			//2nd half
			for(int j=2;j<=i;j++) {
					System.out.print(a);
				}
			System.out.println();
		}
		//lower half
		for(int i=n;i>=1;i--) {
			//spaces
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			//1st half
			for(int j=1;j<=i;j++) {
				System.out.print(a);
			}
			//2nd half
			for(int j=2;j<=i;j++) {
					System.out.print(a);
				}
			System.out.println();
		}*/
	}

}
