package proyecto2.src.Mentes;

import proyecto2.src.Juego.Juego;
import proyecto2.src.TDANave.Nave;

public abstract class MenteFlota extends MenteGeneral{
	protected Nave[] flota;
	protected  int cantNaves;
	
	public Nave[] getNave()
	{
		return flota;
	}
	
	public int getCantNaves()
	{
		return cantNaves;
	}
	
	
}
