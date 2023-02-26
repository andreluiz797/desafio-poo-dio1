package br.com.dio.desafio.dominio;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
      Curso curso1 = new Curso();
      curso1.setTitulo("curso java");
      curso1.setDescricao("descricao curso java");
      curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descricao curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descricao");
        mentoria.setData(LocalDate.now());

       /* System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

      Bootcamp bootcamp = new Bootcamp();
      bootcamp.setNome("Bootcamp java Developer");
      bootcamp.setDescricao("Descricao Bootcamp java Developer");
      bootcamp.getConteudos().add(curso1);
      bootcamp.getConteudos().add(curso2);
      bootcamp.getConteudos().add(mentoria);


      Dev devAndre = new Dev();
      devAndre.setNome("Andre");
      devAndre.inscreverBootcamp(bootcamp);
      devAndre.progredir();
      devAndre.progredir();
      devAndre.progredir();

      System.out.println("***");

      System.out.println("Conteudos Inscritos Andre: " + devAndre.getCouteudosInscritos ());
      System.out.println("Conteudos Concluidos Andre: " + devAndre.getConteudosCloncluidos ());
      System.out.println("XP:" + devAndre.calcularTotalXp());

      System.out.println("___________________");

      Dev devGustavo = new Dev();
      devGustavo.setNome("Gustavo");
      devGustavo.inscreverBootcamp(bootcamp);
      devGustavo.progredir();

      System.out.println("***");

      System.out.println("Conteudos Inscritos Gustavo: " + devGustavo.getCouteudosInscritos());
      System.out.println("Conteudos Inscritos Gustavo: " + devGustavo.getConteudosCloncluidos());
      System.out.println("XP:" + devGustavo.calcularTotalXp());

      System.out.println("___________________");

      Dev devLuiz = new Dev();
      devLuiz.setNome("Luiz");
      devLuiz.inscreverBootcamp(bootcamp);
      devLuiz.progredir();
      devLuiz.progredir();

      System.out.println("***");

      System.out.println("Conteudos Inscritos Luiz: " + devLuiz.getCouteudosInscritos());
      System.out.println("Conteudos Inscritos Luiz: " + devLuiz.getConteudosCloncluidos());
      System.out.println("XP:" + devLuiz.calcularTotalXp());


    }

}