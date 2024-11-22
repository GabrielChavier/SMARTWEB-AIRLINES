package br.com.smartweb.airlines;

import java.util.Objects;

public class Passageiro {

    private String nome;

    public Passageiro(String nome) {
        Objects.requireNonNull(nome, "O nome não pode ser nulo");
        if (nome.trim().isEmpty()) {
            throw new IllegalArgumentException("O nome do passageiro não pode estar vazio");
        }
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        Objects.requireNonNull(nome, "O nome não pode ser nulo");
        if (nome.trim().isEmpty()) {
            throw new IllegalArgumentException("O nome do passageiro não pode estar vazio");
        }
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Passageiro{nome='" + nome + "'}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Passageiro that = (Passageiro) o;
        return nome.equals(that.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome);
    }
}

