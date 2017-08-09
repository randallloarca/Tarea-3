/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea.pkg3;

import java.util.Scanner;

/**
 *
 * @author Randy Loarca
 */
public class menuprincipal {
    
    
    public menuprincipal(){
        MenuPrincipal();
    }
    public void MenuPrincipal(){
        int numeros;
        Scanner sc = new Scanner(System.in);
        System.out.println("                       Tarea 3                        ");
        System.out.println("                      201314388                       ");
        System.out.println("1. Usuarios");
        System.out.println("2. Palabras Palindromas");
        System.out.println("3. Salir");
        
        numeros = sc.nextInt();
        switch(numeros){
            case 1:
                menudeusuarios menuusuario = new menudeusuarios();
            break;
            
            case 2:
                palabraspalindromas pp = new palabraspalindromas();
                
            break;
            
            case 3:   
            default:
            break;
              
        }
    }
}
