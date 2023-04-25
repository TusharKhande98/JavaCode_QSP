class QSP6_ConditionalOptr {
    public static void main(String[] args) {


        //1. Smallest of two
        int a = 33145;
        int b = 31415;
        int min1 = a<b ? a:b;
        System.out.println(min1);


        //2. Largest of two
        int c = 4789215;
        int d = 4556265;
        int max1 = c>d ? c:d;
        System.out.println(max1);


        //3. Smallest of 2 char
        int e = 's';
        int f = 'T';
        int min2 = e<f ? e:f;
        System.out.println(min2);


        //4. Largest of 2 char
        int g = 'C';
        int h = 'q';
        int max2 = g>h ? g:h;
        System.out.println(max2);



        //5. Smallest of three
        int i = 10044;
        int j = 20450;
        int k = 1404444;
        int min3 = (i<j)? (i<k? i:k) : (j<k? j:k);
        System.out.println(min3);



        //6. Largest of three
        int l = 212245;
        int m = 458585;
        int n = 124852;
        int max3 = (l>m)? (l>n? l:n) : (m>n? m:n);
        System.out.println(max3);

    }
}
