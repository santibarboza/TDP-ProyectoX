package proyecto2.src.TDAArma;

//almacena la posicion del cañon con respecto a la navec
//y la direccion a la cual disparará
public class Canon 
{
	protected int x;
	protected int y;
	protected int dx;
	protected int dy;
	
	public Canon(int X,int Y,int dX,int dY)
	{
		x=X;
		y=Y;
		dx=dX;
		dy=dY;
	}
	public int obtX()
	{
		return x;
	}
	public int obtY()
	{
		return y;
	}
	public int obtDX()
	{
		return dx;
	}
	public int obtDY()
	{
		return dy;
	}
	
	
}
