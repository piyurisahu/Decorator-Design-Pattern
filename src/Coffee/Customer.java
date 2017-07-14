package Coffee;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Customer {
	
	private static int choice;
	
	  public static void main(String args[]) throws NumberFormatException, IOException 
	  {
		  do
		  {
			  System.out.println("=====FOOD MENU====");
			  System.out.println("    1.Expresso     ");
			  System.out.println("    2.Expresso with carmel    ");
			  System.out.println("    3.Expresso with moch and carmel    ");
			  System.out.println("    4.Expresso with soy    ");
			  System.out.println("Enter Choice");
			  BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
			  choice=Integer.parseInt(br.readLine());
		  
		  
		 
		  
		  switch (choice)
		  {
		  case 1: 
			  {Beverage coffee=(Beverage) new Expresso();
		  			System.out.println(coffee.getDescription());
		  			System.out.println(coffee.cost());
			  }
			  break;   
		  case 2:
		  {
			  Beverage coffeeWithCarmel=new Carmel((Beverage) new Expresso());
			  System.out.println(coffeeWithCarmel.getDescription());
			  System.out.println(coffeeWithCarmel.cost());
			  
		  }break;   
		  case 3:
		  {
			  Beverage withCarmelandSoy=new Soy(new Carmel((Beverage) new Expresso()));
			  System.out.println(withCarmelandSoy.getDescription());
			  System.out.println(withCarmelandSoy.cost());
		  }break;   
		  	
		  case 4:
		  {
			  Beverage coffeeMocha=new Mocha((Beverage) new Expresso());
			  System.out.println(coffeeMocha.getDescription());
			  System.out.println(coffeeMocha.cost());
		  }break;   
		  default: {
			  System.out.println("Coffee is not available");
		  }
		  return;
		  }
		  }while(choice!=4);
	  }

}
