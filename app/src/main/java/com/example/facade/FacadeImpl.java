package com.example.facade;

/**
 * Created by Anand on 06/10/2016.
 */
public class FacadeImpl implements Facade {

    ClassA a;
    ClassB b;
    ClassC c;

    public FacadeImpl(ClassA a, ClassB b, ClassC c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public int sum() {
        return a.value() + b.value() + c.value();
    }
}
