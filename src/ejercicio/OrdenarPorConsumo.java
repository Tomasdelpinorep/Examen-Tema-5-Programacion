package ejercicio;

import java.util.Comparator;

public class OrdenarPorConsumo implements Comparator<Trayecto>{

	@Override
	public int compare(Trayecto t1, Trayecto t2) {
		if(t1.getLitrosConsumidos() > t2.getLitrosConsumidos()) {
			return 1;
		}else if(t1.getLitrosConsumidos() < t2.getLitrosConsumidos()) {
			return -1;
		}
		return 0;
	}
}
