import java.util.Scanner;

public class OperadorTernario {
    public static void main(String[] args) {
        //Iniciando a variável de tipo Scanner para obter a qtde de produtor futuramente!
        Scanner scan = new Scanner(System.in);

        //Solicita ao usuário a quantidade
        System.out.println("Informe a quantidade de produtos:");

        //Variável de tipo int recebendo a qtde de produtos!
        int qtdProdutos = scan.nextInt();

        //Utilizando um if/else para realizar as verificações!
        if (qtdProdutos >= 500){
            System.out.println("Quantidade suficiente!");
        }else{
            System.out.println("Repor produto!");
        }
        
        //Utilizando o operador ternário para realizar verificações!
        System.out.println((qtdProdutos >= 500) ? "Quantidade suficiente!" : "Repor produto!");
        
        scan.close();
    }

}
