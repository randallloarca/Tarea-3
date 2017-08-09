
package tarea.pkg3;

import java.util.Scanner;

/**
 *
 * @author Randy Loarca
 */

public class palabraspalindromas {
    Scanner sc = new Scanner(System.in); 
    private String palabra;
    private String[] palabras;
    private menuprincipal menup;
    
    public palabraspalindromas(){
       menup();
    }
    
    
    public void menup(){
        System.out.println("          Palabras Palindromas          ");
        System.out.println("            Ingresar Palabra            ");
        palabra = sc.nextLine();
        System.out.println(QuitarEspacios(palabra));
        menup= new menuprincipal();
    }
    
    
    public String QuitarEspacios(String palabras){
        String p;
        p = palabra.replace(" ","");
        p.toLowerCase();
        StringBuffer sb = new StringBuffer(p);
        sb = sb.reverse();
        if(p.equalsIgnoreCase(sb.toString())){
            System.out.println("SI es una Palabra Palindroma");
        }else{
            System.out.println("NO es una Palabra Palindroma");
        }
        return p;
    }
    
    
}
