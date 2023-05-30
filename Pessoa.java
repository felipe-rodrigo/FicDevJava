package pkg2;

// Classe Pessoa
public class Pessoa { 
  private String nome;
  private int idade;

  // Método Construtor
  public Pessoa(String nome, int idade) {
    this.nome = nome;
    this.idade = idade;
  }

  // Métodos get e set do atributo nome
  public String getNome() {
    return this.nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  // Métodos get e set do atributo idade
  public int getIdade() {
    return this.idade;
  }
  public void setIdade(int idade) {
    this.idade = idade;
  }

  // Método status representando o estado 
  public void status() {
    System.out.println("SOBRE A PESSOA: ");
    System.out.println("Nome: " + this.nome);
    System.out.println("Idade: " + this.idade);
  }
}