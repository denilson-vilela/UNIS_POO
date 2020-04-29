/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    Guitarra guitarra = new Guitarra("01020304","fender",  "telecaster","elétrica", "mogno", 1500.00);
        
        System.out.println("Numero de Serie: " + guitarra.getNumeroSerie());
        System.out.println("Fabricante: " + guitarra.getFabricante());
        System.out.println("Madeira: " + guitarra.getMadeira());
        System.out.println("Tipo: " + guitarra.getTipo());
        System.out.println("Modelo: " + guitarra.getModelo());
        System.out.println("Preço: " + guitarra.getPreco());
        
        
        
        
    }
    
}
