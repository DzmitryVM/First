package lection_Generics;

/*2.	Создать статический обобщённый метод swap в final классе PairUtil.
* Метод должен принимать объект класса Pair и возвращать пару, в которой
* элементы поменяны местами. */

final class PairUtil {

    public static String swap() {
        Pair<Integer, String> pair1 = new Pair<Integer, String>(1, "First");
        return pair1.getValue() + ", " + pair1.getKey().toString();                  // меняем местами элементы при выводе
    }

    public static void main(String[] args) {
        System.out.println("Our result: " + swap());
    }
}