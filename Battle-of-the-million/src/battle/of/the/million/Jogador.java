package battle.of.the.million;

import battle.of.the.million.Personagem;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.management.RuntimeErrorException;
import java.util.InputMismatchException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Jogador extends Personagem{
    
    //Atributos
    
    private String nome, apelido, email;
    private long telefone;
    private String Personagem;
    private boolean Sdesistir,Rdesistir;
    
    public String getPersonagem() {
        return Personagem;
    }

    @Override
    public void setVida(int vida) {
        super.setVida(vida); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public float getVida() {
        return super.getVida(); //To change body of generated methods, choose Tools | Templates.
    }
    private int sorte;
    private boolean vez;
    
      Scanner input = new Scanner(System.in);

      //Método Construtor
      
    public Jogador(String nome, String n, String h, int v, boolean s) {
        super(n, h, v, s);
        this.nome = nome;
    }

    //Métodos 
    
    public void teste(){
        
        int x,a,d;
        
    }
    public void EscolherResposta(Partida s, Jogador [] j, Personagem [] p, Pergunta [] u, Alternativas [] a, MenuInicial m1,Partida A, Partida B, Partida C, Partida D){
        int x,i;
       
        if(j[0].getVez() == true){
            i=0;
        }else{
            i=1;
        }
        
           System.out.print("\n" + j[i].Personagem);
           
           for(float y = 0; y <= j[i].getVida(); y+=10){
               System.out.print("[]");
           }
           System.out.print(" " + j[i].getVida() + " %\n");
          
        System.out.print("\n" + j[i].nome + " escolha uma alternativa: ");
        
        String r;
        r = input.next().toLowerCase();
        
        System.out.println("\nConfirmar alternativa?\n\n [1]Sim   [2]Não\n");
        System.out.print("Digite uma opção: ");
        x = input.nextInt();
        
        if(x == 1){
            
        }else if(x ==2){
            s.EscolherResposta(s,j,p,u,a,m1,A,B,C,D);
        }else{
            System.out.println("Alternativa invalida, digite novamente!");
            s.EscolherResposta(s,j,p,u,a,m1,A,B,C,D);
        }
     
        switch (r){
            
            case "a":
               if (s.getA() == true){
                   System.out.println("Parabéns, você acertou!");
                   
                   s.Quiz(u, a, s, j,m1,A,B,C,D);
                   
               }else{
                   System.out.println("Você errou!");
                   if(A.getA() == true){
                       System.out.println("A alternativa correra é a  A");
                   }else if(A.getB() == true){
                   System.out.println("A alternativa correra é a  B");
                   }else if (C.getC() == true){
                   System.out.println("A alternativa correra é a  C");
                   }else{
                   System.out.println("A alternativa correra é a  D");
                   }
                   j[i].vez = false;
                j[i].setVida((int) (j[i].getVida() * 0.95));
                   System.out.print("\n" + j[i].Personagem);
           
           for(float y = 0; y <= j[i].getVida(); y+=10){
               System.out.print("[]");
           }
           System.out.print(" " + j[i].getVida() + " %\n");
           
                   if(i == 0){
                       i=1;
                        j[i].vez = true;
                       
                   }else{
                       i=0;
                       j[i].vez =true;
                   }
               }
               s.Quiz(u, a, s, j,m1,A,B,C,D);
                break;
                
            case "b":
                if (s.getA() == true){
                   System.out.println("Parabéns você acertou!");
                   s.Quiz(u, a, s,j,m1,A,B,C,D);
               }else{
                   System.out.println("Você errou!");
                   if(A.getA() == true){
                       System.out.println("A alternativa correra é a  A");
                   }else if(B.getB()== true){
                   System.out.println("A alternativa correra é a  B");
                   }else if (C.getC() == true){
                   System.out.println("A alternativa correra é a  C");
                   }else{
                   System.out.println("A alternativa correra é a  D");
                   }
                   j[i].vez = false;
                   
                   if(i == 0){
                       i=1;
                        j[i].vez = true;
                       
                   }else{
                       i=0;
                       j[i].vez =true;
                   }
               }
                s.Quiz(u, a, s, j,m1,A,B,C,D);
                break;
                
            case "c":
                if (s.getC() == true){
                   System.out.println("Parabéns você acertou!");
                   s.Quiz(u,a,s,j,m1,A,B,C,D);
               }else{
                   System.out.println("Você errou!");
                   if(A.getA() == true){
                       System.out.println("A alternativa correra é a  A");
                   }else if(B.getB() == true){
                   System.out.println("A alternativa correra é a  B");
                   }else if (C.getC() == true){
                   System.out.println("A alternativa correra é a  C");
                   }else{
                   System.out.println("A alternativa correra é a  D");
                   }
                   j[i].vez = false;
                   
                   if(i == 0){
                       i=1;
                        j[i].vez = true;
                       
                   }else{
                       i=0;
                       j[i].vez =true;
                   }
               }s.Quiz(u, a, s, j,m1,A,B,C,D);
                break;
                
            case "d":
                if (s.getD() == true){
                   System.out.println("Parabéns você acertou!");
                   s.Quiz(u, a, s,j,m1,A,B,C,D);
               }else{
                   System.out.println("\nVocÊ errou!");
                   if(A.getA() == true){
                       System.out.println("A alternativa correra é a  A");
                   }else if(B.getB()== true){
                   System.out.println("A alternativa correra é a  B");
                   }else if (C.getC() == true){
                   System.out.println("A alternativa correra é a  C");
                   }else{
                   System.out.println("A alternativa correra é a  D");
                   }
                   j[i].vez = false;
                   
                   if(i == 0){
                       i=1;
                        j[i].vez = true;
                       
                   }else{
                       i=0;
                       j[i].vez =true;
                   }
               }s.Quiz(u, a, s, j,m1,A,B,C,D);
                break;
                
            case "0":
                j[i].Sdesistir=true;
                System.out.println("\nVocê solicitou desistencia, aguarde a resposta do outro jogador");
                
                 j[i].vez = false;
                   
                   if(i == 0){
                       i=1;
                        j[i].vez = true;
                       
                   }else{
                       i=0;
                       j[i].vez =true;
                   }
                   
               s.Desistir(j, s, m1, u, a);
                break;
                
            default:
                System.out.println("Alternativa invalida, digite novamente!");
                s.EscolherResposta(s,j,p,u,a,m1,A,B,C,D);
                break;
                
        }
        
    }
      
    public void CadastrarJogador(Jogador [] j) {
       
           FileWriter  fw = null;
        
            try{
                input = new Scanner(System.in);
                System.out.print("Nome: ");
                this.setNome(input.nextLine().toUpperCase());

                input = new Scanner(System.in);
                System.out.print("Apelido: ");
                this.setApelido(input.nextLine().toUpperCase());
                
                input = new Scanner(System.in);
                System.out.print("Número de Telefone: ");
                long g = input.nextLong();
                this.setTelefone(g);
                
                input = new Scanner(System.in);
                System.out.print("E-mail: ");
                this.setEmail(input.nextLine().toLowerCase());
                
            }
            catch(InputMismatchException k){
                System.out.println("\nDADOS INVALIDO, VERIFIQUE S DADOS E TENTE NOVAMENTE!");
                this.CadastrarJogador(j);
                
            }
          
    } 
        
           
      
        
        
    public void EscolherPersonagem(Personagem [] p, Jogador [] j){
        
        System.out.print("\n"+ this.getNome()+" escolha um dos personagens:  ");
         int selec = input.nextInt();
         j[0].setVida(100);
         j[1].setVida(100);
         switch (selec){
             
            case 1: // Personagem
               
              if (p[0].getStatus() == true){ 
                  p[0].setStatus(false);
                  Personagem = p[0].getNome();
                  this.setVida(100);
                  
              }else{
                   System.out.println("\nPERSONAGEM INVALIDO ");
                   this.EscolherPersonagem(p,j);
               }
                break;
                
            case 2: // Personagem 1
               if (p[1].getStatus() == true){ 
                  p[1].setStatus(false);
                    Personagem = p[1].getNome();
                  p[1].setVida(100);
                 
              }else{
                   System.out.println("\nPERSONAGEM INVALIDO ");
                   this.EscolherPersonagem(p,j);
               }
                break;
                
            case 3: // Personagem 2
               if (p[2].getStatus() == true){ 
                  p[2].setStatus(false);
                  Personagem = p[2].getNome();
                  p[2].setVida(100);
               
              }else{
                   System.out.println("\nPERSONAGEM INVALIDO ");
                   this.EscolherPersonagem(p,j);
               }
                break;
                
            case 4: // Personagem 3
                if (p[3].getStatus() == true){ 
                  p[3].setStatus(false);
                    Personagem = p[3].getNome();
                  p[3].setVida(100);
                 
              }else{
                   System.out.println("\nPERSONAGEM INVALIDO ");
                   this.EscolherPersonagem(p,j);
               }
                break;
                
            case 5: // Personagem 4
               if (p[4].getStatus() == true){ 
                  p[4].setStatus(false);
                  Personagem = p[4].getNome();
                  p[4].setVida(100);
                 
              }else{
                   System.out.println("\nPERSONAGEM INVALIDO ");
                   this.EscolherPersonagem(p,j);
               }
                break;
                
            default: //Opção Invalidade
                System.out.println("\nNúmero Invalido digite novamente\n");
                this.EscolherPersonagem(p,j);
                break;
                
        }
    }
    
   

    //Métodos Especiais
    
   

    public String getNome() {
        return nome;
    }

    public void setNome(String n) {
            this.nome = n;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String a) {
        this.apelido = a;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String e) {
        this.email = e;
    }

    public long getTelefone() {
        return telefone;
    }

    public void setTelefone(long t) {
        this.telefone = t;
    }

    public Scanner getInput() {
        return input;
    }

    public void setInput(Scanner i) {
        this.input = i;
    }

    public int getSorte() {
        return sorte;
    }

    public void setSorte(int sorte) {
        this.sorte = sorte;
    }

    public boolean getVez() {
        return vez;
    }

    public void setVez(boolean vez) {
        this.vez = vez;
    }

    public boolean getSdesistir() {
        return Sdesistir;
    }

    public void setSdesistir(boolean Sdesistir) {
        this.Sdesistir = Sdesistir;
    }

    public boolean getRdesistir() {
        return Rdesistir;
    }

    public void setRdesistir(boolean Rdesistir) {
        this.Rdesistir = Rdesistir;
    }

}
