package lection_Inners;

class Circle implements Shape.Round {                // 2-й уровень вложенности: круг
    private static final String NAME = "Circle";
    private double r;

    public Circle (double r) {
        this.r = r;
    }

    @Override                                  // переопределяем методы внешних классов
    public String getName(){
        return NAME;
    }

    @Override
    public boolean notZeroAndExist (){
        boolean checkZero = true;
        if(r<=0){
            boolean zeroTrue = false;
            checkZero = zeroTrue;
        }
        return checkZero;
    }

    @Override
    public double getSpace(){
        return Math.PI*Math.pow(r,2);
    }

    @Override
    public boolean compareSpace(double compare){
        return (getSpace()== compare);
    }

    @Override
    public String toString(){
        StringBuilder infoClass = new StringBuilder();
        return (infoClass.append(getName()).append(" with radius ").append(r).toString());
    }

    @Override
    public double getRoundLength(){
        return 2*r*Math.PI;
    }

}
