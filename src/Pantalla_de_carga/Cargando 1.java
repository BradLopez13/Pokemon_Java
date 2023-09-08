package Pantalla_de_carga;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import MenuInicio.FotoFondo;
import MenuInicio.MusicaFondo;
import MenuInicio.PantallaInicio;
import Pantalla_combate.Combate;
import Pantalla_de_Eleccion.Eleccion;

import javax.swing.JProgressBar;
import javax.swing.Timer;

public class Cargando extends JFrame {

	/**
	 * 
	 */
	private JPanel contentPane;
	private static final long serialVersionUID = 1L;
	private Timer t;
	private ActionListener ac;
	int x = 0;
	int y = 0;
	String puntos = " CARGANDO... ";
	static MusicaFondo musica=new MusicaFondo();
	FotoFondo fondo = new FotoFondo("/Imagenes/fondo carga batalla.jpg");

	/**
	 * Create the panel.
	 */
	public Cargando(Combate combate) {		
		PantallaInicio.stop();
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 852, 504);		
		contentPane = new JPanel();
		setContentPane(contentPane);
		playMusic(1);
		contentPane.setLayout(null);
		getContentPane().add(fondo);
		fondo.setBounds(0, 0, 836, 465);
		fondo.setLayout(null);

		
		
		/**
		 * progres bar que marca el tiempo q pasa
		 */
		JProgressBar barra = new JProgressBar();
		barra.setBorderPainted(false);
		barra.setForeground(Color.CYAN);
		barra.setBounds(205, 424, 400, 41);
		barra.setValue(100);
		
		fondo.add(barra);
		
		/**
		 * letras cargando
		 */
		JLabel carga = new JLabel("");
		carga.setBackground(Color.YELLOW);
		carga.setForeground(Color.WHITE);
		carga.setBounds(353, 383, 200, 40);
		fondo.add(carga);
		
		/**
		 * le das el movimiento a la barra y a las letras
		 */
		ac = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
			
				x = x + 1;
				y = y + 1;
				
				barra.setValue(x);
				carga.setText(carga.getText()+puntos.charAt(y));
				if(y == puntos.length()-1) {
					carga.setText("");
					y = 0;
				}
				if(barra.getValue()== 100) {
					t.stop();
					try {
						combate.setVisible(true);
						combate.setResizable(false);
						stop();
						combate.playMusic(2);
						dispose();
					} catch (Exception e1) {
						e1.printStackTrace();
					}
						
				}
			}

			
		};
		t = new Timer(100,ac);
		t.start();
	}	
	
	/**
	 * metodos musica
	 * @param i
	 */
	public static void playMusic(int i) {
		musica.setFile(i);
		musica.play();
		musica.loop();
		}
		public static void stop() {
		musica.stop();
		}
		public static void playSound(int i) {
		musica.setFile(i);
		musica.play();
		}
	}
