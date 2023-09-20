/**
 * Purpose: the currency class converts an amount of money from a specific country into
 * the equivalent currency of another country given the current exchange rate.
 *
 * @author Richa Limaye
 * @version Septermber 6, 2023
 */


public class CurrencyV1 {
    public static void main(String [ ] args){
        //Declare and initialize local variables
        double startingUsDollars = 6500.00;		// starting US Dollars

        // Message to user stating purpose
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("This program converts an amount of money");
        System.out.println("from a specific country into the equivalent");
        System.out.println("currency of another country given the current");
        System.out.println("exchange rate.");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println();
        System.out.printf("%-35s%-45s\n", "Starting US dollars:", startingUsDollars);

        double cadSpent = 2576.14;
        double cadExchangeRate = 1.366250;
        double dollarsSpentInCanada = cadSpent*(1/cadExchangeRate);
        double dollarsAfterCanada = startingUsDollars - dollarsSpentInCanada;
        System.out.println("\nCanada: ");
        System.out.printf("%-35s%-45s\n", " Canadian dollars spent:", cadSpent);
        System.out.printf("%-35s%-45s\n", " US dollars equivalent:", dollarsSpentInCanada);
        System.out.printf("%-35s%-45s\n", " US dollars remaining:", dollarsAfterCanada);

        double jpySpent = 86435.207;
        double jpyExchangeRate = 147.5352;
        double dollarsSpentInJapan = jpySpent*(1/jpyExchangeRate);
        double dollarsAfterJapan = dollarsAfterCanada - dollarsSpentInJapan;
        System.out.println("\nJapan: ");
        System.out.printf("%-35s%-45s\n", " Japanese yen spent:", jpySpent);
        System.out.printf("%-35s%-45s\n", " US dollars equivalent:", dollarsSpentInJapan);
        System.out.printf("%-35s%-45s\n", " US dollars remaining:", dollarsAfterJapan);

        double inrSpent = 1825.37;
        double inrExchangeRate = 1.366250;
        double dollarsSpentInIndia = inrSpent*(1/inrExchangeRate);
        double dollarsAfterIndia = dollarsAfterJapan - dollarsSpentInIndia;
        System.out.println("\nIndia: ");
        System.out.printf("%-35s%-45s\n", " Indian rupees spent:", inrSpent);
        System.out.printf("%-35s%-45s\n", " US dollars equivalent:", dollarsSpentInIndia);
        System.out.printf("%-35s%-45s\n", " US dollars remaining:", dollarsAfterIndia);

        // Complete the code below for Souvenir Purchases
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Souvenir Purchases");
        System.out.println(" (all values in US Dollars) ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        //Calculations for Souvenir #1
        int costItem1 = 12;  						//cost per item of first souvenir
        int budget1 = 100;   						//budget for first item
        int totalItems1 = (int) (budget1/costItem1); 		//how many items can be purchased
        int fundsRemaining1 = (budget1 - (totalItems1*costItem1));  //how much of the budget is left

        System.out.println("Item 1");
        System.out.println("   Cost per item: $" + costItem1 );
        System.out.println("   Budget: $"+ budget1);
        System.out.println("   Total items purchased: " +  totalItems1);
        System.out.println("   Funds remaining: $"  +  fundsRemaining1);
        System.out.println();

        //Calculations for Souvenir #2
        double costItem2 = 29.99;  						//cost per item of second souvenir
        int budget2 = 500;   							//budget for second item
        int totalItems2 = (int) (budget2/costItem2); 	//how many items can be purchased
        double fundsRemaining2 = (budget2 - (totalItems2 * costItem2));  	//how much of the budget is left

        System.out.println("Item 2");
        System.out.println("   Cost per item: $" + costItem2 );
        System.out.println("   Budget: $"+ budget2);
        System.out.println("   Total items purchased: " +  totalItems2);
        System.out.println("   Funds remaining: $"  +  fundsRemaining2);

    }
}
