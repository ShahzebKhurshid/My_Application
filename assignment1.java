package assignment1;

import java.util.Scanner;

public class assignment1 {
	public static void main(String[] args) {
		
		int factor;
		double  BasketPrice =2;
		double  IngredientPrice = 2.15;
Scanner keyboard = new Scanner(System.in); //create scanner object for all input	

System.out.print("What type of milkshake would you like to make (enter V or R)? "); 
String type = keyboard.nextLine();
System.out.print("How many milkshakes will you make? ");
int number = keyboard.nextInt();
System.out.print("How much will you charge for each milkshake (specify both dollars and cents)? ");
double price = keyboard.nextDouble();
System.out.print("How long does it take to make a milkshake (in minutes)? ");
double time = keyboard.nextDouble();
//set condition
if (type == " R") {factor = 1 ;
} else {factor = 1;
}
//calculate data
float basket= factor * number/3f;
double basketFinal= factor * Math.ceil(basket);
double cost= basketFinal * BasketPrice + number * IngredientPrice;
double revenue= price * number;
double profit= revenue - cost;
double TimeCost= time * number;
//display result
System.out.println("In order to make " +  number + " raspberry milkshakes:");
System.out.println("You will need to buy " +  basketFinal + " baskets of raspberries");
System.out.println("You will need to spend $" + cost);
System.out.println("The customer would pay $" + revenue);
System.out.println("You would earn $" + profit);
System.out.println("It will take you " +  TimeCost + " minutes to make the milkshakes.");
keyboard.close();
	}
}


