/**
 */
package proyectomm;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fin</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see proyectomm.ProyectommPackage#getFin()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='R04_sinSucesor'"
 * @generated
 */
public interface Fin extends Tarea {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='sucesor = null'"
	 * @generated
	 */
	boolean R04_sinSucesor(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Fin
