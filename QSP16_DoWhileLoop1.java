class QSP16_DoWhileLoop1 {
    public static void main(String[] args) {

        // 1. Print 1 to 10 with do-while
        int start1 = 0;
        do
        {
            System.out.println("Hello");
            start1++;
        }
        while (start1<5);

        // 2. How to create infinite loop in do-while
        int start2 = 0;
        do
        {
            System.out.println("Hello");
            start2++;
        }
        while (start2<5);
        //  Give while condition as true or don't update the condition

        // 3. Minimum execution of Do-While loop
        int start3 = 0;
        do
        {
            System.out.println("Execution time of do-while");
            start3++;
        }
        while (false);  // condition false, but still its execute 1 time
    }
}
