package lection_Inners;

public class ShapeUtils {

    public static void main(String[] args) {
        Shape[] shape = {new Square(-3),
                        new Rectangle(2,3),
                        new Rhombus(3,2),
                        new Triangle(3,1,5),
                        new Circle(10),
                        new Ellipse(4, 10)};
        //вывод данных о классе через переопределнный метод toString(), расчет и вывод в консоль значений площадей
        for (Shape shape1 : shape) {
            if(shape1.notZeroAndExist()==false && shape1.getName().equals("Triangle")) {
                System.out.println(shape1.getName() + " with parameter = 0 or negative parameter isn't exist. " +
                        "For the triangle condition isn't satisfied (side A + side B)>side C");
            } else if (shape1.notZeroAndExist()==false) {
                System.out.println(shape1.getName() + " with parameter = 0 or negative parameter isn't exist.");
            } else {
                System.out.println(shape1.toString() + "\nSpace of " + shape1.getName() + " = " + shape1.getSpace());}
            }
        // сравнение площадей фигур массива
        for (int i=0; i <shape.length;i++){
            for (int j=i+1; j<shape.length;j++) {
                System.out.println("Space of " + shape[i].getName() + " = space of " + shape[j].getName() + " is " + shape[i].compareSpace(shape[j].getSpace()));
            }
        }
        isRectangleOrTriangle();
    }

    public static void isRectangleOrTriangle(){               // определение соответствия фигуры прямоугольнику или треугольнику просто по названию класса :)
        Shape[] shape = {new Square(3),
                        new Rectangle(2,3),
                        new Rhombus(3,2),
                        new Triangle(3,4,5),
                        new Circle(10),
                        new Ellipse(4, 10)};
        for(int i=0; i<shape.length;i++){
            if(shape[i].getName().equals("Square")||shape[i].getName().equals("Rectangle")){
                System.out.println("The " + shape[i].getName() + " is rectangle");
            } else if (shape[i].getName().equals("Triangle")){
                System.out.println("The " + shape[i].getName() + " is triangle");
            } else {
                System.out.println("The " + shape[i].getName() + " isn't rectangle or triangle");
            }
        }
    }
}
