package ca.demo.salestool;

public class Main {

	
	
	
public static void displaygreeting()
{
	System.out.println("hello happy sales");
	System.out.println("this app shoows sales data");
	System.out.println("test 1");
}


public static void main(String[] args) {
	
	SalesData data =new SalesData();
	displaygreeting();
	data.display();
	
	
}


}
