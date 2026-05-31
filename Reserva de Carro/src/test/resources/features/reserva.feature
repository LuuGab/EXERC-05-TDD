# language: pt

Funcionalidade: Reserva de carro por aplicativo
  Como passageiro de um aplicativo de transporte
  Quero reservar um carro informando meu local
  Para que eu possa me deslocar com comodidade e segurança

  Cenário: Reserva dentro da área de cobertura em Belo Horizonte
    Dado que o passageiro está na cidade "Belo Horizonte"
    Quando o passageiro solicitar uma corrida
    Então o sistema deve retornar "Motorista a caminho"

  Cenário: Reserva dentro da área de cobertura em Contagem
    Dado que o passageiro está na cidade "Contagem"
    Quando o passageiro solicitar uma corrida
    Então o sistema deve retornar "Motorista a caminho"

  Cenário: Reserva fora da área de cobertura
    Dado que o passageiro está na cidade "Rio de Janeiro"
    Quando o passageiro solicitar uma corrida
    Então o sistema deve retornar "Área fora de cobertura"