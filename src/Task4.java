public class Task4 {
    public static void main(String[] args) {

        //Variables
        int myNum = 1001;
        int dividedBy = 2;
        int Checked;

        //Math
        Checked = myNum % dividedBy;

        //Check if Even
        if (Checked == 0) {

            System.out.println("Your number " + myNum + " is even!");

        }

        else {

            System.out.println("Your number " + myNum + " is odd!");

        }

    }
}
