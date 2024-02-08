public class Task3 {
    public static void main(String[] args) {

        //Variables
        double balance, monthOne, monthTwo, INTEREST;
        balance = 5000;
        INTEREST = 1.17;

        //Math
        monthOne = balance * INTEREST;
        monthTwo = monthOne * INTEREST;

        //Output
        System.out.println("Your current balance is: $" + balance + "\nYour balance after one month: $" + monthOne + "\nYour balance after two months: $" + monthTwo);

    }
}
