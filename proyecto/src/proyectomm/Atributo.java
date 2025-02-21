/**
 */
package proyectomm;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Atributo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link proyectomm.Atributo#getNombre <em>Nombre</em>}</li>
 *   <li>{@link proyectomm.Atributo#getTipo <em>Tipo</em>}</li>
 *   <li>{@link proyectomm.Atributo#getOpciones <em>Opciones</em>}</li>
 * </ul>
 *
 * @see proyectomm.ProyectommPackage#getAtributo()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='P04_sinEspaciosEnBlanco'"
 *        annotation="gmf.node label='nombre, tipo' figure='rectangle' label.pattern='{0}:{1}'"
 * @generated
 */
public interface Atributo extends EObject {
	/**
	 * Returns the value of the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre</em>' attribute.
	 * @see #setNombre(String)
	 * @see proyectomm.ProyectommPackage#getAtributo_Nombre()
	 * @model required="true"
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link proyectomm.Atributo#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

	/**
	 * Returns the value of the '<em><b>Tipo</b></em>' attribute.
	 * The literals are from the enumeration {@link proyectomm.EAtributo}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tipo</em>' attribute.
	 * @see proyectomm.EAtributo
	 * @see #setTipo(EAtributo)
	 * @see proyectomm.ProyectommPackage#getAtributo_Tipo()
	 * @model required="true"
	 * @generated
	 */
	EAtributo getTipo();

	/**
	 * Sets the value of the '{@link proyectomm.Atributo#getTipo <em>Tipo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tipo</em>' attribute.
	 * @see proyectomm.EAtributo
	 * @see #getTipo()
	 * @generated
	 */
	void setTipo(EAtributo value);

	/**
	 * Returns the value of the '<em><b>Opciones</b></em>' containment reference list.
	 * The list contents are of type {@link proyectomm.Opcion}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Opciones</em>' containment reference list.
	 * @see proyectomm.ProyectommPackage#getAtributo_Opciones()
	 * @model containment="true"
	 *        annotation="gmf.compartment"
	 * @generated
	 */
	EList<Opcion> getOpciones();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='if self.tipo = EAtributo::LIST then self.opciones-&gt;notEmpty() else self.opciones-&gt;isEmpty() endif'"
	 * @generated
	 */
	boolean P01_tieneOpciones(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='not self.nombre-&gt;includes(\' \')'"
	 * @generated
	 */
	boolean P04_sinEspaciosEnBlanco(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Atributo
