package proyecto2.src.Mentes;

import proyecto2.src.GUI.JuegoJFrame;

public abstract class MenteGeneral extends Thread {
	protected JuegoJFrame juego;
	public abstract void chequearColisiones();
}
