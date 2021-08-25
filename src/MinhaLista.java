import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class MinhaLista {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//variaveis


        List<Empregado> list = new ArrayList<>();
        System.out.println("Quantos Profissionais serão registrados?");
        int ProfRegistrados = sc.nextInt();

        for (int i = 0; i <= ProfRegistrados; i++) {
            System.out.println("Id");
            Integer Id = sc.nextInt();
            System.out.println("Nome:");
            String Nome = sc.nextLine();
            System.out.println("Nome:");
            Double Salario = sc.nextDouble();
            Empregado empregado = new Empregado(Id, Nome, Salario);
            list.add(empregado);
        }
        System.out.println("Entre com o Id a ter um aumento!");
        Integer Idpos = sc.nextInt();
        Integer posicao = position(list, Idpos);
        // Empregado empregado = list.stream().filter(x -> x.getId() == Id).findFirst().orElse(null));
        System.out.println("escreva a porcentagem aumento!");
        if (posicao == null) {
            System.out.println("Id inexistente");
        } else {
            System.out.println("Entre com a porcentagem");
            double porcentagem = sc.nextDouble();
            list.get(posicao).AumentoSalario(porcentagem);
        }
    }


    public static Integer position(List<Empregado> list, int Id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == Id) {
                return i;
            }
        }
    }
}
//https://www.youtube.com/watch?v=Xj-osdBe3TE