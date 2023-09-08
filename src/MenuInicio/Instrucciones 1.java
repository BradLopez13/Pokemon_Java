package MenuInicio;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;

import Pantalla_de_Eleccion.Eleccion;

public class Instrucciones extends JFrame {

	private JPanel contentPane;
	FotoFondo fondo=new FotoFondo("/Imagenes/fondoMenu.jpg");


	/**
	 * Create the frame.
	 */
	public Instrucciones() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);
		getContentPane().add(fondo);
		setBounds(100, 100, 852, 504);
		fondo.setBounds(0, 0, 836, 465);
		
		/**
		 * Label Nombre Instrucciones
		 */
		JLabel lblNewLabel = new JLabel("INSTRUCCIONES");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBackground(Color.BLACK);
		lblNewLabel.setForeground(Color.WHITE);
		
		/**
		 * TextPAne INstrucciones
		 */
		JTextPane txtpnEscogaLosPokemones = new JTextPane();
		txtpnEscogaLosPokemones.setEditable(false);
		txtpnEscogaLosPokemones.setForeground(Color.WHITE);
		txtpnEscogaLosPokemones.setBackground(Color.GRAY);
		txtpnEscogaLosPokemones.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtpnEscogaLosPokemones.setText("Escoga el pokemon que quiere utilizar y contra el que quiere batallar, una vez elegidos le apareceran una serie de ataques que iran reduciendo la vida de su oponente hasta que alguno de los participantes se quede sin vida. Mucha suerte entrenador tendra que darlo todo!!!!!!");
		
		/**
		 * Boton jugar lleva directamente a elegir pokemones
		 */
		JButton btn_volver = new JButton("JUGAR");
		btn_volver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Eleccion frame = new Eleccion();
					frame.setVisible(true);
					frame.setResizable(false);
					dispose();
				} catch (Exception e1) {
					e1.printStackTrace();
				}
				
			}
		});
		btn_volver.setFont(new Font("Tahoma", Font.PLAIN, 13));
		GroupLayout gl_fondo = new GroupLayout(fondo);
		gl_fondo.setHorizontalGroup(
			gl_fondo.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_fondo.createSequentialGroup()
					.addGap(342)
					.addGroup(gl_fondo.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_fondo.createSequentialGroup()
							.addComponent(lblNewLabel)
							.addGap(357))
						.addGroup(gl_fondo.createSequentialGroup()
							.addGroup(gl_fondo.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(btn_volver, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(txtpnEscogaLosPokemones, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE))
							.addContainerGap())))
		);
		gl_fondo.setVerticalGroup(
			gl_fondo.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_fondo.createSequentialGroup()
					.addGap(111)
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(txtpnEscogaLosPokemones, GroupLayout.PREFERRED_SIZE, 276, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btn_volver, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
					.addGap(6))
		);
		fondo.setLayout(gl_fondo);
	}

}
