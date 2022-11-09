/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package industria;

/**
 *
 * @author ioann
 */

    public class Industria2 {
    private double nomina;
    
    public Industria2 (){}

    public Industria2(double nomina) {
        this.nomina = nomina;
    }

    public double getNomina() {
        return nomina;
    }

    public void setNomina(double nomina) {
        this.nomina = nomina;
    }

    @Override
    public String toString() {
        return "su nomina por las empresas seria " + nomina;
    }
    
    
}

