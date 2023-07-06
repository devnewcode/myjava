import java.util.Arrays;
import java.util.Scanner;

public class JavaArrays {
	static void printArray(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
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
	static void changeArray(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			arr[i]=0;
		}
	}
	static int countOccurrences(int [] arr,int x) {
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==x) {
				count++;
			}
		}
		return count;
//		System.out.println("the number of occurrences of element " + x + " is : " + count);
	}
	static int lastOccurrences(int arr[],int x) {
		int ans=-1;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==x) {
				ans=i;
			}
		}
		return ans;
	}
	static int greaterElement(int [] arr, int x) {
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>x) {
				count++;
			}
		}
		return count;
	}
	static boolean isSorted(int[]arr) {
		boolean a=true;
		for(int i=1;i<arr.length;i++) {
			if(arr[i]<arr[i-1]) {
				a=false;
				break;
			}
		}
		return a;
	}
	static int[] smallestAndLargestElement(int[]arr) {
		Arrays.sort(arr);
		int[]ans= {arr[0],arr[arr.length-1]};
		return ans;
	}
	static int kthSmallestElement(int[]arr) {
		int min=arr[0];
		for(int j=0;j<arr.length;j++) {
			if(min>arr[j]) {
				min=arr[j];
			}
		}
		return min;
	}
	static int minimumElement(int[]arr) {
		int min=Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(min>arr[i]) {
				min=arr[i];
			}
		}
		return min;
	}
	static int pairSum(int[]arr,int target) {
		int n=arr.length;
		int ans=0;
		for(int i=0;i<n;i++) {//first number
			for(int j=i+1;j<n;j++) {//second number
				if(arr[i]+arr[j]==target) {
					ans++;
				}
			}
		}
		return ans;
	}
	static int tripletSum(int[]arr,int target) {
		int n=arr.length;
		int ans=0;
		for(int i=0;i<n;i++) {//first number
			for(int j=i+1;j<n;j++) {//second number
				for(int k=j+1;k<n;k++) {
					if(arr[i]+arr[j]+arr[k]==target) {
						ans++;
					}
				}
			}
		}
		return ans;
	}
	static int findUnique(int [] arr) {
		int n=arr.length;
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(arr[i]==arr[j]) {
					arr[i]=-1;
					arr[j]=-1;
				}
			}
		}
		int ans=-1;
		for(int i=0;i<n;i++) {
			if(arr[i]>0) {
				ans=arr[i];
			}
		}
		return ans;
	}
	static int MaximumElement(int[]arr) {
//		int max=arr[0];
//		for(int i=0;i<arr.length;i++) {
//			if(arr[i]>max) {
//				max=arr[i];
//			}
//		}
		//other method:
		int max=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		return max;
	}
	static int secondMax(int[]arr) {
		Arrays.sort(arr);
		int max=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		int secondMax=0;
//		for(int i=1;i<arr.length;i++) {
//			if(arr[i]<max && arr[i]>arr[i-1]) {
//				secondMax=arr[i];
//			}
//		}
		for(int i=1;i<arr.length-1;i++) {
			if(arr[i]<max && arr[i]>arr[i-1]) {
				secondMax=arr[i];
			}
		}
		return secondMax;
	}
	static int secondMax2(int[]arr) {
		int max=MaximumElement(arr);
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==max) {
				arr[i]=Integer.MIN_VALUE;
			}
		}
		int secondMax=MaximumElement(arr);
		return secondMax;
	}
	static void minAndMaxValue() {
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
	}
	static int firstRepeat(int [] arr) {
		//method 1
//		int ans = -1;
//		for(int i=0;i<arr.length;i++) {
//			if(ans<0) {
//			for(int j=i+1;j<arr.length;j++) {
//				if(arr[j]==arr[i]) {
//					ans=arr[j];
//					break;
//				}
//			}
//			}
//		}
//		return ans;
		//method 2
		for(int i=0;i<arr.length;i++) {
		for(int j=i+1;j<arr.length;j++) {
			if(arr[j]==arr[i]) {
				return arr[i];
			}
		}
		}
		return -1;
	}
	static int lastRepeat(int[]arr) {
		int ans = -1;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]==arr[i]) {
					ans=arr[j];
				}
			}
		}
		return ans;
	}
	static int secondMin(int[]arr) {
		int min=minimumElement(arr);
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==min) {
				arr[i]=Integer.MAX_VALUE;
			}
		}
		int secondmin=minimumElement(arr);
		return secondmin;
	}
	static void swap(int a,int b) {
		int temp=0;
		temp=a;
		a=b;
		b=temp;
		System.out.println("a : " + a);
		System.out.println("b : " + b);
	}
	static void swapWithoutTemp(int a, int b) {
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("a : " + a);
		System.out.println("b : " + b);
	}
	static int[] reverseArray(int [] arr) {
		int ans[]=new int[arr.length];
		ans[0]=arr[arr.length-1];
		for(int i=1;i<arr.length;i++) {
			ans[i]=arr[(arr.length-i)-1];
		}
		return ans;
	}
	static int[] reverseArray2(int[]arr) {
		int [] ans=new int[arr.length];
		int j=0;
		//traversing original array in reverse direction
		for(int i=arr.length-1;i>=0;i--) {
			ans[j++]=arr[i];
		}
		return ans;
	}
	static void swapInArray(int [] arr,int i,int j) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	static void reverseArray3(int[]arr) {
		int i=0,j=arr.length-1;
		while(i<j) {
			swapInArray(arr,i,j);
			i++;
			j--;
		}
	}
	static void reverseByIndexes(int [] arr, int i, int j) {
		while(i<j) {
			swapInArray(arr,i,j);
			i++;
			j--;
		}
	}
	static int[] rotate(int [] arr, int k) {
		int n=arr.length;
		k=k%n;
		int[]ans=new int[n];
		int j=0;
		for(int i=n-k;i<n;i++) {
			ans[j++]=arr[i];
		}
		for(int i=0;i<n-k;i++) {
			ans[j++]=arr[i];
		}
		return ans;
	}
	static void rotateByReversing(int [] arr, int k) {
		int n=arr.length;
		k=k%n;
		//{1,2,3}//k=4/3=1
		reverseByIndexes(arr,0,n-k-1);
		reverseByIndexes(arr,n-k,n-1);
		reverseByIndexes(arr,0,n-1);
	}
	static int[] makeFrequencyArray(int [] arr) {
		int [] freq=new int [100005];
		for(int i=0;i<arr.length;i++) {
			freq[arr[i]]++;
		}
		return freq;
	}
	static void sortZeroesAndOnes(int[]arr) {
		int zeroes=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==0) {
				zeroes++;
			}
		}
		for(int i=0;i<arr.length;i++) {
			if(i<zeroes) {
				arr[i]=0;
			}
			else {
				arr[i]=1;
			}
		}
	}
	static void sortZeroesAndOnesBy2Pointers(int [] arr) {
		int left=0 , right = arr.length-1;
		while(left<right) {
			if(arr[left]==1 && arr[right]==0) {
				swapInArray(arr,left,right);
				left++;
				right--;
			}
			if(arr[left]==0) {
				left++;
			}
			if(arr[right]==1) {
				right--;
			}
		}
	}
	static void sortArrayByParity(int [] arr) {
		int left=0,right=arr.length-1;
		while(left<right) {
			if(arr[left]%2==1 && arr[right]%2==0) {
				swapInArray(arr,left,right);
				left++;
				right--;
			}
			if(arr[left]%2==0) {
				left++;
			}
			if(arr[right]%2==1) {
				right--;
			}
		}
	}
	static int[] sortSquares(int[]arr) {
		int left=0,right=arr.length-1;
		int ans[]=new int[arr.length];
		int k=arr.length-1;//we can also take k=0,but then we have to do reverse of ans[] array.
		while(left<=right) {
			if(Math.abs(arr[left])>Math.abs(arr[right])) {
				ans[k--]=arr[left]*arr[left];
				left++;
			}
			else {
				ans[k--]=arr[right]*arr[right];
				right--;
			}
		}
		return ans;
	}
	static int [] makePrefixSumArray(int [] arr) {
		for(int i=1;i<arr.length;i++) {
			arr[i]=arr[i-1]+arr[i];
		}
		return arr;
	}
	static int [] makePrefixSumNewArray(int [] arr) {
		int ans[]=new int[arr.length];
		ans[0]=arr[0];
		for(int i=1;i<arr.length;i++) {
			ans[i]=ans[i-1]+arr[i];
		}
		return ans;
	}
	static int [] makeSuffixSumNewArray(int [] arr) {
		int ans2[]=new int[arr.length];
		ans2[arr.length-1]=arr[arr.length-1];
		for(int i=ans2.length-2;i>=0;i--) {
			ans2[i]=ans2[i+1]+arr[i];
		}
		return ans2;
	}
	static boolean checkSubArrays(int [] arr) {
		int ans[]=makePrefixSumNewArray(arr);
		int ans2[]=makeSuffixSumNewArray(arr);
		boolean check=false;
		for(int i=0;i<ans.length;i++) {
			for(int j=ans2.length-1;j>0;j--) {
				if(ans[i]==ans2[j]) {
					check=true;
					break;
				}
			}
		}
		return check;
	}
	static int findArraySum(int [] arr) {
		int totalSum=0;
		for(int i=0;i<arr.length;i++) {
			totalSum+=arr[i];
		}
		return totalSum;
	}
	static boolean checkSubArrays2(int [] arr) {
		int totalSum=findArraySum(arr);
		int prefSum=0;
		for(int i=0;i<arr.length;i++) {
			prefSum+=arr[i];
			int suffixSum=totalSum-prefSum;
			if(suffixSum==prefSum) {
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		//syntax of an array:
		//int[] ages;
		//ages= new int[10];
		//we can also write it as :
		//int[] ages= new int[10];
		
		//array literal:
		//int[] ages= {1,2,3,4,5};
		//2d arrays -- arrays of arrays:
		
		//int [][] multiArray = new int[4][3];
		//int [][] multiDimensional= {{1,2},{2,3},{3,4}};
		//System.out.println(multiArray.length);
		//System.out.println(multiDimensional.length);
		
		//3d arrays:
		//int [][][] arr_1 = new int[5][4][6];
		
//		traversing the array through loops
//		int[] ages= {1,2,3,4};
		//for loop
//		for(int i=0;i<ages.length;i++) {
//			System.out.println(ages[i]);
//		}
		
		//for each loop
//		for(int age : ages) {
//			System.out.println(age);
//		}
		
		//while loop
//		int i=0;
//		while(i<ages.length) {
//			System.out.println(ages[i]);
//			i++;  //we can also use ++i here.
//		}
		
		//traversing multidimensional arrays:
//		int[][] ages= {{1,2,3},{2,4,6}};
//		for(int i=0;i<ages.length;i++) {
//			for(int j=0;j<ages[i].length;j++) {
//				System.out.println(ages[i][j]);
//			}
//		}
		
		//questions:
		//1-calculating the sum of elements in an array.
//		int arr[]= {1,5,3};
//		int sum=0;
//		for(int i=0;i<arr.length;i++) {
//			sum+= arr[i];
//		}
//		System.out.println(sum);
		
		//2-calculating the maximum value of all the elements in the array.
		//for loop
//		int arr[]= {1,-25,0};
//		int a=0;
//		for(int i=0;i<arr.length;i++) {
//			if(arr[i]>a) {
//				a=arr[i];
//			}
//		}
//		System.out.println("the maximum value in the array is : " + a);
		
		//for each loop
//		int arr[]= {1,25,0};
//		int a=0;
//		for(int x: arr) {
//			if(x>a) {
//				a=x;
//			}
//		}
//		System.out.println("the maximum value is : " + a);
		
		//search the given element x in the array. if present then return the index else return -1.
		//it is also called as linear search.
//		int x=60;
//		int ans=-1;
//		int[]arr= {2,4,60,1,60};
//		for(int i=0;i<arr.length;i++) {
//			if(arr[i]==x) {
//				ans=i;
//				break;
//			}
//			
//		}
//		System.out.println(ans);
//		note:
//		stack is used to store primitive data types, function calls and reference variables.
//		heap is used to store objects and actual array data.
		
		//taking input in arrays:
		Scanner sc=new Scanner(System.in);
//		System.out.println("enter the size of array.");
//		int n=sc.nextInt();
//		int [] arr =new int[n];
//		System.out.println("enter " + n + " elements");
//		for(int i=0;i<arr.length;i++) {
//			arr[i]=sc.nextInt();
//		}
//		System.out.println("array you have entered");
////		for(int i=0;i<arr.length;i++) {
////			System.out.print(arr[i] + " ");
////		}
//		printArray(arr);
		
		//array reference in java.
		//let's see how the array's refernce is given to other variable. it is also called shallow copy,because
		//we made the copy of reference in place of giving it a new memory. in this case if we will change the
		//arr_2, then arr will also get changed.
//		System.out.println("it is the first array");
//		int arr[]= {1,2,6,8};
//		printArray(arr);
//		System.out.println("it is the second array");
//		int arr_2[]=arr;
//		printArray(arr_2);
		
		//now let's see does pass by value work for array or not:
//		int[]arr= {1,2,4,6};
//		changeArray(arr);
//		printArray(arr);
		//so, as conclusion we have find that the values of array have been changed through pass by value method
		//also, because array's data is stored in heap while the reference which is copied is stored in the stack.
		
		//there are basically two ways to copy the actual data of the array.
		//way-1:
		//cloning of an array-> it is the method to give a new memory to array elements in heap to copy it.
		//here, after changing the arr_2, the original array does not get changed.
		//it is also called as deep copy, because here memory is made for different reference variable.
//		int[]arr= {1,2,4,6};
//		int arr_2[]=arr.clone();
//		System.out.println("changing the arr_2");
//		arr_2[0]=0;
//		arr_2[1]=0;
//		System.out.println("original array");
//		printArray(arr);
//		System.out.println("copied array");
//		printArray(arr_2);
		
		//way-2:
		//using the array class from java.util package.
//		int[]arr= {1,2,4,6};
//		int arr_2[]=Arrays.copyOf(arr, arr.length);
//		System.out.println("changing the arr_2");
//		arr_2[0]=0;
//		arr_2[1]=0;
//		System.out.println("original array");
//		printArray(arr);
//		System.out.println("copied array");
//		printArray(arr_2);
		
		//there is a copyofrange() method in array class, let us use it:
//		int[]arr= {1,2,4,6};
//		int arr_2[]=Arrays.copyOfRange(arr, 1, 3);
//		printArray(arr_2);
//		
//		int [] arr_3= {2,4,6,8};
//		int [] arr_4=Arrays.copyOfRange(arr_3, 0, arr_3.length);
//		printArray(arr_4);
		
		//Questions:
		//1.count the number of  occurrences of a particular element x.
//		int arr[]= {5,1,5,2,5};
//		System.out.print("enter the number to check its occurrences: ");
//		int x=sc.nextInt();
//		System.out.println("the number of occurrences of element " + x + " is : " + countOccurrences(arr,x));
		
		//2.find the last occurrence of an element x in a given array.
//		System.out.println("enter the number of elements");
//		int n=sc.nextInt();
//		int a[]=new int[n];
//		System.out.println("enter " + " elements");
//		for(int i=0;i<n;i++) {
//			a[i]=sc.nextInt();
//		}
//		System.out.println("enter the element to find its last occurrences in array: ");
//		int x=sc.nextInt();
//		System.out.println("the last occurrence of the element is : " + lastOccurrences(a,x));
		
		//3.count the number of elements strictly greater than value of x.
//		System.out.println("enter the number of elements");
//		int n=sc.nextInt();
//		int a[]=new int[n];
//		System.out.println("enter " + " elements");
//		for(int i=0;i<n;i++) {
//			a[i]=sc.nextInt();
//		}
//		System.out.print("enter the number to compare : ");
//		int x=sc.nextInt();
//		System.out.println("number of elements greater than " + x + " is : " + greaterElement(a,x));
		
		//4.check if the given array is sorted or not.
//		int arr[]= {1,2,3,6,8};
//		System.out.println(isSorted(arr));
		
		//5.create a method which takes an array_1 and return another array_2 with 2 elements of which the
		//first element is the smallest and the second is the largest of the array_1.
//		int arr[]= {1,20,3,5,7,4};
//		int ans[]=smallestAndLargestElement(arr);
//		System.out.println("the new array after sorting:");
//		for(int i=0;i<ans.length;i++) {
//			System.out.println(ans[i]);
//		}
		
		//6.create a method to give kth smallest and kth largest element of an element.
//		System.out.println("enter the number of elements");
//		int n=sc.nextInt();
//		int a[]=new int[n];
//		System.out.println("enter " + " elements");
//		for(int i=0;i<n;i++) {
//			a[i]=sc.nextInt();
//		}
//		System.out.println("to find kth smallest enter 1 and to find kth largest enter 2 : ");
//		int t=sc.nextInt();
//		if(t==1) {
//			System.out.println("enter the kth smallest : ");
//			int x=sc.nextInt();
//		}
//		if(t==2) {
//			System.out.println("enter the kth largest : ");
//			int x=sc.nextInt();
//		}
//		int[]arr= {108,25,2,6,30,12,45};
//		System.out.println(kthSmallestElement(arr));
		
		//some other basic problems:
		//pattern: target sum
		//1. find the total number of pairs in the array whose sum is equal to the given value x.
//		System.out.println("enter the number of elements : ");
//		int n=sc.nextInt();
//		int arr[]=new int[n];
//		System.out.print("enter " + " elements : ");
//		for(int i=0;i<n;i++) {
//			arr[i]=sc.nextInt();
//		}
//		System.out.println("enter the target sum : ");
//		int target=sc.nextInt();
//		System.out.println(pairSum(arr,target));
		
		//2.count the number of triplets whose sum is equal to the given value x.
//		System.out.println("enter the number of elements : ");
//		int n=sc.nextInt();
//		int arr[]=new int[n];
//		System.out.print("enter " + " elements : ");
//		for(int i=0;i<n;i++) {
//			arr[i]=sc.nextInt();
//		}
//		System.out.println("enter the target sum : ");
//		int target=sc.nextInt();
//		System.out.println(tripletSum(arr,target));
		
		//pattern: array manipulation
		//1.find the unique number in a given array where all the elements are being repeated twice
		//with one value being unique. * only positive elements in an array.
//		System.out.println("enter the number of elements : ");
//		int n=sc.nextInt();
//		int arr[]=new int[n];
//		System.out.print("enter " + " elements : ");
//		for(int i=0;i<n;i++) {
//			arr[i]=sc.nextInt();
//		}
//		System.out.println(findUnique(arr));
		
		//2.find the second largest element in the given array. * answer will  always exist.
//		int []arr = {9,8,9,6,9,5,8};
//		System.out.println("maximum element is : " + MaximumElement(arr));
//		System.out.println("second maximum element is : "+ secondMax2(arr));
		
		//3.given an array 'a' consisting of integers. Return the first value that is repeating
		//in this array. if no value is being repeated, return-1.
		
//		int [] a= {1,2,5,3,4};
//		System.out.println("first repeated value is : " + firstRepeat(a));
		
		//4.given an array 'a' consisting of integers. Return the last value that is repeating
		//in this array. if no value is being repeated, return-1.
//		int[]arr= {1,2,4,5,8,1,8,2};
//		System.out.println("the last repeated element is : " + lastRepeat(arr));
		
		//5.find the second smallest element in the given array.
//		int[]arr= {8,90,2,4,100,200,46};
//		System.out.println("second minimum element : " + secondMin(arr));
		
		//miscellaneous problems:
		//6.given 2 integers a and b. Swap the 2 given values using temporary variables.
//		int a=9;
//		int b=5;
//		swap(a,b);
		//7.given 2 integers a and b. Swap the 2 given value using sum and difference method.
//		int a=9;
//		int b=5;
//		swapWithoutTemp(a,b);
		
		//8.reverse an array consisting of integer values.
//		int arr[]= {1,2,3,4,5};
//		reverseArray3(arr);
//		printArray(arr);
		
		//9.rotate the given array 'a' by k steps,where k is non-negative.
		//note: k can be greater then n as well.
//		int arr[]= {1,2,3,4};
//		int k=50;
//		int ans[]=rotate(arr,k);
//		printArray(ans);
		
		//10.rotate the given array 'a' by k steps,where k is non-negative without using extra space.
		//note: k can be greater then n as well.
//		int arr[]= {1,2,3,4};
//		int k=3;
//		rotateByReversing(arr,k);
//		printArray(arr);
		
		//11.given q queries,check if the given number is present in the array or not.
		//note : value of all the elements in the array is less than 10 to the power 5.
//		int arr[]=takingArray();
//		int freq[]=makeFrequencyArray(arr);
//		System.out.println("enter the queries");
//		int q=sc.nextInt();
//		while(q>0) {
//			System.out.println("enter number to be searched ");
//			int x=sc.nextInt();
//			if(freq[x]>0) {
//				System.out.println("yes");
//			}
//			else {
//				System.out.println("no");
//			}
//		}
		
		//problems based on two pointer approach.
		//12.sort an array consisting of only 0s and 1s.(in increment order)
//		int arr[]=takingArray();
//		sortZeroesAndOnes(arr);
//		printArray(arr);
		
		//13.sort an array consisting of only 0s and 1s by 2-pointer approach.(in increment order)
//		int arr[]=takingArray();
//		sortZeroesAndOnesBy2Pointers(arr);
//		printArray(arr);
		
		//14.given an array of integers 'a',move all the even integers at the beginning of the
		//array followed by all the odd integers. the relative order of odd or even integers does
		//not matter. return any array that satisfies the condition.
//		int arr[]=takingArray();
//		sortArrayByParity(arr);
//		printArray(arr);
		
		//15.given an integer array 'a' sorted in non-decreasing order, return an array of the
		//squares of each number sorted in non-decreasing order.
//		int arr[]=takingArray();
//		int ans[]= sortSquares(arr);
//		printArray(ans);
		
		//pattern: prefix sum
		//16.given an integer array 'a', return the prefix sum/running sum in the same array
		//without creating a new array.
//		int []arr=takingArray();
//		makePrefixSumArray(arr);
//		printArray(arr);
		
		//17.given an array of integers of size n. answer q queries where you need to print the sum
		//of value in a given range of indices from 1 to r(both included).
		//note:the values of 1 and r in queries follow 1-based indexing.
//		int arr[]=takingArray();
//		System.out.println("Enter number of elements : ");
//		int x=sc.nextInt();
//		int arr[]=new int[x+1];
//		
//		System.out.println("Enter " + x + " elements");
//		for(int i=1;i<=x;i++) {
//			arr[i]=sc.nextInt();
//		}
//		int pref[]=makePrefixSumArray(arr);
//		System.out.println("enter the queries");
//		int q=sc.nextInt();
//		while(q-->0) {
//			System.out.println("enter range");
//			int l=sc.nextInt();
//			int r=sc.nextInt();
//			int ans=pref[r]-pref[l-1];
//			System.out.println("sum " + ans);
//		}
		
		//18.check if we can partition the array into two subarrays with equal sum. More formally,
		//check that the prefix sum of a part of the array is equal to the suffix sum of rest
		//of the array.
//		int [] arr=takingArray();
//		System.out.println(checkSubArrays2(arr));
	}

}
