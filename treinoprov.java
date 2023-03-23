import java.util.Scanner;

public class treinoprov {
    public static void main(String[] args) {
        Float nota1,nota2,media,recuperacao;
        String nome;
        Scanner ler = new Scanner(System.in);
        // nome do estudante
        // média das duas notas do estudante
        // testar condição para aprovado
        // testar condição para aprovado
        // testar condição para recuperação
        System.out.println("Digite o nome do aluno");
        nome = ler.nextLine();
        System.out.println("Digite a primeira nota do aluno");
        nota1 = ler.nextFloat();
        System.out.println("Digite a segunda nota do aluno");
        nota2 = ler.nextFloat();
        media = (nota1+nota2)/2;
        if (media >= 6) {
          System.out.println("O aluno: "+nome+ " está aprovado com a média "+media);
        } else { 
          System.out.println( "Digite a nota da recuperação");
          recuperacao = ler.nextFloat();
          if (recuperacao >= 6) {
            System.out.println("O aluno: "+nome+ " passou na recuperação com a nota "+recuperacao); 
          } else {
            System.out.println("O aluno: "+nome+ " reprovou "+recuperacao);
          } 

          
        }
        
    }
}
