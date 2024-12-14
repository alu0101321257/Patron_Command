package main.java.com.proyect;

public class AddCommand implements Command {
    private Calculator calculator;
    private double a;
    private double b;

    public AddCommand(Calculator calculator, double a, double b) {
        this.calculator = calculator;
        this.a = a;
        this.b = b;
    }

    @Override
    public void execute() {
        calculator.setResult(calculator.add(a, b));
    }
}




