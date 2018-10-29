package proyecto2.src.TDAPowerUp;
import java.awt.Rectangle;

import javax.swing.JLabel;
import proyecto2.src.TDANave.*;

public abstract class PowerUp extends JLabel2
{

	
	/**
	 * Crea un objeto instancia de Power Up con poscion p.
	 * @param p es la posicion que ocupara el powerUp.
	 * Aclaracion: p es una posicion sin JLabel asociado, 
	 * la nueva instancia se encarga de asociarce a ella.
	 */
	public PowerUp(int x, int y)
	{
		super(0,1,1);
		this.setLocation(x, y);
	}
	
	/**
	 * Ejecuta una accion a realizar al momento de chocarse a un jugador j.
	 * @param j es el jugador que choco el Powerup.
	 */
	public abstract void accion(Jugador j);
}
