class QSP10_IfElseStatement_Assgn2 {
    public static void main(String[] args) {

        System.out.println("\n");

        double sal = 400000;
        double annual = sal*12;

        if(annual<=0)
        {
            System.out.println("Please enter correct salary amount");
        }
        else if(annual<=300000)
        {
            System.out.println("Your annual income is:- " + annual);
            System.out.println("So, you don't need to pay tax");
        }
        else if(annual>300000 && annual<=600000)
        {
            double tax = annual*0.05;
            System.out.println("Your annual income is:- " + annual);
            System.out.println("So, pay tax amount of 5%  = " + tax);
        }
        else if(annual>600000 && annual<=900000)
        {
            double tax = annual*0.10;
            System.out.println("Your annual income is:- " + annual);
            System.out.println("So, pay tax amount of 10%  = " + tax);
        }
        else if(annual>900000 && annual<=1200000)
        {
            double tax = annual*0.15;
            System.out.println("Your annual income is:- " + annual);
            System.out.println("So, pay tax amount of 15%  = " + tax);
        }
        else if(annual>1200000 && annual<=1500000)
        {
            double tax = annual*0.20;
            System.out.println("Your annual income is:- " + annual);
            System.out.println("So, pay tax amount of 20%  = " + tax);
        }
        else if(annual>1500000)
        {
            double tax = annual*0.30;
            System.out.println("Your annual income is:- " + annual);
            System.out.println("So, pay tax amount of 30%  = " + tax);
        }
        else
        {
            System.out.println("Wrong input");
        }

    }
}
