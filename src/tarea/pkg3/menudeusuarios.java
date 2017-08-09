
package tarea.pkg3;

import java.util.Scanner;

/**
 *
 * @author Randy Loarca
 */
public class menudeusuarios {
    private Scanner us = new Scanner(System.in);
    private String[] usuarios = new String[5];
    private int num;
    private String usuario;
   
    public menudeusuarios(){
        menu();
    }
    
    public void menu(){
        System.out.println("           Menú de Usuarios          ");
        System.out.println("");
        System.out.println("1. Ingresar Usuario");
        System.out.println("2. Mostrar todos los Usuarios");
        System.out.println("3. Mostrar un Usuario Personalizado");
        System.out.println("4. Menú Principal");
        System.out.println("5. Salir");
        num = us.nextInt();
        switch(num){
            case 1:
                llenarvector();
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                menu();
                break;
            case 2:
                mostrarvector();
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                menu();
                break;
            case 3:
                buscarvector();
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                menu();
                break;
            case 4:
                menuprincipal principal = new menuprincipal();
                break;
            case 5:
            default:
                break;
            
        }
    }
    
    public void llenarvector(){
        for(int i=0; i<5; i++){
             System.out.println("Ingresar Usuario");
             usuarios[i] = us.next();
        }    
    }
    
    
    public void mostrarvector(){
        for(int i=0; i<5;i++){
            System.out.println(usuarios[i]);
        } 
    }
    
    public void buscarvector(){
        System.out.println("Ingrese Nombre de Usuario");
        usuario = us.next();
        for(int i=0; i<usuarios.length;i++){
            if(usuarios[i].equals(usuario)){
                System.out.println(usuarios[i]);
                break;
            }else{
                System.out.println("ERROR!! No Existe Ningun Usuario con esa Concidencia");
                break;
            }   
        }
    }
}
