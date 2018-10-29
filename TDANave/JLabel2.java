package proyecto2.src.TDANave;

import java.awt.Rectangle;

import javax.swing.JLabel;

public abstract class JLabel2 extends JLabel {

	//velocidad y direccion con la que se despalza por la pantalla
	protected int velocidad;
	protected int dx;
	protected int dy;

	public JLabel2(int dx, int dy,int vel){
		velocidad=vel;
		this.dx=dx;
		this.dy=dy;
	}


	public int getVelocidad(){
		return velocidad;
	}

	public int getDX(){
		return dx;
	}

	public int getDY(){
		return dy;
	}
	
	public void setDX(int dx){
		this.dx=dx;
	}
	
	public void setDY(int dy){
		this.dy=dy;
		
	}
	
	public void setDXY(int dx, int dy){
		this.dx=dx;
		this.dy=dy;
	}
	
	public Rectangle getRectangle(){
		Rectangle rec = new Rectangle(getX(),getY(),this.getWidth(),this.getHeight());
		return rec;
	}
	
	public boolean hayColision(JLabel2 enemy){
		boolean colisiono=false;
		if(this.getRectangle().intersects(enemy.getRectangle()))
			colisiono=true;
		return colisiono;
	}
	
	public void mover(){
		this.setLocation(getX()+dx,getY()+dy);
	}
	
}
