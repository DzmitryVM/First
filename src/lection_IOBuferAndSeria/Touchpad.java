package lection_IOBuferAndSeria;

import java.io.Serializable;

public class Touchpad implements Serializable{
    transient boolean isFlag;
    double a;
    double b;

    Touchpad(boolean flag){
        this.isFlag = flag;
        a = 0.0;
        b = 0.0;
    }
}
