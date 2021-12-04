package battle.of.the.million;

import battle.of.the.million.Personagem;
import java.util.Scanner;
import javax.management.RuntimeErrorException;
import java.util.InputMismatchException;

public class Jogador extends Personagem{
    
    //Atributos
    
    private String nome, apelido, email;
    private long telefone;
    private Personagem perselec;
    private int sorte;
    private boolean vez;
    
      Scanner input = new Scanner(System.in);

      //Método Construtor
      
    public Jogador(String nome, String n, String h, float v, boolean s) {
        super(n, h, v, s);
        this.nome = nome;
    }

    //Métodos 
    
    public void teste(){
        
        int x,a,d;
        
    }
    public void EscolherResposta(Partida s, Jogador [] j){
        int x,i;
       
        if(j[0].getVez() == true){
            i=0;
        }else{
            i=1;
        }
        System.out.print("\n" + j[i].nome + " Escolha uma Alternativa: ");
        
        String r;
        r = input.next().toLowerCase();
        
        System.out.println("\nConfirmar alternativa?\n\n [1]Sim   [2]Não\n");
        System.out.print("Digite uma opção: ");
        x = input.nextInt();
        
        if(x == 1){
            
        }else if(x ==2){
            s.EscolherResposta(s,j);
        }else{
            System.out.println("Alternativa invalida, digite novamente!");
            s.EscolherResposta(s,j);
        }
     
        switch (r){
            
            case "a":
               if (s.getA() == true){
                   System.out.println("Parabéns você acertou!");
                   
               }else{
                   System.out.println("Você errou!");
                   j[i].vez = false;
                   
                   if(i == 0){
                       i=1;
                        j[i].vez = true;
                       
                   }else{
                       i=0;
                       j[i].vez =true;
                   }
               }
                break;
                
            case "b":
                if (s.getA() == true){
                   System.out.println("Parabéns você acertou!");
               }else{
                   System.out.println("Você errou!");
                   j[i].vez = false;
                   
                   if(i == 0){
                       i=1;
                        j[i].vez = true;
                       
                   }else{
                       i=0;
                       j[i].vez =true;
                   }
               }
                break;
                
            case "c":
                if (s.getC() == true){
                   System.out.println("Parabéns você acertou!");
               }else{
                   System.out.println("Você errou!");
                   j[i].vez = false;
                   
                   if(i == 0){
                       i=1;
                        j[i].vez = true;
                       
                   }else{
                       i=0;
                       j[i].vez =true;
                   }
               }
                break;
                
            case "d":
                if (s.getD() == true){
                   System.out.println("Parabéns você acertou!");
               }else{
                   System.out.println("Você errou!");
                   j[i].vez = false;
                   
                   if(i == 0){
                       i=1;
                        j[i].vez = true;
                       
                   }else{
                       i=0;
                       j[i].vez =true;
                   }
               }
                break;
                
            default:
                System.out.println("Alternativa invalida, digite novamente!");
                s.EscolherResposta(s,j);
                break;
                
        }
        
    }
      
    public void CadastrarJogador() {
       
        try{
            input = new Scanner(System.in);
        System.out.print("Nome: ");
        this.setNome(input.nextLine());
        
        input = new Scanner(System.in);
        System.out.print("Apelido: ");
        this.setApelido(input.nextLine());
        
        input = new Scanner(System.in);
        System.out.print("Número de Telefone: ");
        long g = input.nextLong();
        this.setTelefone(g);
        
        input = new Scanner(System.in);
        System.out.print("E-mail: ");
        this.setEmail(input.nextLine());
        
        System.out.println("\n\n------ JOGADOR CADASTRADO COM SUCESSO! ------");
    }
        catch(InputMismatchException k){
            System.out.println("DADOS INVALIDO, VERIFIQUE S DADOS E TENTE NOVAMENTE!");
            this.CadastrarJogador();
    }
        
        }
        
    public void EscolherPersonagem(Personagem [] p){
        
        System.out.print("\n"+ this.getApelido() +" Escolha um dos personagens: ");
         int selec = input.nextInt();
         switch (selec){
             
            case 1: // Personagem
               
              if (p[0].getStatus() == true){ 
                  p[0].setStatus(false);
              }else{
                   System.out.println("\nPERSONAGEM INVALIDO ");
                   this.EscolherPersonagem(p);
               }
                break;
                
            case 2: // Personagem 1
               if (p[1].getStatus() == true){ 
                  p[1].setStatus(false);
              }else{
                   System.out.println("\nPERSONAGEM INVALIDO ");
                   this.EscolherPersonagem(p);
               }
                break;
                
            case 3: // Personagem 2
               if (p[2].getStatus() == true){ 
                  p[2].setStatus(false);
              }else{
                   System.out.println("\nPERSONAGEM INVALIDO ");
                   this.EscolherPersonagem(p);
               }
                break;
                
            case 4: // Personagem 3
                if (p[3].getStatus() == true){ 
                  p[3].setStatus(false);
              }else{
                   System.out.println("\nPERSONAGEM INVALIDO ");
                   this.EscolherPersonagem(p);
               }
                break;
                
            case 5: // Personagem 4
               if (p[4].getStatus() == true){ 
                  p[4].setStatus(false);
              }else{
                   System.out.println("\nPERSONAGEM INVALIDO ");
                   this.EscolherPersonagem(p);
               }
                break;
                
            default: //Opção Invalidade
                System.out.println("\nNúmero Invalido digite novamente\n");
                this.EscolherPersonagem(p);
                break;
                
        }
    }
    
    public Personagem getPerselec() {
        return perselec;
    }

    //Métodos Especiais
    
    public void setPerselec(Personagem p) {
        this.perselec = p;
    }

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
    
    
    
}
