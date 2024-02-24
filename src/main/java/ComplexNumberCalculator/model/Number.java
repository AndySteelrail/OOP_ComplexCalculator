package ComplexNumberCalculator.model;


public abstract class Number {
    public static boolean isNumeric(String str) {
        return str.matches("^[+-]?((\\d+([.,]\\d*)?)|([.,]\\d+))$");
    }

    public static double convertToNumber(String str) {
        return Double.parseDouble(
                str.replace(",", "."));
    }
}
