package policia2;

public class delincuente {
	// creamos las variables
	private String Nombredelincuente;
	private String Apellidosdelincuente;
	private int Edaddelincuente;
	private String Crimendelincuente;
	private int Alturadelincuente;

	public delincuente() {
		//  las inicializamos
		Nombredelincuente="";
		Apellidosdelincuente="";
		Edaddelincuente=0;
		Crimendelincuente="";
		Alturadelincuente=0;

	}
	// creamos los metodos
	public void guardaNombre(String nom){
		Nombredelincuente=nom;
	}
	public String cogerNombre(){
		return Nombredelincuente;
	}

	public void guardaApellido(String apellido){
		Apellidosdelincuente=apellido;
	}
	public String cogerApellido(){
		return Apellidosdelincuente;
	}
	public void guardarEdad(int edad){
		Edaddelincuente=edad;
	}

	public int cogeredad(){
		return Edaddelincuente ;
	}
	public void guardarcrimen(String crimen){
		Crimendelincuente=crimen;
	}
	public String cogercrimen(){
		return Crimendelincuente;
	}
	public void guardaraltura(int altura){
		Alturadelincuente=altura;
	}

	public int cogeraltura(){
		return Alturadelincuente ;
	}
	public String toString(){
		return Nombredelincuente;
	}

}
