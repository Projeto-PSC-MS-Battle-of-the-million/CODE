
package com.mycompany.trabalhofinal;

public class Usuario {
  private long cpf;
private String nome;

public Usuario(){
}
public Usuario(long cpf,String nome){
    this.cpf=cpf;
    this.nome=nome;
}

public long getCpf() {return cpf;}
public void setCpf(long cpf) {this.cpf = cpf;}//get e set cpf

public String getNome() {return nome;}
public void setNome(String nome) {this.nome= nome;} //get e set nome  
}
