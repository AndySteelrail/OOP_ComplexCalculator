package ComplexNumberCalculator.view;


import java.util.Scanner;

public abstract class InputView {

    public static String inputRealNumber (Scanner sc) {
        System.out.print("Введите действительную часть комплексного числа:");
        return sc.nextLine();
    }

    public static String inputImaginaryNumber (Scanner sc) {
        System.out.print("Введите мнимую часть комплексного числа:");
        return sc.nextLine();
    }

    public static String inputOperator (Scanner sc) {
        System.out.println("""
                Введите символ - оператор:
                + Сложение
                - Вычитание
                * Умножение
                / Деление"""
                );
        return sc.nextLine();
    }
}
