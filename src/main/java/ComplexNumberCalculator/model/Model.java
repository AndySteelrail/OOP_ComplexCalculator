package ComplexNumberCalculator.model;

import ComplexNumberCalculator.model.operation.*;

import java.util.HashMap;

public class Model {
    private ComplexNumber firstNumber;
    private ComplexNumber secondNumber;
    private String operator;

    public void setFirstInput(String realPart, String imaginaryPart) throws Exception {
        if (!Number.isNumeric(realPart)) {
            throw new Exception("Действительная часть первого числа не является числом");
        }
        if (!Number.isNumeric(imaginaryPart)) {
            throw new Exception("Мнимая часть первого числа не является числом");
        }
        firstNumber = new ComplexNumber(
                Number.convertToNumber(realPart),
                Number.convertToNumber(imaginaryPart)
        );
    }

    public void setSecondInput(String realPart, String imaginaryPart) throws Exception {
        if (!Number.isNumeric(realPart)) {
            throw new Exception("Действительная часть второго числа не является числом");
        }
        if (!Number.isNumeric(imaginaryPart)) {
            throw new Exception("Мнимая часть второго числа не является числом");
        }
        secondNumber = new ComplexNumber(
                Number.convertToNumber(realPart),
                Number.convertToNumber(imaginaryPart)
        );
    }

    public void setOperator(String operatorString) throws Exception {
        if (!operatorString.equals("+") && !operatorString.equals("-") &&
                !operatorString.equals("*") && !operatorString.equals("/")) {
            throw new Exception("Неверно введённый оператор");
        }
        operator = operatorString;
    }

    public ComplexNumber getResult() throws Exception {
        return switch (operator) {
            case "+" -> new Addition().calculate(firstNumber, secondNumber);
            case "-" -> new Substraction().calculate(firstNumber, secondNumber);
            case "*" -> new Multiplication().calculate(firstNumber, secondNumber);
            default -> new Division().calculate(firstNumber, secondNumber);
        };
    }
}
