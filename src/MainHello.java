public class MainHello {
    public static void main(String[] args) {
        System.out.println("Hello, Robhit!");

        System.out.println(calculateScore(300));

        for(int i=1;i<=7;i++){
            dayOfTheWeek(i);

        }

        sumOfDigits sod = new sumOfDigits();
        System.out.println("sum of 123 digits is: " + sod.sumOfDigits(123));

        //Leap Year Program
        isLeapYear leapYear = new isLeapYear();
        if(leapYear.isLeapYear(2018)){
            System.out.println("Year 2018 is a Leap Year");
        } else {
            System.out.println("Year 2018 is not a Leap Year");
        }

        //Palindrome check
        palindrome pd = new palindrome();
        if(pd.palindrome("1212")){
            System.out.println("1212 is a palindrome");
        } else {
            System.out.println("1212 is not a palindrome");
        }

        //Reading Inputs
        ReadingInputs ri = new ReadingInputs();
        System.out.println("Please enter your name: ");
        System.out.println("You have given: " + ri.ReadingInputs());

        //Class Concepts
        ClassConcepts ccPorsche = new ClassConcepts();
        System.out.println("Model is: " + ccPorsche.getModel());
        ccPorsche.setModel("Carreraa");
        System.out.println("Model is: " + ccPorsche.getModel());


        //Constructor Concepts
        ConstructorConcepts bankingProcess = new ConstructorConcepts();
            //Withdrawing money (using getters ans setters)
        bankingProcess.withdrawal(100.00);
            //Depositing Money (using getters ans setters)
        bankingProcess.deposit(1000.00);
        System.out.println("Current Account Balance is: " + bankingProcess.getAccBalance());

        //Using constructor for setting the values instead of using getters and setters
        ConstructorConcepts AccountProcess = new ConstructorConcepts("12345",0.00,
                "Robhit","robhit@email.com",
                "+60101234320");
        System.out.println("Account Number: " + AccountProcess.getAccNumber());
        System.out.println("Account Balance: " + AccountProcess.getAccBalance());

    }

    //New Method
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        }else {
            int megaByte = kiloBytes/1024;
            int rKiloBytes = kiloBytes%1024;
            System.out.println(kiloBytes + " KB = " + megaByte + " MB and " + rKiloBytes + " KB");
        }

    }

    public static boolean bark(boolean barking, int hourOfDay){
        if(hourOfDay >= 0 && hourOfDay < 24 && barking){
            if((hourOfDay < 8 || hourOfDay > 22) && barking){
                return true;
            }
        }
        return false;
    }



    //Method Overloading
    public static int calculateScore(String PlayerName, int score){
        System.out.println("Player " + PlayerName + " Scored: " + score);
        return score * 1000;

    }

    public static int calculateScore(int score){
        System.out.println("Unnamed Player Scored: " + score);
        return score * 1000;

    }

    public static int calculateScore(){
        System.out.println("No player, no score");
        return 0;

    }

    public static void dayOfTheWeek(int day){

        switch (day) {
            case 1:
                System.out.println("It is Monday!");
                break;
            case 2:
                System.out.println("It is Tuesday!");
                break;
            case 3:
                System.out.println("It is Wednesday!");
                break;
            case 4:
                System.out.println("It is Thursday!");
                break;
            case 5:
                System.out.println("It is Friday!");
                break;
            case 6:
                System.out.println("It is Saturday!");
                break;
            case 7:
                System.out.println("It is Sunday!");
                break;
            default:
                System.out.println("Invalid Day!");
                break;

        }


    }
}