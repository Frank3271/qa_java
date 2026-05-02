package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;
import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class LionParameterizedTest {

    private final String sex;
    private final boolean expectedMane;
    private final Feline feline;   // поле для хищника

    // Конструктор теперь принимает три параметра
    public LionParameterizedTest(String sex, boolean expectedMane, Feline feline) {
        this.sex = sex;
        this.expectedMane = expectedMane;
        this.feline = feline;
    }

    @Parameterized.Parameters(name = "Пол: {0} -> грива: {1}")
    public static Collection<Object[]> data() {
        Feline realFeline = new Feline();  // создаём один реальный Feline для всех тестов
        return Arrays.asList(new Object[][]{
                {"Самец", true, realFeline},
                {"Самка", false, realFeline}
        });
    }

    @Test
    public void lionHasCorrectMane() throws Exception {
        Lion lion = new Lion(sex, feline);  // теперь передаём feline из конструктора
        assertEquals(expectedMane, lion.doesHaveMane());
    }
}