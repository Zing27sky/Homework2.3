package pro.sky.homeworkCalculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class CalculatorController {
    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping(path = "/calculator")
    public String calculator() {
        return "Добро пожаловть в калькулятор! ";
    }

    @GetMapping("/calculator/plus")
    public String addition(@RequestParam Optional<Double> num1, @RequestParam Optional<Double> num2) {
        if (num1.isEmpty() || num2.isEmpty()) {
            return "Ошибка: Не хватает вводных данных!";
        }
        Double result = calculatorService.addition(num1.get(), num2.get());
        return calculator() + " " + num1.get() + " + " + num2.get() + " = " + result;
    }

    @GetMapping("/calculator/minus")
    public String subtraction(@RequestParam Optional<Double> num1, @RequestParam Optional<Double> num2) {
        if (num1.isEmpty() || num2.isEmpty()) {
            return "Ошибка: Не хватает вводных данных!";
        }
        double result = calculatorService.subtraction(num1.get(), num2.get());
        return calculator() + " " + num1.get() + " - " + num2.get() + " = " + result;
    }

    @GetMapping("/calculator/multiply")
    public String multiplication(@RequestParam Optional<Double> num1, @RequestParam Optional<Double> num2) {
        if (num1.isEmpty() || num2.isEmpty()) {
            return "Ошибка: Не хватает вводных данных!";
        }
        double result = calculatorService.multiplication(num1.get(), num2.get());
        return calculator() + " " + num1.get() + " * " + num2.get() + " = " + result;
    }

    @GetMapping("/calculator/divide")
    public String division(@RequestParam Optional<Double> num1, @RequestParam Optional<Double> num2) {
        if (num1.isEmpty() || num2.isEmpty()) {
            return "Ошибка: Не хватает вводных данных!";
        }
        if (num2.get() == 0) {
            return calculator() + "Ошибка: На ноль делить нельзя!";
        }
        double result = calculatorService.division(num1.get(), num2.get());
        return calculator() + " " + num1.get() + " / " + num2.get() + " = " + result;
    }
}