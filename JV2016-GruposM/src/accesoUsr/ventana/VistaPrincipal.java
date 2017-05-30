/** Proyecto: Juego de la vida.
 *  Resuelve todos los aspectos relacionados con la presentación
 *  del GUI del programa. Colabora en el patron MVC
 *  @since: prototipo2.1
 *  @source: VistaPrincipal.java 
 *  @version: 2.2 - 2017.05.24
 *  @author: Jesus
 */
package accesoUsr.consola;


import java.io.Console;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class VistaPrincipal extends JFrame {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	
	private Console consola;
	private int opcionActiva;

	private JMenu mnFicheros;
	private JMenu mnSimulaciones;
	private JMenu mnMundos;
	private JMenu mnUsuarios;
	private JMenu mnSesiones;
	private JMenu mnAyuda;


	/**
	 * Create the frame.
	 */
	public VistaPrincipal() {
		setTitle("JV-2017 MENU");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);

		final String[] opciones = new String[] {"Salir", "Crear Simulación", "Modificar Simulación" 
				, "Eliminar Simulación", "Mostrar Datos Simulaciones", "Mostrar Id Simulaciones"
				, "Ejecutar Simulación Demo", "Crear Mundo", "Modificar Mundo", "Eliminar Mundo"
				, "Mostrar Datos Mundos", "Crear Usuario", "Modificar Usuario", "Eliminar Usuario"
				, "Mostrar Datos Usuario", "Modificar Sesion", "Eliminar Sesion", "Mostrar Datos Sesion"
				, "Mostrar Id Sesiones"
		};

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		// Ficheros
		mnFicheros = new JMenu("Ficheros");
		menuBar.add(mnFicheros);

		JMenuItem mntmSalir = new JMenuItem(opciones[0]);
		mnFicheros.add(mntmSalir);

		// Simulaciones
		mnSimulaciones = new JMenu("Simulaciones");
		menuBar.add(mnSimulaciones);

		JMenuItem mntmCrearSimulacin = new JMenuItem(opciones[1]);
		mnSimulaciones.add(mntmCrearSimulacin);

		JMenuItem mntmModificarSimulacin = new JMenuItem(opciones[2]);
		mnSimulaciones.add(mntmModificarSimulacin);

		JMenuItem mntmEliminarSimulacin = new JMenuItem(opciones[3]);
		mnSimulaciones.add(mntmEliminarSimulacin);

		JMenuItem mntmMostrarDatosSimulaciones = new JMenuItem(opciones[4]);
		mnSimulaciones.add(mntmMostrarDatosSimulaciones);

		JMenuItem mntmMostrarIdSimulaciones = new JMenuItem(opciones[5]);
		mnSimulaciones.add(mntmMostrarIdSimulaciones);

		JMenuItem mntmEjecutarSimulacinDemo = new JMenuItem(opciones[6]);
		mnSimulaciones.add(mntmEjecutarSimulacinDemo);

		// Mundos
		mnMundos = new JMenu("Mundos");
		menuBar.add(mnMundos);

		JMenuItem mntmCrearMundo = new JMenuItem(opciones[7]);
		mnMundos.add(mntmCrearMundo);

		JMenuItem mntmModificarMundo = new JMenuItem(opciones[8]);
		mnMundos.add(mntmModificarMundo);

		JMenuItem mntmEliminarMundo = new JMenuItem(opciones[9]);
		mnMundos.add(mntmEliminarMundo);

		JMenuItem mntmMostrarDatosMundos = new JMenuItem(opciones[10]);
		mnMundos.add(mntmMostrarDatosMundos);

		// Usuarios
		mnUsuarios = new JMenu("Usuarios");
		menuBar.add(mnUsuarios);

		JMenuItem mntmCrearUsuario = new JMenuItem(opciones[11]);
		mnUsuarios.add(mntmCrearUsuario);

		JMenuItem mntmModificarUsuario = new JMenuItem(opciones[12]);
		mnUsuarios.add(mntmModificarUsuario);

		JMenuItem mntmEliminarUsuario = new JMenuItem(opciones[13]);
		mnUsuarios.add(mntmEliminarUsuario);

		JMenuItem mntmMostrarDatosUsuarios = new JMenuItem(opciones[14]);
		mnUsuarios.add(mntmMostrarDatosUsuarios);

		// Sesiones
		mnSesiones = new JMenu("Sesiones");
		menuBar.add(mnSesiones);

		JMenuItem mntmModificarSesin = new JMenuItem(opciones[15]);
		mnSesiones.add(mntmModificarSesin);

		JMenuItem mntmEliminarSesin = new JMenuItem(opciones[16]);
		mnSesiones.add(mntmEliminarSesin);

		JMenuItem mntmMostrarDatosSesiones = new JMenuItem(opciones[17]);
		mnSesiones.add(mntmMostrarDatosSesiones);

		JMenuItem mntmMostrarIdSesiones = new JMenuItem(opciones[18]);
		mnSesiones.add(mntmMostrarIdSesiones);

		// Ayuda
		mnAyuda = new JMenu("Ayuda");
		menuBar.add(mnAyuda);
	}

	public void mostrarMensaje(String mensaje) {
		JOptionPane.showMessageDialog(contentPanel, mensaje);
	}
	
	public void pedirOpcion() {
		if (consola != null) {
			opcionActiva = Integer.parseInt(consola.readLine());
			return;
		}
		// Desde entorno Eclipse la consola falla.
		opcionActiva = new Scanner(System.in).nextInt();
	}

	public int getOpcionActiva() {
		return opcionActiva;
	}
}
