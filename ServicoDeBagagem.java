package br.com.smartweb.airlines;

import java.util.Objects;

public class ServicoDeBagagem {

    private final ServicoDeReserva servicoDeReserva;

    public ServicoDeBagagem(ServicoDeReserva servicoDeReserva) {
        this.servicoDeReserva = Objects.requireNonNull(servicoDeReserva, "O serviço de reservas não pode ser nulo");
    }

    public void contratar(String codigoReserva, int quantidadeBagagens) {
        if (quantidadeBagagens <= 0) {
            throw new IllegalArgumentException("Quantidade de bagagens deve ser maior que zero");
        }

        // Busca a reserva de forma segura
        Reserva reserva = buscarReservaPorCodigo(codigoReserva);
        
        // Adiciona a quantidade de bagagens
        reserva.adicionarBagagens(quantidadeBagagens);
    }

    private Reserva buscarReservaPorCodigo(String codigoReserva) {
        return servicoDeReserva.buscar(codigoReserva)
                .orElseThrow(() -> new ReservaNaoEncontradaException("Reserva com código " + codigoReserva + " não encontrada"));
    }
}
