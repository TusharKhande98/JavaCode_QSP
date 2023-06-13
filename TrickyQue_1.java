public class TrickyQue_1
{
    public static void main(String[] args)
    {
        int a=10, b=0;
        float c=0.0f;
        int d=0;

//        System.out.println(a/b); // shows error
        System.out.println(a/c); // o/p = infinity
        System.out.println(d/c);

        //Dividing a non-zero number by zero (0.0) in Java results in infinity because the value 0.0 is treated as an approximation of zero in floating-point arithmetic. Dividing a non-zero number by 0.0 is interpreted as dividing by an infinitesimally small number, which yields infinity. However, dividing zero by zero (0.0 / 0.0) results in NaN (Not a Number).
    }
}
