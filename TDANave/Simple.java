package proyecto2.src.TDANave;

import java.util.Iterator;

import TDALista.DoubleLinkedList;
import TDALista.PositionList;
import proyecto2.src.Proyectil.Proyectil;

public class Simple extends Enemigo {
	/**
	 * Crea un objeto instancia de la clase Simple.
	 * @param pos es la posicion en la pantalla
	 * @param color es el color de la nave Simple.
	 */
	public Simple(int x,int y, boolean color,boolean powerup)
	{
		super(x,y, color, 15, 1, 1,powerup);
		resistencia=1;
		resActual=1;
		
	}
	/**
	 * Mueve la posicion de la nave simple por la pantalla.
	 */
	public void mover() 
	{
		//realiza el movimiento caracteristico de la nave enemiga...
		//HACERRRRRRRRRRRRRRRRRRRR
		
	}
	/**
	 * Se encarga de decrementar su resistencia total o sus vidas de tenerlas.
	 * Ademas se encarga de avisar al juego si se murio.
	 */
	public void esGolpeado() 
	{
		if(resActual==1);
			//murio: falta implmementarlo
		else
			resActual--;
		
	}

	/**
	 * Realiza un disparo.
	 * @return Retorna una coleccion de proyectiles del disparo. 
	 */
	public Iterator<Proyectil> disparar() {
		PositionList<Proyectil> proyectiles= new DoubleLinkedList<Proyectil>();
			
			Proyectil p= new Proyectil(this.getX(),this.getY(),0,1,color,false);
			proyectiles.addFirst(p);
		return proyectiles.iterator();
	}

}
