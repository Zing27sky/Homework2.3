package pro.sky.homeworkCalculator;

import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
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
        return calculatorService.calculator();
    }

    @GetMapping("/calculator/plus")
    public String addition(@RequestParam Optional<Double> num1, @RequestParam Optional<Double> num2) {
        if (num1.isEmpty() || num2.isEmpty()) {
            return calculatorService.error();
        }
        Double result = calculatorService.addition(num1.get(), num2.get());
        return calculator() + " " + num1.get() + " + " + num2.get() + " = " + result;
    }

    @GetMapping("/calculator/minus")
    public String subtraction(@RequestParam Optional<Double> num1, @RequestParam Optional<Double> num2) {
        if (num1.isEmpty() || num2.isEmpty()) {
            return calculatorService.error();
        }
        double result = calculatorService.subtraction(num1.get(), num2.get());
        return calculator() + " " + num1.get() + " - " + num2.get() + " = " + result;
    }

    @GetMapping("/calculator/multiply")
    public String multiplication(@RequestParam Optional<Double> num1, @RequestParam Optional<Double> num2) {
        if (num1.isEmpty() || num2.isEmpty()) {
            return calculatorService.error();
        }
        double result = calculatorService.multiplication(num1.get(), num2.get());
        return calculator() + " " + num1.get() + " * " + num2.get() + " = " + result;
    }

    @GetMapping("/calculator/divide")
    public String division(@RequestParam Optional<Double> num1, @RequestParam Optional<Double> num2) {
        if (num1.isEmpty() || num2.isEmpty()) {
            return calculatorService.error();
        }
        if (num2.get() == 0) {
            return calculator() + " " + calculatorService.errorDivision();
        }
        double result = calculatorService.division(num1.get(), num2.get());
        return calculator() + " " + num1.get() + " / " + num2.get() + " = " + result;
    }
}