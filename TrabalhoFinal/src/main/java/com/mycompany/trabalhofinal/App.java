package com.mycompany.trabalhofinal;
import javax.swing.JOptionPane;
public class App {
    public static void main(String[] args) throws Exception {
       //System.out.print("The battle of the million");
       
       JOptionPane.showMessageDialog(null,
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
 






    }
}
