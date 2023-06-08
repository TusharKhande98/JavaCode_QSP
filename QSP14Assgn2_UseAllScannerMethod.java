import java.util.Scanner;
class QSP14Assgn2_UseAllScannerMethod {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter a 'byte'  value:-");
        byte b = s.nextByte();
        System.out.println("\tEntered value is:- " + b);

        System.out.print("Enter a 'short' value:-");
        short sh = s.nextShort();
        System.out.println("\tEntered value is:- " + sh);

        System.out.print("Enter a 'integer' value:-");
        int i = s.nextInt();
        System.out.println("\tEntered value is:- " + i);

        System.out.print("Enter a 'float' value:-");
        float f = s.nextFloat();
        System.out.println("\tEntered value is:- " + f);

        System.out.print("Enter a 'double' value:-");
        double d = s.nextDouble();
        System.out.println("\tEntered value is:- " + d);

        System.out.print("Enter a 'character' value:-");
        char c = s.next().charAt(0);
        System.out.println("\tEntered value is:- " + c);

        System.out.print("Enter a 'string(single word)' value:-");
        String st = s.next();
        System.out.println("\tEntered value is:- " + st);

        // Its not gives o/p
        System.out.print("Enter a 'string(Type a line)' value:-");
        String stl = s.nextLine();
        System.out.println("\tEntered value is:- " + stl);
    }
}
