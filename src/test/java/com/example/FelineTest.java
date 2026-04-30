package com.example;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;
import static org.junit.Assert.*;


public class FelineTest {

    private final Feline feline = new Feline();
    @Test
    public void eatMeatReturnsPredatorFood() throws Exception {
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        assertEquals(expected, feline.eatMeat());
    }
    @Test
    public void getFamilyReturnsCats() {
        assertEquals("Кошачьи", feline.getFamily());
    }
    @Test
    public void getKittensWithoutArgumentReturnsOne() {


        assertEquals(1, feline.getKittens());
    }
    @Test
    public void getKittensWithArgumentReturnsFive() {
        assertEquals(5, feline.getKittens(5));
    }
    @Test
    public void getKittensWithArgumentReturnsZero() {
        assertEquals(0, feline.getKittens(0));
    }
}