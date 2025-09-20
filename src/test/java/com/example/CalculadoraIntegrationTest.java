package com.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CalculadoraIntegrationTest {

    @Test
    public void testSumaYResta() {
        Calculadora calc = new Calculadora();
        int suma = calc.sumar(2, 3);
        int resta = calc.restar(suma, 1); // integración: suma + resta
        assertEquals(4, resta, "2+3-1 debería ser 4");
    }
}

