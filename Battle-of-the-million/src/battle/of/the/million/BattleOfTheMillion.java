package battle.of.the.million;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Scanner;

public class BattleOfTheMillion {
    public static void main(String[] args) {
             
        //Personagens
        
        Personagem p[] = new Personagem [5];
        
        p[0] = new Personagem ("Fred Jones", "Líderança", 100, true);
        p[1] = new Personagem ("Velma Dinkley", "Inteligencia", 100, true);
        p[2] = new Personagem ("Scooby-Doo", "Companherismo", 100, true);
        p[3] = new Personagem ("Daphne Blake", "Charme", 100, true);
        p[4] = new Personagem ("Salshicha", "Veloz", 100, true);
        
      //Perguntas
       
       Pergunta q [] = new Pergunta [14];
       
       q[0] = new Pergunta ("Quando o programa é executado normalmente (não no modo de depuração), qual instrução é verdadeira sobre os pontos de interrupção?", 0,true);
       q[1] = new Pergunta ("Qual destas opções seria uma constraint lógica ao modelar o tempo para uma entidade City?", 1,true);
       q[2] = new Pergunta ("Qual das alternativas a seguir seria melhor representado por um arco ?", 2,true);
       q[3] = new Pergunta ("Qual destes pares de entidades tem maior probabilidade de ser modelado como um relacionamento M:M?", 3,true);
       q[4] = new Pergunta ("Em sql qual é o operador de diferente?", 4,true);
       q[5] = new Pergunta ("Quantos operadores de JOIN existem?", 5,true);
       q[6] = new Pergunta ("Para realiza a média aritmética dos valores de um campo devo usar?", 6,true);
       q[7] = new Pergunta ("Qual é a finalidade de adicionar comentários ao código?", 7,true);
       q[8] = new Pergunta ("Se a etapa dos requisitos do Modelo Espiral de desenvolvimento fosse esquecida, qual das seguintes situações poderia ocorrer?", 8,true);
       q[9] = new Pergunta ("Qual é a ordem correta das etapas no Modelo Espiral de Desenvolvimento?", 9,true);
       q[10] = new Pergunta ("Para que servem as classes em orientação a objetos?", 10, true);
       q[11] = new Pergunta ("Para que serve o encapsulamento na linguagem orientada a objeto?", 11, true);
       q[12] = new Pergunta ("Para que serve o polimorfismo na linguagem orientada a objetos?", 12, true);
       q[13] = new Pergunta ("Pare que serve a diagramação em uma UML?", 13, true);
       
       //Alternativas
       
       Alternativas a [] = new Alternativas [55];
       
       a[0] = new Alternativas (false, "Qualquer ponto de interrupção parará a execução do programa. ",0);
       a[1] = new Alternativas (false, "Os pontos de interrupção pararão a execução do programa no último ponto de interrupção. ",0);
       a[2] = new Alternativas (true, "Os pontos de interrupção não afetarão a execução do programa.",0);
       a[3] = new Alternativas (false, "Os pontos de interrupção pararão a execução do programa no primeiro ponto de interrupção. ",0);
       a[4] = new Alternativas (false, "As pessoas nascem e morrem na cidade.",1);
       a[5] = new Alternativas (true, "Se vocÊ estiver criando um sistema para qualquer cidade da França, precisará de autorização de segurança.",1);
       a[6] = new Alternativas (false, "O nome das cidades e/ou sua associação a países podem mudar junto com as dronteiras dos países.",1);
       a[7] = new Alternativas (false, "Os padrões de tráfego diário devem ser monitorados para determinar quantos agentes responsáveis pela aplicação da lei serão necessários.",1);
       a[8] = new Alternativas (false, "TEACHER (Female,Bob)",2);
       a[9] = new Alternativas (true, "DELIVERY ADDRESS (Home, Office)",2);
       a[10] = new Alternativas (false, "PARENT (Girl,Bob)",2);
       a[11] = new Alternativas (false, "STUDENT(Grade A student, Average Student)",2);
       a[12] = new Alternativas (false, "PERSON e FINGERPRINT",3);
       a[13] = new Alternativas (false, "CAR e WHEEL",3);
       a[14] = new Alternativas (false, "TREE e BRANCH",3);
       a[15] = new Alternativas (true, "TEACHER e SUBJECT AREA",3);
       a[16] = new Alternativas (false, "!=",4);
       a[17] = new Alternativas (true, "<>",4);
       a[18] = new Alternativas (false, "=!",4);
       a[19] = new Alternativas (false, "><",4);
       a[20] = new Alternativas (false, "3",5);
       a[21] = new Alternativas (false, "4",5);
       a[22] = new Alternativas (true, "5",5);
       a[23] = new Alternativas (false, "6",5);
       a[24] = new Alternativas (false, "ART",6);
       a[25] = new Alternativas (false, "SUM",6);
       a[26] = new Alternativas (false, "COUNT",6);
       a[27] = new Alternativas (true, "AVG",6);
       a[28] = new Alternativas (false, "Fornecer uma boa aparência do código.",7);
       a[29] = new Alternativas (false, "Aumentar o tempo de execução do código.",7);
       a[30] = new Alternativas (true, "Fornecer uma explicação sobre o código ao programador.",7);
       a[31] = new Alternativas (false, " Fornecer uma melhor segurança ao programa.",7);
       a[32] = new Alternativas (false, "O programa fornece resultados imprecisos.",8);
       a[33] = new Alternativas (true, "Recursos obrigatórios do software estão faltando no programa.",8);
       a[34] = new Alternativas (false, " O código fica desorganizado.",8);
       a[35] = new Alternativas (false, "As soluções parecem ser elusivas.",8);
       a[36] = new Alternativas (true, "Requisitos, Design, Desenvolvimento, Teste.",9);
       a[37] = new Alternativas (false, "Requisitos, Design, Teste, Desenvolvimento.",9);
       a[38] = new Alternativas (false, "Design, Requisitos, Desenvolvimento, Teste",9);
       a[39] = new Alternativas (true, "Servem para definir as características, atributos e funções que um objeto será capaz de realizar.",10);
       a[40] = new Alternativas (false, "Servem para organizar os atributos e funções que um programa será capaz de realizar",10);
       a[41] = new Alternativas (false, "Servem para padronizar os atributos e funções que um objeto para que esse execute as funções",10);
       a[42] = new Alternativas (false, "Servem para camuflar os atributos e funções de um objeto durante a realização do sistema.",10);
       a[43] = new Alternativas (false, "Serve para padronizar o processo interno para usuários.",11);
       a[44] = new Alternativas (true, "Serve para esconder Processos internos de um objeto de um ou mais usuários",11);
       a[45] = new Alternativas (false, "Serve para proteção dos códigos utilizados na programação",11);
       a[46] = new Alternativas (false, "Serve para sustentação da ideologia computacional.",11);
       a[47] = new Alternativas (true, "Serve para que um objeto herde as características de uma determinada classe já existente.",12);
       a[48] = new Alternativas (false, "Serve para que um objeto modifique todas as características de uma determinada classe já existente.",12);
       a[49] = new Alternativas (false, "Serve para que um objeto elimine todas as funções de uma determinada classe já existente.",12);
       a[50] = new Alternativas (false, "Serve para que um objeto reprograme as características, gerando um produto completamente novo.",12);
       a[51] = new Alternativas (false, "Serve para se ter uma visão específica da modelagem de um software orientado a objetos.",12);
       a[52] = new Alternativas (true, "Serve para se ter uma visão geral da modelagem de um software orientado a objetos.",12);
       a[53] = new Alternativas (false, "Serve para se ter um comando amplo da modelagem de um software orientado a objetos",12);
       a[54] = new Alternativas (false, "Serve para modelar um software orientado a objetos.",12);
       
       
       //Partida
       
       Partida s = new Partida("null","null","null",0,false);
       
        //Jogador
        
       Scanner input = new Scanner(System.in);
       
       Jogador j[] = new Jogador [50];
       
       j[0] = new Jogador ("null", "null", "null", 0, true);
       j[1] = new Jogador ("null", "null", "null", 0, true);
       
       
        // INICIO DO GAME
     
        // MENU INICIAL
     
        s.MenuInicial(j, s, q, a);
       
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
      
      try{
        Robot robot = new Robot();
        robot.setAutoDelay(10);
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_L);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_L);
    } catch (AWTException ex) { }
    
     //Sistema de decisão 
    
       s.random(j);
       
     //Apresentação da Questão
     
      s.Quiz(q, a, s, j,s, s, s, s);
      
      
    
     
      
   
    
    }}
