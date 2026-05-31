package main.java.reserva;

public class ReservaService {

    public String reservar(String cidade, String endereco) {
        // Regra de negócio: Verifica se a cidade está na área de cobertura
        if (cidade.equalsIgnoreCase("Belo Horizonte") || cidade.equalsIgnoreCase("Contagem")) {
            return "Motorista a caminho";
        } else {
            return "Área fora de cobertura";
        }
    }
}