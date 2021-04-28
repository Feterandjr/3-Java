package MiCodigo;

public class ManejaMascotas {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mascota erReyklk;
		erReyklk=new Mascota("Caiman","erReyklk",85);
		MascotaConCuidados Marad;
		Marad=new MascotaConCuidados("Gato","Maradona el Polvoso",60);
		System.out.println("Mascota 1 ");
		System.out.println("Se llama: "+erReyklk.getNombre());
		System.out.println("Es un: "+erReyklk.getEspecie());
		System.out.println("Y tiene: "+erReyklk.getEdad()+" años");
		System.out.println("Mascota 2 ");
		System.out.println("Se llama: "+Marad.getNombre());
		System.out.println("Es un: "+Marad.getEspecie());
		System.out.println("Y tiene: "+Marad.getEdad()+" años");
		Marad.setCuidados("Enterrarlo en la tumba, y a darle rayas ;)");
		System.out.println("Cuidados especiales: "+Marad.getCuidados());
	}

}
