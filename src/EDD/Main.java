/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EDD;


public class Main {
    
    public static void main(String[] args) {
        
        Vaca Vaca=new Vaca(12546978,"13/12/2020",20,"LALA");
        Vaca Vaca2=new Vaca(12546979,"15/12/2020",20,"ALPURA");
        
        Cabra Cabra=new Cabra(12546977,"10/12/2020",20,"coronado");
        Cabra Cabra2=new Cabra(12546976,"9/12/2020",20,"cabrona");
        
        Vaca.RegistroLeche(25.2f, 4, 2022);
        Vaca2.RegistroLeche(20.2f, 5, 2022);
        
        
        
        Cabra.registroLecheCabra(20.5f, 12, 2022);
        Cabra.registroLecheCabra(15.3f, 8, 2022);
        
        Vaca.mostrarDatos();
        Vaca2.mostrarDatos();
        
        Cabra.mostrarDatosCabra();
        Cabra2.mostrarDatosCabra();
        
        
        
        
    }
    
}
