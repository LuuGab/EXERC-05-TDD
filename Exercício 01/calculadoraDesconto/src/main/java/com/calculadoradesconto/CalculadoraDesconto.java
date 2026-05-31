package com.calculadoradesconto;

public class CalculadoraDesconto {

    private void validarValor(double valor) {
        if (valor < 0) {
            throw new IllegalArgumentException("O valor da compra não pode ser negativo.");
        }
    }

    private double obterPercentualDesconto(double valor) {
        if (valor >= 500) {
            return 0.10;
        } else if (valor >= 100) {
            return 0.05;
        }
        return 0; // Valor da compra menor que R$ 100,00 não há desconto aplicado
    }

    private double aplicarDesconto(double valor, double percentual) {
        return valor * (1 - percentual);
    }

    public double calcularValorFinal(double valorCompra) {
        validarValor(valorCompra);
        
        double percentualDesconto = obterPercentualDesconto(valorCompra);
        
        return aplicarDesconto(valorCompra, percentualDesconto);
    }

}