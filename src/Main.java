import br.com.desafio.dominio.Bootcamp;
import br.com.desafio.dominio.Curso;
import br.com.desafio.dominio.Dev;
import br.com.desafio.dominio.Mentoria;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Curso curso = new Curso();
        Curso curso2 = new Curso();
        Mentoria mentoria = new Mentoria();

        mentoria.setTitulo("Java Java");
        mentoria.setDescricao("mentoria java");



        curso.setTitulo("Java");
        curso.setDescricao("Curso 01");
        curso.setCargaHoratia(40.5d);

        curso2.setTitulo("Python");
        curso2.setDescricao("Curso 02");
        curso2.setCargaHoratia(30.5d);

        System.out.println(curso);

        Bootcamp bootcamp = new Bootcamp();

        bootcamp.setNome("Bootcamp java dev");
        bootcamp.setDescricao("bootcamp descricao");
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(curso2);


        Dev devSavio = new Dev();

        devSavio.setNome("Sávio Cunha");
        devSavio.increverBootcampo(bootcamp);
        System.out.println(devSavio.getConteudosInscritos());


    }
}