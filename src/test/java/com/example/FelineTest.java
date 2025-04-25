package com.example;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest  {
    Feline feline = new Feline();

    @Test
    public void getFamilyFeline() {
        Assert.assertEquals("Кошачьи", feline.getFamily());

    }
    @Test
    public void getKittensFeline() {
        Assert.assertEquals(1, feline.getKittens());
    }

    @Test
    public void getKittensCount() {
        Assert.assertEquals(2, feline.getKittens(2));
    }

    @Test
    public void shouldReturnEatMeat() throws Exception {
        Assert.assertEquals(List.of("Животные", "Птицы", "Рыба"),feline.eatMeat());
    }

}