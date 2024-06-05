import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        String numAgencia = "067-8";
        int numConta = 1021;
        String nomeCli = "Mario Andrade";
        double saldo = 237.48;

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Digite o número da conta: ");
        int numContaDig = scanner.nextInt();
            if (numContaDig == numConta){

                System.out.println("Digite o número da agência ");
                String numAgenciaDig = scanner.next();
                    if (numAgenciaDig.equals(numAgencia)){
        
                    System.out.println("Olá " + nomeCli + " obrigado por criar uma conta em nosso banco, sua agência é: " + numAgencia + ", conta " + numConta + " e seu saldo " + saldo + " já está disponível para saque!");
        
                    } 
                    else{
        
                    System.out.println("Você ainda não possui conta no nosso banco");
                    }

            } 
            else {

                System.out.println("Você ainda não possui conta no nosso banco");
            }
    }
}
