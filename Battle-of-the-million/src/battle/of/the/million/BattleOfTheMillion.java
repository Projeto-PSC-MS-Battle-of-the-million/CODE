package battle.of.the.million;

import java.util.Scanner;

public class BattleOfTheMillion {
    public static void main(String[] args) {
             
        
                                                            //Instancias
        
        //Personagens
        
        Personagem p[] = new Personagem [5];
        
        p[0] = new Personagem ("Gustavo", "Paciencia", 100, true);
        p[1] = new Personagem ("Breno", "------", 100, true);
        p[2] = new Personagem ("Mark", "--------", 100, true);
        p[3] = new Personagem ("Paulo", "-------", 100, true);
        p[4] = new Personagem ("Allan", "-------", 100, true);
        
       //Perguntas
       
       Pergunta q [] = new Pergunta [10];
       
       q[0] = new Pergunta ("Pergunta", 0,true);
       q[1] = new Pergunta ("Pergunta", 1,true);
       q[2] = new Pergunta ("Pergunta", 2,true);
       q[3] = new Pergunta ("Pergunta", 3,true);
       q[4] = new Pergunta ("Pergunta", 4,true);
       q[5] = new Pergunta ("Pergunta", 5,true);
       q[6] = new Pergunta ("Pergunta", 6,true);
       q[7] = new Pergunta ("Pergunta", 7,true);
       q[8] = new Pergunta ("Pergunta", 8,true);
       q[9] = new Pergunta ("Pergunta", 9,true);
       
       //Alternativas
       
       Alternativas a [] = new Alternativas [40];
       
       a[0] = new Alternativas (true, "Alternativa",0);
       a[1] = new Alternativas (true, "Alternativa",0);
       a[2] = new Alternativas (true, "Alternativa",0);
       a[3] = new Alternativas (true, "Alternativa",0);
       a[4] = new Alternativas (false, "Alternativa",1);
       a[5] = new Alternativas (false, "Alternativa",1);
       a[6] = new Alternativas (false, "Alternativa",1);
       a[7] = new Alternativas (false, "Alternativa",1);
       a[8] = new Alternativas (false, "Alternativa",2);
       a[9] = new Alternativas (false, "Alternativa",2);
       a[10] = new Alternativas (false, "Alternativa",2);
       a[11] = new Alternativas (false, "Alternativa",2);
       a[12] = new Alternativas (false, "Alternativa",3);
       a[13] = new Alternativas (false, "Alternativa",3);
       a[14] = new Alternativas (false, "Alternativa",3);
       a[15] = new Alternativas (false, "Alternativa",3);
       a[16] = new Alternativas (false, "Alternativa",4);
       a[17] = new Alternativas (false, "Alternativa",4);
       a[18] = new Alternativas (false, "Alternativa",4);
       a[19] = new Alternativas (false, "Alternativa",4);
       a[20] = new Alternativas (false, "Alternativa",5);
       a[21] = new Alternativas (false, "Alternativa",5);
       a[22] = new Alternativas (false, "Alternativa",5);
       a[23] = new Alternativas (false, "Alternativa",5);
       a[24] = new Alternativas (false, "Alternativa",6);
       a[25] = new Alternativas (false, "Alternativa",6);
       a[26] = new Alternativas (false, "Alternativa",6);
       a[27] = new Alternativas (false, "Alternativa",6);
       a[28] = new Alternativas (false, "Alternativa",7);
       a[29] = new Alternativas (false, "Alternativa",7);
       a[30] = new Alternativas (false, "Alternativa",7);
       a[31] = new Alternativas (false, "Alternativa",7);
       a[32] = new Alternativas (false, "Alternativa",8);
       a[33] = new Alternativas (false, "Alternativa",8);
       a[34] = new Alternativas (false, "Alternativa",8);
       a[35] = new Alternativas (false, "Alternativa",8);
       a[36] = new Alternativas (false, "Alternativa",9);
       a[37] = new Alternativas (false, "Alternativa",9);
       a[38] = new Alternativas (false, "Alternativa",9);
       a[39] = new Alternativas (false, "Alternativa",9);
       
       //Menu Inicial
       
       MenuInicial m1 = new MenuInicial();
       
       //Partida
       
       Partida s = new Partida("null","null","null",0,false);
       
       
        //Jogador
        
       Scanner input = new Scanner(System.in);
       
       Jogador j[] = new Jogador [50];
       
       j[0] = new Jogador ("null", "null", "null", 0, true);
       j[1] = new Jogador ("null", "null", "null", 0, true);
       
       
        // INICIO DO GAME
     
        // MENU INICIAL
     
       m1.MenuInicial();
       
       //CADASTRO DE JOGADORES
      
         System.out.println("\n------ CADASTRO JOGADOR 1 ------\n");
       j[0].CadastrarJogador(j);
      
       System.out.println("\n------ CADASTRO JOGADOR 2 ------\n");
       j[1].CadastrarJogador(j);
       
       //Escolha de Personagens
       
      System.out.println("\n------ PLAYER 1 ESCOLHA UM PERSONAGEM------\n");
      
       for(int i =0; i < 5;i++){
           
        p[i].ApresentarPersonagens(i);                 
       }
       
        j[0].EscolherPersonagem(p,j);
      
      System.out.println("\n------ PLAYER 2 ESCOLHA UM PERSONAGEM------ \n");
      
       for(int i =0; i < 5;i++){
           
      p[i].ApresentarPersonagens(i);                 
       }
       
     j[1].EscolherPersonagem(p,j);
     
     //Sistema de decisão 
    
       s.random(j);
       
     //Apresentação da Questão
     
      s.Quiz(q, a, s, j);
      
     
     if(j[0].getVida() > j[1].getVida()){
         System.out.println("\n======O JOGADOR " + j[0].getNome() + " VENCEU O JOGO! ======");
     }else if(j[0].getVida() < j[1].getVida()){
     System.out.println("\n====== O JOGADOR " + j[1].getNome() + " VENCEU O JOGO! ======");
     }else{
         System.out.println("\n ====== O JOGO EMPATOU! ======");
     }
    
      
       
       
    }
    
}
