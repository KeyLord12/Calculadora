/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import javax.swing.JOptionPane;

/**
 *
 * @author KeylorCampos
 */
public class Calculadora {

    private static boolean flag = true;
    
    
    public static void main(String[] args) {
        ModuloSuma suma= new ModuloSuma();
        ModuloResta resta= new ModuloResta();
        ModuloMultiplicacion multiplicar= new ModuloMultiplicacion();
        ModuloDivision dividir= new ModuloDivision();
        
        while(flag==true){
            int j=0;
            int k=0;
            String i = JOptionPane.showInputDialog("Menu\n1-Suma\n2-Resta\n3-Multiplicar\n4-Dividir\n5-Salir");
            switch(i){
                case "1":
                    k=Integer.parseInt(JOptionPane.showInputDialog("Inserte el primero numero que desea sumar:"));
                    j=Integer.parseInt(JOptionPane.showInputDialog("Inserte el Segundo numero que desea sumar:"));
                    
                    JOptionPane.showMessageDialog(null, "Resultado: "+suma.Suma(k, j));
                   break;
                case "2":
                    k=Integer.parseInt(JOptionPane.showInputDialog("Inserte el primero numero que desea restar:"));
                    j=Integer.parseInt(JOptionPane.showInputDialog("Inserte el Segundo numero que desea restar:"));
                    
                    JOptionPane.showMessageDialog(null, "Resultado: "+resta.Resta(k, j));
                   break;
                
                   
                   
                   
                   
                   
                   
                   
                case "5":
                    flag=false;
                    
                    
                   break;
                default:
                    JOptionPane.showMessageDialog(null, "Seleccione un numero valido en las opciones");
                    
                    break;
            }
            
        }
        
        
    }
    
}
