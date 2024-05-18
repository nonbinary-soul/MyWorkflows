/**
 */
package proyectomm;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Foreign Key</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link proyectomm.ForeignKey#getReferencia_a <em>Referencia a</em>}</li>
 * </ul>
 *
 * @see proyectomm.ProyectommPackage#getForeignKey()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='P07_PKEnOtraTabla'"
 * @generated
 */
public interface ForeignKey extends Atributo {
	/**
	 * Returns the value of the '<em><b>Referencia a</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referencia a</em>' reference.
	 * @see #setReferencia_a(PrimaryKey)
	 * @see proyectomm.ProyectommPackage#getForeignKey_Referencia_a()
	 * @model required="true"
	 *        annotation="gmf.link color='0,0,0' label='Referencia a...' target.decoration='filledclosedarrow' style='dash' width='2'"
	 * @generated
	 */
	PrimaryKey getReferencia_a();

	/**
	 * Sets the value of the '{@link proyectomm.ForeignKey#getReferencia_a <em>Referencia a</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referencia a</em>' reference.
	 * @see #getReferencia_a()
	 * @generated
	 */
	void setReferencia_a(PrimaryKey value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.tipo = self.referencia_a.tipo'"
	 * @generated
	 */
	boolean P06_mismoTipoQuePK(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.oclContainer().oclAsType(Tabla) &lt;&gt; self.referencia_a.oclContainer().oclAsType(Tabla)'"
	 * @generated
	 */
	boolean P07_PKEnOtraTabla(DiagnosticChain diagnostics, Map<Object, Object> context);

} // ForeignKey
