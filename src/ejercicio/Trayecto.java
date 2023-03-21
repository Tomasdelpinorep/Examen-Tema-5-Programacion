package ejercicio;

public class Trayecto implements Comparable<Trayecto>{

	private int id;
	private double tiempoTrayecto,litrosConsumidos;
	private String modo;
	public Trayecto(int id, double tiempoTrayecto, double litrosConsumidos, String modo) {
		super();
		this.id = id;
		this.tiempoTrayecto = tiempoTrayecto;
		this.litrosConsumidos = litrosConsumidos;
		this.modo = modo;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getTiempoTrayecto() {
		return tiempoTrayecto;
	}
	public void setTiempoTrayecto(double tiempoTrayecto) {
		this.tiempoTrayecto = tiempoTrayecto;
	}
	public double getLitrosConsumidos() {
		return litrosConsumidos;
	}
	public void setLitrosConsumidos(double litrosConsumidos) {
		this.litrosConsumidos = litrosConsumidos;
	}
	public String getModo() {
		return modo;
	}
	public void setModo(String modo) {
		this.modo = modo;
	}
	
	@Override
	public String toString() {
		return "Trayecto [id=" + id + ", tiempoTrayecto=" + tiempoTrayecto + ", litrosConsumidos=" + litrosConsumidos
				+ ", modo=" + modo + "]";
	}

	@Override
	public int compareTo(Trayecto t) {
		return this.getModo().compareToIgnoreCase(t.getModo());
	}

	
	
}
