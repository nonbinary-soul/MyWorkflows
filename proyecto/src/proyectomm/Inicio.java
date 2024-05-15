/**
 */
package proyectomm;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Inicio</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see proyectomm.ProyectommPackage#getInicio()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='R03_sinPredecesor'"
 *        annotation="gmf.node label='nombre' figure='svg' svg.uri='platform:/plugin/proyecto/icons/start.svg' label.icon='false' label.placement='external'"
 * @generated
 */
public interface Inicio extends Tarea {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='predecesor = null'"
	 * @generated
	 */
	boolean R03_sinPredecesor(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Inicio
