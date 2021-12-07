package battle.of.the.million;

import java.util.Random;
import java.util.Scanner;

public class Partida extends Jogador{

    //Atributos
    
  private boolean A,B,C,D;
  private int l, nq;

    //Instacias  
    Scanner input = new Scanner(System.in);
  
    //Métodos Construtor
    
   public Partida(String nome, String n, String h, int v, boolean s) {
        super(nome, n, h, v, s);
    }

    //Métodos
   
    public void random(Jogador [] j){
       Random aleatorio = new Random();
            j[0].setSorte(aleatorio.nextInt(100));
            j[1].setSorte(aleatorio.nextInt(100));
            
            if(j[0].getSorte()== j[1].getSorte()){
                random(j);
            }else if (j[0].getSorte()> j[1].getSorte()){
                
                System.out.println("\nO JOGADOR  " + j[0].getNome() + " INICIA A PRIMEIRA RODADA");
                    j[0].setVez(true);
                    j[1].setVez(false);
            }else{
                System.out.println("\nO JOGADOR " + j[1].getNome() + " INICIA A PRIMEIRA RODADA");
                    j[1].setVez(true);
                    j[0].setVez(false);
            }
            
    }
    
    public void finalizar (Jogador [] j,Partida s){
        
        System.out.println("\n====== PONTUAÇÃO FINAL! ======");
         System.out.print("\n" + j[0].getPersonagem());
           
           for(float y = 0; y <= j[0].getVida(); y+=10){
               System.out.print("[]");
           }
           System.out.print(" " + j[0].getVida() + " %\n");
           
            System.out.print("\n" + j[1].getPersonagem());
           
           for(float y = 0; y <= j[1].getVida(); y+=10){
               System.out.print("[]");
           }
           System.out.print(" " + j[1].getVida() + " %\n");
        
     if(j[0].getVida() > j[1].getVida()){
         System.out.println("\n====== O JOGADOR " + j[0].getNome() + " VENCEU O JOGO! ======");
     }else if(j[0].getVida() < j[1].getVida()){
     System.out.println("\n====== O JOGADOR " + j[1].getNome() + " VENCEU O JOGO! ======");
     }else{
         System.out.println("\n====== O JOGO EMPATOU! ======\n");
     }
        System.out.println("\n       ====== FIMA DO GAME ======\n");
        System.out.print("Digite 1 para retornar ao menu inicial: ");
        
        int k;
        k=input.nextInt();
        
        if(k==1){
           s.MenuInicial();
        }else{
            System.out.println("Digite uma opção válida!");
            s.finalizar(j,s);
        }
         
    }
    
    public void Quiz(Pergunta [] p, Alternativas [] a, Partida s, Jogador [] j,Partida A, Partida B, Partida C, Partida D){
       
        int x;
        
        
        Random  i = new Random();
        l++;
        
            x = i.nextInt(9);
           char letter='@';
           
           if(p[x].getPergstatus() == false){
               if(l > 30){
               s.finalizar(j,s);
               }else{
           s.Quiz(p, a, s, j,A,B,C,D);}
            }else{nq++;
               System.out.println("\n============ QUESTÃO " + nq + " ============");
           System.out.println("\n[" + nq + "] " + p[x].getEnunciado() + "\n");
           p[x].setPergstatus(false);}
          
           for(int y=0; y < 40; y++){
              
               if(a[y].getId() == x ){
                   
                    letter++;
                
                       String Stringletter = Character.toString(letter);

                   System.out.print("[" + Stringletter + "] ");
               System.out.println(a[y].getEnunciado());
                 
               if(Stringletter.equalsIgnoreCase("A")){ 
                   this.setA(a[y].getStatus());
               }else if(Stringletter.equalsIgnoreCase("B")){
                   this.setB(a[y].getStatus());
               }else if(Stringletter.equalsIgnoreCase("C")){
                   this.setC(a[y].getStatus());
               }else {
                   this.setD(a[y].getStatus());
               }
}
           }
           System.out.println("\n[0]Solicitar desistencia");
           s.EscolherResposta(s, j, j, p, a,A,B,C,D);
           

    }
    
