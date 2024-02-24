package ComplexNumberCalculator.model.operation;

import ComplexNumberCalculator.model.ComplexNumber;

public class Multiplication implements Operation{
    @Override
    public ComplexNumber calculate(
            ComplexNumber firstNumber,
            ComplexNumber secondNumber) {
        double realResult =
                firstNumber.getRealPart() * secondNumber.getRealPart() -
                firstNumber.getImaginaryPart() * secondNumber.getImaginaryPart();
        double imaginaryResult =
                firstNumber.getRealPart() * secondNumber.getImaginaryPart() +
                firstNumber.getImaginaryPart() * secondNumber.getRealPart();
        return new ComplexNumber(realResult, imaginaryResult);
    }
}