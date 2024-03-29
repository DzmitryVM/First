package lection_Inners;

class Square implements Shape.FourSides {       // 2-й уровень вложенности: квадрат
    private static final String NAME = "Square";
    private double side;

    public Square(double side) {
        this.side = side;
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

    @Override
    public double getSpace() {
        return Math.pow(side, 2);
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

    public double getDiagonal(){               // Добавляем свой метод для квадрата
        return Math.sqrt(2*Math.pow(side,2));
    }
}