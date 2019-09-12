package lection_Generics;

/*1.	Создать класс Pair, параметризованный двумя параметрами K и V.
* Класс должен хранить две переменные типов K и V соответственно.
* У класса должен быть конструктор, принимающий 2 параметра типов K и V,
* а также набор соответствующих геттеров/сеттеров.
* */


class Pair<K,V> {

    private K keyK;
    private V valueV;


    public Pair (K argK, V argV) {
        keyK = argK;
        valueV = argV;
    }

    public K getKey () {                 // Вернуть keyK
        return keyK;
    }

    public void setKey (K keyK) {
        this.keyK = keyK;
    }

    public V getValue () {
        return valueV;
    }

    public void setValue (V valueV) {
        this.valueV = valueV;
    }

}



