package ComplexNumberCalculator.controller;

import ComplexNumberCalculator.model.ComplexNumber;
import ComplexNumberCalculator.model.Number;
import ComplexNumberCalculator.service.LOGGER;
import ComplexNumberCalculator.view.InputView;
import ComplexNumberCalculator.model.Model;
import ComplexNumberCalculator.view.PrintView;

import java.util.Scanner;

public class Controller {
    Scanner sc = new Scanner(System.in);
    private static final LOGGER logger = new LOGGER();
    private final Model model = new Model();

    public void start() {

        try {
            String firstRealString = InputView.inputRealNumber(sc);
            String firstImaginaryString = InputView.inputImaginaryNumber(sc);
            model.setFirstInput(firstRealString, firstImaginaryString);

            String secondRealString = InputView.inputRealNumber(sc);
            String secondImaginaryString = InputView.inputImaginaryNumber(sc);
            model.setSecondInput(secondRealString, secondImaginaryString);

            String operator = InputView.inputOperator(sc);
            model.setOperator(operator);

            ComplexNumber result = model.getResult();
            PrintView.printResult(result.toString());

            logger.log("Введено первое число: " + firstRealString + ", " + firstImaginaryString);
            logger.log("Введено второе число: " + secondRealString + ", " + secondImaginaryString);
            logger.log("Введен оператор: " + operator);
            logger.log("Результат операции: " + result.toString());
        }
        catch (Exception e) {
            PrintView.printExitMessage(e.getMessage());
            logger.log(e.getMessage());
            System.exit(1);
        }
    }
}
