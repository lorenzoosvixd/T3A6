
package industria;


 import java.util.Scanner;


public class Industria {
     
     
    public static void main(String[] args) {
     Industria2 o=new Industria2 ();
     Scanner obj=new Scanner (System.in);
     int empleados ;
     double nomina=0;
     float  salario;
     double base,base1;
     String  sucursal,nombre,apellidoPaterno,apellidoMaterno,curp,email,rfc;
     double salarioNeto;
     
        System.out.println("por favor escriba la sucursal que usted desea de acuerdo a las siguientes opciones"
        + "\n1.sucursalcdmx" + "\n2.sucursal ValeconVeracruz");
        sucursal=obj.next();
     System.out.println ("bienvenido , escribe la cantidad de sus trabajadores");
     empleados =obj.nextInt();
     int i;
     for (i=1;i<=empleados;i=i+1){
      empleado ();
         
         
     }
      
           
    }
      public static void empleado (){
        Industria1 h=new Industria1 ();
        Industria2 z=new Industria2 ();
          Scanner obj=new Scanner (System.in);
          
          float salario;
          double  bono;
          int años; 
          double base,base1,resultado,ISR,salarioNeto, nomina=0;
         //aqui se va a ingresar los datos del salario
          System.out.println("por favor escriba su nombre"); 
          String nombre=obj.next();
          h.setNombre(nombre);
          
          
          System.out.println("por favor escribe su apellido paterno");
          String apellidoPaterno=obj.next();
          h.setApellidoPaterno(apellidoPaterno);
          
          
          System.out.println("por favor escribe su apellido materno");
          String apellidoMaterno =obj.next();
          h.setApellidoMaterno(apellidoMaterno);
          
          
          System.out.println("por favor escriba su RFC");
          String RFC=obj.next();
          h.setRfc(RFC);
          
          
          System.out.println("por favor, escriba su curp del empleado");
          String curp=obj.next();
          h.setCurp(curp);
          
          
          System.out.println("por favor ,escriba el email del empleado");
          String email=obj.next();
          h.setEmail(email);
          
          
          System.out.println("por favor escriba su numero de telefono (solo numeros)");
          int telefono=obj.nextInt();
          h.setTelefono(telefono);
          
          
          System.out.println("por favor ,escriba el numero del contrato del empleado (solo numeros)");
          int contrato =obj.nextInt();
          h.setContrato(contrato);
          
          
          System.out.println("por favor de acuerdo a las sig.opciones " + "\n1. obrero " + "\n2.contador " 
          + "\n3.administrador " + "\ndetermine en cual seccion esta ");
          int tipoempleado=obj.nextInt();
          h.setTipoempleado(tipoempleado);
          
          
          if (tipoempleado<=3){
              
              if (tipoempleado==3){
                  
                  System.out.println("por favor escriba cuanto gana semanalmente su empleado");
                  salario=obj.nextFloat();
                  h.setSalario(salario);
                  
                  System.out.println("por favor escriba cuanto tiempo lleva en la industria (en años)");
                  años= obj.nextInt();
                  h.setAños(años);
                  
                   if (años==0 || años<=2){ 
                       if (salario ==0.01 || salario<=318){
                         base=salario - 0.1;
                         resultado=(base*1.92)/100;
                         ISR=resultado;
                         System.out.println("su ISR es " + ISR);
                         salarioNeto= salario - ISR;
                         h.setSalarioNeto(salarioNeto);
                         nomina = nomina + salarioNeto;
                         z.setNomina(nomina);
                          System.out.println(h.toString());
                           System.out.println(z.toString());
                                  
                       } 
                       else if (salario ==318.01 || salario<=2699.40){
                         base=salario - 318.01;
                         resultado=(base*6.40)/100;
                         resultado = resultado + 6.15;
                         ISR=resultado;
                         System.out.println("su ISR es " + ISR);
                         salarioNeto= salario - ISR;
                         h.setSalarioNeto(salarioNeto);
                         nomina = nomina + salarioNeto;
                         z.setNomina(nomina);
                         System.out.println(h.toString());
                       }
                       else if (salario ==2699.41 || salario<=4744.05){
                         base=salario - 2699.41;
                         resultado=(base*10.88)/100;
                         resultado = resultado + 158.55;
                         ISR=resultado;
                         System.out.println("su ISR es " + ISR);
                         salarioNeto= salario - ISR;
                         h.setSalarioNeto(salarioNeto);
                         nomina = nomina + salarioNeto;
                         z.setNomina(nomina);
                         System.out.println(h.toString());
                         System.out.println(z.toString());
                       }
                       else if (salario ==4744.06 || salario<=5514.75){
                         base=salario - 4744.06;
                         resultado=(base*16)/100;
                         resultado = resultado + 381;
                         ISR=resultado;
                         System.out.println("su ISR es " + ISR);
                         salarioNeto= salario - ISR;
                         h.setSalarioNeto(salarioNeto);
                         nomina = nomina + salarioNeto;
                         z.setNomina(nomina);
                         System.out.println(h.toString());
                         System.out.println(z.toString());
                       }
                       else if (salario ==5514.76 || salario<=6602.70){
                         base=salario - 5514.76;
                         resultado=(base*17.92)/100;
                         resultado = resultado + 504.30;
                         ISR=resultado;
                         System.out.println("su ISR es " + ISR);
                         salarioNeto= salario - ISR;
                         h.setSalarioNeto(salarioNeto);
                         nomina = nomina + salarioNeto;
                         z.setNomina(nomina);
                         System.out.println(h.toString());  
                         System.out.println(z.toString());
                       }
                       else if (salario ==6602.71 || salario<=13316.70){
                         base=salario - 6602.71;
                         resultado=(base*21.36)/100;
                         resultado = resultado + 699.30;
                         ISR=resultado;
                         System.out.println("su ISR es " + ISR);
                         salarioNeto= salario - ISR;
                         h.setSalarioNeto(salarioNeto);
                         nomina = nomina + salarioNeto;
                         z.setNomina(nomina);
                         System.out.println(h.toString());
                         System.out.println(z.toString());
                       }
                       else if (salario ==13316.71 || salario<=20988.70){
                         base=salario - 13316.71;
                         resultado=(base*23.52)/100;
                         resultado = resultado + 2133;
                         ISR=resultado;
                         System.out.println("su ISR es " + ISR);
                         salarioNeto= salario - ISR;
                         h.setSalarioNeto(salarioNeto);
                         nomina = nomina + salarioNeto;
                         z.setNomina(nomina);
                         System.out.println(h.toString());
                         System.out.println(z.toString());
                       }
                       else if (salario ==20988.71 || salario<=40071.30){
                         base=salario - 20988.71;
                         resultado=(base*30)/100;
                         resultado = resultado + 3937.80;
                         ISR=resultado;
                         System.out.println("su ISR es " + ISR);
                         salarioNeto= salario - ISR;
                         h.setSalarioNeto(salarioNeto);
                         nomina = nomina + salarioNeto;
                         z.setNomina(nomina);
                         System.out.println(h.toString());
                         System.out.println(z.toString());
                       } 
                      
                  }
                  else if (años==3 || años<=5){
                     bono=(salario *4)/100;
                     bono=bono +salario;
                        if (salario ==0.01 || salario<=318){
                         base=bono - 0.1;
                         resultado=(base*1.92)/100;
                         ISR=resultado;
                         System.out.println("su ISR es " + ISR);
                         salarioNeto= bono - ISR;
                         h.setSalarioNeto(salarioNeto);
                         nomina = nomina + salarioNeto;
                         z.setNomina(nomina);
                          System.out.println(h.toString());
                          System.out.println(z.toString());
                       } 
                      else if (salario ==318.01 || salario<=2699.40){
                         base=bono - 318.01;
                         resultado=(base*6.40)/100;
                         resultado = resultado + 6.15;
                         ISR=resultado;
                         System.out.println("su ISR es " + ISR);
                         salarioNeto= bono - ISR;
                         h.setSalarioNeto(salarioNeto);
                         nomina = nomina + salarioNeto;
                         z.setNomina(nomina);
                         System.out.println(h.toString());
                         System.out.println(z.toString());
                       }
                      else if (salario ==2699.41 || salario<=4744.05){
                         base=bono - 2699.41;
                         resultado=(base*10.88)/100;
                         resultado = resultado + 158.55;
                         ISR=resultado;
                         System.out.println("su ISR es " + ISR);
                         salarioNeto= bono - ISR;
                         h.setSalarioNeto(salarioNeto);
                         nomina = nomina + salarioNeto;
                         z.setNomina(nomina);
                         System.out.println(h.toString());
                         System.out.println(z.toString());
                       }
                      else if (salario ==4744.06 || salario<=5514.75){
                         base=bono - 4744.06;
                         resultado=(base*16)/100;
                         resultado = resultado + 381;
                         ISR=resultado;
                         System.out.println("su ISR es " + ISR);
                         salarioNeto= bono - ISR;
                         h.setSalarioNeto(salarioNeto);
                         nomina = nomina + salarioNeto;
                         z.setNomina(nomina);
                         System.out.println(h.toString());
                         System.out.println(z.toString());
                       }
                      else if (salario ==5514.76 || salario<=6602.70){
                         base=bono - 5514.76;
                         resultado=(base*17.92)/100;
                         resultado = resultado + 504.30;
                         ISR=resultado;
                         System.out.println("su ISR es " + ISR);
                         salarioNeto= bono - ISR;
                         h.setSalarioNeto(salarioNeto);
                         nomina = nomina + salarioNeto;
                         z.setNomina(nomina);
                         System.out.println(h.toString());   
                         System.out.println(z.toString());
                       }
                      else if (salario ==6602.71 || salario<=13316.70){
                         base=bono - 6602.71;
                         resultado=(base*21.36)/100;
                         resultado = resultado + 699.30;
                         ISR=resultado;
                         System.out.println("su ISR es " + ISR);
                         salarioNeto= bono - ISR;
                         h.setSalarioNeto(salarioNeto);
                         nomina = nomina + salarioNeto;
                         z.setNomina(nomina);
                         System.out.println(h.toString());
                         System.out.println(z.toString());
                       }
                      else if (salario ==13316.71 || salario<=20988.70){
                         base=bono - 13316.71;
                         resultado=(base*23.52)/100;
                         resultado = resultado + 2133;
                         ISR=resultado;
                         System.out.println("su ISR es " + ISR);
                         salarioNeto= bono - ISR;
                         h.setSalarioNeto(salarioNeto);
                         nomina = nomina + salarioNeto;
                         z.setNomina(nomina);
                         System.out.println(h.toString());
                         System.out.println(z.toString());
                       }
                      else if (salario ==20988.71 || salario<=40071.30){
                         base=bono - 20988.71;
                         resultado=(base*30)/100;
                         resultado = resultado + 3937.80;
                         ISR=resultado;
                         System.out.println("su ISR es " + ISR);
                         salarioNeto= bono - ISR;
                         h.setSalarioNeto(salarioNeto);
                         nomina = nomina + salarioNeto;
                         z.setNomina(nomina);
                         System.out.println(h.toString());
                         System.out.println(z.toString());
                       } 
                     
                  }
                  else if (años==6 ||años<=10){
                      bono=(salario *12 )/100;
                      bono=bono + salario;
                    if (salario ==0.01 || salario<=318){
                         base=bono - 0.1;
                         resultado=(base*1.92)/100;
                         ISR=resultado;
                         System.out.println("su ISR es " + ISR);
                         salarioNeto= bono - ISR;
                         h.setSalarioNeto(salarioNeto);
                         nomina = nomina + salarioNeto;
                         z.setNomina(nomina);
                          System.out.println(h.toString());
                         System.out.println(z.toString()); 
                       } 
                      else if (salario ==318.01 || salario<=2699.40){
                         base=bono - 318.01;
                         resultado=(base*6.40)/100;
                         resultado = resultado + 6.15;
                         ISR=resultado;
                         System.out.println("su ISR es " + ISR);
                         salarioNeto= bono - ISR;
                         h.setSalarioNeto(salarioNeto);
                         nomina = nomina + salarioNeto;
                         z.setNomina(nomina);
                         System.out.println(h.toString());
                       }
                      else if (salario ==2699.41 || salario<=4744.05){
                         base=bono - 2699.41;
                         resultado=(base*10.88)/100;
                         resultado = resultado + 158.55;
                         ISR=resultado;
                         System.out.println("su ISR es " + ISR);
                         salarioNeto= bono - ISR;
                         h.setSalarioNeto(salarioNeto);
                         nomina = nomina + salarioNeto;
                         z.setNomina(nomina);
                         System.out.println(h.toString());
                         System.out.println(z.toString());
                       }
                      else if (salario ==4744.06 || salario<=5514.75){
                         base=bono - 4744.06;
                         resultado=(base*16)/100;
                         resultado = resultado + 381;
                         ISR=resultado;
                         System.out.println("su ISR es " + ISR);
                         salarioNeto= bono - ISR;
                         h.setSalarioNeto(salarioNeto);
                         nomina = nomina + salarioNeto;
                         h.setNomina(nomina);
                         System.out.println(h.toString());
                         System.out.println(z.toString());
                       }
                      else if (salario ==5514.76 || salario<=6602.70){
                         base=bono - 5514.76;
                         resultado=(base*17.92)/100;
                         resultado = resultado + 504.30;
                         ISR=resultado;
                         System.out.println("su ISR es " + ISR);
                         salarioNeto= bono - ISR;
                         h.setSalarioNeto(salarioNeto);
                         nomina = nomina + salarioNeto;
                         z.setNomina(nomina);
                         System.out.println(h.toString()); 
                         System.out.println(z.toString());
                       }
                      else if (salario ==6602.71 || salario<=13316.70){
                         base=bono - 6602.71;
                         resultado=(base*21.36)/100;
                         resultado = resultado + 699.30;
                         ISR=resultado;
                         System.out.println("su ISR es " + ISR);
                         salarioNeto= bono - ISR;
                         h.setSalarioNeto(salarioNeto);
                         nomina = nomina + salarioNeto;
                         z.setNomina(nomina);
                         System.out.println(h.toString()); 
                         System.out.println(z.toString());
                       }
                      else if (salario ==13316.71 || salario<=20988.70){
                         base=bono - 13316.71;
                         resultado=(base*23.52)/100;
                         resultado = resultado + 2133;
                         ISR=resultado;
                         System.out.println("su ISR es " + ISR);
                         salarioNeto= bono - ISR;
                         h.setSalarioNeto(salarioNeto);
                         nomina = nomina + salarioNeto;
                         z.setNomina(nomina);
                         System.out.println(h.toString());
                         System.out.println(z.toString());
                       }
                      else if (salario ==20988.71 || salario<=40071.30){
                         base=bono - 20988.71;
                         resultado=(base*30)/100;
                         resultado = resultado + 3937.80;
                         ISR=resultado;
                         System.out.println("su ISR es " + ISR);
                         salarioNeto= bono - ISR;
                         h.setSalarioNeto(salarioNeto);
                         nomina = nomina + salarioNeto;
                         z.setNomina(nomina);
                         System.out.println(h.toString());
                         System.out.println(z.toString());
                       } 
                  } 
              }
              
              else { 
                  
                   System.out.println("por favor escriba cuanto gana semanalmente su empleado");
                   salario=obj.nextFloat();
                   
                   System.out.println("por favor escriba cuanto tiempo lleva en la industria (en años)");
                   años= obj.nextInt();
                   
                   
                   if (años==0 || años<=2){ 
                          if (salario ==0.01 || salario<=318){
                         base=salario - 0.1;
                         resultado=(base*1.92)/100;
                         ISR=resultado;
                         System.out.println("su ISR es " + ISR);
                         salarioNeto= salario - ISR;
                         h.setSalarioNeto(salarioNeto);
                         nomina = nomina + salarioNeto;
                         z.setNomina(nomina);
                         System.out.println(h.toString());
                         System.out.println(z.toString());
                          
                       } 
                      else if (salario ==318.01 || salario<=2699.40){
                         base=salario - 318.01;
                         resultado=(base*6.40)/100;
                         resultado = resultado + 6.15;
                         ISR=resultado;
                         System.out.println("su ISR es " + ISR);
                         salarioNeto= salario - ISR;
                         h.setSalarioNeto(salarioNeto);
                         nomina = nomina + salarioNeto;
                         z.setNomina(nomina);
                         System.out.println(h.toString());
                         System.out.println(z.toString());
                       }
                      else if (salario ==2699.41 || salario<=4744.05){
                         base=salario - 2699.41;
                         resultado=(base*10.88)/100;
                         resultado = resultado + 158.55;
                         ISR=resultado;
                         System.out.println("su ISR es " + ISR);
                         salarioNeto= salario - ISR;
                         h.setSalarioNeto(salarioNeto);
                         nomina = nomina + salarioNeto;
                         z.setNomina(nomina);
                         System.out.println(h.toString());
                         System.out.println(z.toString());
                       }
                     else  if (salario ==4744.06 || salario<=5514.75){
                         base=salario - 4744.06;
                         resultado=(base*16)/100;
                         resultado = resultado + 381;
                         ISR=resultado;
                         System.out.println("su ISR es " + ISR);
                         salarioNeto= salario - ISR;
                         h.setSalarioNeto(salarioNeto);
                         nomina = nomina + salarioNeto;
                         z.setNomina(nomina);
                         System.out.println(h.toString());
                         System.out.println(z.toString());
                       }
                      else if (salario ==5514.76 || salario<=6602.70){
                         base=salario - 5514.76;
                         resultado=(base*17.92)/100;
                         resultado = resultado + 504.30;
                         ISR=resultado;
                         System.out.println("su ISR es " + ISR);
                         salarioNeto= salario - ISR;
                         h.setSalarioNeto(salarioNeto);
                         nomina = nomina + salarioNeto;
                         z.setNomina(nomina);
                         System.out.println(h.toString());
                         System.out.println(z.toString());
                       }
                      else if (salario ==6602.71 || salario<=13316.70){
                         base=salario - 6602.71;
                         resultado=(base*21.36)/100;
                         resultado = resultado + 699.30;
                         ISR=resultado;
                         System.out.println("su ISR es " + ISR);
                         salarioNeto= salario - ISR;
                         h.setSalarioNeto(salarioNeto);
                         nomina = nomina + salarioNeto;
                         z.setNomina(nomina);
                         System.out.println(h.toString());
                         System.out.println(z.toString());
                       }
                     else  if (salario ==13316.71 || salario<=20988.70){
                         base=salario - 13316.71;
                         resultado=(base*23.52)/100;
                         resultado = resultado + 2133;
                         ISR=resultado;
                         System.out.println("su ISR es " + ISR);
                         salarioNeto= salario - ISR;
                         h.setSalarioNeto(salarioNeto);
                         nomina = nomina + salarioNeto;
                         z.setNomina(nomina);
                         System.out.println(h.toString());
                         System.out.println(z.toString());
                       }
                     else  if (salario ==20988.71 || salario<=40071.30){
                         base=salario - 20988.71;
                         resultado=(base*30)/100;
                         resultado = resultado + 3937.80;
                         ISR=resultado;
                         System.out.println("su ISR es " + ISR);
                         salarioNeto= salario - ISR;
                         h.setSalarioNeto(salarioNeto);
                         nomina = nomina + salarioNeto;
                         z.setNomina(nomina);
                         System.out.println(h.toString());
                         System.out.println(z.toString());
                       } 
                      
                  }
                  else if (años==3 || años<=5){
                      bono=(salario *3)/100;
                      bono=bono +salario;
                      if (salario ==0.01 || salario<=318){
                         base=bono - 0.1;
                         resultado=(base*1.92)/100;
                         ISR=resultado;
                         System.out.println("su ISR es " + ISR);
                         salarioNeto= bono - ISR;
                         h.setSalarioNeto(salarioNeto);
                         nomina = nomina + salarioNeto;
                         z.setNomina(nomina);
                          System.out.println(h.toString());
                          System.out.println(z.toString());
                       } 
                     else  if (salario ==318.01 || salario<=2699.40){
                         base=bono - 318.01;
                         resultado=(base*6.40)/100;
                         resultado = resultado + 6.15;
                         ISR=resultado;
                         System.out.println("su ISR es " + ISR);
                         salarioNeto= bono - ISR;
                         h.setSalarioNeto(salarioNeto);
                         nomina = nomina + salarioNeto;
                         z.setNomina(nomina);
                         System.out.println(h.toString());
                         System.out.println(z.toString());
                       }
                     else  if (salario ==2699.41 || salario<=4744.05){
                         base=bono - 2699.41;
                         resultado=(base*10.88)/100;
                         resultado = resultado + 158.55;
                         ISR=resultado;
                         System.out.println("su ISR es " + ISR);
                         salarioNeto= bono - ISR;
                         h.setSalarioNeto(salarioNeto);
                         nomina = nomina + salarioNeto;
                         z.setNomina(nomina);
                         System.out.println(h.toString());
                         System.out.println(z.toString());
                       }
                     else  if (salario ==4744.06 || salario<=5514.75){
                         base=bono - 4744.06;
                         resultado=(base*16)/100;
                         resultado = resultado + 381;
                         ISR=resultado;
                         System.out.println("su ISR es " + ISR);
                         salarioNeto= bono - ISR;
                         h.setSalarioNeto(salarioNeto);
                         nomina = nomina + salarioNeto;
                         z.setNomina(nomina);
                         System.out.println(h.toString());
                         System.out.println(z.toString());
                       }
                     else  if (salario ==5514.76 || salario<=6602.70){
                         base=bono - 5514.76;
                         resultado=(base*17.92)/100;
                         resultado = resultado + 504.30;
                         ISR=resultado;
                         System.out.println("su ISR es " + ISR);
                         salarioNeto= bono - ISR;
                         h.setSalarioNeto(salarioNeto);
                         nomina = nomina + salarioNeto;
                         z.setNomina(nomina);;
                         System.out.println(h.toString());  
                         System.out.println(z.toString());
                       }
                     else  if (salario ==6602.71 || salario<=13316.70){
                         base=bono - 6602.71;
                         resultado=(base*21.36)/100;
                         resultado = resultado + 699.30;
                         ISR=resultado;
                         System.out.println("su ISR es " + ISR);
                         salarioNeto= bono - ISR;
                         h.setSalarioNeto(salarioNeto);
                         nomina = nomina + salarioNeto;
                         z.setNomina(nomina);
                         System.out.println(h.toString()); 
                         System.out.println(z.toString());
                       }
                     else  if (salario ==13316.71 || salario<=20988.70){
                         base=bono - 13316.71;
                         resultado=(base*23.52)/100;
                         resultado = resultado + 2133;
                         ISR=resultado;
                         System.out.println("su ISR es " + ISR);
                         salarioNeto= bono - ISR;
                         h.setSalarioNeto(salarioNeto);
                         nomina = nomina + salarioNeto;
                         z.setNomina(nomina);
                         System.out.println(h.toString());
                         System.out.println(z.toString());
                       }
                     else  if (salario ==20988.71 || salario<=40071.30){
                         base=bono - 20988.71;
                         resultado=(base*30)/100;
                         resultado = resultado + 3937.80;
                         ISR=resultado;
                         System.out.println("su ISR es " + ISR);
                         salarioNeto= bono - ISR;
                         h.setSalarioNeto(salarioNeto);
                         nomina = nomina + salarioNeto;
                         z.setNomina(nomina);
                         System.out.println(h.toString());
                         System.out.println(z.toString());
                       } 
                      
                  }
                  else if (años==6 ||años<=10){
                      bono=(salario *8)/100;
                      bono=bono +salario;
                      if (salario ==0.01 || salario<=318){
                         base=bono - 0.1;
                         resultado=(base*1.92)/100;
                         ISR=resultado;
                         System.out.println("su ISR es " + ISR);
                         salarioNeto= bono - ISR;
                         h.setSalarioNeto(salarioNeto);
                         nomina = nomina + salarioNeto;
                         z.setNomina(nomina);
                          System.out.println(h.toString());
                          System.out.println(z.toString());
                       } 
                    else   if (salario ==318.01 || salario<=2699.40){
                         base=bono - 318.01;
                         resultado=(base*6.40)/100;
                         resultado = resultado + 6.15;
                         ISR=resultado;
                         System.out.println("su ISR es " + ISR);
                         salarioNeto= bono - ISR;
                         h.setSalarioNeto(salarioNeto);
                         nomina = nomina + salarioNeto;
                         z.setNomina(nomina);
                         System.out.println(h.toString());
                         System.out.println(z.toString());
                       }
                     else  if (salario ==2699.41 || salario<=4744.05){
                         base=bono - 2699.41;
                         resultado=(base*10.88)/100;
                         resultado = resultado + 158.55;
                         ISR=resultado;
                         System.out.println("su ISR es " + ISR);
                         salarioNeto= bono - ISR;
                         h.setSalarioNeto(salarioNeto);
                         nomina = nomina + salarioNeto;
                         z.setNomina(nomina);
                         System.out.println(h.toString());
                         System.out.println(z.toString());
                       }
                     else  if (salario ==4744.06 || salario<=5514.75){
                         base=bono - 4744.06;
                         resultado=(base*16)/100;
                         resultado = resultado + 381;
                         ISR=resultado;
                         System.out.println("su ISR es " + ISR);
                         salarioNeto= bono - ISR;
                         h.setSalarioNeto(salarioNeto);
                         nomina = nomina + salarioNeto;
                         z.setNomina(nomina);
                         System.out.println(h.toString());
                         System.out.println(z.toString());
                       }
                    else   if (salario ==5514.76 || salario<=6602.70){
                         base=bono - 5514.76;
                         resultado=(base*17.92)/100;
                         resultado = resultado + 504.30;
                         ISR=resultado;
                         System.out.println("su ISR es " + ISR);
                         salarioNeto= bono - ISR;
                         h.setSalarioNeto(salarioNeto);
                         nomina = nomina + salarioNeto;
                         z.setNomina(nomina);
                         System.out.println(h.toString());   
                         System.out.println(z.toString());
                       }
                    else   if (salario ==6602.71 || salario<=13316.70){
                         base=bono - 6602.71;
                         resultado=(base*21.36)/100;
                         resultado = resultado + 699.30;
                         ISR=resultado;
                         System.out.println("su ISR es " + ISR);
                         salarioNeto= bono - ISR;
                         h.setSalarioNeto(salarioNeto);
                         nomina = nomina + salarioNeto;
                         z.setNomina(nomina);
                         System.out.println(h.toString()); 
                         System.out.println(z.toString());
                       }
                    else   if (salario ==13316.71 || salario<=20988.70){
                         base=bono - 13316.71;
                         resultado=(base*23.52)/100;
                         resultado = resultado + 2133;
                         ISR=resultado;
                         System.out.println("su ISR es " + ISR);
                         salarioNeto= bono - ISR;
                         h.setSalarioNeto(salarioNeto);
                         nomina = nomina + salarioNeto;
                         z.setNomina(nomina);
                         System.out.println(h.toString());
                         System.out.println(z.toString());
                       }
                    else   if (salario ==20988.71 || salario<=40071.30){
                         base=bono - 20988.71;
                         resultado=(base*30)/100;
                         resultado = resultado + 3937.80;
                         ISR=resultado;
                         System.out.println("su ISR es " + ISR);
                         salarioNeto= bono - ISR;
                         h.setSalarioNeto(salarioNeto);
                         nomina = nomina + salarioNeto;
                         z.setNomina(nomina);
                         System.out.println(h.toString());
                         System.out.println(z.toString());
                       } 
                  }
              }
          }
          
          else {
              // suceso cuando no coincide con los valores de tipo de empleado
              System.out.println("por favor determine el tipo de empleado correctamente");
          }
                  
          
          
          
         
     }
   }

    

