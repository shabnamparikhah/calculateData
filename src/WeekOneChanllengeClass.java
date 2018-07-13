import java.util.Scanner;

public class WeekOneChanllengeClass {
    public static void main(String[] args)
    {
        Scanner myScan = new Scanner(System.in);
        String apple ;
        String banana ;
        double price1;
        double price2;
        int quantity1;
        int quantity2;
        double totalCost1;
        double totalCost2;
        double totalAmount;

        System.out.println("Enter Item Name1 : ");
        apple = myScan.next();

        System.out.println("Enter Item Name2 : ");
        banana = myScan.next();

        System.out.println("Enter Item price1 : ");
        price1 = myScan.nextDouble();

        System.out.println("Enter Item price2 : ");
        price2 = myScan.nextDouble();

        System.out.println("Enter Item quantity1 : ");
        quantity1 = myScan.nextInt();

        System.out.println("Enter Item quantity2 : ");
        quantity2 = myScan.nextInt();

        totalCost1 = price1 * quantity1;
        totalCost2 = price2 * quantity2;
        totalAmount = totalCost1+ totalCost2;

        System.out.println("Item Name \t Price \t Quantity \t Cost \n" +  apple +"     \t "+"$"+   price1 + "     \t" + quantity1 + "      \t  " +"$"+
                totalCost1 + "\n"  +  banana +"    \t " +"$"+    price2 + "    \t" + quantity2 + "      \t  " +"$"+ totalCost2 );

        System.out.println("--------------------------------------------------------" );
        System.out.println("Total Purchase Amount : "  +"$"+ totalAmount);






    }
}
