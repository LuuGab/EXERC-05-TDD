package com.calculadoradesconto;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraDescontoTest {
    private CalculadoraDesconto calculadora;

    @BeforeEach
    void setup() {
        calculadora = new CalculadoraDesconto();
    }

    // 0% desconto
    @Test
    void deveRetornarValorSemDesconto_QuandoValorForMenorQueCem() {

        double resultado = calculadora.calcularValorFinal(80.00);
        assertEquals(80.00, resultado);
    }

    // 5% desconto
    @Test
    void deveAplicarDescontoDeCincoPorcento_QuandoValorForEntreCemECinhentos() {
        double resultado = calculadora.calcularValorFinal(200.00);
        assertEquals(190.00, resultado);
    }

    // 10% desconto
    @Test
    void deveAplicarDescontoDeDezPorcento_QuandoValorForMaiorOuIgualACinhentos() {
        double resultado = calculadora.calcularValorFinal(1000.00);
        assertEquals(900.00, resultado);
    }

    // Exception
    @Test
    void deveLancarExcecao_QuandoValorForNegativo() {
        assertThrows(IllegalArgumentException.class, () -> {
            calculadora.calcularValorFinal(-50.00);
        });
    }

    // Refactor dos testes
    @Test
    void deveManterDescontoCincoPorcento_QuandoValorForCem() {
        assertEquals(95.00, calculadora.calcularValorFinal(100.00));
    }

    @Test
    void deveManterDescontoCincoPorcento_QuandoValorForQuatrocentosENoventaENove() {
        assertEquals(474.99, calculadora.calcularValorFinal(499.99), 0.001);
    }

    @Test
    void deveAplicarDezPorcento_QuandoValorForQuinhentos() {
        assertEquals(450.00, calculadora.calcularValorFinal(500.00));
    }
}