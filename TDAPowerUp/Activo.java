package proyecto2.src.TDAPowerUp;

import proyecto2.src.TDANave.Jugador;

public abstract class Activo extends PowerUp
{
	/**
	 * Crea un objeto instancia de Activo que modela un PowerUp Activo.
	 * @param p es la posicion que ocupa el PowerUp.
	 */
	public Activo(int x,int y)
	{
		super(x,y);
	}
	/**
	 * Se encarga de almacenar el powerUp en el jugador que lo choco
	 * @param j es el jugador que choco el powerUp.
	 */
	public  void accion(Jugador j)
	{
		j.guardarActivo(this);
	}
	/**
	 * Realiza el efecto a realizar cuando el jugador active el powerUp,
	 * solo es llamado desde Jugador.
	 * @param j es el jugador que lo activa.
	 */
	public abstract void activar(Jugador j);
}
