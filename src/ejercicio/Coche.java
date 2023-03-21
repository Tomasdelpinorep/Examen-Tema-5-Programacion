package ejercicio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Coche {

	private List<Trayecto> lista;

	public Coche(List<Trayecto> lista) {
		super();
		this.lista = lista;
	}

	public List<Trayecto> getLista() {
		return lista;
	}

	public void setLista(List<Trayecto> lista) {
		this.lista = lista;
	}

	@Override
	public String toString() {
		return "Coche [lista=" + lista + "]";
	}

	public String modoAString(int buscarModo) {
		switch (buscarModo) {
		case 1:
			return "Eco";
		case 2:
			return "Normal";
		case 3:
			return "Deportivo";
		}
		return null;
	}

	public List<Trayecto> buscarTrayectos(String modo) {
		List<Trayecto> listaModos = new ArrayList<Trayecto>();

		Iterator<Trayecto> i = lista.iterator();
		while (i.hasNext()) {
			Trayecto t = i.next();
			if (t.getModo().equalsIgnoreCase(modo)) {
				listaModos.add(t);
			}
		}

		return listaModos;
	}

	public List<Trayecto> ordenarDuracion() { // de mayor a menor
		Collections.sort(lista, new OrdenarPorDuracion());
		return lista;
	}

	public List<Trayecto> ordenarConsumo() { // de menor a mayor
		Collections.sort(lista, new OrdenarPorConsumo());
		return lista;
	}

	public void imprimirPrimero(List<Trayecto> soloPrimero) {
		System.out.println(soloPrimero.get(0)); //uso el 0 porque el primero SIEMPRE será indice 0, creo :)
	}

	public List<Trayecto> cumplirCondicionConsumo(double limiteConsumo) {
		List<Trayecto> cumpleCondicion = new ArrayList<>();
		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i).getLitrosConsumidos() < limiteConsumo) {
				cumpleCondicion.add(lista.get(i));
			}
		}
		
		return cumpleCondicion;
	}

	public void imprimirMenorConsumo(double limiteConsumo) {
		iterarTodos(cumplirCondicionConsumo(limiteConsumo));
	}
	
	public void iterarTodos() {
		Iterator <Trayecto> i = lista.iterator();
		
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}
	
	public void iterarTodos(List<Trayecto> listaEspecifica) {
		Iterator <Trayecto> i = listaEspecifica.iterator();
		
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}
	
	public void modificarModo(String nuevoModo, int mod) {
		lista.get(mod).setModo(nuevoModo);
	}
	
	public void imprimirUno(int pos) {
		System.out.println(lista.get(pos));
	}
	
	public List<Trayecto> ordenarNatural(){
		Collections.sort(lista);
		return lista;
	}
	
	public double calcularMedia() {
		double total=0;
		for(Trayecto t : lista) {
			total+=t.getLitrosConsumidos();
		}
		return total/lista.size();
	}
	
	public int generarRandom() {
		int max=1000;
		
		Random rnd = new Random(System.nanoTime());
		return rnd.nextInt(max)+1;
	}
	
	public int generarModoRandom() {
		int max=3;
		
		Random rnd = new Random(System.nanoTime());
		return rnd.nextInt(max)+1;
	}
	
	public List<Trayecto> generarListaRandom(int size){
		List<Trayecto> listaRandom = new ArrayList<>();
		
		for(int i = 0; i<size ;i++) {
			listaRandom.add(new Trayecto(generarRandom(),generarRandom(),
					generarRandom(),modoAString(generarModoRandom())));
		}
		
		return listaRandom;
	}

}
