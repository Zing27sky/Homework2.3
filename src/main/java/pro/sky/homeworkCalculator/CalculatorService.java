package pro.sky.homeworkCalculator;

public interface CalculatorService {
    String calculator();

    String error();

    String errorDivision();

    Double addition(Double num1, Double num2);

    Double subtraction(Double num1, Double num2);

    Double multiplication(Double num1, Double num2);

    Double division(Double num1, Double num2);
}