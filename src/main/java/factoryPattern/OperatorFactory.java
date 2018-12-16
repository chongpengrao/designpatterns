package factoryPattern;

public class OperatorFactory {

    public static Operator getOperator(String symbol){
        switch (symbol){
            case "+":
                return new OperatorAdd();
            case "-":
                return new OperatorSub();
            case "*":
                return new OperatorMul();
            case "/":
                return new OperatorDiv();
            default:
                throw new RuntimeException("运算符号有误");
        }

    }
}
