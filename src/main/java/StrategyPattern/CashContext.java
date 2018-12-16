package StrategyPattern;

public class CashContext {
    private CashSuper cashSuper;

    public CashContext(String type){
        switch (type){
            //不促销
            case "0":
                cashSuper = new CashNormal();
                break;
            //打8折
            case "0.08":
                cashSuper = new CashRebate(0.8);
                break;
                //每满300减100
            case "300,100":
                cashSuper = new CashReturn(300,100);
                break;
        }
    }

    public double acceptCash(double amount){
        return cashSuper.acceptCash(amount);
    }

}
