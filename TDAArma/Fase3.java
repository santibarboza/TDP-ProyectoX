package proyecto2.src.TDAArma;

import TDALista.DoubleLinkedList;

public class Fase3 extends Arma 
{
	public Fase3(int anchoNave, int altoNave,boolean clr)
	{
		super(anchoNave,altoNave,clr);
		cantDisparos=3;
		velDisparos=2;
		armaFinal=true;
		posDispRelativa();
	}
	public Arma obtMutacion()
	{
		return this;
	}
	protected void posDispRelativa()
	{
		//setear x,y,dx,dy, para cada posicion de partida de proyectiles
		// y llamar al metodo addDisp(x,y,dx,dy) para cada uno de ellos
		//ADVERTENCIA= velDisparos debe estar inicializado al llamar al metodo
	}
}
