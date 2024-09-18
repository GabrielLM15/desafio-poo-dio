import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Conteudo;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Java");
        curso1.setDescricao("Curso de Java");
        curso1.setCargaHoraria(10);

        Curso curso2 = new Curso();
        curso2.setTitulo("Python");
        curso2.setDescricao("Curso de Python");
        curso2.setCargaHoraria(10);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Java");
        mentoria.setDescricao("Mentoria de Java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devGabriel = new Dev();
        devGabriel.setNome("Gabriel");
        devGabriel.inscreverBootcamp(bootcamp);
        //System.out.println("Conteudos inscritos Gabriel \n" + devGabriel.getConteudosInscritos());
        //devGabriel.progredir();
        //System.out.println("Conteudos concluidos Gabriel \n" + devGabriel.getConteudosConcluidos());
        //System.out.println("Conteudos inscritos Gabriel \n" + devGabriel.getConteudosInscritos());
        
        if(!devGabriel.getConteudosInscritos().isEmpty()){
            System.out.println("Conteudos Inscritos: "+ devGabriel.getNome());
            for(Conteudo c: devGabriel.getConteudosInscritos()){
                System.out.println(c);
            }
        } else {
            System.out.println("O Dev " + devGabriel.getNome() + " não está inscrito");
        }
        

        /*Dev devDiego = new Dev();
        devDiego.setNome("Diego");
        devDiego.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos Diego \n" + devDiego.getConteudosInscritos());
        devDiego.progredir();
        devDiego.progredir();
        System.out.println("Conteudos concluidos Diego \n" + devDiego.getConteudosConcluidos());*/


    }
}
