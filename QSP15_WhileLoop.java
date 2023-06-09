import java.util.Scanner;
class QSP15_WhileLoop {
    public static void main(String[] args) {

        // 1. print same line 5 times
        int start1 = 0;
        while(start1<5)
        {
            System.out.println("Hello flash");
            start1++;
        }
        System.out.println("Code is complied\n");

        // 2. print nos 1 to 5
        int i = 0;
        while (i<=5)
        {
            System.out.println(i);
            i++;
        }
        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*");

        // 3.(A) print 'a' to 'z'
        char ch = 'a';
        while (ch<='z')
        {
            System.out.print(ch);
            System.out.print(" ");
            ch++;
        }

        // 3.(B) print 'a' to 'z' without initialize it in char
        int i1 = 'a';
        while (i1<='z')
        {
            System.out.print((char)i1);  // typecast used here
            System.out.print(" ");
            i1++;
        }

        // 4. Create infinite loop
//        int i2 = 0;
//        while (true)   // condition is always true here so infinite will be created
//        {
//            System.out.println(i2);
//            i2++;
//        }

        // 5. Even nos upto 100
        int i3 = 1;
        while (i3<=100)
        {
            if (i3%2==0)
            {
                System.out.println(i3);
            }
            i3++;
        }

        // 6. Read values dynamically:- print odd character
        Scanner s = new Scanner(System.in);
        System.out.print("Enter starting alphabet:- ");
        char start3 = s.next().charAt(0);
        System.out.print("Enter ending alphabet:- ");
        char end = s.next().charAt(0);

        while (start3<=end)
        {
            if (start3%2!=0)
            {
                System.out.println(start3);

            }
            start3++;
        }
    }
}
