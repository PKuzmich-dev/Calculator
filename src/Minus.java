public class Minus extends Operation {
    @Override
    double execute() {
        return operand1 - operand2;
    }

    public Minus(String expr) {
        super(expr);
    }
}
