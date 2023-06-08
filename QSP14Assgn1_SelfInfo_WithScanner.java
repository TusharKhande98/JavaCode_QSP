import java.util.Scanner;
class QSP14Assgn1_SelfInfo_WithScanner {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Type your First name:-");
        String fn = s.nextLine();
        System.out.print("Type your Last name:-");
        String ln = s.nextLine();
        System.out.print("Course Name:- ");
        String cn = s.nextLine();
        System.out.print("YOP:-");
        int yop = s.nextShort();
        System.out.print("Contact No.:-");
        long cont = s.nextLong();

        System.out.println("Type your name initials below in uppercase, to get I'd");
        System.out.print("First name:- ");
        char fnid = s.next().charAt(0);
        System.out.print("Last name:- ");
        char lnid = s.next().charAt(0);

        System.out.println("Your registration is done...");
        System.out.println("\tStudent Name:- " + fn + " " + ln);
        System.out.println("\tPaas-out year:- " +yop);
        System.out.println("\tContact No.:- " + cont);
        System.out.println("\tEnrolled to Course:-  " + cn);
        System.out.println("\tID no:- " + fnid+lnid + "-" + 101);


    }
}
