package proyecto2.src.GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JToolBar;
import javax.swing.JButton;
import javax.swing.SwingConstants;

import java.awt.Color;

import javax.swing.JLabel;

import proyecto2.src.Mentes.MenteFlotaEnemiga;
import proyecto2.src.Mentes.MenteJugador;
import proyecto2.src.TDANave.*;
import proyecto2.src.TDANivel.Nivel;
import proyecto2.src.TDAPowerUp.PowerUp;

import java.awt.Font;

public class JuegoJFrame extends JFrame {

	//cosas de la interfaz grafica
	private JPanel contentPane;
	private JPanel panelNivel;
	private JToolBar toolBarTop;
	private JToolBar toolBarBot;
	private JButton btnExit;
	
	//cosas de la logica del juego..
	protected Jugador player;
	protected Nivel nivelActual;
	protected PowerUp[] powerUps;
	protected MenteJugador mentePlayer;
	protected MenteFlotaEnemiga flotaEnemiga;
	
//	protected MenteProyectiles proyectiles;
	
		
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JuegoJFrame frame = new JuegoJFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public JuegoJFrame() {
//		player = new NaveResistente("Jugador1", null);
//		Posicion pos = new Posicion(player);
//		player.setPosicionIni(pos,x,y);
//		
		
		initGUI();
		initGame();

	}

	public void initGUI(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 565, 380);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));

		panelNivel = new JPanel();
		panelNivel.setBackground(new Color(175, 238, 238));
		contentPane.add(panelNivel, BorderLayout.CENTER);

		toolBarTop = new JToolBar();
		toolBarTop.setBackground(Color.GREEN);
		contentPane.add(toolBarTop, BorderLayout.NORTH);

		btnExit = new JButton("Exit");
		toolBarTop.add(btnExit);

		toolBarBot = new JToolBar();
		toolBarBot.setBackground(Color.GREEN);
		contentPane.add(toolBarBot, BorderLayout.SOUTH);

		JLabel label = new JLabel("9999");
		label.setForeground(Color.RED);
		label.setFont(new Font("Snap ITC", Font.PLAIN, 16));
		toolBarBot.add(label);
	}


	public void initGame(){
		//inicializa el juego y las imagenes del mismo..
		
		
		
	}
}