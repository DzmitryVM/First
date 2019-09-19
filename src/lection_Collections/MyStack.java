package lection_Collections;

class MyStack {
    int number;
    int size=0;
    private int[] myStackArray;
    private int startWith;


    public MyStack(int numberStack) {
        this.number=numberStack;
        myStackArray=new int[setStackSize()];
        startWith=-1;
    }

    public int setStackSize() {
        for (int i = 0; (int) (number / Math.pow(10, i)) != 0; i++) {  // получаем размер стэка через кол-во разрядов числа
            size = i + 1;
        }
        return size;
    }

    public void addNumberToStack() {
        for(int j=setStackSize()-1; j>=0;j--){
            int element = number/(int) Math.pow(10,j);
            myStackArray[++startWith]=element;
            number = number-element*(int) Math.pow(10,j);
        }
    }

    public void getMyStack(){

        for (int i=0; i<setStackSize();i++)
            System.out.print(myStackArray[i] + ", ");
    }

    public void getNumberFromStack(int indexOfElement){
        System.out.println(myStackArray[indexOfElement]);
    }

    public void getReverseNumber (){
        int number2=0;
        for (int ind=0; ind<setStackSize(); ind++) {
            number2 = number2+myStackArray[ind]*(int) Math.pow(10,ind);
        }
            System.out.print(number2);
    }
}

