package proyecto2.src.Mentes;

import java.util.HashSet;
import java.util.Set;

import TDAPila.LinkedStack;
import TDAPila.Stack;
import proyecto2.src.Proyectil.Proyectil;
import proyecto2.src.TDANave.Enemigo;
import proyecto2.src.TDANave.Jugador;
import proyecto2.src.TDANave.Nave;

public class MenteProyectiles extends MenteGeneral {
	protected Proyectil[] proyectilesAliados;
	protected Proyectil[] proyectilesEnemigos;
	int cantAliados,cantEnemigos;
	
	public MenteProyectiles()
	{
		proyectilesAliados=new Proyectil[400];
		proyectilesEnemigos=new Proyectil[400];
		cantAliados=0;
		cantEnemigos=0;
	}
	public Proyectil[] getProyectilesAliados()
	{
		return proyectilesAliados;
	}
	public Proyectil[] getProyectilesEnemigos()
	{
		return proyectilesEnemigos;
	}
	public void setProyectilesAliados(Proyectil[] proy,int cant)
	{
	proyectilesAliados=proy;
	cantAliados=cant;
	}
	public void agregarProyectilesAliados(Proyectil[] aAgregar)
	{
		for(int i=0;i<aAgregar.length;i++)
		{
			proyectilesAliados[cant]=aAgregar[i];
			cantAliados++;
		}
		
	}
	
	public void chequearColisiones() {
		// debe verificar si hay colision con alguna nave enemiga
		// y tambien debe verificar si hay colision con otro proyectil distinto
		Jugador player= (Jugador) juego.getMenteJugador().getNave();
		Stack<Integer> ProyAliadosElim= new LinkedStack<Integer>();
		Stack<Integer> proyEnemigoElim=new LinkedStack<Integer>();
		Stack<Integer> navesElim= new LinkedStack<Integer>();
		int cantAtaquesJugador=0;
		Enemigo[] naves = juego.getMenteFlotaEnemiga().getNave();
		//debe fijarse que para cada misil aliado se choque con un misil enemigo
		// y cada misil aliado choque con un enemigo
		for(int i=0;i<proyectilesAliados.length ;i++)
		{
			for(int j=0;j<naves.length ; j++)
			{
				if(proyectilesAliados[i].hayColision(naves[j]))
				{
					ProyAliadosElim.push(i);
					navesElim.push(j);
				}
			}
		}
		while(!ProyAliadosElim.isEmpty())
		{
			int pos=ProyAliadosElim.pop();
			if(pos==cantAliados-1)
				proyectilesAliados[pos]=null;
			else
				proyectilesAliados[pos]=proyectilesAliados[cantAliados-1];
			cantAliados--;
		}
		while(!navesElim.isEmpty())
		{
			int pos=navesElim.pop();
			naves[pos].esGolpeado();
		}
		//debe fijarse que cada misil enemigo choque con el jugador
		for(int i=0; i<proyectilesEnemigos.length;i++)
		{
			if(proyectilesEnemigos[i].hayColision(juego.getMenteJugador().getNave()))
			{
				proyEnemigoElim.push(i);
				cantAtaquesJugador++;
			}
		}
		
		
		
		juego.repaint();
	
	}
	
}
