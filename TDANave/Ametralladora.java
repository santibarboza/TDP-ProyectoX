package proyecto2.src.TDANave;

import java.util.Iterator;

import TDALista.DoubleLinkedList;
import TDALista.PositionList;
import proyecto2.src.Proyectil.Proyectil;
import proyecto2.src.TDAPowerUp.Activo;

public class Ametralladora extends Enemigo
{
	/**
	 * Crea un objeto instancia de la clase Ametralladora
	 * @param p es la posicion en la que va a estar la ametralladora
	 * @param clr es el color que va a tener
	 */
	public Ametralladora(int x,int y, boolean clr,boolean powerup) 
	{
		super(x,y, clr, 50,1,1,powerup);
		resistencia=resActual=2;
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
		PositionList<Proyectil> proyectiles= new DoubleLinkedList<Proyectil>();
		Proyectil p= new Proyectil(getX(),getY()+1,0,1,color,true);
		proyectiles.addFirst(p);
	return proyectiles.iterator();
	}

}
