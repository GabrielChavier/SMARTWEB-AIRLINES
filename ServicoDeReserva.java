package br.com.smartweb.airlines;

import java.util.*;

public class ServicoDeReserva {

    private final Set<Reserva> reservas = new HashSet<>();

    public Collection<Reserva> getReservas() {
        return Collections.unmodifiableSet(reservas);
    }

    public void adicionar(Reserva reserva) {
        boolean reservaAdicionada = reservas.add(reserva);

        if (!reservaAdicionada) {
            throw new ReservaDuplicadaException(
                    String.format("A reserva com o código %s já existe", reserva.getCodigo()));
        }
    }

    public Optional<Reserva> buscar(String codigo) {
        return reservas.stream()
                .filter(reserva -> reserva.getCodigo().equals(codigo))
                .findFirst();
    }

}
