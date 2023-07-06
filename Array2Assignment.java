import java.util.Arrays;
import java.util.Scanner;

public class Array2Assignment {
static int[] positiveAndNegative(int[]arr) {
	int[]ans=new int[arr.length];
	int j=0;
	for(int i=0;i<arr.length;i++) {
		if(arr[i]>=0) {
			ans[j]=arr[i];
			j++;
		}
	}
	for(int i=0;i<arr.length;i++) {
		if(arr[i]<0) {
			ans[j]=arr[i];
			j++;
		}
	}
	return ans;
}
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
//static int[] unionOfArrays(int [] a, int [] b) {
//	int count=0;
//	for(int i=0;i<b.length;i++) {
//			for(int j=0;j<a.length;j++) {
//				if(a[j]==b[i]) {
//					count++;
//				}
//			}
//			
//		}
//		int ans[]=new int[(a.length+b.length)-count];
//		for(int i=0;i<a.length;i++) {
//				ans[i]=a[i];
//		}
////		for(int i=ans.length-count;i<ans.length;i++) {
////			if(ans[i]!=b[i]) {
////				ans[i]=b[i];
////			}
////		}
//		for(int i=ans.length-count;i<ans.length;i++) {
//			for(int h=0;h<ans.length;h++) {
//				for(int j=0;j<ans.length;j++) {
//					for(int k=0;k<b.length;k++) {
//						if(ans[h]!=b[k]) {
//							ans[i]=b[k];
//						}
//					}
//					
//				}
//			}
//			
//		}
////		for(int i=a.length;i<ans.length;i++) {
////			for(int j=0;j<b.length;j++) {
////				for(int k=0;k<a.length;k++) {
////					if(a[k]!=b[j]) {
////						ans[i]=b[j];
////					}
////				}
////				
////			}
////		}
//	return ans;
//}
static int [] elementsInUnionOfArray(int []a , int []b) {
	int count=0;
	for(int i=0;i<b.length;i++) {
			for(int j=0;j<a.length;j++) {
				if(a[j]==b[i]) {
					count++;
				}
			}
		}
	for(int j=1;j<a.length;j++) {
		if(a[j-1]==a[j]) {
			count++;
		}
	}
	for(int i=1;i<b.length;i++) {
		if(b[i-1]==b[i]) {
			count++;
		}
	}
		int ans[]=new int[(a.length+b.length)-count];
		return ans;
}
static int kthSmallestElement(int[]arr,int k) {
	Arrays.sort(arr);
	int ans=arr[k-1];
	return ans;
}
static void indexesOfSubArray(int[]arr,int S) {
	int ans=0;
	for(int i=0;i<arr.length;i++) {
		for(int j=1;j<arr.length;j++) {
		ans=arr[i];
		if(ans<S) {
			ans+=arr[j];
			if(ans==S) {
				System.out.println(i);
				System.out.println(j);
				break;
			}
		}
		
		}
		if(ans==S) {
			break;
		}
	}
}
static boolean equalityOfArrays(int[]a,int[]b) {
	if(a.length==b.length) {
	for(int i=0;i<a.length;i++) {
		if(a[i]!=b[i]) {
			return false;
		}
	}
	return true;
	}
	return false;
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//1.give an unsorted array with negative elements at the end of the array without changing their order.
//		System.out.print("enter the number of elements : ");
//		int n=sc.nextInt();
//		int [] arr=new int[n];
//		System.out.println("enter " + n +" elements : ");
//		for(int i=0;i<n;i++) {
//			arr[i]=sc.nextInt();
//		}
//		int[]ans=positiveAndNegative(arr);
//		for(int i=0;i<ans.length;i++) {
//			System.out.println(ans[i]);
//		}
		//2.give an array a[n] and b[m] with union without repetition of elements.
//		System.out.println("enter elements for a[] and b[] : ");
//		int m=sc.nextInt();
//		int n=sc.nextInt();
//		
//		int a[]=new int[m];
//		int b[]=new int[n];
//		if(m>=n) {
//		System.out.println("Enter " + m + " elements for a[]");
//		for(int i=0;i<m;i++) {
//			a[i]=sc.nextInt();
//		}
//		System.out.println("Enter " + n + " elements for b[]");
//		for(int i=0;i<n;i++) {
//			b[i]=sc.nextInt();
//		}
//		}
////		int [] a= {1,2,3,4,5};
////		int [] b= {1,2,3};
//		int[]ans=elementsInUnionOfArray(a,b);
//		System.out.println("number of elements is : " + ans.length);
		
		//3.find kth smallest element in an array having distinct elements, where k<arr.length .
//		int arr[]=takingArray();
//		System.out.println("enter the kth smallest element : ");
//		int k=sc.nextInt();
//		System.out.println("the " + " smallest element is : " + kthSmallestElement(arr,k));
		
		//4.given an unsorted array a of size n that contains only negative integers, find a
		//continuous sub array which adds to a given number S.
		//in case of multiple subarrays,return the subarray which comes first on moving from
		//left to right. you need to print the start and end index of answer subarray.
//		int a[]= {1,2,3,7,5};
//		int S=12;
//		indexesOfSubArray(a,S);
		
		//5.write a java program to test the equality of two arrays.
		int [] a= {2,5,7,9,12};
		int [] b= {2,5,7,9,12};
		System.out.println(equalityOfArrays(a,b));
		
	}

}
