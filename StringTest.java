package week3.day1.assignment;


public class StringTest {
	public static void main (String[] args) {
	
		
		//Assignment 5
		 String str3 = new String("Kutty");
		 String str4 = new String("Kutty");
		 
		 if(str3==str4) {
			 System.out.println(" Same text");
		 }
		 else
			 System.out.println("Diff text");
		 //Output:-str3 and str4 stores in different memory allocation.Hence,the str3 is not equal to str4.
		
		//Assignment 6
		// A flow chart to show the single level and multilevel inheritence in Selenium. 
		//SafariDriver extends RemoteWebDriver- single level
		//ChromeDriver extends ChromiumDriver-multilevel inheritance
		//EdgeDriver extends ChromiumDriver- multilevel
		
		
	//Assignment 7 -Exercise1
	String text = "Java Exercise";
	int i =text.indexOf("E");
	int j=text.indexOf("s");
	System.out.println("position of E "+i +"Position of s "+j);
	
	//Assignment 7 -Exercise2
	String str1="I am Learning Java" ;
	String str2="I am learning java";
	if (str1.equals(str2))
		System.out.println(str1 +" is equal to "+ str2);
	else 
		System.out.println(str1 +" is not equal to "+ str2);
	if (str1.equalsIgnoreCase(str2))
		System.out.println(str1 +"is equal to "+ str2);
	else 
		System.out.println(str1 +"is not equal to "+ str2);
	
	//Assignment 7 -Exercise3
	String sentence = "I am working with Java8";
	
	String sentence1= sentence.replace("8", "11");

	String sentence2= sentence1.substring(5, 15);
	System.out.println("new string "+sentence1);
	System.out.println("print the character "+sentence2);
	
		
		
			
			
}	

	

}
