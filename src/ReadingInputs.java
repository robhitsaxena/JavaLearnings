import java.util.Scanner;

public class ReadingInputs {
    public static String ReadingInputs(){
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        scanner.close();
        return name;

    }
}
