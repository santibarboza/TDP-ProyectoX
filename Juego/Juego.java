package proyecto2.src.Juego;

import proyecto2.src.GUI.JuegoJFrame;
import proyecto2.src.Proyectil.Proyectil;
import proyecto2.src.TDANave.Enemigo;
import proyecto2.src.TDANave.Jugador;
import proyecto2.src.TDANivel.Nivel;
import proyecto2.src.TDAPowerUp.PowerUp;

public class Juego extends javax.swing.JFrame
{
	protected Jugador jugador;
	protected Nivel nivelActual;
	protected Enemigo[] enemigos;
	protected PowerUp[] powerUps;
	protected Proyectil[] proyectiles;
	
	public Jugador obtJugador()
	{
		return jugador;
	}
	
	public void comenzar()
	{
		//nivelActual=new Nivel1(40, 10);
		//jugador= new Jugador(...)
	}
	
	private void controlarColisiones()
	{
	}
	private void actualizarMovimientos()
	{
		
	}
}
