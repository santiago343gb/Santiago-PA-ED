package recu;

public class Perez_rectangulo {

	private int Id;
	private double ladoA;
	private double ladoB;
	private String Color;
	public Perez_rectangulo(int id, double ladoA, double ladoB, String color) {
		super();
		Id = id;
		this.ladoA = ladoA;
		this.ladoB = ladoB;
		Color = color;
	}
	public Perez_rectangulo(double ladoA, double ladoB, String color) {
		super();
		this.ladoA = ladoA;
		this.ladoB = ladoB;
		Color = color;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public double getLadoA() {
		return ladoA;
	}
	public void setLadoA(double ladoA) {
		this.ladoA = ladoA;
	}
	public double getLadoB() {
		return ladoB;
	}
	public void setLadoB(double ladoB) {
		this.ladoB = ladoB;
	}
	public String getColor() {
		return Color;
	}
	public void setColor(String color) {
		Color = color;
	}
	@Override
	public String toString() {
		return "Perez_rectangulo [Id=" + Id + ", ladoA=" + ladoA + ", ladoB=" + ladoB + ", Color=" + Color
				+ ", getId()=" + getId() + ", getLadoA()=" + getLadoA() + ", getLadoB()=" + getLadoB() + ", getColor()="
				+ getColor() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
	
	//guradar2
	
	//jsfaofgjo
	
}
