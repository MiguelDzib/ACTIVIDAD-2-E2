/*
2.- Crear un metodo que determine si es el día es habil (lunes a viernes), 
y emitir un mensaje o en su caso emitir un mensaje que es fin de semana.
 */
package actividad.pkg2.e2;
import java.util.Scanner;
public class ACTIVIDAD2E2 {

    public static void main(String[] args) {
        
        Scanner entrada= new Scanner(System.in);
        System.out.println("Introduce el dia de la semana");
        String dia = entrada.nextLine();
        switch(dia){
            case "Lunes","Martes","Miercoles","Jueves","Viernes":
                System.out.println("EL DÍA ES HABIL");
                break;
            case "Sabado", "Domingo":
                System.out.println("ES FIN DE SEMANA");
                break;
            default:
                System.out.println("Incorrecto, recuerda escribir el dia iniciando con mayuscula");
      
        }
    
     }
}

