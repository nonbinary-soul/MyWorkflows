/**
 */
package proyectomm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BD</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link proyectomm.BD#getAtributo_seleccionado <em>Atributo seleccionado</em>}</li>
 * </ul>
 *
 * @see proyectomm.ProyectommPackage#getBD()
 * @model abstract="true"
 * @generated
 */
public interface BD extends Intermedia {
	/**
	 * Returns the value of the '<em><b>Atributo seleccionado</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Atributo seleccionado</em>' reference.
	 * @see #setAtributo_seleccionado(Atributo)
	 * @see proyectomm.ProyectommPackage#getBD_Atributo_seleccionado()
	 * @model required="true"
	 * @generated
	 */
	Atributo getAtributo_seleccionado();

	/**
	 * Sets the value of the '{@link proyectomm.BD#getAtributo_seleccionado <em>Atributo seleccionado</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Atributo seleccionado</em>' reference.
	 * @see #getAtributo_seleccionado()
	 * @generated
	 */
	void setAtributo_seleccionado(Atributo value);

} // BD
