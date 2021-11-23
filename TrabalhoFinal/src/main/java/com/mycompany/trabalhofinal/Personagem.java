
package com.mycompany.trabalhofinal;

public class Personagem {
      private int id;
    private String nome;
    private boolean status;
 

public Personagem(){}
public Personagem(int id,String nome, boolean status){
 this.id=id;
 this.nome=nome;
 this.status=status;
}
public int getId() {return id;}
public void setId(int id) {this.id = id;}//get e set id

public String getNome(){return nome;}
public void setNome(String nome){this.nome=nome;}

public boolean isStatus() {return status;}
public void setStatus(boolean status) {this.status = status;}

  
}
