package dominio;

public class Curso extends Conteudo {

    private int cargaHoraria;

    // CONTRUTOR //
    public Curso(String titulo, String descricao, int cargaHoraria) {
        this.setTitulo(titulo);
        this.setDescricao(descricao);
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
                + "Descrição: " + getDescricao() + "\n"
                + "Carga Horaria: " + cargaHoraria;
    }

}
