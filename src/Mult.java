public class Mult extends Operation {
    @Override
    double execute() {
        return operand1 * operand2;
    }

    public Mult(String expr) {
        super(expr);
    }
}
