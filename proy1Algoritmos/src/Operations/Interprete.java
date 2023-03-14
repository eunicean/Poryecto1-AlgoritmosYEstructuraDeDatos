import java.util.Scanner;
import java.util.ArrayList;
import java.lang.Integer;

public class Interprete {
    
    public Operations Operate(String expresion) {
            int state = SintaxScanner.getState(expresion);

        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Bienvenido al programa de interprete de Lisp");
        String menu = "\n--------------------------------------------------------\n| Seleccione alguna de las siguientes opciones:        |\n| (1) Asignación de variables                           |\n| (2) Agregar Operación                             |\n| (3) Operación Resta                         |\n| (4) Operación Multiplicación                                     |\n| (5) Operación División                                           |\n| (6) Citas                                    |\n| (7) Operaciones                                     |\n| (8) Operaciones Atom                                    |\n| (9) Operaciones Listas                                    |\n| (10) Operación igual que                                    |\n| (11) Operación más pequeño que                                     |\n| (12) Operación más grande que                                     |\n| (13) Operaciones Condicionadas                                     |\n| (14) Resulatados Operaciones                                    |\n--------------------------------------------------------\nOpcion a elegir: ";
        System.out.println(menu);
        int op = teclado.nextInt();
        teclado.nextLine();
        
        

        while(op != 5){
            switch(op){
                case 1:{
                    System.out.println("Selecciono Opcion 2\n");
                    break;
                }
                case 2:{
                    System.out.println("Selecciono Opcion 2\n");
                    break;
                }
                case 3:{
                    System.out.println("Selecciono Opcion 3\n");
                    break;
                }
                case 4:{
                    System.out.println("Selecciono Opcion 4\n");
                    break;
                }case 5:{
                    System.out.println("Selecciono Opcion 5\n");
                    break;
                }case 6:{
                    System.out.println("Selecciono Opcion 6\n");
                    break;
                }case 7:{
                    
                    System.out.println("Selecciono Opcion 7\n");
                    break;
                }case 8:{
                    
                    System.out.println("Selecciono Opcion 8\n");
                    break;
                }case 9:{
                    
                    System.out.println("Selecciono Opcion 9\n");
                    break;
                }case 10:{
                    
                    System.out.println("Selecciono Opcion 10\n");
                    break;
                }case 11:{
                    
                    System.out.println("Selecciono Opcion 11\n");
                    break;
                }case 12:{
                    
                    System.out.println("Selecciono Opcion 12\n");
                    break;
                }case 13:{
                    
                    System.out.println("Selecciono Opcion 13\n");
                    break;
                }case 14:{
                    
                    System.out.println("Selecciono Opcion 14\n");
                    break;
                }
                default:
                    ErrorOperationResult errorResult = new ErrorOperationResult();
                    errorResult.addResults("EXPRESSION ERROR", "Expresion invalida.");
                    return errorResult;

                    
            }
            System.out.println(menu);
            op = teclado.nextInt();
            teclado.nextLine();
        }
    }
}