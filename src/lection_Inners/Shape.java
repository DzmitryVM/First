package lection_Inners;

public interface Shape {
    double getSpace();
    String getName();
    boolean notZeroAndExist();
    boolean compareSpace(double compare);

    // 1-й уровень вложенности: фигуры с 3-мя сторонами в фигурах

    public interface ThreeSides extends Shape {
        double getPerimeter();
    }

    public interface FourSides extends Shape {
        double getPerimeter();
    }

    public interface Round extends Shape {
        double getRoundLength();

    }
}
