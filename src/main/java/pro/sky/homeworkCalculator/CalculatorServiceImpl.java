package pro.sky.homeworkCalculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    public String calculator() {
        return "Добро пожаловать в калькулятор!";
    }

    public String errorDivision() {
        return "Ошибка: На ноль делить нельзя!";
    }

    public String error() {
        return "Ошибка: Нехватает вводных данных";
    }

    public Double addition(Double num1, Double num2) {
        return num1 + num2;
    }

    public double subtraction(double num1, double num2) {
        return num1 - num2;
    }

    public double multiplication(double num1, double num2) {
        return num1 * num2;
    }

    public double division(double num1, double num2) {
        return num1 / num2;
    }
}