package StrategyPattern;

import java.util.Scanner;

/**
 * 模拟商场收银的场景:每满300减100,打8折，正常价
 */
public class MarketCash {
    public static void main(String[] args){
        try {
            Scanner scan = new Scanner(System.in);
            double total = 0;
            while (true){
                System.out.println("请输入该商品单价：");
                double price = Double.parseDouble(scan.nextLine());

                System.out.println("请输入商品数量：");
                int count = Integer.parseInt(scan.nextLine());

                System.out.println("请输入促销方式：");
                String type = scan.nextLine();

                CashContext cashContext = new CashContext(type);
                total += cashContext.acceptCash(price*count);

                if ("EXIT".equals(scan.nextLine().toUpperCase())){
                    System.out.println("需要支付的总价为："+total);
                    return;
                }
            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
