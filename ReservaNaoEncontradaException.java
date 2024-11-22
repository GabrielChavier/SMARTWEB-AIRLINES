package br.com.smartweb.airlines;

public class ReservaNaoEncontradaException extends RuntimeException {

    public ReservaNaoEncontradaException() {
        super("Reserva não encontrada"); // Mensagem padrão
    }

    public ReservaNaoEncontradaException(String message) {
        super(message);
    }

    public ReservaNaoEncontradaException(String message, Throwable cause) {
        super(message, cause);
    }

    public ReservaNaoEncontradaException(Throwable cause) {
        super(cause);
    }
}
