/**
 */
package proyectomm;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Primary Key</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see proyectomm.ProyectommPackage#getPrimaryKey()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='P10_tipoPKPermitido'"
 * @generated
 */
public interface PrimaryKey extends Atributo {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.tipo &lt;&gt; EAtributo::BOOLEAN and self.tipo &lt;&gt; EAtributo::LIST'"
	 * @generated
	 */
	boolean P10_tipoPKPermitido(DiagnosticChain diagnostics, Map<Object, Object> context);

} // PrimaryKey
