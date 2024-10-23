import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GraphicsConfiguration;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class VentanaInicioSesion extends JFrame{
	
	//Declaracion de los componentes botón
	private JButton btnInicioSesion, btnCierreSesion;
	//Declaracion de los componentes etiqueta
	private JLabel lblTitulo, lblNombreUsuario, lblContraseniaUsuario;
	//Declaracion de los componente cuadro de texto
	private JTextField txtNombreUsuario;
	private JPasswordField txtContraseniaUsuario;
	//Declaracion de los paneles
	private JPanel pCentro, pNorte, pEste, pOeste, pSur;
	//Declaramos los JFrames
	private JFrame vActual;
	
	public VentanaInicioSesion() {
		super();
		
		vActual = this;
		
		//Establecemos las propiedades de la ventana
		setBounds(300, 200, 600, 400);
		setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		
		//Cambiar el título de la ventana
		setTitle("DEUSTO GYM");
		//Cambiar el icono de la ventana (Esquina superior izquierda)
		ImageIcon imagen = new ImageIcon("img/icono.png");
		setIconImage(imagen.getImage());
		
		//Instanciamos los paneles
		pCentro = new JPanel();
		//Modificamos el Layout del panel centro
		pCentro.setLayout(new GridLayout(2, 2)); //Formato de matriz de 2x2
		pNorte = new JPanel();
		pSur = new JPanel();
		pEste = new JPanel();
		pOeste = new JPanel();
		
		//Añadimos los paneles al panel principal de la ventana
		getContentPane().add(pNorte, BorderLayout.NORTH);
		getContentPane().add(pEste, BorderLayout.EAST);
		getContentPane().add(pOeste, BorderLayout.WEST);
		getContentPane().add(pSur, BorderLayout.SOUTH);
		getContentPane().add(pCentro, BorderLayout.CENTER);
		
		//Instanciamos los componentes botón
		btnInicioSesion = new JButton("INICIO SESIÓN");
		btnCierreSesion = new JButton("CIERRE SESIÓN");
		//Cambiamos el tipo de letra en los botones
		btnInicioSesion.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 18));
		btnCierreSesion.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 18));
		
		lblTitulo = new JLabel("ONGI ETORRI!!");
		lblNombreUsuario = new JLabel("Introduce tu nombre de usuario: ");
		lblContraseniaUsuario = new JLabel("Introduce tu contraseña: ");
		
		txtNombreUsuario = new JTextField(20);
		txtContraseniaUsuario = new JPasswordField(20);
		
		//Añadimos el botón al panel principal de la ventana
		pSur.add(btnInicioSesion);
		pSur.add(btnCierreSesion);
		
		pNorte.add(lblTitulo);
		//Como pCentro es un GridLayout, hay que añadir los componentes en el
		//orden en el que queremos que aparezcan (De izda a dcha y de arriba a abajo)
		pCentro.add(lblNombreUsuario);
		pCentro.add(txtNombreUsuario);
		pCentro.add(lblContraseniaUsuario);
		pCentro.add(txtContraseniaUsuario);
		
		//Añadimos los listeners
		btnCierreSesion.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// Aquí escribimos el código que queremos que se ejecute cuando clickemos sobre el botón
				System.exit(0); //Cerrar la aplicación
			}
		});
		
		btnInicioSesion.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		setVisible(true); //Siempre la última sentencia
	}
	
}
