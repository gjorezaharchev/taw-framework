package com.taw.tests;

import com.taw.common.elements.Elements;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Iterator;

public class CSV extends Elements {

    @DataProvider(name = "a")
    public Iterator<Object[]> aaa() {


        return dataSources.csv("src/test/resources/data/book.csv", ";");
    }

    @Test(dataProvider = "a")
    //@Test
    public void test(String a, String b, String c, String d) {
        System.out.println(d + a + b + c);
    }


}