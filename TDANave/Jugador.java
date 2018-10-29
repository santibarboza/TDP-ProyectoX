package proyecto2.src.TDANave;
import java.util.Iterator;

import proyecto2.src.Proyectil.*;
import proyecto2.src.TDAArma.*;
import proyecto2.src.TDAPowerUp.*;
import TDALista.*;

public abstract class Jugador extends Nave 
{
	protected Activo powerup;
	protected String nombre;
	protected Arma arma;
	protected int vidas;
	protected int cantBombas;
	protected static int limiteBombas=2;
	
	/**
	 * Crea un Objeto Instancia de la clase jugador.
	 * @param nom es el nombre del Jugador.
	 * @param pos es su posición.
	 * @param clr es su color.
	 */
	public Jugador(String nom,int x, int y, boolean clr,int punt, int vel, int res)
	{
		super(x,y,clr,punt,vel,res);
		nombre=nom;
		arma=primerArma(x,y,clr);
		cantBombas=0;
		poder=false;
	}
	/**
	 * Crea un Objeto Instancia de la clase jugador.
	 * @param nom es el nombre del Jugador.
	 * @param pos es su posición.
	 * @param clr es su color.
	 * @param punt es el puntaje que posee.
	 * @param cvidas es la cantidad de vidas que tiene.
	 * @param arm es el arma que posee.
	 */
	public Jugador(String nom,int x, int y, boolean clr,int punt, int vel,int res,int cvidas,Arma arm)
	{
		super(x,y,clr,punt,vel,res);
		nombre=nom;
		vidas=cvidas;
		arma=arm;
		cantBombas=2;
	}
	/**
	 * Devuelve el nombre del jugador
	 * @return Retorna el nombre del jugador
	 */
	public String obtNombre()
	{
		return nombre;
	}
	/**
	 * Devuelve la cantidad de bombas del jugador
	 * @return cantidad de bombas del jugador
	 */
	public int obtCantBombas()
	{
		return cantBombas;
	}
	/**
	 * Devuelve la cantidad de vidas del jugador
	 * @return cantidad de vidas del jugador
	 */
	public int obtVidas()
	{
		return vidas;
	}
	/**
	 * Modifica la cantidad de vidas del jugador
	 * @param v la cantidad de vidas que va a tener el jugador
	 */
	public void setVidas(int v)
	{
		vidas=v;
	}
	/**
	 * Cambia el color de la nave
	 */
	public void cambiarColor()
	{
		color= !color;
		arma.cambiarColor();
	}
	/**
	 * Activa el PowerUp activo que tenga disponible
	 * @return Activo si es que tiene y sino retorna null
	 */
	public Activo activarActivo()
	{
		powerup.activar(this);
		return powerup;
	}
	/**
	 * Guarda el PowerUp activo pasado por parametro
	 * @param p el powerUp activo
	 */
	public void guardarActivo(Activo p)
	{
		powerup=p;
	}
	/**
	 * Define la posición inicial del jugador, 
	 * y al arma la define en la misma posición y con el mismo color que la nave
	 * @param p posición a definir en la nave
	 */
	public void setPosicionIni(int x, int y)
	{
		this.setLocation(x,y);
	}
	/**
	 * Incrementa el puntaje con el entero pasado por parámetro
	 * @param inc el entero para incrementar en el puntaje
	 */
	public void incrementarPuntaje(int inc)
	{
		puntaje+=inc;
	}
	/**
	 * Vuelve al primer arma (de la fase 1)
	 */
	public void resetArma()
	{
		arma= primerArma(this.getX(),this.getY(),color);
	}
	/**
	 * Muta el arma a la proxima fase.
	 */
	public void mutarArma()
	{
		if(!arma.mutacionFinal())
			arma=arma.obtMutacion();
	}
	/**
	 * Se agrega una bomba al jugador
	 * @param b bomba a agregar
	 */
	public void agregarBomba()
	{
		if(limiteBombas<cantBombas)
			cantBombas++;
	}
	/**
	 * si tiene bomba entonces la devuelve sino devuelve nulo
	 * @return Bomba que obtiene de las bombas del jugador
	 */
	//muestra por pantalla la explosion, destruye a todas las naves y descuenta una bomba del contador..
	public void tirarBomba()
	{
		if(cantBombas>0)
		{
			//destruirTodo(); //metodo de Juego..
			cantBombas--;
		}
		
	}
	
	public  void esGolpeado() 
	{//verificar si esta bien
	
		if(resActual==1)
			if(vidas==1);
				//perdiste
			else
			{
				vidas--;
				//deberia reaparecer en la pantalla y reiniciar el nivel
			}
		else 
			resActual--;
			
	}

	/**
	 * Realiza un disparo.
	 * @return Retorna una coleccion de proyectiles del disparo.
	 * Aclaracion: los proyectiles ya estan ubicado en la pantalla y tienen
	 * una direccion definida.
	 */
	public Iterator<Proyectil> disparar() 
	{
		return arma.disparar(getX(),getY());
	}
	
	
	private Arma primerArma(int x, int y,boolean clr)
	{
		return new Fase1(x,y,clr);
	}
	
}
