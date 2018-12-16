package factoryPattern;

import lombok.Data;

@Data
public abstract class Operator {
    protected double numberA;
    protected double numberB;

    public abstract double getResult();
}

class OperatorAdd extends Operator {

    @Override
    public double getResult() {
        return numberA+numberB;
    }
}

class OperatorSub extends Operator {

    @Override
    public double getResult() {
        return numberA-numberB;
    }
}

class OperatorMul extends Operator {

    @Override
    public double getResult() {
        return numberA*numberB;
    }
}

class OperatorDiv extends Operator {

    @Override
    public double getResult() {
        return numberA/numberB;
    }
}