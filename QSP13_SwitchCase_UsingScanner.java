import java.util.Scanner;
class QSP13_SwitchCase_UsingScanner {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("***** Welcome to our Restaurant *****");

        System.out.println("What do you prefer in Lunch/Dinner?");
        System.out.println("1. Veg \n2. Non-Veg\n");
        System.out.println("Select option number from above");


        int veg = sc.nextInt();
        //  Switch case - 1 for Veg
        switch (veg)
        {
            case 1:
                System.out.println("\n*-*-* Veg Menu *-*-*");
                System.out.println("1. Paratha ---> 50 rs.");
                System.out.println("2. Puri Bhaji ---> 70 rs.");
                System.out.println("3. Paneer tikka masala ---> 150 rs.");
                System.out.println("4. Roti ---> 7 rs.\n");

                System.out.println("Choose number from above to order food");
                int vegip = sc.nextInt();
                System.out.println("Enter quantity of item you have to order");
                int qty = sc.nextInt();
                System.out.println(" ");
                switch (vegip)
                {
                    case 1:
                        int paratha = 50;
                        System.out.println("Your order of "+ qty +" 'Paratha' will be ready in short");
                        System.out.println("You can make payment of " + (paratha*qty) + "/-Rs");
                        break;

                    case 2:
                        int puribhaji = 70;
                        System.out.println("Your order of "+ qty +" 'Puri Bhaji' will be ready in short");
                        System.out.println("You can make payment of " + (puribhaji*qty) + "/-Rs");
                        break;
                    case 3:
                        int pbm = 150;
                        System.out.println("Your order of "+ qty +" 'Paneer butter masala' will be ready in short");
                        System.out.println("You can make payment of " + (pbm*qty) + "/-Rs");
                        break;

                    case 4:
                        int roti = 7;
                        System.out.println("Your order of "+ qty +" 'Roti' will be ready in short");
                        System.out.println("You can make payment of " + (roti*qty) + "/-Rs");
                        break;
                    default:
                        System.out.println("Please enter correct choice");
                }
                break;


            case 2:
                System.out.println("\n*-*-* Non-veg Menu *-*-*");
                System.out.println("1. Egg Roll ---> 80 rs.");
                System.out.println("2. Chicken Egg Roll ---> 99 rs.");
                System.out.println("3. Chicken fry---> 90 rs.");
                System.out.println("4. Mutton soup ---> 60 rs.\n");

                System.out.println("Choose number from above, to order food");
                int nonvegip = sc.nextInt();
                System.out.println("Enter quantity of item you have to order");
                int nvqty = sc.nextInt();
                System.out.println(" ");
                switch (nonvegip)
                {
                    case 1:
                        int er = 80;
                        System.out.println("Your order of "+ nvqty +" 'egg Roll' be ready in short");
                        System.out.println("You can make payment of " + (er*nvqty) + "/-Rs");
                        break;

                    case 2:
                        int cer = 99;
                        System.out.println("Your order of "+ nvqty +" 'Chicken Egg Roll' will be ready in short");
                        System.out.println("You can make payment of " + (cer*nvqty) + "/-Rs");
                        break;
                    case 3:
                        int cf = 90;
                        System.out.println("Your order of "+ nvqty +" 'Chicken Fry' will be ready in short");
                        System.out.println("You can make payment of " + (cf*nvqty) + "/-Rs");
                        break;

                    case 4:
                        int ms = 60;
                        System.out.println("Your order of "+ nvqty +" 'Mutton Soup' will be ready in short");
                        System.out.println("You can make payment of " + (ms*nvqty) + "/-Rs");
                        break;
                    default:
                        System.out.println("Please enter correct choice");


                }

        }


    }
}
