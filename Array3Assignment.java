import java.util.Scanner;

public class Array3Assignment {
	static int[] takingArray() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of elements : ");
		int x=sc.nextInt();
		int arr[]=new int[x];
		
		System.out.println("Enter " + x + " elements");
		for(int i=0;i<x;i++) {
			arr[i]=sc.nextInt();
		}
		return arr;
	}
	static int countOccurrences(int [] arr,int x) {
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==x) {
				count++;
			}
		}
		return count;
	}
	static int missingNumber(int [] arr) {
		int j=1;
		for(int i=0;i<arr.length;i++) {
			for(int k=0;k<arr.length;k++) {
			if(j==arr[k]) {
				j++;
			}
			}
		}
		return j;
	}
	public static void main(String[] args) {
		//1.given an array sorted in increasing order of size n and an integer x,find if there
		//exists a pair in the array whose absolute difference is exactly x.(n>1)
		
//		int [] arr= {1,2,3,4,5,6,7};
//		int x=0;
//		boolean check=false;
//		for(int i=1;i<arr.length;i++) {
//			for(int j=0;j<arr.length-1;j++) {
//				if(arr[j]!=arr[i]) {
//			if((Math.abs(arr[i])-Math.abs(arr[j]))==x) {
//				check=true;
//				break;
//			}
//				}
//			}
//		}
//		System.out.println(check);
		
		//2.given an array of size n ,find the total number of occurrences of given number x.
		Scanner sc=new Scanner(System.in);
//		int arr[]=takingArray();
//		System.out.println("enter number for finding occurrences");
//		int x=sc.nextInt();
//		System.out.println("number of occurrences are : " + countOccurrences(arr,x));
		
		//3.given an array arr[] of size N-1 with integers in the range of [1,N],the task is to
		//find the missing number from the first N integers. there are no duplicates in the list.
		int arr[]=takingArray();
		System.out.println("the missing number is : " + missingNumber(arr));
	}

}
