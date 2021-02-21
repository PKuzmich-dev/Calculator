import java.util.regex.Pattern;

public class Operation {
    double operand1;
    double operand2;

    double execute(){
        return 0;
    }

    static boolean validExpr(String expr){
        return Pattern.matches("\\d+[.]\\d+\\s?[+*-/]\\s?\\d+[.]\\d+", expr) || // в левой и правой части вещественные числа
                Pattern.matches("\\d+\\s?[+*-/]\\s?\\d+[.]\\d+", expr) || // в левой части целое, в правой вещественное
                Pattern.matches("\\d+[.]\\d+\\s?[+*-/]\\s?\\d+", expr) || // в левой части вещественное, в правой целое
                Pattern.matches("\\d+\\s?[+*-/]\\s?\\d+", expr);
    }

    Operation(String expr){
        int pos = 0;
        if (expr.indexOf("+") > 0)
            pos = expr.indexOf("+");
        else if (expr.indexOf("-") > 0)
            pos = expr.indexOf("-");
        else if (expr.indexOf("*") > 0)
            pos = expr.indexOf("*");
        else
            pos = expr.indexOf("/");

        operand1 = Double.parseDouble(expr.substring(0,pos));
        operand2 = Double.parseDouble(expr.substring(pos+1));
    }
}
