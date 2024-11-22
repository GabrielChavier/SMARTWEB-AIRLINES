package br.com.smartweb.airlines;

public record Voo(String codigo, String origem, String destino) {
    public Voo {
        if (codigo == null || codigo.isBlank()) {
            throw new IllegalArgumentException("O código do voo não pode ser nulo ou vazio");
        }
        if (origem == null || origem.isBlank()) {
            throw new IllegalArgumentException("A origem do voo não pode ser nula ou vazia");
        }
        if (destino == null || destino.isBlank()) {
            throw new IllegalArgumentException("O destino do voo não pode ser nulo ou vazio");
        }
    }
}
