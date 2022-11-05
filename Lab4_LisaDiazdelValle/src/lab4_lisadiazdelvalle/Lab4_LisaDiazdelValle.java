/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab4_lisadiazdelvalle;

import java.util.Scanner;
/**
 *
 * @author HTS
 */
public class Lab4_LisaDiazdelValle {

    /**
     * @param args the command line arguments
     */
    static Scanner leer = new Scanner (System.in);
    public static void main(String[] args) {
        // TODO code application logic here
        
        int opcion;
        do{
            
            System.out.println("--Menu--");
            System.out.println("1. Sumador binario");
            System.out.println("2. Contains");
            System.out.println("3. Alpha");
            System.out.println("4. Salir");
            System.out.println("Elija una opcion: ");
            opcion = leer.nextInt();
            
            switch (opcion){
                case 1: 
                    System.out.println("---Sumador Binario---");
                    System.out.println("Ingrese el primer numero: ");
                    String cadena1 = leer.next();
                    System.out.println("Ingrese el segundo numero: ");
                    String cadena2 = leer.next();
                    sumadorbinario(cadena1, cadena2);  
                    break;
                case 2:
                    System.out.println("---Contains---");
                    System.out.println("Ingrese la primera cadena: ");
                    String contenedor = leer.nextLine().toLowerCase();
                    contenedor = leer.nextLine().toLowerCase();
                    System.out.println("Ingrese la segunda cadena: ");
                    String contenida = leer.next().toLowerCase();
                contains (contenedor, contenida); 
                    break;
                case 3:
                    System.out.println("---Alpha---");
                    System.out.println("Ingrese una cadena: ");
                    String frase = leer.next().toLowerCase();
                    Alpha (frase); 
                    break;
                default:
                    break;
                    
            }//fin del switch
        }while (opcion != 4);
        
    }//fin del main
    //metodo 1
    public static void sumadorbinario (String cadena1, String cadena2){
        if (cadena1.length()== cadena2.length()){
            int contador = 0, contador2 = 0;
            for (int i= 0; i<cadena1.length(); i++){
                char caracter1 = cadena1.charAt(i);
                if (caracter1 == '0' || caracter1 == '1'){
                   contador ++;
                }   
            }
                if (contador2 == cadena1.length()){
                    for (int j = 0; j<cadena2.length(); j++){
                        char caracter2 = cadena2.charAt(j);                                     
                        if (caracter2 == '0' || caracter2 == '1'){
                        contador2++;
                        }
                    }
                }else{
                    System.out.println("La cadena solo puede contener 0's y 1's");
                }           
        }else{        
            System.out.println("Las cadenas deben de tener la misma longitud");
        }
       
        
    }//fin sumador binario
    //Metodo 2
    public static void contains (String contenedor, String contenida){
        if (contenedor.length()>= contenida.length()){
            int contador2 = 0;
            for(int i = 0; i < contenida.length(); i++){
                char caracter = contenida.charAt(i);       
                for (int j = 0; j<contenedor.length(); j++){
                    char caracter2 = contenedor.charAt(j);                
                    if(caracter == caracter2){ 
                        contador2++;                        
                    }
                }if (contador2 == contenedor.length()){
                    break;
                }  
            }
            if(contador2 == contenida.length()){
                System.out.println("La cadena "+contenedor+" contiene la cadena "+contenida);
            }else{
                System.out.println("La cadena "+contenedor+" no contiene la cadena " +contenida);
            }        
        }else{
            System.out.println("La contenida es de mayor longitud que el contenedor");
        }
}
    //Metodo 3
    public static void Alpha (String frase){
        int cont = 0;
        for(int i = 97; i <= 122; i++){
            for (int k=0; k<frase.length(); k++){
                char caracter = frase.charAt(k);
                if (i== caracter){
                    cont++;
                }
            }
        }
        if (cont == frase.length()){
            System.out.println("La cadena solo contiene letras");
        }else{
            System.out.println("La cadena contiene caracteres que no son letras:(");               
        }         
    }//fin alpha    
} 


    
    

