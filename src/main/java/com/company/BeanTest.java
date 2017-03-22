package com.company;

import com.beans.BeanA;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Created by yanshuai on 2017/3/21.
 */
public class BeanTest {

    public static void main(String[] args) {
        FileSystemXmlApplicationContext context = new FileSystemXmlApplicationContext("classpath:application.xml");
        BeanA beana = (BeanA) context.getBean("beanA");
        beana.printInfo();
    }
}
