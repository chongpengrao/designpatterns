package factoryPattern;

import java.util.Scanner;

/**
 * 这是一个简单的计算器，能计算加减乘除
 */
public class Caculator {

    public static void main(String[] args){
        try {
            Scanner scan = new Scanner(System.in);

            System.out.println("请输入第一个数A:");
            String numberA = scan.nextLine();

            System.out.println("请输入运算符");
            String symbol = scan.nextLine();

            System.out.println("请输入第二个数B:");
            String numberB = scan.nextLine();

//            Operator operator;
//            switch (symbol){
//                case "+":
//                    operator = new OperatorAdd();
//                    break;
//                case "-":
//                    operator = new OperatorSub();
//                    break;
//                case "*":
//                    operator = new OperatorMul();
//                    break;
//                case "/":
//                    operator = new OperatorDiv();
//                    break;
//                default:
//                    throw new RuntimeException("运算符号错误！");
//            }

            Operator operator = OperatorFactory.getOperator(symbol);

            operator.setNumberA(Double.parseDouble(numberA));
            operator.setNumberB(Double.parseDouble(numberB));

            System.out.println("计算结果为："+operator.getResult());

        }catch (Exception e){
            throw new RuntimeException("输入的数不符合规范");
        }

    }

}


