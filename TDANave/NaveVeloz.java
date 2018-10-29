package proyecto2.src.TDANave;
public class NaveVeloz extends Jugador 
{
	protected static int vel=4;
	protected static int res=3;
	/**
	 * Crea un objeto instancia de la clase NaveResistente.
	 * @param pos es la posicion que ocupa en la pantalla.
	 * @param nom es el nombre.
	 */
	public NaveVeloz(String nom,int x, int y, boolean clr,int punt)
	{
		super(nom,x,y,true,punt,vel, res);
	}
}
