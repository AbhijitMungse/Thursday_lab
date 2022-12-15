package exerciseQue;

public class CompareTwoString {
public static void main(String[] args) {
	String str1="Welcome to java";
	String str2="Welcome to python";
	String str3="Welcome to java";
	if(str1.compareTo(str2)==0)//using compareTo to chech two strings are equal or not
	{
		System.out.println("Strings are equal");
	}
	else
	{
		System.out.println("Strings are not equal");
	}
	if(str1.compareTo(str3)==0)
	{
		System.out.println("Strings are equal");
	}
	else
	{
		System.out.println("Strings are not equal");
	}
}
}