    public void Desistir(Jogador[] j,Partida s,Pergunta [] p, Alternativas [] a){
    
       if(j[0].getSdesistir() == true){
       
           System.out.println("\nO JOGADOR " + j[0].getNome() + " SOLICITOU DESISTENCIA\n");
           System.out.println("Você deseja parar o jogo?\n\n[1]Sim    [2]Não \n");
           System.out.print("Digite uma opção: ");
                int x = input.nextInt();
                
                switch (x){
                
                    case 1:
                        j[1].setRdesistir(true);
                       System.out.println("\n====== O JOGO FOI FINALIZADO POR DESISTENCIA DE AMBOS JOGADORES! ======");
                       System.out.println("\n                       ====== FIMA DO GAME ======\n");
        System.out.print("Digite 1 para retornar ao menu inicial: ");
        
        int k;
        k=input.nextInt();
        
        if(k==1){
           s.MenuInicial();
        }else{
            System.out.println("Digite uma opção válida!");
            s.finalizar(j,s);
        }
                        break;
                        
                    case 2:
                        int vr;
                        j[1].setRdesistir(false);
                        vr = (int) (j[0].getVida() * 0.15);
                        j[1].setVida((int) (j[1].getVida() + vr));
                        j[0].setVida((int) (j[0].getVida() * 0.85));
                        s.Quiz(p, a, s, j,s, s, s, s);
                        break;
                }
                
           
       }else{
       
           System.out.println("\nO JOGADOR " + j[1].getNome() + " SOLICITOU DESISTENCIA\n");
           System.out.println("Você deseja parar o jogo?\n\n [1]Sim    [2]Não ");
                int x = input.nextInt();
                int vr;
                switch (x){
                
                    case 1:
                        j[0].setRdesistir(true);
                        System.out.println("\n====== O JOGO FOI FINALIZADO POR DESISTENCIA DE AMBOS JOGADORES! ======");
                        System.out.println("\n       ====== FIMA DO GAME ======\n");
        System.out.print("Digite 1 para retornar ao menu inicial: ");
        
        int k;
        k=input.nextInt();
        
        if(k==1){
           s.MenuInicial();
        }else{
            System.out.println("Digite uma opção válida!");
            s.finalizar(j,s);
        }
                        break;
                        
                    case 2:
                        j[0].setRdesistir(false);
                        vr = (int) (j[1].getVida() * 0.15);
                        j[0].setVida((int) (j[0].getVida() + vr));
                        j[1].setVida((int) (j[1].getVida() * 0.85));
                        s.Quiz(p, a, s, j,s, s, s, s);
                        break;
                }
       }
    
    }
    
    
    public void MenuInicial(){
        
        System.out.println("\n------ BATTLE OF THE MILLION ------\n");
        System.out.println("[1] Iniciar Jogo");
        System.out.println("[2] Informações dos desenvolvedores");
        System.out.println("[3] Explicação do Jogo");
        System.out.println("[4] Sair \n");
        System.out.print("Escolha uma opção: ");
        
            int opc = input.nextInt();
        
        switch (opc){
            case 1: // Inicializar o Jogo
                break;
            case 2: // Informações dos desenvolvedores
                System.out.println("\n------ BATTLE OF THE MILLION 2021 DESENVOLVEDORES ------\n");
                System.out.println("Allan Patrick de Souza Araújo      RA: 32113062\n" +
"Breno Rocha Dias                   RA: 321216260\n" +"Gustavo Henrique Santos Faria Rolo RA:32111822\n" +
"Mark Anthony Da Silva Junior       RA: 321220148\n" +"Paulo Vinícius Oliveira de Almeida RA:321123422\n");
                 System.out.print("Digite 1 para retornar ao menu: ");
                  
               for (int i = input.nextInt(); i !=1;){
                   System.out.println("\nNúmero Invalido digite novamente\n");
                   System.out.print("Digite 1 para retornar ao menu: ");
                  i = input.nextInt();
               }
               MenuInicial();
              
                break;
            case 3: // Explicação do Jogo
                System.out.println("\n------ REGRAS BATTLE OF THE MILLION ------\n");
                System.out.println("1- O jogo inicia quando ha dois jogadores.\n" +
"2- Quando o jogo iniciar os Jogadores devem escolher um personagem.\n" +
"3- Após isso tera um sorteio para decidir quem ira começar o jogo. \n" +
"4- O jogador vai receber uma pergunta com 4 alternativas e  deve escolher apenas 1.\n" +
"5- Caso o jogador acerte, ele recebera outra questão.\n" +
"6- Caso o jogador erre ele perde 5% da vida e passa a vez para o proximo player.\n" +
"7- O jogo terminar quando um dos jogadores tem o tempo de vida igual a 0.\n" +
"8- Caso as questões acabam e ambos os jogadores estiverem com um tempo de vida diferente de 0, o jogador que tiver o maior tempo de vida vai ser o vencedor.\n" +
"");
                 System.out.print("Digite 1 para retornar ao menu: ");
                  
               for (int i = input.nextInt(); i !=1;){
                   System.out.println("\nNúmero Invalido digite novamente\n");
                   System.out.print("Digite 1 para retornar ao menu: ");
                  i = input.nextInt();
               }
               MenuInicial();
              
                break;
            case 4: // Sair
                System.out.println("\nVOCÊ DESEJA SAIR DO PROGRAMA ? \n\n [1] Sim   [2] Não");
                System.out.print("\nEscolha uma opção: ");
                int x = input.nextInt();
                        if(x == 1){
                             System.exit(0);
                        }else if (x == 2){
                            MenuInicial();
                        }else{
                            System.out.println("\n NÚMERO INVALIDO DIGITE NOVAMENTE");
                           //
                      
                            if(x != 1 && x !=2){
                                System.out.print("\nEscolha uma opção: ");
                                x = input.nextInt();
                                        if(x == 1){
                             System.exit(0);
                        }else if (x == 2){
                            MenuInicial();
                        }
                            }
                        }
               
                break;
            default: //Opção Invalidade
                System.out.println("\nNúmero Invalido digite novamente\n");
                
                MenuInicial();
                break;
                
        }
       
        }
        
    
    
    
    //Métodos Especiais

    public boolean getA() {
        return A;
    }

    public void setA(boolean A) {
        this.A = A;
    }

    public boolean getB() {
        return B;
    }

    public void setB(boolean B) {
        this.B = B;
    }

    public boolean getC() {
        return C;
    }

    public void setC(boolean C) {
        this.C = C;
    }

    public boolean getD() {
        return D;
    }

    public void setD(boolean D) {
        this.D = D;
    }

    
}
    
