package com.example.parcial;
import org.junit.Test;
import static org.junit.Assert.*;


public class PruebaUnitariaA {
    @Test
    public void testClaseA() {

        testMultiplicar();
        testSuma();
    }

    private void testMultiplicar() {
        int resultado = multiplicar(3, 4);
        assertEquals(12, resultado);
    }

    private void testSuma() {
        int resultado = suma(1,5);
        assertEquals(6, resultado);
    }

    private int multiplicar(int a, int b) {
        return a * b;
    }

    private int suma(int a, int b) {
        return a + b;
    }


}
