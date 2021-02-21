import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String expr;
        Scanner in = new Scanner(System.in);

        System.out.println("Для выполнения вычислений введите строку в формате <число><операция +,-,*,/><число>");
        System.out.println("Для выхода введите exit");

        while(true){
            System.out.print("Введите выражение:");
            expr = in.nextLine();

            if (expr.equals("exit"))
                break;

            if (Operation.validExpr(expr)){
                System.out.println("Результат:" + calc(expr));
            }
            else {
                System.out.println("Выражение не удовлетворяет требованиям калькулятора");
            }
        }
    }

    public static double calc(String expr){
        // проверяем наличие в выражении операции
        if (expr.indexOf("+")>0){
            return (new Add(expr)).execute();
        } else if (expr.indexOf("-")>0){
            return (new Minus(expr)).execute();
        } else if (expr.indexOf("*")>0){
            return (new Mult(expr)).execute();
        } else {
            return (new Div(expr)).execute();
        }
    }

}
