import java.util.Scanner;
class QSP16_DoWhileLoop2 {
    public static void main(String[] args) {
        //  PIN  verification
        Scanner s= new Scanner(System.in);
        int attempt = 0;
        int actPin = 1234;
        do
        {
            System.out.print("Enter you PIN:- ");
            int pin = s.nextInt();

            if (pin == actPin)
            {
                System.out.println("LogIn Successful");
                break;
            }
            System.out.println("PIN incorrect... Try again");
            attempt++;
        }
        while(attempt<3);

        if(attempt == 3)
        {
            System.out.println("Reached maximum limit");
        }
    }
}
