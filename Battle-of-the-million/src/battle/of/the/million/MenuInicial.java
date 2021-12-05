package battle.of.the.million;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.InputMismatchException;
import java.util.Scanner;
public class MenuInicial {
    
    //Atributos
    private int Opc;
    
    Scanner input = new Scanner(System.in);
    
    //Métodos
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
    
    }

