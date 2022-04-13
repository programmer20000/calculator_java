
import java.util.Scanner;

public class Calculator {
    private Scanner QuestionUser = new Scanner(System.in);
    private Scanner FirstNumber = new Scanner(System.in);
    private Scanner SecondNumber = new Scanner(System.in);
    private String MathOperation = QuestionUser.nextLine();

    private float Number1 = FirstNumber.nextFloat();
    private float Number2 = FirstNumber.nextFloat();
    private float sum;

    public void calculator() {
        if (MathOperation.equals("+")) {
            sum = Number1 + Number2;
            System.out.println("result " + sum);

        }
        if (MathOperation.equals("-")) {
            sum = Number1 - Number2;
            System.out.println("result " + sum);
        }
        if (MathOperation.equals("*")) {
            sum = Number1 * Number2;
            System.out.println("result" + sum);
        }
        if (MathOperation.equals("/")) {
            sum = Number1 / Number2;
            System.out.println("result " + sum);
    }
}
}