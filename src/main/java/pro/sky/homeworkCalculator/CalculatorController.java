package pro.sky.homeworkCalculator;

import jakarta.websocket.server.PathParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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
    public String addition(@RequestParam Double num1, @RequestParam Double num2) {
        if (num1 == null|| num2 == null) {
            return calculatorService.error();
        }
        Double result = calculatorService.addition(num1, num2);
        return calculator() + " " + num1 + " + " + num2 + " = " + result;
    }

    @GetMapping("/calculator/minus")
    public String subtraction(@RequestParam double num1, @RequestParam double num2) {
        double result = calculatorService.subtraction(num1, num2);
        return calculator() + " " + num1 + " - " + num2 + " = " + result;
    }

    @GetMapping("/calculator/multiply")
    public String multiplication(@RequestParam double num1, @RequestParam double num2) {
        double result = calculatorService.multiplication(num1, num2);
        return calculator() + " " + num1 + " * " + num2 + " = " + result;
    }

    @GetMapping("/calculator/divide")
    public String division(@RequestParam double num1, @RequestParam double num2) {
        if (num2 == 0) {
            return calculator() + " " + calculatorService.errorDivision();
        }
        double result = calculatorService.division(num1, num2);
        return calculator() + " " + num1 + " / " + num2 + " = " + result;
    }
}