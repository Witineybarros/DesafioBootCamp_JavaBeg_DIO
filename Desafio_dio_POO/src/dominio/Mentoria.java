package dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {

    private LocalDate data;

    // CONTRUTOR //
    public Mentoria(String titulo, String descrição, LocalDate data) {
        this.setTitulo(titulo);
        this.setDescrição(descrição);
        this.data = data;
    }

    // GET - SET //
    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    // M E T O D O S //
    @Override
    public double calcularXP() {
        return XP_PADRAO + 20d;
    }

    @Override
    public String toString() {
        return "------ M E N T O R I A ------\n"
                + "Titulo: " + getTitulo() + "\n"
                + "Descrição: " + getDescrição() + "\n"
                + "Data: " + data;
    }

}
