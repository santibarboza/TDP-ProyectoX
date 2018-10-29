package proyecto2.src.TDANivel;

import proyecto2.src.TDANave.Enemigo;
import proyecto2.src.TDANave.Jugador;
import proyecto2.src.TDAPowerUp.Pasivo;

public abstract class Nivel {
	protected int cantEnemigos;
	protected int frecuenciaAparicion;
	protected int enemigosEntregados;
	public Nivel(int cantEnemigos, int frecuencia)
	{
		this.cantEnemigos=cantEnemigos;
		this.frecuenciaAparicion=frecuencia;
	}
	public boolean quedanEnemigos()
	{
		return (cantEnemigos-enemigosEntregados)==0;
	}
	public abstract Enemigo crearEnemigo();
	
	public abstract Enemigo crearEnemigoConPowerUp();
	
	public abstract void ubicarJugador(Jugador jugador);
	
	public abstract Pasivo lanzarPowerUp();
	
}
