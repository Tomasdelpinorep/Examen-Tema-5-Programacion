package ejercicio;

import java.util.Comparator;

public class OrdenarPorDuracion implements Comparator<Trayecto>{

	@Override
	public int compare(Trayecto t1, Trayecto t2) {
		if(t1.getTiempoTrayecto() > t2.getTiempoTrayecto()) {
			return -1;
		}else if(t1.getTiempoTrayecto() < t2.getTiempoTrayecto()) {
			return 1;
		}
		return 0;
	}



}
