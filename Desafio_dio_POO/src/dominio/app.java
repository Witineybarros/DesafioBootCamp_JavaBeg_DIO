package dominio;

import java.time.LocalDate;

public class app {

    public static void main(String[] args) {
        Curso curso1 = new Curso("Curso java", "linguagem java", 8);
        Curso curso2 = new Curso("Curso js", "linguagem JavaScript", 4);

        System.out.println(curso1);
        System.out.println(curso2);

        Mentoria mentoria1 = new Mentoria("Java", "Mentoria introdutoria sobre o java", LocalDate.now());
        Mentoria mentoria2 = new Mentoria("JS", "Mentoria introdutoria sobre o JAVA SCRIPT", LocalDate.now());
        System.out.println("");
        
        System.out.println(mentoria1);
        System.out.println(mentoria2);
    }

}
