package package1;

public class Student
{
    int a=455;  // a is a variable that will store integer value
    public void display()  // display() is the method
    { // boundary of the method
     System.out.println("Welcome to all of you");	
    }
    public static void main(String[] args) 
    {
		Student arun=new Student();  // object creation
		arun.display();   // calling the display method
		System.out.println("I am the main method"); // printing a msg
		arun.display();  // calling the display method
		System.out.println("value of a "+arun.a);
		arun.a=12;  // calling the variable and giving the value
		System.out.println("value of a "+arun.a); // print the value of a
		arun.a=34; // calling the variable and giving the value again
		System.out.println("value of a "+arun.a); // printing the value of a
	}
    
	
}
