
package industria;

import java.util.Scanner;
public class Industria1 {
         private String  sucursal;
         private String nombre;
         private String apellidoPaterno;
         private String apellidoMaterno;
         private String curp;
         private String email;
         private String rfc;
         private double base;
         private double base1;
         private double resultado;
         private double ISR;
          private double bono;
         private double salarioNeto;
         public double nomina;
         private float salario;
     
         private int años;
         private int telefono;
         private int contrato;
         private int tipoempleado;
         
public Industria1 (){}

    public Industria1(String sucursal, String nombre, String apellidoPaterno, String apellidoMaterno, String curp, String email, String rfc, double base, double base1, double resultado, double ISR, double salarioNeto,double nomina, float salario, double bono, int años,int telefono,int contrato, int tipoempleado) {
        this.sucursal = sucursal;
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.curp = curp;
        this.email = email;
        this.rfc = rfc;
        this.base = base;
        this.base1 = base1;
        this.resultado = resultado;
        this.ISR = ISR;
        this.salarioNeto = salarioNeto;
        this.nomina=nomina;
        this.salario = salario;
        this.bono = bono;
        this.años = años;
        this.telefono = telefono;
        this.contrato = contrato;
        this.tipoempleado = tipoempleado;
    }

    public int getAños() {
        return años;
    }

    public void setAños(int años) {
        this.años = años;
    }

    public String getSucursal() {
        return sucursal;
    }

    public void setSucursal(String sucursal) {
        this.sucursal = sucursal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getBase1() {
        return base1;
    }

    public void setBase1(double base1) {
        this.base1 = base1;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

    public double getISR() {
        return ISR;
    }

    public void setISR(double ISR) {
        this.ISR = ISR;
    }

    public double getSalarioNeto() {
        return salarioNeto;
    }

    public void setSalarioNeto(double salarioNeto) {
        this.salarioNeto = salarioNeto;
    }

    public double getNomina() {
        return nomina;
    }

    public void setNomina(double nomina) {
        this.nomina = nomina;
    }
    
    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public double getBono() {
        return bono;
    }

    public void setBono(double bono) {
        this.bono = bono;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getContrato() {
        return contrato;
    }

    public void setContrato(int contrato) {
        this.contrato = contrato;
    }

    public int getTipoempleado() {
        return tipoempleado;
    }

    public void setTipoempleado(int tipoempleado) {
        this.tipoempleado = tipoempleado;
    }
    
    
    
    

    @Override
    public String toString() {
       return "el nombre del empleado es " + nombre + " " + apellidoPaterno + " " + apellidoMaterno 
                + "\nel rfc del empleado es" + " " + rfc + "\nel rfc del empleado es " + " " +  rfc
                + "\nel curp del empleado es " + " " + curp + "\nel correo electronico del empleado es " 
                + " " + email + "\nel numero de telefono del empleado es " + " " + telefono + 
                "\nsu salario neto es " + " " +  salarioNeto  ;
              
    }


        
}
