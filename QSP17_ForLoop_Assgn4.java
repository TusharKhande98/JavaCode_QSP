import java.util.Scanner;
public class QSP17_ForLoop_Assgn4 {
    public static void main(String[] args) {
        // pin verify with while
        Scanner s= new Scanner(System.in);
        int attempt = 0;
        int actPin = 1234;
        while(attempt<3)
        {
            System.out.print("Enter you PIN:- ");
            int pin = s.nextInt();
            if (pin == actPin)
            {
                System.out.println("LogIn Successful");
                break;
            }
            else
            {
                System.out.println("PIN incorrect... Try again");
                attempt++;
            }
        }
        if(attempt == 3)
        {
            System.out.println("Reached maximum limit");
        }
    }
}
