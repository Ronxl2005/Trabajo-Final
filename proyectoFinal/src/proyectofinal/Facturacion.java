/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectofinal;
import java.util.Scanner;
/**
 *
 * @author Alis
 */
public class Facturacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner sc = new Scanner (System.in);
double iva = 0.0;
int v = 0, c = 0;
int tpago = 0;
String c1 = "";
String c2 = "";
String c3 = "";
String c4 = "";
String c5 = "";
String pago = "";
 System.out.println("Cree su cuenta");
 System.out.println("Ingrese su usuario");
 String usuario = sc.nextLine();
 System.out.println("Ingrese su contraseña");
 String contraseña = sc.nextLine();

 String usuario1 = usuario;
 String contraseña1 = contraseña;
 
 System.out.println("Inicie sesion");
 System.out.println("Ingrese su usuario");
 usuario = sc.nextLine();
  System.out.println("Ingrese su contraseña");
 contraseña = sc.nextLine();
  while (!usuario.equals(usuario1) || !contraseña.equals(contraseña1)){
 System.out.println("Contraseña o Usuario erroneo");
 System.out.println("Ingrese su usuario");
 usuario = sc.nextLine();
 System.out.println("Ingrese su contraseña");
 contraseña = sc.nextLine();
  }
 System.out.println("Los cursos son los siguientes ");
  System.out.println(" ");
 System.out.println("Curso: Matemáticas                                               Curso: Biologia");
  System.out.println(" ");
 System.out.println("Profesor: Juan Pérez                                             Profesor: Ana Gomez");
  System.out.println(" ");
 System.out.println("Duración: 3 meses                                                Duración: 2 meses");
  System.out.println(" ");
 System.out.println("Precio: $100                                                     Precio: $100");
  System.out.println(" ");
 System.out.println("Descripción: Curso básico de álgebra y geometría                 Descripción: Introduccion a la biologia celular");
  System.out.println(" ");
  System.out.println(" ");
 System.out.println("Curso: Ingles                                 Curso: Portugues                                 Curso: frances");
  System.out.println(" ");
 System.out.println("Profesor: Mark Smith                          Profesor: Carla Silva                            Profesor: Marie Dupont");
  System.out.println(" ");
 System.out.println("Duración: 4 meses                             Duración: 3 meses                                Duración: 3 meses");
  System.out.println(" ");
 System.out.println("Precio: $120                                  Precio: $120                                     Precio: $120");
  System.out.println(" ");
 System.out.println("Descripción: Ingles basico a intermedio       Descripción: Portugues para principiantes        Descripción: Frances basico");
             System.out.println(" ");
            System.out.println(" ");

  System.out.println("Porfavor Ingrese la cantidad de cursos que desearia comprar");
    System.out.println(" ");
            System.out.println(" ");

  c = sc.nextInt();
   while(c != 1 && c != 2 && c != 3 && c != 4 && c != 5){
        System.out.println("Porfavor Ingrese una cantidad valida");
          System.out.println(" ");

        c = sc.nextInt();
   }
   System.out.println("Los cursos son los siguientes porfavor ingrese el curso que desea (uno a la vez)");
             System.out.println(" ");
  System.out.println("1- Matematicas ");
            System.out.println(" ");
  System.out.println("2- Biologia ");
            System.out.println(" ");
  System.out.println("3- Ingles ");
            System.out.println(" ");
  System.out.println("4- Portugues ");
            System.out.println(" ");
  System.out.println("5- Frances ");
            System.out.println(" ");
  if (c == 1){
   c1 = sc.nextLine();
   while(!"Matematicas".equals(c1) && !"Biologia".equals(c1) && !"Ingles".equals(c1) && !"Portugues".equals(c1) && !"Frances".equals(c1)){
      
       System.out.println("Porfavor Ingrese el curso bien");
          System.out.println(" ");

        c1 = sc.nextLine();
   } if ("Matematicas".equals(c1) || "Biologia".equals(c1) ){
       v = 100;
           iva = v + (v*0.15);
   }else {
       v = 120;
           iva = v + (v*0.15);
   }
  }else if (c == 2){
      
      c1 = sc.nextLine();
      c2 = sc.nextLine();
      
      while((!"Matematicas".equals(c1) && !"Biologia".equals(c1) && !"Ingles".equals(c1) && !"Portugues".equals(c1) && !"Frances".equals(c1))|| (!"Matematicas".equals(c2) && !"Biologia".equals(c2) && !"Ingles".equals(c2) && !"Portugues".equals(c2) && !"Frances".equals(c2))){
      
       System.out.println("Porfavor Ingrese el curso bien");
          System.out.println(" ");

        c1 = sc.nextLine();
        c2 = sc.nextLine();

   } if ("Matematicas".equals(c1)|| "Biologia".equals(c1) ){
       v = 100;
       if ("Matematicas".equals(c2)|| "Biologia".equals(c2)){
           v = 100+100;
           iva = v + (v*0.15);
       }else {
           v = 100+120;
           iva = v + (v*0.15);
       }
               
               
   }else{
       
       v = 120;
       
       if ("Matematicas".equals(c2)|| "Biologia".equals(c2)){
           v = 120+100;
           iva = v + (v*0.15);
       }else {
           v = 120+120;
           iva = v + (v*0.15);
   }
  }
    }if (c == 3){
      
      c1 = sc.nextLine();
      c2 = sc.nextLine();
      c3 = sc.nextLine();

      while((!"Matematicas".equals(c1) && !"Biologia".equals(c1) && !"Ingles".equals(c1) && !"Portugues".equals(c1) && !"Frances".equals(c1))|| (!"Matematicas".equals(c2) && !"Biologia".equals(c2) && !"Ingles".equals(c2) && !"Portugues".equals(c2) && !"Frances".equals(c2)) || (!"Matematicas".equals(c3) && !"Biologia".equals(c3) && !"Ingles".equals(c3) && !"Portugues".equals(c3) && !"Frances".equals(c3))){
      
       System.out.println("Porfavor Ingrese el curso bien");
          System.out.println(" ");

        c1 = sc.nextLine();
        c2 = sc.nextLine();
        c3 = sc.nextLine();
   } if ("Matematicas".equals(c1)|| "Biologia".equals(c1) ){
       v = 100;
       if ("Matematicas".equals(c2)|| "Biologia".equals(c2)){
           v = 100+100+120;
           iva = v + (v*0.15);
           
       }else {
           if ("Matematicas".equals(c3)|| "Biologia".equals(c3)){
            v = 100 + 100 +120;
           iva = v + (v*0.15);

           }else{
              v = 100 + 120 +120;
           iva = v + (v*0.15);

           }
       }
                            
   }else{
       v = 120;
       if ("Matematicas".equals(c2)|| "Biologia".equals(c2)){
           v = 120+100;
           if ("Matematicas".equals(c3)|| "Biologia".equals(c3)){
               v = 120+100+100;
           iva = v + (v*0.15);
           }else{
               v = 120+120+100;
           iva = v + (v*0.15);
           }
       }else {
           v = 120+120;
           if ("Matematicas".equals(c3)|| "Biologia".equals(c3)){
                          v = 120+120+100;
                                     iva = v + (v*0.15);

           }else{
               v=120+120+120;
           iva = v + (v*0.15);

           }
   }}
    }if (c == 4){
      c1 = sc.nextLine();
      c2 = sc.nextLine();
      c3 = sc.nextLine();
      c4 = sc.nextLine();

     while((!"Matematicas".equals(c1) && !"Biologia".equals(c1) && !"Ingles".equals(c1) && !"Portugues".equals(c1) && !"Frances".equals(c1))|| (!"Matematicas".equals(c2) && !"Biologia".equals(c2) && !"Ingles".equals(c2) && !"Portugues".equals(c2) && !"Frances".equals(c2)) || (!"Matematicas".equals(c3) && !"Biologia".equals(c3) && !"Ingles".equals(c3) && !"Portugues".equals(c3) && !"Frances".equals(c3))|| (!"Matematicas".equals(c4) && !"Biologia".equals(c4) && !"Ingles".equals(c4) && !"Portugues".equals(c4) && !"Frances".equals(c4))){
      
       System.out.println("Porfavor Ingrese el curso bien");
          System.out.println(" ");

        c1 = sc.nextLine();
        c2 = sc.nextLine();
        c3 = sc.nextLine();
        c4 = sc.nextLine();
    }if ("Matematicas".equals(c1)|| "Biologia".equals(c1) ){
       v = 100;
       if ("Matematicas".equals(c2)|| "Biologia".equals(c2)){
           v = 100+100+120+120;
           iva = v + (v*0.15);
       }else {
           if ("Matematicas".equals(c2)|| "Biologia".equals(c2)){
              
              if ("Matematicas".equals(c3)|| "Biologia".equals(c3)){
                  v = 100 +100 +120 +120; 
           iva = v + (v*0.15);

              }else{
                  v= 120 +120 +120+100;
           iva = v + (v*0.15);
              }
           }else{
               v = 120 +120;
             if ("Matematicas".equals(c3)|| "Biologia".equals(c3)){
              if ("Matematicas".equals(c4)|| "Biologia".equals(c4))
              v = 120+ 120 +100 + 100;
           iva = v + (v*0.15);

           } else{
                 v = 120 + 120 +120 +100;
           iva = v + (v*0.15);
             }
       }}
    }
    } if (c == 5){
      
      c1 = sc.nextLine();
      c2 = sc.nextLine();
      c3 = sc.nextLine();
      c4 = sc.nextLine();
      c5 = sc.nextLine();


     while((!"Matematicas".equals(c1) && !"Biologia".equals(c1) && !"Ingles".equals(c1) && !"Portugues".equals(c1) && !"Frances".equals(c1))|| (!"Matematicas".equals(c2) && !"Biologia".equals(c2) && !"Ingles".equals(c2) && !"Portugues".equals(c2) && !"Frances".equals(c2)) || (!"Matematicas".equals(c3) && !"Biologia".equals(c3) && !"Ingles".equals(c3) && !"Portugues".equals(c3) && !"Frances".equals(c3))|| (!"Matematicas".equals(c4) && !"Biologia".equals(c4) && !"Ingles".equals(c4) && !"Portugues".equals(c4) && !"Frances".equals(c4)) || (!"Matematicas".equals(c5) && !"Biologia".equals(c5) && !"Ingles".equals(c5) && !"Portugues".equals(c5) && !"Frances".equals(c5))){
      
       System.out.println("Porfavor Ingrese el curso bien");
          System.out.println(" ");

        c1 = sc.nextLine();
        c2 = sc.nextLine();
        c3 = sc.nextLine();
        c4 = sc.nextLine();
        c5 = sc.nextLine();
    }
     v = 120 + 120 + 120 +100 + 100;
           iva = v + (v*0.15);
    }
    v = v;
    System.out.println("Tarjetas");
 System.out.println("Formas de pago");
 System.out.println("Credito o Debito");
 System.out.println("seleccione una forma");
 pago = sc.nextLine();
