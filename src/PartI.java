public class PartI {
    public static void main(String[] args) {

        //Variables
        int intOperandA = 5;
        int intOperandB = 25;
        int intSum, intProduct, intDifference, intQuotient, intModulo;
        double doubleOperandA = 3.14;
        double doubleOperandB = 5.56;
        double doubleSum, doubleProduct, doubleDifference, doubleQuotient, doubleModulo;

        //Integer Math
        intSum = intOperandA + intOperandB;
        intDifference = intOperandA - intOperandB;
        intProduct = intOperandA * intOperandB;
        intQuotient = intOperandA / intOperandB;
        intModulo = intOperandA % intOperandB;

        //Integer Output
        System.out.println("The Integers: ");
        System.out.println("The sum is: " + intSum);
        System.out.println("The Difference is: " + intDifference);
        System.out.println("The Product is: " + intProduct);
        System.out.println("The Quotient is: " + intQuotient);
        System.out.println("The Modulo is: " + intModulo);

        //Double Math
        doubleSum = doubleOperandA + doubleOperandB;
        doubleDifference = doubleOperandA - doubleOperandB;
        doubleProduct = doubleOperandA * doubleOperandB;
        doubleQuotient = doubleOperandA / doubleOperandB;
        doubleModulo = doubleOperandA % doubleOperandB;

        //Double Output
        System.out.println("\n The Doubles: ");
        System.out.println("The Sum is: " + doubleSum);
        System.out.println("The Difference is: " + doubleDifference);
        System.out.println("The Product is: " + doubleProduct);
        System.out.println("The Quotient is: " + doubleQuotient);
        System.out.println("The Modulo is: " + doubleModulo);




    }
}
