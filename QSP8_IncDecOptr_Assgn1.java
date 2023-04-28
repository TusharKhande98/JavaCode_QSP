class QSP8_IncDecOptr_Assgn1 {
    public static void main(String[] args) {

        int a=11, b=22, c;
        c = a + b + a++ + b++ + ++a + ++b;
        System.out.println(" ");
        System.out.println("a="+a);
        System.out.println("b="+b);
        System.out.println("c="+c);

        int f=1;
        f = f++ + ++f * --f - f--;
        System.out.println(" ");
        System.out.println(f);



//        boolean d = true;
//        d++;
//        System.out.println(d);
        //  bad operand type for unary operator

        int m = 0, n = 0;
        int p = --m * --n * n-- * m--;
        System.out.println(" ");
        System.out.println(p);

        int g=1010, h=1010;
        System.out.println(" ");
        System.out.println(g++ / ++h * h-- / --g);

    }
}
