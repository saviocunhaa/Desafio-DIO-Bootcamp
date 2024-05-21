package br.com.desafio.dominio;

public class Curso extends Conteudo{

    private Double cargaHoraria;


    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargaHoratia=" + cargaHoraria +
                '}';
    }

    @Override
    public double calcularXP() {
        return XP_PADRAO * cargaHoraria;
    }


    public Double getCargaHoratia() {
        return cargaHoraria;
    }

    public void setCargaHoratia(Double cargaHoratia) {
        this.cargaHoraria = cargaHoratia;
    }

}
