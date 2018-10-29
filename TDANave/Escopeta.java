package proyecto2.src.TDANave;

import java.util.Iterator;

import proyecto2.src.Proyectil.Proyectil;
import proyecto2.src.TDAPowerUp.Activo;
import TDALista.DoubleLinkedList;
import TDALista.PositionList;
//falta implementar el esgolpeado
public class Escopeta extends Enemigo 
{
	/**
	 * Crea un objeto instancia de la clase escopeta
	 * @param p es la posicion en la que va a estar la escopeta
	 * @param clr es el color que va a tener
	 */
	public Escopeta(int x,int y, boolean clr,boolean powerup) 
	{
		super(x,y, clr,100 ,4,4,powerup);
		resistencia=resActual=3;
	}
		/**
	 * Es golpeado y puede morir o decrementar su resistencia
	 */
	public void esGolpeado() 
	{
		if(resActual==1);
			//murio
		else
			resActual--;
	}

	/**
	 * Realiza un disparo.
	 * @return Retorna una coleccion de proyectiles del disparo. 
	 */
	public Iterator<Proyectil> disparar() 
	{
		//hay que implementarlo
		return null;
	}

}
