package test.java.steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Quando;
import io.cucumber.java.pt.Então;
import main.java.reserva.ReservaService;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReservaSteps {

    private ReservaService service;
    private String resposta;
    private String cidadeAtual;

    public ReservaSteps() {
        this.service = new ReservaService();
    }

    @Dado("que o passageiro está na cidade {string}")
    public void que_o_passageiro_está_na_cidade(String cidade) {
        this.cidadeAtual = cidade;
    }

    @Quando("o passageiro solicitar uma corrida")
    public void o_passageiro_solicitar_uma_corrida() {
        this.resposta = service.reservar(cidadeAtual, "Endereço");
    }

    @Então("o sistema deve retornar {string}")
    public void o_sistema_deve_retornar(String mensagemEsperada) {
        assertEquals(mensagemEsperada, this.resposta);
    }
}