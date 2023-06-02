class QSP12_SwitchCase_Assgn2 {
    public static void main(String[] args) {


        String busspass= "student";

        switch (busspass)
        {
            case "student":
                System.out.println("You will get a pass at 60% of actual cost");
                break;

            case "senior citizen":
                System.out.println("You will get a pass at 25% of actual cost and also get benefit of reserved seats");
                break;

            case "ex-military":

                System.out.println("You don't need to issue pass, entire journey is free for you sir");
                break;
            default:
                System.out.println("Please enter a valid input to get a pass discount details");
                System.out.println("Or choose any 1 category from below:-\n1. student \n2. senior citizen \n3. ex-military");
                break;
        }




    }
}
