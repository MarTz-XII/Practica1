/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EDD;

/**
 *
 * @author Erick
 */
public class Cabra extends Vaca{

    public Cabra(long codigoDeRegistro, String fechaAdquisicion, int edad, String raza) {
        super(codigoDeRegistro, fechaAdquisicion, edad, raza);
    }
    
    
    
     public float registroLecheCabra(float litros,int mes,int año){
        litrosTotal=litros * mes;
        return litrosTotal;
    }
    
    public void mostrarDatosCabra(){
       System.out.print("Registro: "+codigoDeRegistro+" Fecha de Adquisicion: "+fechaAdquisicion+" Edad: "+edad+" Raza: "+raza);
    }

    public long getCodigoDeRegistro() {
        return codigoDeRegistro;
    }

    public void setCodigoDeRegistro(long codigoDeRegistro) {
        this.codigoDeRegistro = codigoDeRegistro;
    }

    public String getFechaAdquisicion() {
        return fechaAdquisicion;
    }

    public void setFechaAdquisicion(String fechaAdquisicion) {
        this.fechaAdquisicion = fechaAdquisicion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public float getLitrosTotal() {
        return litrosTotal;
    }

    public void setLitrosTotal(float litrosTotal) {
        this.litrosTotal = litrosTotal;
    }

    @Override
    public String toString() {
        return "Cabra{" + '}';
    }
    
    
    
}
