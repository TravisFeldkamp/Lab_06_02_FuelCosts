import java.util.Scanner;
public class FuelCosts {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);//initialize scanner for user input
        double gasTank = 0;//variable for gas in the tank
        double fuelMiles = 0;//variable for miles per gallon
        double priceGas = 0;//variable for cost of gas
        String trash = "";//variable for incorrect input
        double xMiles = 0;//variable for number of miles to be traveled given mpg, and gallons in tank
        double hundredMiles = 0;// variable for 100 miles


        System.out.println("How many gallons of gas is in the tank?");//output to user for gas in tank
        if(in.hasNextDouble()) {//if a double is given run this block of code
            gasTank = in.nextDouble();//gasTank variable now hold user input
        }
        else {//if invalid input given run this code
            trash = in.nextLine();//user input stored as trash
            System.out.println("That is an invalid input:" + trash);//output for invalid input
            System.out.println("Run the program again and enter a valid input" );//output telling user to rerun program
            System.exit(0);//exits and stops program
        }
        System.out.println("How many miles per gallon do you get?");//output to user MPG
        if(in.hasNextDouble()){// if a double is given run this block of code
            fuelMiles = in.nextDouble();// fuelMiles variable now hold user input
}
        else {trash = in.nextLine();// if invalid input given run this code
            System.out.println("That is an invalid input:" + trash);//output for invalid input
            System.out.println("Run the program again and enter a valid input" );//output telling user to rerun program
            System.exit(0);//exits and stops program
        }
        System.out.println("How much does gas cost per gallon?");//output to user for price of gas
        if (in.hasNextDouble())//run this block of code if valid input given
            priceGas = in.nextDouble();//set users input to priceGas
        else {//run this if invalid user input given
            System.out.println("That is an invalid input:" + trash);//output for invalid input
            System.out.println("Run the program again and enter a valid input" );//output telling user to rerun program
            System.exit(0);//exits and stops program

        }
        hundredMiles = 100 / fuelMiles ;// hundredMiles variable becomes answer to 100 / fuelMiles
        hundredMiles = hundredMiles * priceGas;// hundredMiles now stores info of hundredMiles*priceGas
        System.out.println("The cost of driving 100 Miles is  $" + hundredMiles );//output to user telling them the cost of driving 100 miles
        xMiles = gasTank * fuelMiles;//xmiles now becomes the answer to gasTank * fuelMiles
        System.out.println("You can travel " + xMiles + " miles with the gas in your tank.");// output to user telling them how many miles they can travel
    }
}