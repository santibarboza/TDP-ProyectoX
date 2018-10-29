package proyecto2.src.TDAArma;

import TDALista.*;

public class Fase2 extends Arma 
{
	public Fase2(int anchoNave, int altoNave,boolean clr)
	{
		super(anchoNave,altoNave,clr);
		cantDisparos=2;
		velDisparos=2;
		armaFinal=false;
		posDispRelativa();
	}
	public Arma obtMutacion()
	{
		return new Fase3(ancho,alto,color);
	}
	
	protected void posDispRelativa()
	{
		//setear x,y,dx,dy, para cada posicion de partida de proyectiles
		// y llamar al metodo addDisp(x,y,dx,dy) para cada uno de ellos
		//ADVERTENCIA= velDisparos debe estar inicializado al llamar al metodo
	}
	
}
