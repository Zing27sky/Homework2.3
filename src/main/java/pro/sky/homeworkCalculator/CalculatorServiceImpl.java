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

    public Double subtraction(Double num1, Double num2) {
        return num1 - num2;
    }

    public Double multiplication(Double num1, Double num2) {
        return num1 * num2;
    }

    public Double division(Double num1, Double num2) {
        return num1 / num2;
    }
}