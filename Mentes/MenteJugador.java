package proyecto2.src.Mentes;

import java.awt.Point;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import TDAPila.LinkedStack;
import TDAPila.Stack;
import proyecto2.src.GUI.JuegoJFrame;
import proyecto2.src.TDANave.Jugador;
import proyecto2.src.TDANave.Nave;

public class MenteJugador extends MenteFlota implements KeyListener{
	 final int factor=4;
	
	public MenteJugador(JuegoJFrame game,Jugador player)
	{
		flota=new Nave[1];
		flota[0]=player;
		cantNaves=1;
		juego=game;
	}

	
	public void keyPressed(KeyEvent arg0) 
	{
		Point pos=flota[0].getLocation();
		switch(arg0.getKeyCode()) 
		{
			case KeyEvent.VK_UP: 
			{
				if(flota[0].getY()>=factor)
					flota[0].setDXY(0, -factor);
				break;
			}
			case KeyEvent.VK_DOWN: 
			{	
				if(flota[0].getY()<juego.getHeight()-factor)
					flota[0].setDXY(0,factor);
				break;
			}
			case KeyEvent.VK_LEFT: 
			{	
				if(flota[0].getX()>=factor)
					flota[0].setDXY(-factor,0);
				break;
			}
			case KeyEvent.VK_RIGHT: 	
			{
				if(flota[0].getX()<juego.getWidth()-factor)
					flota[0].setDXY(factor,0);
				break;
			}
		}
		flota[0].mover();
		juego.repaint();
		
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void chequearColisiones() {
		Jugador j= (Jugador) flota[0];
		PowerUp[] powerUps= juego.getPowerUp();
		Stack<Integer> chocaron = new LinkedStack<Integer>();
		int cantPower=juego.getCantPowerUp();
		
		for(int i=0; i<cantPower; i++)
		{
			if(powerUps[i].hayColision(j))
				chocaron.push(i);
		}
		while(!chocaron.isEmpty())
		{
			cantPower=getCantPowerUp();
			int pos=chocaron.pop();
			if(pos==cantPower-1)
			{
				powerUps[cantPower-1]=null;
			}
			else{
				powerUps[pos]=powerUps[cantPower-1];
				powerUps[cantPower-1]=null;
			}
			juego.setCantPowerUp(cantPower-1);
		}
		juego.repaint();
	}
}
