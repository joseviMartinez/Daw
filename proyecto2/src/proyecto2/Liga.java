package proyecto2;

import java.io.Serializable;

public class Liga implements Serializable{
int numEquipos;
String nombreLiga;
private Equipo equipos[];
	public Liga() {
		numEquipos=0;
		nombreLiga="Liga Española";
		equipos=new Equipo[numEquipos];
	}
	public Liga (int NE, String nL){
		numEquipos=NE;
		nombreLiga=nL;
		
	}
	public void SetNombre (String nombre1){
		nombreLiga=nombre1;
	}
	public String  GetNombre(){
		return nombreLiga;
	}
	public int GetnumEquipo(){
		return numEquipos;
	}
	public Equipo GetEquipo(int posicion){
		return equipos[posicion];
	}
	public void SetEquipo (Equipo Equipo1, int Equipo2){
		equipos[Equipo2]=Equipo1;
	}
}

