package ejercicio;

import java.util.ArrayList;
import java.util.List;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		
		int opcion, buscarModo,mod,size;
		double limiteConsumo;
		
		Trayecto t1 = new Trayecto(1,120,8.7,"eco");
		Trayecto t2 = new Trayecto(2,70,7.9,"deportivo");
		Trayecto t3 = new Trayecto(3,830,56.3,"normal");
		Trayecto t4 = new Trayecto(4,260,21.3,"normal");
		
		List<Trayecto> lista = new ArrayList<Trayecto>();
		lista.add(t1);
		lista.add(t2);
		lista.add(t3);
		lista.add(t4);
		Coche c = new Coche(lista);
		
		System.out.println("Bienvenido al programa.");
		do {
			imprimirMenu();
			opcion=Leer.datoInt();
			
			switch(opcion) {
			case 0:
				System.out.println("Gracias por utilizar el programa.");
				break;
				
			case 1: 
				System.out.println("Indique el modo que desea buscar:");
				System.out.println("1. Eco | 2. Normal | 3. Deportivo");
				buscarModo=Leer.datoInt();
				c.iterarTodos(c.buscarTrayectos(c.modoAString(buscarModo)));
				System.out.println("**************************** \n\n");
				break;
				
			case 2:
				c.imprimirPrimero(c.ordenarDuracion());
				System.out.println("**************************** \n\n");
				break;
				
			case 3:
				System.out.println("Indique x:");
				limiteConsumo=Leer.datoDouble();
				c.imprimirMenorConsumo(limiteConsumo); 
				System.out.println("**************************** \n\n");
				
				break;
				
			case 4:
				c.imprimirPrimero(c.ordenarConsumo());
				System.out.println("**************************** \n\n");
				break;
				
			case 5:
				System.out.println("Indique el trayecto que desea modificar");
				c.iterarTodos();
				System.out.println();
				mod=Leer.datoInt();
				System.out.println("Indique el nuevo modo: 1. Eco | 2. Normal | 3. Deportivo");
				buscarModo=Leer.datoInt();
				c.modificarModo(c.modoAString(buscarModo),mod);
				
				System.out.println("El nuevo trayecto es:");
				c.imprimirUno(mod);
				System.out.println("**************************** \n\n");
				break;
				
			case 6:
				c.iterarTodos(c.ordenarNatural());
				System.out.println("**************************** \n\n");
				break;
				
			case 7:
				c.iterarTodos(c.ordenarDuracion());
				System.out.println("**************************** \n\n");
				break;
				
			case 8: //pal final que es largo
				System.out.println("Indique el número de trayectos:");
				size=Leer.datoInt();
				c.iterarTodos(c.generarListaRandom(size));
				System.out.println("**************************** \n\n");
				//Esta lista no se queda guardada tras generarla, todos los demás case
				//se usará la lista precargada
				
				break;
				
			case 9:
				System.out.printf("La media de litros consumida es de %.2fL \n\n",c.calcularMedia());
				break;
				
			case 10:
				c.iterarTodos();
				System.out.println("**************************** \n\n");
				break;
			}
		}while(opcion !=0);
	}
	
	public static void imprimirMenu() {
		System.out.println("1. Buscar todos los trayectos de un determinado modo.");
		System.out.println("2. Buscar el trayecto de mayor duración");
		System.out.println("3. Buscar trayectos que hayan consumido menos de x:");
		System.out.println("4. Buscar trayecto que haya gastado menos combustible");
		System.out.println("5. Modificar modo de un trayecto");
		System.out.println("6. Ordenar la lista por modo de conducción alfabéticamente (natural)");
		System.out.println("7. Ordenar la lista por duración del trayecto, de mayor a menor (no natural)");
		System.out.println("8. Crear lista aleatoria de trayectos");
		System.out.println("9. Calcular media de litros consumidos");
		System.out.println("10. Imprimir toda la lista");
		System.out.println("0. Salir del programa");
	}

}
