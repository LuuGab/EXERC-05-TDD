package test.java.runner;

import main.java.reserva.ReservaService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReservaServiceTest {

    @Test
    public void testReservaBeloHorizonte() {
        ReservaService service = new ReservaService();
        String resultado = service.reservar("Belo Horizonte", "Av. Afonso Pena");
        assertEquals("Motorista a caminho", resultado);
    }

    @Test
    public void testReservaContagem() {
        ReservaService service = new ReservaService();
        String resultado = service.reservar("Contagem", "Rua das Flores");
        assertEquals("Motorista a caminho", resultado);
    }

    @Test
    public void testReservaForaDaArea() {
        ReservaService service = new ReservaService();
        String resultado = service.reservar("São Paulo", "Av. Paulista");
        assertEquals("Área fora de cobertura", resultado);
    }
}