while (!"credito".equals(pago) && !"debito".equals(pago)){

      System.out.println("Su opcion no es clara porfavor ingrese de nuevo");
       pago = sc.nextLine();
} if ("credito".equals(pago)){
 System.out.println("Seleccione su plazo de pago");
 System.out.println("3 meses o 2 meses (en numeros su opcion)");
 tpago = sc.nextInt();
 while (tpago != 3 && tpago != 2){ 

      System.out.println("Su opcion no es clara porfavor ingrese de nuevo");
       tpago = sc.nextInt();
} if (tpago == 3){
 System.out.println("                                       Factura                 ");
           System.out.println(" ");
 System.out.println("     cursos:");
 System.out.println(                   c1 + " " + c2 + " " + c3 + " " + c4 + " " + c5);
 System.out.println("       Cursos totales: " + c); 
 System.out.println("       Valor de los cursos: $" + v ); 
 System.out.println("       Valor de los cursos mas iva 15%: $" + iva);
 System.out.println("     Tiempo a pagar 3 meses"); 
}else{

 System.out.println("Factura");
 System.out.println("cursos:");
 System.out.println(c1 + " " + c2 + " " + c3 + " " + c4 + " " + c5);
 System.out.println("Cursos totales: " + c); 
 System.out.println("Valor de los cursos: $" + v ); 
 System.out.println("Valor de los cursos mas iva 15%: $" + iva);
 System.out.println("Tiempo a pagar 2 meses");    
}
 
} else {

 System.out.println("Factura");
 System.out.println("cursos:");
 System.out.println(c1 + " " + c2 + " " + c3 + " " + c4 + " " + c5);
 System.out.println("Cursos totales: " + c); 
 System.out.println("Valor de los cursos: $" + v ); 
 System.out.println("Valor de los cursos mas iva 15%: $" + iva);
}
    }
    
}
