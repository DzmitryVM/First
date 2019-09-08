package lection_Inners;

class Triangle implements Shape.ThreeSides {
    private static final String NAME = "Triangle";
    private double sideA, sideB, sideC;

    public Triangle (double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }
    @Override                                  // переопределяем методы внешних классов
    public String getName(){
        return NAME;
    }

    @Override
    public boolean notZeroAndExist (){
        boolean checkZeroAndExist = true;
        if(sideA<=0 || sideB<=0 || sideC<=0){
            boolean zeroTrue = false;
            checkZeroAndExist = zeroTrue;
        } else if ((sideA+sideB)<=sideC || (sideA+sideC)<=sideB || (sideB+sideC)<=sideA){
             boolean triangleExist = false;
             checkZeroAndExist = triangleExist;
        }
        return checkZeroAndExist;
    }

    public boolean suchTriangleExist(){
        boolean resultTriangleExist = true;
        if ((sideA+sideB)<=sideC || (sideA+sideC)<=sideB || (sideB+sideC)<=sideA) {
            boolean triangleExist = false;
            resultTriangleExist = triangleExist;
        }
        return resultTriangleExist;
    }

    @Override                                  // площадь треугольника находим через формулу Герона
    public double getSpace() {
        double p = getPerimeter()/2;
        return Math.sqrt((p*(p-sideA)*(p-sideB)*(p-sideC)));
    }

    @Override
    public boolean compareSpace(double compare){
        return (getSpace()== compare);
    }

    @Override
    public double getPerimeter() {
        return sideA+sideB+sideC;
    }

    @Override
    public String toString(){
        StringBuilder infoClass = new StringBuilder();
        return (infoClass.append(getName()).append(" with sides ").append(sideA).append(", ").append(sideB).append(", ").append(sideC).toString());
    }

    public double getHeights(){               // Добавляем свой метод: для расчета высоты используем полученную площадь
        double[] sidesArray = {sideA, sideB, sideC};
        double baseSide = 0;                        // задаем начальное значение основания треугольника
        for (int i=0; i<sidesArray.length; i++) {
            if (baseSide < sidesArray[i]) {
                double maxSide = sidesArray[i];
                baseSide = maxSide;                 // за основание принимаем самую длинную сторону
            } else {
                System.out.println("It isn't a triangle");
            }
        }
        return getSpace()/(0.5*baseSide);
    }
}