package lection_Inners;

public interface Shape {
    double getSpace();
    /*boolean getSpaceEqual(String [] shapes);
    String [] shapes = {"Square", "Circle"};*/

    public interface FourSidesEqual extends Shape {     // 1-й уровень вложенности: фигуры с равными сторонами в фигурах
        double getPerimeter();

        class Square implements FourSidesEqual {       // 2-й уровень вложенности: квадрат
            private double side;

            public Square(double side) {
                this.side = side;
            }

            @Override                                  // переопределяем методы внешних классов
            public double getSpace() {
                return Math.pow(side, 2);
            }

            @Override
            public double getPerimeter() {
                return side * 4;
            }
            /*@Override                                  // переопределяем метод сравнения площадей
            public boolean getSpaceEqual(String [] shapes){
                boolean equal=false;
                for (int i=0; i<shapes.length;i++) {
                    if (Square.getSpace() == Shape.shapes[i].getSpace) {
                        equal=true;
                    } else {
                        equal=false;
                    }
                }
                return equal;
            }*/

            public double getDiagonal(){               // Добавляем свой метод для квадрата
                double diagonal;
                return diagonal = Math.sqrt(2*Math.pow(side,2));
            }
        }
    }

    public interface Round extends Shape {             // 1-й уровень вложенности: фигуры с равными сторонами в фигурах
        double getRoundLength();

        class Circle implements Round {                // 2-й уровень вложенности: круг
            private double r;

            public Circle (double r) {
                this.r = r;
            }

            @Override
            public double getSpace(){
                return Math.PI*Math.pow(r,2);
            }

            @Override
            public double getRoundLength(){
                return 2*r*Math.PI;
            }

            /*@Override                                  // переопределяем метод сравнения площадей
            public boolean getSpaceEqual(String [] shapes){
                boolean equal=false;
                for (int i=0; i<shapes.length;i++) {
                    if (Circle.getSpace() == Shape.shapes[i].getSpace) {
                        equal=true;
                    } else {
                        equal=false;
                    }
                }
                return equal;
            }*/

        }
    }
}
