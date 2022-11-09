import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.Toolkit;
import java.util.*;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;


public class Ventana {

	private JFrame frmCapturaDeRegistros;
	private JTextField textNombre;
	private JTextField textApellido;
	private JTextField textEdad;
	private JTextField textTelefono;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana window = new Ventana();
					window.frmCapturaDeRegistros.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Ventana() {
		initialize();
	}
	
	ArrayList <String> nombres = new ArrayList <String>();
	ArrayList <String> apellidos = new ArrayList <String>();
	ArrayList <Integer> edades = new ArrayList <Integer>();
	ArrayList <Long> telefonos = new ArrayList <Long>();

	private void initialize() {
		JButton btnRegistro = new JButton("Registro");
		btnRegistro.setEnabled(false);

		frmCapturaDeRegistros = new JFrame();
		frmCapturaDeRegistros.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\julia\\OneDrive\\Imágenes\\bob.jpg"));
		frmCapturaDeRegistros.setTitle("CAPTURA DE REGISTROS");
		frmCapturaDeRegistros.getContentPane().setBackground(new Color(153, 204, 102));
		frmCapturaDeRegistros.setForeground(Color.ORANGE);
		frmCapturaDeRegistros.getContentPane().setForeground(Color.BLACK);
		frmCapturaDeRegistros.setBounds(100, 100, 1000, 500);
		frmCapturaDeRegistros.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCapturaDeRegistros.getContentPane().setLayout(null);
		
		JTextArea txtrAsd = new JTextArea();
		txtrAsd.setBackground(Color.LIGHT_GRAY);
		txtrAsd.setFont(new Font("Perpetua Titling MT", Font.BOLD | Font.ITALIC, 15));
		txtrAsd.setBounds(299, 113, 651, 280);
		txtrAsd.setEditable(false);
		frmCapturaDeRegistros.getContentPane().add(txtrAsd);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setFont(new Font("Tahoma", Font.ITALIC, 20));
		lblNombre.setBounds(60, 125, 94, 20);
		frmCapturaDeRegistros.getContentPane().add(lblNombre);
		
		textNombre = new JTextField();
		textNombre.addKeyListener(new KeyAdapter() {
			public void habilitarBoton() {
				if(!textNombre.getText().isEmpty() && !textApellido.getText().isEmpty() && !textEdad.getText().isEmpty() && !textTelefono.getText().isEmpty()) {
					btnRegistro.setEnabled(true);					
				}
				else {
					btnRegistro.setEnabled(false);
				}
				
			}
			public void keyReleased(KeyEvent e) {
				habilitarBoton();
			}
		});
		textNombre.setBounds(161, 123, 86, 25);
		frmCapturaDeRegistros.getContentPane().add(textNombre);
		textNombre.setColumns(10);
		
		JLabel lblApellido = new JLabel("Apellido");
		lblApellido.setFont(new Font("Tahoma", Font.ITALIC, 20));
		lblApellido.setBounds(60, 180, 94, 25);
		frmCapturaDeRegistros.getContentPane().add(lblApellido);
		
		textApellido = new JTextField();
		textApellido.addKeyListener(new KeyAdapter() {
			public void habilitarBoton() {
				if(!textNombre.getText().isEmpty() && !textApellido.getText().isEmpty() && !textEdad.getText().isEmpty() && !textTelefono.getText().isEmpty()) {
					btnRegistro.setEnabled(true);					
				}
				else {
					btnRegistro.setEnabled(false);
				}
				
			}
			public void keyReleased(KeyEvent e) {
				habilitarBoton();
			}
		});
		textApellido.setBounds(161, 179, 86, 25);
		frmCapturaDeRegistros.getContentPane().add(textApellido);
		textApellido.setColumns(10);
		
		JLabel lblEdad = new JLabel("Edad");
		lblEdad.setFont(new Font("Tahoma", Font.ITALIC, 20));
		lblEdad.setBounds(60, 235, 71, 34);
		frmCapturaDeRegistros.getContentPane().add(lblEdad);
		
		textEdad = new JTextField();
		textEdad.addKeyListener(new KeyAdapter() {
			public void habilitarBoton() {
				if(!textNombre.getText().isEmpty() && !textApellido.getText().isEmpty() && !textEdad.getText().isEmpty() && !textTelefono.getText().isEmpty()) {
					btnRegistro.setEnabled(true);					
				}
				else {
					btnRegistro.setEnabled(false);
				}
				
			}
			public void keyReleased(KeyEvent e) {
				habilitarBoton();
			}
		});
		textEdad.setBounds(161, 239, 86, 25);
		frmCapturaDeRegistros.getContentPane().add(textEdad);
		textEdad.setColumns(10);
		
		JLabel lblTelefono = new JLabel("Telefono");
		lblTelefono.setFont(new Font("Tahoma", Font.ITALIC, 20));
		lblTelefono.setBounds(60, 288, 94, 44);
		frmCapturaDeRegistros.getContentPane().add(lblTelefono);
		
		textTelefono = new JTextField();
		textTelefono.addKeyListener(new KeyAdapter() {
			public void habilitarBoton() {
				if(!textNombre.getText().isEmpty() && !textApellido.getText().isEmpty() && !textEdad.getText().isEmpty() && !textTelefono.getText().isEmpty()) {
					btnRegistro.setEnabled(true);					
				}
				else {
					btnRegistro.setEnabled(false);
				}
				
			}
			public void keyReleased(KeyEvent e) {
				habilitarBoton();
			}
		});
		textTelefono.setBounds(161, 298, 86, 25);
		frmCapturaDeRegistros.getContentPane().add(textTelefono);
		textTelefono.setColumns(10);
		
		btnRegistro.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnRegistro.setForeground(Color.RED);
		btnRegistro.setBounds(60, 359, 187, 34);
		
		btnRegistro.addActionListener(new ActionListener() {
			public boolean isNumeric(String cadena) {
				
				boolean resultado;
				
				try {
					Integer.parseInt(cadena);
					resultado = true;
				} catch (NumberFormatException excepcion) {
					resultado = false;
				}
				
				return resultado;
			}
			
			public void actionPerformed(ActionEvent e) {
				
				try {
					int edad = Integer.parseInt(textEdad.getText());	
					String nombre = textNombre.getText();
					String apellido = textApellido.getText();
					long telefono = Long.parseLong(textTelefono.getText());
			
					
					if (edad >= 18 && isNumeric(nombre) != true && isNumeric(apellido) != true){
						txtrAsd.setText(txtrAsd.getText() + " \n   Hola " + textNombre.getText() + " " + textApellido.getText() + " te has registrado exitosamente \n"
								+ "   --> Edad: " + edad + " || Telefono: " + telefono + "\n\n");
						
						nombres.add(nombre);
						apellidos.add(apellido);
						edades.add(edad);
						telefonos.add(telefono);
						
						
						JOptionPane.showMessageDialog(frmCapturaDeRegistros, "Registro Exitoso", "OK", 1);	
						textNombre.setText("");
						textApellido.setText("");
						textEdad.setText("");
						textTelefono.setText("");
						btnRegistro.setEnabled(false);
						
					}
					
					else if (isNumeric(nombre) == true && isNumeric(apellido) == true){
						JOptionPane.showMessageDialog(frmCapturaDeRegistros, "Nombre y apellido debe tener letras", "ERROR", 0);	
						textNombre.setText("");
						textApellido.setText("");
						textEdad.setText("");
						textTelefono.setText("");		
						btnRegistro.setEnabled(false);
					}	
					
					else if (isNumeric(nombre) == true){
						JOptionPane.showMessageDialog(frmCapturaDeRegistros, "Nombre debe tener letras", "ERROR", 0);	
						textNombre.setText("");
						textApellido.setText("");
						textEdad.setText("");
						textTelefono.setText("");
						btnRegistro.setEnabled(false);
					}	
					
					else if (isNumeric(apellido) == true){
						JOptionPane.showMessageDialog(frmCapturaDeRegistros, "Apellido debe tener letras", "ERROR", 0);	
						textNombre.setText("");
						textApellido.setText("");
						textEdad.setText("");
						textTelefono.setText("");
						btnRegistro.setEnabled(false);
					}	
					else {
						JOptionPane.showMessageDialog(frmCapturaDeRegistros, "No se puede hacer registro\n - Edad no permitida", "ERROR", 0);	
						textNombre.setText("");
						textApellido.setText("");
						textEdad.setText("");
						textTelefono.setText("");
						btnRegistro.setEnabled(false);
					}

				}
				
				
				catch (NumberFormatException a){
					textNombre.setText("");
					textApellido.setText("");
					textEdad.setText("");
					textTelefono.setText("");
					JOptionPane.showMessageDialog(frmCapturaDeRegistros, "Datos Invalidos", "ERROR", 0);	
					btnRegistro.setEnabled(false);
				}
				btnRegistro.setEnabled(false);
				
			}
		});
		frmCapturaDeRegistros.getContentPane().add(btnRegistro);
		
		JLabel lblMouse = new JLabel("Mouse");
		lblMouse.setBounds(45, 421, 202, 14);
		frmCapturaDeRegistros.getContentPane().add(lblMouse);
		
		JLabel lblNewLabel = new JLabel("REGISTRO DE INFORMACIÓN");
		lblNewLabel.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD | Font.ITALIC, 40));
		lblNewLabel.setBounds(299, 26, 576, 44);
		frmCapturaDeRegistros.getContentPane().add(lblNewLabel);
		
		JMenuBar menuBar = new JMenuBar();
		frmCapturaDeRegistros.setJMenuBar(menuBar);
		
		JMenu mnMenuPrincipal = new JMenu("Opciones");
		menuBar.add(mnMenuPrincipal);
		
		JMenuItem mntmOpcion2 = new JMenuItem("Salir");
		mntmOpcion2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		JMenuItem mntmOpcion1 = new JMenuItem("Mostrar Datos");
		mntmOpcion1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mostrarDatos();
			}
		});
		
		JMenuItem mntmOpcion3 = new JMenuItem("Mostrar Datos Individuales");
		mntmOpcion3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mostrarDatosOrden();
			}
		});
		mnMenuPrincipal.add(mntmOpcion3);
		mnMenuPrincipal.add(mntmOpcion1);
		mnMenuPrincipal.add(mntmOpcion2);
		
		frmCapturaDeRegistros.getContentPane().addMouseMotionListener(new MouseMotionAdapter() {
			
			public void mouseMoved(MouseEvent e) {
				lblMouse.setText("Mouse: " + e.getX() + ", " + e.getY());
			}
		});
		

	}	
	
	protected void mostrarDatos() {
		JOptionPane.showMessageDialog(null, "Nombres: " + nombres + "\nApellidos: " + apellidos + "\nEdades: " + edades + "\nTelefonos: " + telefonos);
	}
	
	protected void mostrarDatosOrden() {
		for(int i = 0; i < nombres.size(); i++) {
			JOptionPane.showMessageDialog(null, "INFORMACION PERSONA " + (i+1) + "\nNombre: " + nombres.get(i) + "\nApellido: " + apellidos.get(i) + "\nEdad: " + edades.get(i) + "\nTelefono: " + telefonos.get(i), "INFORMACION", 1);
		}
		JOptionPane.showMessageDialog(null, "No hay mas personas", "FIN", 2);
		
	}
}
