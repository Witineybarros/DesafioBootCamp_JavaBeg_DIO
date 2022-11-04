
package dominio;

import java.time.LocalDate;


public class Mentoria {

    private String titulo;
    private String descrição;
    private LocalDate data;

    public Mentoria(String titulo, String descrição, LocalDate data) {
        this.titulo = titulo;
        this.descrição = descrição;
        this.data = data;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescrição() {
        return descrição;
    }

    public void setDescrição(String descrição) {
        this.descrição = descrição;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "------ M E N T O R I A ------\n" 
             + "Titulo: " + titulo + "\n"
             + "Descrição: " + descrição + "\n"
             + "Data: " + data;
    }
    
    
}
