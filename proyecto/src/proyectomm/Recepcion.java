/**
 */
package proyectomm;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Recepcion</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see proyectomm.ProyectommPackage#getRecepcion()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='P06_mismaTablaQueEnvio'"
 *        annotation="gmf.node label='nombre' figure='svg' svg.uri='platform:/plugin/proyecto/icons/received-message.svg' label.icon='false' label.placement='external'"
 * @generated
 */
public interface Recepcion extends Mensaje {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='predecesor.oclIsTypeOf(Envio)'"
	 * @generated
	 */
	boolean R07_envioAsociado(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.tabla_accedida = self.predecesor.oclAsType(Envio).tabla_accedida'"
	 * @generated
	 */
	boolean P06_mismaTablaQueEnvio(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Recepcion
