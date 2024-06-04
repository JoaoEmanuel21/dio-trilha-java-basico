import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[]args){
        //Criando o objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Digite seu nome");
        String nome = scanner.next();

        System.out.println("Digite seu sobrenome");
        String sobreNome = scanner.next();

        System.out.println("Digite sua altura");
        Double altura = scanner.nextDouble();

        System.out.println("Digite sua idade");
        int idade = scanner.nextInt();

        System.out.println("Seu nome é: " + nome + " " + sobreNome + ", sua altura " + altura + " e idade de " + idade);

    }
}
