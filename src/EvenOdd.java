import java.util.Scanner;
/*

Task
Given an integer, , perform the following conditional actions:

If  is odd, print Weird
If  is even and in the inclusive range of 2 to 5, print Not Weird
If  is even and in the inclusive range of 6 to 20, print Weird
If  is even and greater than 20, print Not Weird
 */
public class EvenOdd {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Please input a number: ");
        int N = scanner.nextInt();

        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        scanner.close();
        String ans = "";
        if (N % 2 == 0) {
            //even
            if (N >= 2 && N <= 5) {
                System.out.println("Not Weird");

            }
            if (N >= 6 && N <= 20) {
                System.out.println("Weird");

            }
            if (N > 20) {
                System.out.println("Not Weird");
            }

        } else {
            //odd
            System.out.println("Weird");
        }

    }
}

