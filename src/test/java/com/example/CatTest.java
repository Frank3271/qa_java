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
    public void getFoodCallsFelineGetFood() throws Exception {
        List<String> expectedFood = List.of("Мясо", "Рыба");
        when(feline.getFood("Хищник")).thenReturn(expectedFood);
        List<String> actualFood = cat.getFood();
        assertEquals(expectedFood, actualFood);
        verify(feline, times(1)).getFood("Хищник");
    }

    @Test;
    public void getKittensCallsFelineGetKitte
        when(feline.getKittens()).thenReturn(3);

        assertEquals(3, cat.getKittens());
        verify(feline, times(1)).getKittens();
    }
}
