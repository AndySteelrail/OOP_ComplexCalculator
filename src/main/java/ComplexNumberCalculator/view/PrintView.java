package ComplexNumberCalculator.view;


public abstract class PrintView {
    public static void printResult(String result) {
        System.out.println("Результат операции: \n" + result);
    }

    public static void printExitMessage(String reason) {
        System.out.println(reason);
    }
}
