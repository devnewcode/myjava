import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
		/*
		//int[] marks=new int[3];
		//int marks[]=new int[3];// so, this array is taking the space of 12 bytes.
		int marks[]= {98,68,88};
		//marks[0]=98;
		//marks[1]=68;
		//marks[2]=88;
		//System.out.println(marks[0]);
		//System.out.println(marks[1]);
		//System.out.println(marks[2]);
		for(int i=0;i<3;i++) {
			System.out.println(marks[i]);
		}
		*/
		//taking inputs from the user.
		/*
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of the array");
		int size = sc.nextInt();
		int numbers[]=new int[size];
		System.out.println("enter the elements you want to put in the array");
		for(int i=0;i<size;i++) {
			numbers[i]=sc.nextInt();
		}
		System.out.println("these are the elements you have entered");
		for(int i=0;i<size;i++) {
			System.out.println(numbers[i]);
		}
		*/
		//problem 1->taking array from the user. and search for a given no. x and print it's index.
		// it is a linear search problem.
		/*
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of the array");
		int size = sc.nextInt();
		int numbers[]=new int[size];
		System.out.println("enter the elements you want to put in the array");
		for(int i=0;i<size;i++) {
			numbers[i]=sc.nextInt();
		}
		System.out.println("enter the number you want to find the index of.");
		int a=sc.nextInt();
		for(int i=0;i<numbers.length;i++) {
			if(numbers[i]==a) {
				System.out.println("the index of the number is "+ i);
			}
		}
		*/
		//problem 2->take an array of names as input from the user and print them on the screen.
		/*
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of the array");
		int size = sc.nextInt();
		String s[]=new String[size];
		for(int i=0;i<size;i++) {
			s[i]=sc.next();
		}
		for(int i=0;i<size;i++) {
			System.out.println("name " + (i+1) + " is : " + s[i]);
		}
		*/
		//problem 3->find the max & min number in an array of integers.
		/*
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of the array");
		int size = sc.nextInt();
		int numbers[]=new int[size];
		System.out.println("enter the elements you want to put in the array");
		for(int i=0;i<size;i++) {
			numbers[i]=sc.nextInt();
		}
		int min=Integer.MAX_VALUE;
		int max=Integer.MIN_VALUE;
		for(int i=0;i<size;i++) {
			if(numbers[i]<min) {	//1<min	//2<min
				min = numbers[i];	//min=1	//min=1
			}
			if(numbers[i]>max) {	//1>max	//2>1
				max = numbers[i];	//max=1	//max=2
			}
		}
		System.out.println("largest number is : " + max);
		System.out.println("smallest number is : " + min);
		*/
		//problem 4->take an array of numbers as input and check if it
		//is an array sorted in ascending order.
		//eg:{1,2,4,7} is sorted in ascending order.
		//   {3,4,6,2} is not sorted in ascending order.
		/*
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of the array");
		int size = sc.nextInt();
		int numbers[]=new int[size];
		System.out.println("enter the elements you want to put in the array");
		for(int i=0;i<size;i++) {
			numbers[i]=sc.nextInt();
		}
		boolean sort=true;
		for(int i=0;i<size-1;i++) {			//i=0	//i=1
			if(numbers[i]>numbers[i+1]) {	//1>20	//20>3
				sort=false;
			}
		}
		if(sort) {
			System.out.println("the array is sorted");
		}
		else {
			System.out.println("the array is not sorted");
		}
		*/
		
		// 2d arrays
		// syntax :
		// type[] arrayName = new type[rows][columns];
		// for example: int[][]numbers=new int[3][5];
		//making an 2d array.
		/*
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no of rows of an array");
		int rows = sc.nextInt();
		System.out.println("enter the no of columns of an array");
		int columns = sc.nextInt();
		int[][] numbers=new int[rows][columns];
		System.out.println("enter the elements you want to put in the array");
		System.out.println("enter the elements by giving space like '1_2_3_4_5'");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				numbers[i][j]=sc.nextInt();
			}
		}
		//to print the array
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				System.out.print(numbers[i][j] + "  ");
			}
			System.out.println();
		}
		*/
		//problem 1->take a matrix as input from the user and search for a given number x and print
		// the indices at which it occurs.
		/*
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no of rows of an array");
		int rows = sc.nextInt();
		System.out.println("enter the no of columns of an array");
		int columns = sc.nextInt();
		int[][] numbers=new int[rows][columns];
		System.out.println("enter the elements you want to put in the array");
		System.out.println("enter the elements by giving space like '1_2_3_4_5'");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				numbers[i][j]=sc.nextInt();
			}
		}
		System.out.println("enter the number you want to search");
		int a=sc.nextInt();
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				if(numbers[i][j]==a) {
					System.out.println("the number is found at index : " + i + "," + j);
				}
			}
		}
		*/
		//problem 2->print the spiral order matrix as output for a given matrix of numbers.
		/*
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no of rows of an array");
		int rows = sc.nextInt();
		System.out.println("enter the no of columns of an array");
		int columns = sc.nextInt();
		int[][] numbers=new int[rows][columns];
		System.out.println("enter the elements you want to put in the array");
		System.out.println("enter the elements by giving space like '1_2_3_4_5'");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				numbers[i][j]=sc.nextInt();
			}
		}
		int minr=0;
		int minc=0;
		int maxr=numbers.length-1;
		int maxc=numbers[0].length-1;
		int totalnumberofelements=rows*columns;
		int counter=0;
		
		while(counter<totalnumberofelements) {
			//left wall
			for(int i=minr, j=minc;i<=maxr && counter<totalnumberofelements;i++) {
				System.out.println(numbers[i][j]);
				counter++;
			}
			minc++;
			
			//bottom wall
			for(int i=maxr, j=minc;j<=maxc && counter<totalnumberofelements;j++) {
				System.out.println(numbers[i][j]);
				counter++;
			}
			maxr--;
			
			//right wall
			for(int i=maxr, j=maxc;i>=minr && counter<totalnumberofelements;i--) {
				System.out.println(numbers[i][j]);
				counter++;
			}
			maxc--;
			
			//top wall
			for(int i=minr, j=maxc;j>=minc && counter<totalnumberofelements;j--) {
				System.out.println(numbers[i][j]);
				counter++;
			}
			minr++;
			
		}
		*/
		//problem 2->for a given matrix of n*m, print its transpose.
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no of rows of an array");
		int rows = sc.nextInt();
		System.out.println("enter the no of columns of an array");
		int columns = sc.nextInt();
		int[][] numbers=new int[rows][columns];
		System.out.println("enter the elements you want to put in the array");
		System.out.println("enter the elements by giving space like '1_2_3_4_5'");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				numbers[i][j]=sc.nextInt();
			}
		}
		//printing the array.
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				System.out.print(numbers[i][j] + "  ");
			}
			System.out.println();
		}
		//printing the array transpose.
		for(int i=0;i<columns;i++) {
			for(int j=0;j<rows;j++) {
				System.out.print(numbers[j][i] + "  ");
			}
			System.out.println();
		}
		
	}

}
