package br.com.smartweb.airlines;

public class AirLinesMain {

    public static void main(String[] args) {
        System.out.println("======================== SMARTWEB AIRLINES ========================");

        var servicoDeReserva = new ServicoDeReserva();
        var servicoDeBagagem = new ServicoDeBagagem(servicoDeReserva);
        Voo voo = new Voo("G31333", "UDI", "GRU");

        // Adicionando reservas
        servicoDeReserva.adicionar(new Reserva("28A888", voo, "Juca Ferreira do Nascimento"));
        servicoDeReserva.adicionar(new Reserva("28B111", voo, "Mari Lins da Fonseca"));
        servicoDeReserva.adicionar(new Reserva("74F877", voo, "Sebastião Coelho Beltrão"));

        // Tentando contratar bagagem
        servicoDeBagagem.contratar("28A888", 2);

        // Listando reservas
        servicoDeReserva.getReservas().forEach(System.out::println);

        System.out.println("=====================================================================");
    }
}
