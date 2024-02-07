public class Task1 {
    public static void main(String[] args){

        //Variables
        double price = 19.99;
        double salesTaxPrice;
        double total;
        double SALESTAX = 0.05;

        //Math
        salesTaxPrice = price * SALESTAX;
        total = price + salesTaxPrice;

        //Output
        System.out.println("The sales tax is: $" + salesTaxPrice + "\n The total is: $" + total);



    }
}
