package proyecto2.src.TDAArma;

import java.util.Iterator;

import proyecto2.src.Proyectil.*;
import TDALista.*;
//HAY QUE CORREGIR..
public abstract class Arma
{
	protected PositionList<Canon> posDisp;
	protected boolean color;
	protected int cantDisparos;
	protected int velDisparos;
	protected boolean armaFinal;
	protected int ancho;
	protected int alto;
	
	public Arma(int anchoNave, int altoNave,boolean clr){
		posDisp=new DoubleLinkedList<Canon>();
		color=clr;
		ancho= anchoNave;
		alto=altoNave;
	}
	
	public boolean mutacionFinal()
	{
		return armaFinal;
	}
	public boolean obtColor()
	{
		return color;
	}
	
	public Iterator<Canon> obtPosDisp()
	{
		return posDisp.iterator();
	}

	public void cambiarColor()
	{
		color= !color;
	}
	//se pasa por parametro la pos del jugador y para cada "Punto"  se calcula la posicion de la cual disparará.
	public Iterator<Proyectil> disparar(int xPlayer, int yPlayer)
	{
		PositionList<Proyectil> proyectiles= new DoubleLinkedList<Proyectil>();
		for(Canon Lugar: posDisp)
		{
			Proyectil p= new Proyectil(Lugar.obtX()+xPlayer,Lugar.obtY()+yPlayer,Lugar.obtDX(),Lugar.obtDY(),color,true);
			proyectiles.addFirst(p);
		}
		return proyectiles.iterator();
	}
	public abstract Arma obtMutacion();
	protected abstract void posDispRelativa();
}
