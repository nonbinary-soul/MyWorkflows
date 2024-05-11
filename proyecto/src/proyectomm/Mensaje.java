/**
 */
package proyectomm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mensaje</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link proyectomm.Mensaje#getTabla_accedida <em>Tabla accedida</em>}</li>
 * </ul>
 *
 * @see proyectomm.ProyectommPackage#getMensaje()
 * @model abstract="true"
 * @generated
 */
public interface Mensaje extends Intermedia {
	/**
	 * Returns the value of the '<em><b>Tabla accedida</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tabla accedida</em>' reference.
	 * @see #setTabla_accedida(Tabla)
	 * @see proyectomm.ProyectommPackage#getMensaje_Tabla_accedida()
	 * @model required="true"
	 * @generated
	 */
	Tabla getTabla_accedida();

	/**
	 * Sets the value of the '{@link proyectomm.Mensaje#getTabla_accedida <em>Tabla accedida</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tabla accedida</em>' reference.
	 * @see #getTabla_accedida()
	 * @generated
	 */
	void setTabla_accedida(Tabla value);

} // Mensaje
