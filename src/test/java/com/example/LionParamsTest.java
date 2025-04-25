package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class LionParamsTest {

    @Parameterized.Parameter
    public String sex;
    @Parameterized.Parameter(1)
    public boolean result;

    @Parameterized.Parameters
    public static Object[][]data(){
        return new Object[][]{
                {"Самец",true},
                {"Самка", false}
        };
    }

    @Test
    public void doesHaveManeBySex() throws Exception {
        Lion lion = new Lion(sex);
        Assert.assertEquals(result, lion.doesHaveMane());
    }

}
