package ca.demo.salestool;

public class Main {

	
	
	
public static void displaygreeting()
{
	System.out.println("hello happy sales CAPS FIXED");
	System.out.println("this app shoows sales data CAPS FIXED");
	System.out.println("-------------------------------------");
	System.out.println("test 1");
	System.out.println("test 2");
}


public static void main(String[] args) {
	
	SalesData data =new SalesData();
	displaygreeting();
	data.display();
	
	
}


}
