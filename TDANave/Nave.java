package proyecto2.src.TDANave;

import java.util.Iterator;
import proyecto2.src.TDAPowerUp.*;
import proyecto2.src.Proyectil.*;
public abstract class Nave extends JLabel2
{
	
	protected boolean poder;
	protected boolean color;
	protected int puntaje;
	protected int resistencia;
	protected int resActual;
	

	/**
	 * Crea un objeto instancia de la clase Nave.
	 * @param p es la posicion que occupa en la pantalla.
	 * @param clr es el color de la nave.
	 * @param punt es el puntaje de la nave.
	 */
	public Nave (int x, int y, boolean clr,int punt, int vel, int res)
	{	
		super(0,0,vel);
		this.setLocation(x, y);
		color=clr;
		puntaje=punt;
		resistencia=res;
		resActual=resistencia;
	}
	public Nave (int x, int y, boolean clr,int punt)
	{
		this(x,y,clr,punt,0,0);
	}
	/**
	 * Decide si la nave tiene o no un powerUp Activo guardado.
	 * @return Retorna verdadero si la nave almacena un Activo, falso de lo contrario.
	 */
	public boolean tieneActivo()
	{
		return poder;
	}
	
	/**
	 * Devuelve el color de la nave.
	 * @return Retorna Verdadero si la nave es AZUL, y falso si es ROJA.
	 */
	public boolean obtColor()
	{
		return color;
	}
	/**
	 * Devuelve la resistencia total de la nave.
	 * @return Retorna cuantos disparos soporta en total la nave antes de acabar su vida.
	 */
	public  int obtResistencia()
	{
		return resistencia;
	}
	/**
	 * Devuelve la resistencia actual de la nave.
	 * @return Retorna cuantos disparos le faltan recibir para acabar su vida.
	 */
	public  int obtResActual()
	{
		return resActual;
	}
	/**
	 * Devuelve el puntaje de la nave.
	 * @return Retorna el puntaje d ela nave.
	 */
	public  int obtPuntaje()
	{
		return puntaje;
	}
	/**
	 * Devuelve la velocidad de la Nave.
	 * @return Retorna la velocidad de la nave. 
	 */
	public  int obtVelocidad()
	{
		return velocidad;
	}
	/**
	 * Se encarga de decrementar su resistencia total o sus vidas de tenerlas.
	 */
	public abstract void esGolpeado();
	/**
	 * Realiza un disparo devolviendo un iterador de proyectiles.
	 * @return Retorna una coleccion de proyectiles del disparo.
	 * Aclaracion: los proyectiles ya estan ubicado en la pantalla y tienen
	 * una direccion definida.
	 */
	public abstract Iterator<Proyectil>  disparar();
	
//	public boolean HuboChoque(Nave enemy){
//		boolean seChocaron=false;
//		Rectangle r1 = new Rectangle(posicion.obtX(),posicion.obtY());
//		Rectangle r2 = new Rectangle(enemy.obtPosicion().obtX(),enemy.obtPosicion().obtY());
//		if(r1.intersects(r2))
//			seChocaron=true;
//		return seChocaron;
//	}
}
