package dominio;

import java.time.LocalDate;

public class app {
    
    public static void main(String[] args) {
        
       
        Curso curso1 = new Curso("Curso Java", "Linguagem de progamação em Java", 8);
        Curso curso2 = new Curso("Curso Js", "Linguagem de progamação em Java Script", 4);

        System.out.println(curso1);
        System.out.println(curso2);

        Mentoria mentoria1 = new Mentoria("Mentoria sobre JAVA", "mentoria introdutoria sobre Java", LocalDate.now());
        Mentoria mentoria2 = new Mentoria("Mentoria sobre JAVA SCRIPT", "mentoria introdutoria sobre Java Script", LocalDate.now());
        System.out.println("");

        System.out.println(mentoria1);
        System.out.println(mentoria2);
    }

}
