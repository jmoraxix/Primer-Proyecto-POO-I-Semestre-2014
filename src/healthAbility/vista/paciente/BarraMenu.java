/**
 * Jose David Mora Loria
 * 2014004856
 * Diego Delgado Cerdas
 * 2013099268
 * Mar 24, 2014
 */
package healthAbility.vista.paciente;


import healthAbility.HealthAbility;
import healthAbility.InformacionProyecto;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 * @author Diego 12/3/14
 *
 */
@SuppressWarnings("serial")
public class BarraMenu extends JMenuBar {

	private JMenu menu1, mUsuarios, mUsuarioPaciente, mCitas, mBusquedas; 	
	private JMenuItem mSalir, mCrearPaciente, mEliminarPaciente, mActualizarPaciente, mCitasAgregar, mCitasVer, 
	mBuscarDoctor, mBuscarPaciente, mBuscarClinicas;

	public final static Font letraTitulo1 = new Font("Georgia", Font.BOLD, 38);
	public final static Font letraTexto1 = new Font("Georgia", Font.PLAIN, 28);
	public final static Font letraTexto2 = new Font("Georgia", Font.PLAIN, 22);
	private JFrame frame;
	public static final Dimension tamTotal = HealthAbility.getTamPantalla();

	public BarraMenu(final JFrame frame){
		this.frame = frame;
		menu1 = new JMenu("Archivo                         ");
		menu1.setMnemonic('A');
		this.add(menu1);

		mSalir = new JMenuItem("Salir"); 	
		mSalir.setMnemonic('S');
		mSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0); 
			}
		});

		JMenuItem mntmAcercaDeNosotros = new JMenuItem("Acerca de...");
		mntmAcercaDeNosotros.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new InformacionProyecto().setVisible(true);
			}
		});
		menu1.add(mntmAcercaDeNosotros);
		menu1.add(mSalir);   

		mUsuarios = new JMenu("Usuarios                         ");
		mUsuarios.setMnemonic('U');
		this.add(mUsuarios);

		///////////////CREAR ELIMINAR MODIFICAR PACIENTE//////////////////
		mUsuarioPaciente = new JMenu("Usuario Paciente");
		mUsuarioPaciente.setMnemonic('P');

		mCrearPaciente = new JMenuItem("Crear Paciente                         ");
		mCrearPaciente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				AgregarPaciente agregarPaciente = new AgregarPaciente();
				agregarPaciente.setVisible(true);
				frame.setVisible(false);
			}
		});
		mUsuarioPaciente.add(mCrearPaciente);
		mCrearPaciente.setMnemonic('C');
		

		mActualizarPaciente = new JMenuItem("Actualizar Paciente");
		mActualizarPaciente.setMnemonic('A');
		mActualizarPaciente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ActualizarPaciente actualizarPaciente = new ActualizarPaciente();
				actualizarPaciente.setVisible(true);
				frame.setVisible(false);
			}
		});
		mUsuarioPaciente.add(mActualizarPaciente);
		mUsuarios.add(mUsuarioPaciente);

		////////JMENUBAR CITAS///////////////
		mCitas = new JMenu("Citas                         ");
		mCitas.setMnemonic('C');
		this.add(mCitas);

		mCitasAgregar = new JMenuItem("Agregar cita");
		mCitasAgregar.setMnemonic('A');
		mCitasAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		mCitasVer = new JMenuItem("Ver citas");
		mCitasVer.setMnemonic('V');
		mCitasVer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		
		mCitas.add(mCitasAgregar);
		mCitas.add(mCitasVer);
		
		mBusquedas = new JMenu("B�squedas                         ");
		mBusquedas.setMnemonic('B');
		this.add(mBusquedas);
		
		
		mBuscarDoctor = new JMenuItem("Buscar Doctor");
		mBuscarDoctor.setMnemonic('D');
		mBusquedas.add(mBuscarDoctor);
		mBuscarDoctor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		

		mBuscarPaciente = new JMenuItem("Buscar Paciente");
		mBuscarPaciente.setMnemonic('P');
		mBusquedas.add(mBuscarPaciente);
		mBuscarPaciente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		
		mBuscarClinicas = new JMenuItem("Buscar Cl�nica");
		mBuscarClinicas.setMnemonic('C');
		mBusquedas.add(mBuscarClinicas);
		mBuscarClinicas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		
		
	}
}
