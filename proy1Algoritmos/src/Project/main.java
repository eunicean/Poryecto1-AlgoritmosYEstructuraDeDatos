package Project;

import java.io.*;
import java.util.*;
import Interprete.*;

public class main {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		Interpreter myInterpreterLISP = new Interpreter();
		System.out.println("+-------------------------------+");
		System.out.println("| Bienvenido al interprete LISP |");
		System.out.println("+-------------------------------+");
		int option = 0;
		String data = "";
		String code = "";
		boolean menu = true;
		while(menu) {
			System.out.println();
			System.out.println("Seleccione una opcion: \n 1. Escribir codigo\n 2. Leer Archivo con codigo -example.txt-\n");
			option = tec.nextInt();	tec.nextLine();
			if(option==1) {
				do {
					System.out.println();
					System.out.println("------------------------------------------------------");
					System.out.println("Escriba su expresion (escriba 'out' para salir)\n");
					code = tec.nextLine();
					System.out.println(myInterpreterLISP.RunCode(code));
				} while (!code.equals("out"));
			}
			else if(option == 2 ) {
				System.out.println();
				System.out.println("------------------------------------------------------");
				System.out.println("Leyendo archivo...");
				try {
					File myFile = new File("example.txt");
					Scanner myReader = new Scanner(myFile);
					while (myReader.hasNextLine()) {
				        data = myReader.nextLine();
				      }
					myReader.close();
					
				} catch (FileNotFoundException  e) {
					System.out.println("An error occurred.");
				      e.printStackTrace();
				}
				System.out.println("Expression: " + data);
				System.out.println(myInterpreterLISP.RunCode(data));
			}
			else {
				System.out.println("Ingrese una de las opciones dadas");
			}
		}
		
		
	}
}
