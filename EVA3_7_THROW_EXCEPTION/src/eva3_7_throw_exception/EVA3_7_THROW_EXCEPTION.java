/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva3_7_throw_exception;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author invitado
 */
public class EVA3_7_THROW_EXCEPTION {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
//        generar excepciones
        //detiene la ejecucion del programa
//        palabra throw
        
//        checked
//        unchecked
        
        Prueba obj=new Prueba();
        try {
            //checked exception, obligatorio resolverla
            Scanner input=new Scanner(System.in);
            int valor=input.nextInt();
            obj.capturaMayorCero(valor);
            
            
        } catch (Exception ex) {
            //exception superclase de las excepciones, captura todas
            System.out.println(ex.getMessage());
        }
        
        //arithmetic exception es unchecked, no obligatorio capturar
        obj.division(100, 0);
        
    }
    
}


class Prueba{
    public void capturaMayorCero(int valor) throws Exception{
        if (valor <= 0) {//lanzar exception
            throw new Exception(valor+" es negativo o 0");

            
        }
                    System.out.println("Valor: "+valor);
        
    }
    
    //no marca error porque es unchecked
    //se lanza para que se capture despues
    public int division(int x,int y) throws ArithmeticException{
        if(y==0){
            throw new ArithmeticException("valor divisor no debe ser 0");
        }
        return x/y;
    }
}