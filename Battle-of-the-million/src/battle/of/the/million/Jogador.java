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
    private int vez;
    
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
    public void EscolherResposta(){
        System.out.print("\nEscolha uma Alternativa: ");
        
        String r;
        r = input.next().toLowerCase();
     
        System.out.println(r);
        switch (r){
            
            case "a":
                
                break;
                
            case "b":
                
                break;
                
            case "c":
                
                break;
                
            case "d":
                
                break;
                
            default:
                
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

    public int getVez() {
        return vez;
    }

    public void setVez(int vez) {
        this.vez = vez;
    }

    public Scanner getInput() {
        return input;
    }

    public void setInput(Scanner i) {
        this.input = i;
    }
    
}
