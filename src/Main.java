import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Curso curso = new Curso();
        curso.setTitulo(" Curso JS");
        curso.setDescricao("Aprenda JavaScript para frontend");
        curso.setCargaHoraria(4);
        
        Curso curso1 = new Curso();
        curso1.setTitulo(" Curso AWS");
        curso1.setDescricao("Aprenda AWS para desenvolver na cloud");
        curso1.setCargaHoraria(10);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Aprenda Java com os melhores profissionais do mercado");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setDescricao("Bootcamp Inter Java Experts");
        bootcamp.setDescricao("Aprenda Java com os devs do Inter");
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(mentoria);

        Dev engPedro = new Dev();
        engPedro.setNome("Pedro Henrique");
        engPedro.inscreverBootcamp(bootcamp);
        System.out.println("---------");
        System.out.println("Conteudos inscritos Pedro: " + engPedro.getCounteudosInscritos());
        engPedro.progredir();
        engPedro.progredir();
        engPedro.progredir();
        System.out.println("Conteudos inscritos Pedro: " + engPedro.getCounteudosInscritos());
        System.out.println("Conteudos concluidos Pedro: " + engPedro.getConteudosConcluidos());
        System.out.println("XP: " + engPedro.calcularTotalXp());
        System.out.println("---------------");
        
        Dev devNathalia = new Dev();
        devNathalia.setNome("Nathalia Fernandez");
        devNathalia.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos Nathalia: " + devNathalia.getCounteudosInscritos());
        System.out.println("---------");
        devNathalia.progredir();
        System.out.println("Conteudos inscritos Nathalia: " + devNathalia.getCounteudosInscritos());
        System.out.println("Conteudos concluidos Nathalia: " + devNathalia.getConteudosConcluidos());
        System.out.println("XP: " + devNathalia.calcularTotalXp());
       
    }
}
