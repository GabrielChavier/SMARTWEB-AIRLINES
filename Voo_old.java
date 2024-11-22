package br.com.smartweb.airlines;

import java.util.Objects;

public class Voo {
    private final String codigo;
    private final String origem;
    private final String destino;

    public Voo(String codigo, String origem, String destino) {
        this.codigo = Objects.requireNonNull(codigo, "O código não pode ser nulo");
        this.origem = Objects.requireNonNull(origem, "A origem não pode ser nula");
        this.destino = Objects.requireNonNull(destino, "O destino não pode ser nulo");
    }

    public String getCodigo() {
        return codigo;
    }

    public String getOrigem() {
        return origem;
    }

    public String getDestino() {
        return destino;
    }

    @Override
    public String toString() {
        return String.format("Voo {codigo='%s', origem='%s', destino='%s'}", codigo, origem, destino);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Voo voo = (Voo) o;

        if (!codigo.equals(voo.codigo)) return false;
        if (!origem.equals(voo.origem)) return false;
        return destino.equals(voo.destino);
    }

    @Override
    public int hashCode() {
        int result = codigo.hashCode();
        result = 31 * result + origem.hashCode();
        result = 31 * result + destino.hashCode();
        return result;
    }
}
