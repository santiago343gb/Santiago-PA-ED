package recu;

//comit para evitar perderlo todo//


public class Perez_circulo {

	private int Id;
	private String Nombre;
	private double Radio;
	private String Color;

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public double getRadio() {
		return Radio;
	}

	public void setRadio(double radio) {
		Radio = radio;
	}

	public String getColor() {
		return Color;
	}

	public void setColor(String color) {
		Color = color;
	}

	@Override
	public String toString() {
		return "Perez_circulo [Id=" + Id + ", Nombre=" + Nombre + ", Radio=" + Radio + ", Color=" + Color + "]";
	}

	public Perez_circulo(String nombre, double radio, String color) {
		super();
		Nombre = nombre;
		Radio = radio;
		Color = color;
	}

   
    public Perez_circulo(int id, String nombre, double radio, String color) {
        this.Id = id;
        this.Nombre = nombre;
        this.Radio = radio;
        this.Color = color;
    }

   

}
