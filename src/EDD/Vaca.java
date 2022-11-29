/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EDD;
        

/**
 *
 * @author Erick
 */
public class Vaca {
    protected long codigoDeRegistro;
    protected String fechaAdquisicion;
    protected int edad;
    protected String raza;
    protected float litrosTotal;

    public Vaca(long codigoDeRegistro, String fechaAdquisicion, int edad, String raza) {
        this.codigoDeRegistro = codigoDeRegistro;
        this.fechaAdquisicion = fechaAdquisicion;
        this.edad = edad;
        this.raza = raza;
    }
    
    public float RegistroLeche(float litros,int semana,int año){
         litrosTotal=(litros *4)*12;
        return litrosTotal;
        
    }
    public void mostrarDatos(){
        
        System.out.print("Codigo de Registro: "+codigoDeRegistro+" Adquisicion: "+fechaAdquisicion+" Edad: "+edad+" Raza: "+raza+" Litros al año: "+litrosTotal);
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
        return "Vaca{" + "codigoDeRegistro=" + codigoDeRegistro + ", fechaAdquisicion=" + fechaAdquisicion + ", edad=" + edad + ", raza=" + raza + ", litrosTotal=" + litrosTotal + '}';
    }
    
    
    
}
