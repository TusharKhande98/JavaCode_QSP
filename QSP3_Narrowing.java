class QSP3_Narrowing {
    public static void main(String[] args) {

    // 1. Narrowing of long into other
        long l = 7895462177645L;
        int j = (int)l;
        char ch = (char)l;
        short s = (short)l;
        byte b = (byte)l;
        System.out.println(l);
        System.out.println(j);
        System.out.println(ch);
        System.out.println(s);
        System.out.println(b);


    // 2. Narrowing of Float into other
        float f = 4523.1253554f;
        long a = (long)f;
        int h = (int)f;
        char c = (char)f;
        short d = (short)f;
        byte e = (byte)f;
        System.out.println(f);
        System.out.println(a);
        System.out.println(h);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);


    // 3. Narrowing of Short into other
        short i = 4568;
        byte g = (byte)i;
        System.out.println(i);
        System.out.println(g);


    // 4. Narrowing of Int into other
        int n = 198789;
        byte k = (byte)n;
        short o = (short)n;
        char m = (char)n;
        System.out.println(k);
        System.out.println(o);
        System.out.println(m);


    // 5. Narrowing of Char into other
        char w = 'S';
        byte p = (byte)w;
        short q = (short)w;
        int r = (int)w;
        long t = (long)w;
        float u = (float)w;
        double v = (double)w;

        System.out.println(s);
        System.out.println(m);
        System.out.println(p);
        System.out.println(q);
        System.out.println(r);
        System.out.println(t);
        System.out.println(u);
        System.out.println(v);

    }
}
