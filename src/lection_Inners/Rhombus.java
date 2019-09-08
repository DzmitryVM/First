package lection_Inners;

class Rhombus implements Shape.FourSides {
    private static final String NAME = "Rhombus";
    private double side, minDiagonal;

    public Rhombus(double side, double minDiagonal) {
        this.side = side;
        this.minDiagonal = minDiagonal;
    }

    @Override                                  // переопределяем методы внешних классов
    public String getName(){
        return NAME;
    }

    @Override
    public boolean notZeroAndExist (){
        boolean checkZero = true;
        if(side<=0){
            boolean zeroTrue = false;
            checkZero = zeroTrue;
        }
        return checkZero;
    }

    @Override    // площадь определяем по формуле S=(диагональ1 + диагональ2) / 2
    public double getSpace() {
        return (getMaxDiagonal()/2)*(minDiagonal/2);
    }

    @Override
    public boolean compareSpace(double compare){
        return (getSpace()== compare);
    }

    @Override
    public double getPerimeter() {
        return side * 4;
    }

    @Override
    public String toString(){
        StringBuilder infoClass = new StringBuilder();
        return (infoClass.append(getName()).append(" with side ").append(side).toString());
    }

    public double getMaxDiagonal(){               // Добавляем свой метод по расчету второй диагонали
        return Math.sqrt(Math.pow(side,2)-Math.pow(minDiagonal/2,2))*2;
    }
}
