package ComplexNumberCalculator.model.operation;

import ComplexNumberCalculator.model.ComplexNumber;

public interface Operation {
    ComplexNumber calculate (
            ComplexNumber firstNumber,
            ComplexNumber secondNumber) throws Exception;
}
