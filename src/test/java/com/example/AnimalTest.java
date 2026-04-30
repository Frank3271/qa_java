package com.example;

import org.junit.Test;
import java.util.List;
import static org.junit.Assert.*;

public class AnimalTest {
    private final Animal animal = new Animal();
    @Test
    public void getFoodWithHerbivoreReturnsPlants() throws Exception {
        List<String> expected = List.of("Трава", "Различные растения");
        assertEquals(expected, animal.getFood("Травоядное"));
    }
    @Test
    public void getFoodWithPredatorReturnsAnimalsBirdsFish() throws Exception {
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        assertEquals(expected, animal.getFood("Хищник"));
    }
    @Test(expected = Exception.class)
    public void getFoodWithInvalidKindThrowsException() throws Exception {
        animal.getFood("Неизвестное");
    }
    @Test
    public void getFamilyReturnsCorrectString() {
        String expected = "Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи";
        assertEquals(expected, animal.getFamily());
    }
}
