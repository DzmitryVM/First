package lection_Inners;

class Rectangle implements Shape.FourSides {       // 2-й уровень вложенности: квадрат
    private static final String NAME = "Rectangle";
    private double sideA, sideB;

    public Rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    // переопределяем методы внешних классов
    @Override
    public String getName(){
        return NAME;
    }

    @Override
    public boolean notZeroAndExist (){
        boolean checkZero = true;
        if(sideA<=0 || sideB<=0){
            boolean zeroTrue = false;
            checkZero = zeroTrue;
        }
        return checkZero;
    }

    @Override
    public double getSpace() {
        return sideA*sideB;
    }

    @Override
    public boolean compareSpace(double compare){
        return (getSpace()== compare);
    }

    @Override
    public double getPerimeter() {
        return sideA*sideB*2;
    }

    @Override
    public String toString(){
        StringBuilder infoClass = new StringBuilder();
        return (infoClass.append(getName()).append(" with sides ").append(sideA).append(" and ").append(sideB).toString());
    }

    // Добавляем свой метод

    public double getDiagonal(){
        double diagonal;
        return diagonal = Math.sqrt(Math.pow(sideA,2)+Math.pow(sideB,2));
    }
}
