/**
 */
package proyectomm;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Borrado</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see proyectomm.ProyectommPackage#getBorrado()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='P04_borradoConClavePrimaria'"
 * @generated
 */
public interface Borrado extends BD {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t        self.atributo_seleccionado.oclIsTypeOf(PrimaryKey)'"
	 * @generated
	 */
	boolean P04_borradoConClavePrimaria(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Borrado
