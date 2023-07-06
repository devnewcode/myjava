import java.util.Scanner;

public class Strings {

	public static void main(String[] args) {
		/*
		Scanner sc=new Scanner(System.in);
		String name=sc.nextLine();
		String name="krishna";
		String sentence="jai shri ram.";
		System.out.println("your name is: "+name);
		System.out.println("your sentence is: "+sentence);
		System.out.println(name);
		*/
		//some functions on strings.
		//1.concatenation
		/*
		String firstName="rahul";
		String lastName="sharma";
		String fullName=firstName+ " " +lastName;
		System.out.println(fullName);
		*/
		//2.length
		//System.out.println(fullName.length());
		
		//3.charAt
		/*
		String firstName="rahul";
		String lastName="sharma";
		String fullName=firstName+ " " +lastName;
		for(int i=0;i<fullName.length();i++) {
			System.out.println(fullName.charAt(i));
		}
		*/
		//compare
		//String name1="Apple";
		//String name2="Apple";
		//in this the function .compareTo() has three cases:
		//case 1: string1>string2= +ve value
		//case 2: string1==string2= 0
		//case 3: string1<string2= -ve value
		
		//.compareTo() compares the value of first dissimilar characters of both strings.
		//for example->we have string1= aahello & string2= aabello
		//here, in both the strings letter 'a' is equal but after that there is 'h' and 'b'
		//now 'h' has the higher value here. So, string1 has higher value in this example.
		/*
		if(name1.compareTo(name2)==0) {
			System.out.println("Strings are equal");
		}
		else {
			System.out.println("Strings are not equal");
		}
		*/
		//substrings
		/*
		String sentence="my name is tarun.";
		String name=sentence.substring(11,sentence.length());
		System.out.println(name);
		String name2=sentence.substring(3,7);
		System.out.println(name2);
		*/
		//ParseInt Method of integer class
		/*
		String str="123";
		int number = Integer.parseInt(str);
		System.out.println(number);
		*/
		//ToString Method of String class
		/*
		int number = 123;
		String str=Integer.toString(number);
		System.out.println(str.length());
		*/
		//problem 1->take an array of strings input from the user & find the cumulative(combined)
		//length of all those strings.
		/*
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the size of the array");
		int size=sc.nextInt();
		String str[]=new String[size];
		int tolength=0;
		System.out.println("enter the strings to the array.");
		for(int i=0;i<size;i++) {
			str[i]=sc.next();
		}
		for(int i=0;i<size;i++) {
			tolength= tolength + str[i].length();
		}
		System.out.println("the combined length of all the strings is : " + tolength);
		*/
		//problem 2->input a string from the user. create a new string called 'result' in which you will
		//replace the letter 'e' in the original string with letter 'i'.
		//example:
		//original="eabcdef" ; result= "iabcdif"
		//original= "xyz" ; result= "xyz"
		/*
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the string 1 with letter 'e'.");
		String str1=sc.next();
		String result=str1.replace('e', 'i');
		System.out.println("the new string is : " + result);
		*/
		//problem 3->input an email from the user. you have to create a username from the email by
		//deleting the part that comes after '@'. display that username to the user.
		//example:
		//email="apnaCollegeJava@gmail.com";
		//username="apnaCollegeJava"
		//email="helloWorld123@gmail.com";
		//username="helloWorld123"
		/*
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your email id");
		String email=sc.next();
		String username="";
		char a='@';
		for(int i=0;i<email.length();i++) {
			if((email.charAt(i))!=a) {
				username=username + email.charAt(i);
			}
			else {
				break;
			}
		}
		System.out.println("your username is : "+username);
		*/
		
		//String Builder
		StringBuilder sb = new StringBuilder("hello");
		System.out.println(sb);
		
		//char at 0 index
		System.out.println(sb.charAt(0));
		
		//function: set char at index.
		sb.setCharAt(0, 'P');
		System.out.println(sb);
		
		//setting the character in string
		sb.insert(0, 'S');
		System.out.println(sb);
		
		//deleting a sub string or a character from the string.
		sb.delete(0, 1);
		System.out.println(sb);
		
	}
}
