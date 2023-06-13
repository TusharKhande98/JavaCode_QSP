import java.util.Scanner;
public class QSP17_ForLoop_Assgn2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int pin = 1234;

        for (int ip = 1; ip<3; ip++)
        {
            System.out.println("Enter PIN here: -");
            int pinEnt = sc.nextInt();
            if(pinEnt == pin)
            {
                System.out.println("Login Success");
                break;
            }
            else
            {
                System.out.println("Invalid PIN");
            }
            if (pinEnt==3)
            {
                System.out.println("Maximum limit reached");
            }
        }
    }
}
