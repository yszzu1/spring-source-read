package com.beans;

/**
 * Created by yanshuai on 2017/3/21.
 */
public class BeanA {

    private BeanB b;

    public void setB(BeanB b) {
        this.b = b;
    }

    public BeanA() {
        System.out.println("A init");
    }

    public void printInfo(){
        System.out.println("A inited");
    }
}
