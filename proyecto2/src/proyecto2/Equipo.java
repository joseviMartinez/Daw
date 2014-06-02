package proyecto2;

public class Equipo {
	private String Jugador[];
	private String nombreEquipo;
	private int golesFavor;
	private int golesEnContra;
	private int partidosGanados;
	private int partidosPerdidos;
	// tenemos dos constructores, este para crear y igualar las variables con las de arriba
		public Equipo(String nom, int golesF, int golesC,int partidosG,int partidosP){
			nombreEquipo=nom;
			golesFavor=golesF;
			golesEnContra=golesC;
			partidosGanados=partidosG;
			partidosPerdidos=partidosP;
}
		// este construcutor es el que utilizamos y donde le damos un numero de valor a las variables
		public Equipo() {
			nombreEquipo="";
			golesFavor=0;
			golesEnContra=0;
			partidosGanados=0;
			partidosPerdidos=0;
			
			//inicializamos el array
			Jugador=new String[10];
			Jugador[7]="Juanfran";
			for(int i=0;i<Jugador.length;i++)
			{
				Jugador[i]="";
				System.out.println(Jugador[i]);
			}
			
		}
		
		//nos permite modificar el nombre del jugador
		public void modificarJugador (String nombreNuevo,int posicionJugador) {
			
			Jugador[posicionJugador]=nombreNuevo;
		}
		
		//nos devuelva la posicion de un jugador
		
		public String devolverJugador (int posicionJugador) {
			return Jugador[posicionJugador];
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		public void SetNombre(String nombre1){
			nombreEquipo=nombre1;
		}
		public String getNombre(){
			return nombreEquipo;
		}
		public void setGolesFavor(int golesFavor1){
			golesFavor=golesFavor1;
		}
		
		public int getGolesFavor (){
			return golesFavor;
		}
		public void setGolesEnContra(int golesContra1){
			golesEnContra=golesContra1;
		}
		public int getGolesContra(){
			return golesEnContra;
		}
		public void setPartidosGanados(int partidosGanados1){
			partidosGanados=partidosGanados1;
		}
		public int getPartidosGanados(){
			return partidosGanados;
		}
		public void setPartidosPerdidos(int partidosPerdidos1){
			partidosPerdidos=partidosPerdidos1;
			
		}
		public int getPartidosPerdidos(){
			return partidosPerdidos;
		}
}		
