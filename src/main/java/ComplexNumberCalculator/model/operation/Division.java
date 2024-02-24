package ComplexNumberCalculator.model.operation;

import ComplexNumberCalculator.model.ComplexNumber;

public class Division implements Operation{
    @Override
    public ComplexNumber calculate (
            ComplexNumber firstNumber,
            ComplexNumber secondNumber) throws Exception {

        if (secondNumber.getRealPart() == 0 && secondNumber.getImaginaryPart() == 0) {
            throw new Exception("Попытка деления на 0");
        }
        double divider =
                secondNumber.getRealPart() * secondNumber.getRealPart() +
                secondNumber.getImaginaryPart() * secondNumber.getImaginaryPart();
        double realResult =
                (firstNumber.getRealPart() * secondNumber.getRealPart() +
                firstNumber.getImaginaryPart() * secondNumber.getImaginaryPart()) /
                divider;
        double imaginaryResult =
                (firstNumber.getImaginaryPart() * secondNumber.getRealPart() -
                firstNumber.getRealPart() * secondNumber.getImaginaryPart()) /
                divider;
        return new ComplexNumber(realResult, imaginaryResult);
    }
}
