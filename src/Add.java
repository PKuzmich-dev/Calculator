public class Add extends Operation {
    @Override
    double execute() {
        return operand1 + operand2;
    }

    public Add(String expr) {
        super(expr);
    }
}
