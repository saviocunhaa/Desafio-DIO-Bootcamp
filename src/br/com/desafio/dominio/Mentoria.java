package br.com.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo   {

    private final LocalDate data = LocalDate.now();



    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", data=" + data +
                '}';
    }

    @Override
    public double calcularXP() {
        return XP_PADRAO + 20d;
    }

}
