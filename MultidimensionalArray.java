import java.util.Scanner;

public class MultidimensionalArray {
static int[][] takingInput(int r,int c) {
	Scanner sc=new Scanner(System.in);
	int arr[][]=new int[r][c];
	System.out.println("enter "+ r*c + " elements : ");
	for(int i=0;i<r;i++) {
		for(int j=0;j<c;j++) {
			arr[i][j]=sc.nextInt();
		}
	}
	return arr;
}
static void printArray(int arr[][]) {
	for(int i=0;i<arr.length;i++) {//here we can also use i<row
		for(int j=0;j<arr[i].length;j++) {//here we can also use j<column
			System.out.print(arr[i][j] + " ");
		}
		System.out.println();
	}
}
static void add(int a[][],int r1,int c1,int b[][],int r2,int c2) {
	if(r1!=r2||c1!=c2) {
		System.out.println("Wrong Input");
		return;
	}
	int sum[][]=new int[r1][c1];
	for(int i=0;i<r1;i++) {
		for(int j=0;j<c1;j++) {
			sum[i][j]=a[i][j]+b[i][j];
		}
	}
	printArray(sum);
}
static void mul(int a[][],int r1,int c1,int b[][],int r2,int c2) {
	if(c1!=r2) {
		System.out.println("Wrong Input");
		return;
	}
	int ans[][]=new int[r1][c2];
	for(int i=0;i<r1;i++) {
		for(int j=0;j<c2;j++) {
			for(int k=0;k<c1;k++) {
				ans[i][j]+=(a[i][k]*b[k][j]);
			}
		}
	}
	printArray(ans);
}
static int[] reverse(int []arr) {
	int j=arr.length-1;
	int temp=0;
	for(int i=0;i<arr.length;i++) {
		if(i<j) {
		temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		j--;
		}
	}
	return arr;
}
static void reversed(int arr[][]) {
	for(int i=0;i<arr.length;i++) {
			reverse(arr[i]);
	}
	printArray(arr);
}
static int [][] transpose(int [][]arr,int r,int c){
	int ans[][]=new int[c][r];
	for(int i=0;i<c;i++) {
		for(int j=0;j<r;j++) {
			ans[i][j]=arr[j][i];
		}
	}
	return ans;
}
static void transposeInplace(int [][] arr,int r,int c) { //it is used only for square matrix.
	for(int i=0;i<c;i++) {
		for(int j=i;j<r;j++) {
			int temp=arr[i][j];
			arr[i][j]=arr[j][i];
			arr[j][i]=temp;
		}
	}
	printArray(arr);
}
static void pascaltriangle(int n) {
	int ans[][]=new int[n][];
	for(int i=0;i<n;i++) {
		//ith row has i+1 columns
		ans[i]=new int[i+1];
		//1st and last element of every row is 1
		ans[i][0]=ans[i][i]=1;
		for(int j=1;j<i;j++) {
			ans[i][j]=ans[i-1][j]+ans[i-1][j-1];
		}
	}
	printArray(ans);
}
static void spiral(int arr[][],int r,int c) {
	int toprow=0,bottomrow=r-1,leftcol=0,rightcol=c-1;
	int totalelements=0;
	while(totalelements<r*c) {
		//toprow
		for(int j=leftcol;j<=rightcol && totalelements<r*c;j++) {
			System.out.println(arr[toprow][j] + " ");
			totalelements++;
		}
		toprow++;
		//rightcol
		for(int i=toprow;i<=bottomrow && totalelements<r*c;i++) {
			System.out.println(arr[i][rightcol] + " ");
			totalelements++;
		}
		rightcol--;
		//bottomrow
		for(int j=rightcol;j>=leftcol && totalelements<r*c;j--) {
			System.out.println(arr[bottomrow][j] + " ");
			totalelements++;
		}
		bottomrow--;
		//leftcol
		for(int i=bottomrow;i>=toprow && totalelements<r*c;i--) {
			System.out.println(arr[i][leftcol] + " ");
			totalelements++;
		}
		leftcol++;
	}
}
static int[][] generateSpiralMatrix(int n){
	int [][] arr=new int[n][n];
	int toprow=0,bottomrow=n-1,leftcol=0,rightcol=n-1;
	int current=1;
	while(current<=n*n) {
		//toprow
		for(int j=leftcol;j<=rightcol && current<=n*n;j++) {
			arr[toprow][j] =current++;
		}
		toprow++;
		//rightcol
		for(int i=toprow;i<=bottomrow && current<=n*n;i++) {
			arr[i][rightcol] =current++;
		}
		rightcol--;
		//bottomrow
		for(int j=rightcol;j>=leftcol && current<=n*n;j--) {
			arr[bottomrow][j] =current++;
		}
		bottomrow--;
		//leftcol
		for(int i=bottomrow;i>=toprow && current<=n*n;i--) {
			arr[i][leftcol] =current++;
		}
		leftcol++;
	}
	return arr;
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//2d arrays:
//		int [][]arr= {{1,2,3},
//					  {4,5,6},
//					  {7,8,9}
//					 };
//		int arr[][]=new int[rows][columns];//-->here,in this method rows are compulsory but column is not compulsory.
//		System.out.println("enter row and column number : ");
//		int r=sc.nextInt();
//		int c=sc.nextInt();
//		int[][]arr=takingInput(r,c);
//		printArray(arr);
		
		//addition of two matrix
//		System.out.println("enter row and column number for a[][] : ");
//		int r1=sc.nextInt();
//		int c1=sc.nextInt();
//		
//		System.out.println("enter row and column number for b[][] : ");
//		int r2=sc.nextInt();
//		int c2=sc.nextInt();
//		System.out.println("a matrix");
//		int a[][]=takingInput(r1,c1);
//		System.out.println("b matrix");
//		int b[][]=takingInput(r2,c2);
//		add(a,r1,c1,b,r2,c2);
		
		//matrix multiplication
//		System.out.println("enter row and column number for a[][] : ");
//		int r1=sc.nextInt();
//		int c1=sc.nextInt();
//		
//		System.out.println("enter row and column number for b[][] : ");
//		int r2=sc.nextInt();
//		int c2=sc.nextInt();
//		System.out.println("a matrix");
//		int a[][]=takingInput(r1,c1);
//		System.out.println("b matrix");
//		int b[][]=takingInput(r2,c2);
//		mul(a,r1,c1,b,r2,c2);
		
		//reversing each row of 2d array:
//		System.out.println("enter row and column number for : ");
//		int r=sc.nextInt();
//		int c=sc.nextInt();
//		int arr[][]=takingInput(r,c);
//		reversed(arr);
		
//		transpose of a matrix
//		System.out.println("enter row and column number for : ");
//		int r=sc.nextInt();
//		int c=sc.nextInt();
//		int arr[][]=takingInput(r,c);
//		int ans[][]=transpose(arr,r,c);
//		printArray(ans);
//		transposeInplace(arr,r,c);
		
		//question 1: given a square matrix, turn it by 90 degrees in a clockwise direction without
		//using any extra space.
//		eg:			1 2 3		7 4 1
//					4 5 6		8 5 2
//					7 8 9		9 6 3
//		System.out.println("enter row and column number for : ");
//		int r=sc.nextInt();
//		int c=sc.nextInt();
//		int arr[][]=takingInput(r,c);
//		int ans[][]=transpose(arr,r,c);
//		printArray(ans);
//		System.out.println("array rotated by 90 degree in a clockwise direction : ");
//		reversed(ans);
		
		//question 2: given an integer n, return the first n rows of Pascal's triangle.
		//In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:
//		System.out.println("enter the number of rows : ");
//		int n=sc.nextInt();
//		pascaltriangle(n);
		
		//question 3: given an n*m matrix 'a',return all elements of the matrix in spiral order.
//		System.out.println("enter row and column number for : ");
//		int r=sc.nextInt();
//		int c=sc.nextInt();
//		int arr[][]=takingInput(r,c);
//		spiral(arr,r,c);
		
		//question 4: given a positive integer n, generate an n*n matrix filled with elements from
		//1 to n^2 in spiral order.
//		System.out.println("enter integer n : ");
//		int n=sc.nextInt();
//		int [][]arr=generateSpiralMatrix(n);
//		printArray(arr);
		
		int r=sc.nextInt();
		int c=sc.nextInt();
		int [][]arr=takingInput(r,c);
		printArray(arr);
	}

}
