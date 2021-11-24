package com.mycompany.trabalhofinal;

import java.util.ArrayList;
import javax.swing.JOptionPane;
public class App {
    public static void main(String[] args) throws Exception {
       //System.out.print("The battle of the million");
       
      /* JOptionPane.showMessageDialog(null,
                "O jogo irá começar",
                "Battle of the million",
                1);
                
       
                String[] acceptableValues = {"","(a)Sim", "(b)Não", "(c)talvez","(d)claro"};
                String input2 = (String)JOptionPane.showInputDialog(
                         null,
                        "Breno é gato?",
                        "Battle of the million? ",
                        3,
                        null,
                        acceptableValues,
                        acceptableValues[0]);
 */

Personagem p1 = new Personagem(1,"Celsin","Labia e Conversação");//Personagem 1
Personagem p2 = new Personagem(2,"Silvio do corre","alzheimer e falta de noção");
Personagem p3 = new Personagem(3,"Fauto magrelo","Glicose alta e peso pena");
Personagem p4 = new Personagem(4,"Paulo do hermes","Conta cheia e criador da alexa");
Personagem p5 = new Personagem(5,"Mark do if","certificado do git e milior do brazil");


System.out.print(p1);
System.out.print(p2);
System.out.print(p3);
System.out.print(p4);
System.out.print(p5);





    }
}
