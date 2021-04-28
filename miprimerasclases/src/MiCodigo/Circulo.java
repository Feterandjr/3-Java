package MiCodigo;

public class Circulo {
	private double radio;
	private ParejaNumeros coordenadasCentro;
	

	/**
	 * @return the coordenadasCentro
	 */
	public ParejaNumeros getCoordenadasCentro() {
		return coordenadasCentro;
	}
	/**
	 * @param coordenadasCentro the coordenadasCentro to set
	 */
	public void setCoordenadasCentro(ParejaNumeros coordenadasCentro) {
		this.coordenadasCentro = coordenadasCentro;
	}
	public Circulo(double radio,double centro_x,double centro_y){
		this.setRadio(radio);
		coordenadasCentro=new ParejaNumeros(centro_x,centro_y);
	
	}
	public double devuelveArea(){
		double area;
		area=(float) (3.1416*radio*radio);
		return(area);
		
	}
	public double getRadio() {
		return radio;
	}
	public void setRadio(double radio) {
		this.radio = radio;
	}
	public ParejaNumeros getCoordenadasCentro1() {
		return coordenadasCentro;
	}
	public void setCoordenadasCentro1(ParejaNumeros coordenadasCentro) {
		this.coordenadasCentro = coordenadasCentro;
	}
	public double getCoordenadaCentroX() {
		return(coordenadasCentro.getNum1());
	}
	public double getCoordenadaCentroY() {
		return(coordenadasCentro.getNum2());
	}
}
