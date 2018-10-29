package proyecto2.src.Mentes;

import java.awt.Rectangle;

import TDAPila.EmptyStackException;
import TDAPila.LinkedStack;
import TDAPila.Stack;
import proyecto2.src.Juego.Juego;
import proyecto2.src.TDANave.Enemigo;
import proyecto2.src.TDANave.Jugador;


public class MenteFlotaEnemiga extends MenteFlota{

	
	//constructor de la flota  de enemigos diversos (simple, ametralladora o escopeta)..
	public MenteFlotaEnemiga(Enemigo[] naves, Juego juego)
	{
		flota=naves;
		this.juego=juego;
		cantNaves=naves.length;
	}
	
	public void setFlota(Enemigo[] flota){
		this.flota=flota;
	}
	
	public void moverFlota() {
		for(int i=0; i<flota.length; i++)
			{Enemigo naveE= (Enemigo) flota[i];
			naveE.mover();
			}
		juego.repaint();//VERRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR!!!
	}

	public void chequearColisiones() {
		try{
		 Jugador player = juego.getPlayer();
		 int resActualPlayer = player.obtResActual();
		 Stack<Integer> chocaron = new LinkedStack<Integer>(); 
		 int j=0;
		 while((j<cantNaves)&&(resActualPlayer>0))
			{if((player.obtColor()!=flota[j].obtColor())&&(player.hayColision(flota[j])))
					{chocaron.push(j);
					 player.esGolpeado();
					}
					
			j++;
			}
		 
		 while(!chocaron.isEmpty())
		 	{int pos = chocaron.pop();
		 	 if(pos==cantNaves-1)
		 		 {flota[pos]=null;
		 		 }
		 	 else //cualquier otro valor...
		 	 	{flota[pos]=flota[cantNaves-1];
		 	 	 flota[cantNaves-1]=null;
		 	 	}
		 	cantNaves--;
		 	}
		 
		juego.repaint();
		}catch(EmptyStackException ex){
			System.out.println(ex.getMessage());
		}
	}

}
