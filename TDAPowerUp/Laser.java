package proyecto2.src.TDAPowerUp;

import proyecto2.src.TDANave.Jugador;
//hay que implementar el activar
public class Laser extends Activo
	{
	/**
	 * Crea un objeto Instancia de la clase Laser en una posicion pos.
	 * @param pos es la posicion en la que se crea el PowerUp.
	 */
	public Laser(int x, int y){
		super(x,y);
	}

	/**
	 * Realiza el efecto a realizar cuando el jugador active el powerUp,
	 * solo es llamado desde Jugador.
	 * @param j es el jugador que lo activa.
	 */
	public void activar(Jugador j) 
	{
		//hay que implementarlo
	}
}
