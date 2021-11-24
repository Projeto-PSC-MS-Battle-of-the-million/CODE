
package com.mycompany.trabalhofinal;

public class Personagem {
    private int id;
    private String nome;
    private boolean status=true;
    private String habilidades;

public Personagem(){}
public Personagem(int id,String nome,String habilidades){
 this.id=id;
 this.nome=nome;
 this.habilidades=habilidades;
}

public int getId() {return id;}
public void setId(int id) {this.id = id;}//get e set id

public String getNome(){return nome;}
public void setNome(String nome){this.nome=nome;}

public boolean getStatus() {return status;}
public void setStatus(boolean status) {this.status = status;}

/*public void taOnao(){
    if(this.status==true){
    System.out.print("Ativadão.");
    }
    else{System.out.print("Mortão");}    
   }*/
public String toString(){ //toString
    return "\nNome do Personagem       :"+nome+
           "\nHabilidades do Personagem:"+habilidades+
           "\nStatus do corno          :"+status+"\n";
            }
}
