package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {
    @Mock
    private Feline  feline;



    @Test(expected = Exception.class)
    public void lionWithInvalidSexThrowsException() throws Exception {
        new Lion("Ошибка", feline);
        //так ?
    }
    //так ?
    @Test
    public void getKittensReturnsWhatFelineReturns() throws Exception {
        when(feline.getKittens()).thenReturn(7);
        Lion lion = new Lion("Самец", feline);
        assertEquals(7, lion.getKittens());
    }
    @Test
    public void getKittensCallsFelineGetKittens() throws Exception {
        Lion lion = new Lion("Самец", feline);
        lion.getKittens();
        verify(feline).getKittens();
    }
    @Test
    public void getFoodReturnsWhatFelineGetFoodReturns() throws Exception {
        List<String> expected = List.of("Животные", "Птицы", "Рыба");  // ок
        when(feline.getFood("Хищник")).thenReturn(expected);
        Lion lion = new Lion("Самец", feline);
        assertEquals(expected, lion.getFood());
    }
    @Test
    public void getFoodCallsFelineGetFoodWithPredator() throws Exception {
        Lion lion = new Lion("Самец", feline);
        lion.getFood();
        verify(feline).getFood("Хищник");
    }
}
