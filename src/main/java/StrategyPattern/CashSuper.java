package StrategyPattern;



public interface CashSuper {
    double acceptCash(double amount);
}

class CashNormal implements CashSuper{
    @Override
    public double acceptCash(double amount) {
        return amount;
    }
}

class CashRebate implements CashSuper{

    private double rebate;//打折费率

    public CashRebate(double rebate){
        this.rebate = rebate;
    }

    @Override
    public double acceptCash(double amount) {
        return amount*rebate;
    }
}

class CashReturn implements CashSuper{

    private double amountCondition;
    private double rebateAmount;

    public CashReturn(double amountCondition,double rebateAmount){
        this.rebateAmount = rebateAmount;
        this.amountCondition = amountCondition;
    }

    @Override
    public double acceptCash(double amount) {
        return amount>amountCondition ? amount-Math.floor(amount/amountCondition)*rebateAmount : amount;
    }
}