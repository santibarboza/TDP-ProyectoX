package proyecto2.src.Proyectil;
import javax.swing.JLabel;

import proyecto2.src.TDANave.JLabel2;

public class Proyectil extends JLabel2
{
	protected boolean fuegoAliado;
	protected boolean color;
	protected static int vel=5;
	
	public Proyectil(int x, int y ,int dx,int dy,boolean clr, boolean aliado)
	{
		super(dx,dy,vel);
		setLocation(x,y);
		color=clr;
		fuegoAliado=aliado;
		
	}
	
	public boolean obtColor()
	{
		return color;
	}
	public boolean esFuegoAliado()
	{
		return fuegoAliado;
	}
}
