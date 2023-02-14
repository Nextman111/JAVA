package oop2;

import oop2.interfaces.Sayable;

public class Radio implements Sayable {
    @Override
    public String say(){
        return "Radio say blablabla";
    }
}
