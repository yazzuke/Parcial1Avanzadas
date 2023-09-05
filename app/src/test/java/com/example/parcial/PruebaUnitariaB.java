package com.example.parcial;
import org.junit.Test;

import static org.junit.Assert.*;

public class PruebaUnitariaB {

    @Test
    public void testOperacionesJuntas() {
        int resultadoSuma = sumar(120, 442);
        assertEquals(562, resultadoSuma);

        int resultadoResta = restar(1389, 421);
        assertEquals(968, resultadoResta);

        int resultadoMultiplicacion = multiplicar(23,53);
        assertEquals(1219, resultadoMultiplicacion);
    }

    private int sumar(int a, int b) {
        return a + b;
    }

    private int restar(int a, int b) {
        return a - b;
    }

    private int multiplicar(int a, int b) {
        return a * b;
    }

}