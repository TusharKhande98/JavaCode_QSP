class QSP12_SwitchCase_Assgn1 {
    public static void main(String[] args) {

        char grade = 'A';
        switch (grade)
        {
            case 'A':
                System.out.println("Excellent");
                break;

            case 'B':
                System.out.println("Good");
                break;

            case 'C':
                System.out.println("Average");
                break;

            case 'D':
                System.out.println("Below Average");
                break;

            default:
                System.out.println("Invalied Grade");
                break;
        }

    }
}
