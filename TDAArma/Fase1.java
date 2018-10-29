package proyecto2.src.TDAArma;


import TDALista.*;

public class Fase1 extends Arma 
{
	public Fase1(int anchoNave, int altoNave,boolean clr)
	{
		super(anchoNave,altoNave,clr);
		cantDisparos=1;
		velDisparos=1;
		armaFinal=false;
		posDispRelativa();
	}
	public Arma obtMutacion()
	{
		return new Fase2(ancho,alto,color);
	}
	
	protected void posDispRelativa()
	{
		//ADVERENCIA:esto es un ejemplo, faltan modificar 
		//el x para ubicar el disparo al medio
		int x,y,dx,dy;
		x=ancho/2;
		y=-5;
		dx=0;
		dy=1;
		posDisp.addFirst(new Canon(x,y,dx,dy));
	}
	
}
