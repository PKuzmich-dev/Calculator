public class Div extends Operation {
    @Override
    double execute() {
        return operand1 / operand2;
    }

    public Div(String expr) {
        super(expr);
    }
}
