package pro.sky.homeworkCalculator;

public interface CalculatorService {
    String calculator();

    String error();

    String errorDivision();

    double addition(double num1, double num2);

    double subtraction(double num1, double num2);

    double multiplication(double num1, double num2);

    double division(double num1, double num2);
}