public class QSP17_ForLoop_Assgn1 {
    public static void main(String[] args) {
    // Write previous codes in do-while & for loop

    // I. Do-While Loop
        // 1. It prints line for 3 times
        int a = 1;
        do
        {
            System.out.println("Its a Do-While loop");
            a++;
        }
        while (a<=3);
        System.out.println("Do-While Code is compiled\n");

        // 2. It prints table of 4
        int e = 4;
        do
        {
            System.out.print(e);
            System.out.print(" ");
            e+=4;
        }
        while (e<=40);
        System.out.println("\n");

        // 3. It prints a-z, A-Z & special character
        int f = 'A';
        do
        {
            System.out.print((char)f);
            System.out.print(" ");
            f++;
        }
        while (f<='z');
        System.out.println("\n");

        // 4. It prints even nos upto 50
        int g = 0;
        do
        {
            if (g%2==0)
            {
                System.out.print(g);
                System.out.print(" ");
            }
            g++;
        }
        while(g<=50);
        System.out.println("\n");


    // II. For Loop

        // 1. It will print even nos upto 20 in one line.
        int b;
        for (b=2; b<=20; b+=2)
        {
            System.out.print(b);
            System.out.print(" ");
        }
        System.out.println("\n");

        // 2. it will print characters a-z
        char c;
        for(c='a'; c<='z'; c++)
        {
            System.out.print(c);
            System.out.print(" ");
        }
        System.out.println("\n");

        // 3. print characters a-z without using char datatype
        int d;
        for (d='A'; d<='Z'; d++ )
        {
            System.out.print((char)d);

            System.out.print(" ");
        }
        System.out.println("\n");

        // 4. print odd values upto 50
        int h;
        for (h=0; h<=50; h++)
        {
            if (h%2!=0)
            {
                System.out.print(h);
                System.out.print(" ");

            }
        }
        System.out.println("\n");
    }
}
