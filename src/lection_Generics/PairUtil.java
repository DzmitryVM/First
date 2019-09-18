package lection_Generics;

/*2.	Создать статический обобщённый метод swap в final классе PairUtil.
* Метод должен принимать объект класса Pair и возвращать пару, в которой
* элементы поменяны местами. */

final class PairUtil {

    private PairUtil () {}

    public static <argK, argV> Pair <argV, argK> swap (Pair<argK, argV> pair){
        return new Pair<>(pair.getValue(), pair.getKey());
    }

    public static void main(String[] args) {
        Pair<Integer, String> pair1 = new Pair<Integer, String>(1, "First");
        System.out.println("Our result: " + swap(pair1).getValue() + ", " + swap(pair1).getKey());
    }


}