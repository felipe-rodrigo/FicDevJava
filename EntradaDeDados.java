package pkg2;

import java.util.Scanner;

public class EntradaDeDados {
  public static void main(String[] args) {
  
    Scanner ler = new Scanner(System.in);

    Pessoa fulano = new Pessoa(String nome, int idade);

    System.out.print("Digite seu nome: ");
    String nome = ler.nextLine();
    
    System.out.print("Digite sua idade:");
    int idade = ler.nextInt();

    fulano.status();

    ler.close();
  }
}
