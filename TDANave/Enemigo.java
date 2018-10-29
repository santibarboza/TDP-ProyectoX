package proyecto2.src.TDANave;

import proyecto2.src.TDAPowerUp.*;

public abstract class Enemigo extends Nave 
{
	protected int cantDispSimultaneos;
	
	/**
	 Crea un objeto instancia de la clase Enemigo que modela una Nave enemiga.
	 * @param p 	es la posicion de la Nave Enemiga.
	 * @param clr	es el colode de la Nave Enemiga.
	 * @param punt  es el puntaje de la Nave Enemiga.
	 * @param cantDisp es la cantidad de Disparos Simultaneos de la nave.
	 * @param powerup indica si tiene o no activo.
	 */
	public Enemigo(int x,int y,boolean clr,int punt,int frecDisp, int cantDisp,boolean powerup)
	{
		super(x,y,clr,punt);
		cantDispSimultaneos=cantDisp;
		poder=powerup;
	}
	/**
	 * Devuelve la cantidad de Disparos en simultaneos que realiza.
	 * @return Retorna la cantidad de Disparos en simultaneos que realiza.
	 */
	public int obtCantDisparos()
	{
		return cantDispSimultaneos;
	}
	
}
