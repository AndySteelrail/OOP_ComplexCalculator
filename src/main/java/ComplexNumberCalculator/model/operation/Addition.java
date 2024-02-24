package ComplexNumberCalculator.model.operation;

import ComplexNumberCalculator.model.ComplexNumber;

public class Addition implements Operation{

    @Override
    public ComplexNumber calculate(
            ComplexNumber firstNumber,
            ComplexNumber secondNumber) {
        double realResult =
                firstNumber.getRealPart() + secondNumber.getRealPart();
        double imaginaryResult =
                firstNumber.getImaginaryPart() + secondNumber.getImaginaryPart();
        return new ComplexNumber(realResult, imaginaryResult);
    }
}