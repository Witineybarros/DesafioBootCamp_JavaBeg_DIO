package dominio;

public class Curso extends Conteudo {

    private int cargaHoraria;

    // CONTRUTOR //
    public Curso(String titulo, String descrição, int cargaHoraria) {
        this.setTitulo(titulo);
        this.setDescrição(descrição);
        this.cargaHoraria = cargaHoraria;
    }

    public Curso() {

    }

    // GET - SET //
    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    // M E T O D O S //
    @Override
    public double calcularXP() {
        return XP_PADRAO * cargaHoraria;
    }

    @Override
    public String toString() {
        return "------ C U R S O ------\n"
                + "Titulo: " + getTitulo() + "\n"
                + "Descrição: " + getDescrição() + "\n"
                + "Carga Horaria: " + cargaHoraria;
    }

}
