package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {
    @Mock
    private Feline feline;
    @InjectMocks
    private Cat cat;
    @Test
    public void getSoundReturnsMeow() {
        assertEquals("Мяу", cat.getSound());
    }
    @Test
    public void getFoodReturnsWhatEatMeatReturns() throws Exception {
        List<String> expected = List.of("Животные", "Птицы", "Рыбы"); // понял

        when(feline.eatMeat()).thenReturn(expected);
        assertEquals(expected, cat.getFood());
    }
    @Test
    public void getFoodCallsEatMeatOnPredator() throws Exception {
        cat.getFood();
        verify(feline).eatMeat();
    }
}