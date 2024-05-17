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
 *   <li>{@link proyectomm.Mensaje#getTabla_accedida_por_mensaje <em>Tabla accedida por mensaje</em>}</li>
 * </ul>
 *
 * @see proyectomm.ProyectommPackage#getMensaje()
 * @model abstract="true"
 * @generated
 */
public interface Mensaje extends Intermedia {
	/**
	 * Returns the value of the '<em><b>Tabla accedida por mensaje</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tabla accedida por mensaje</em>' reference.
	 * @see #setTabla_accedida_por_mensaje(Tabla)
	 * @see proyectomm.ProyectommPackage#getMensaje_Tabla_accedida_por_mensaje()
	 * @model required="true"
	 *        annotation="gmf.link color='0,0,0' label='Acceso a la tabla...' target.decoration='filledclosedarrow' style='dash' width='2'"
	 * @generated
	 */
	Tabla getTabla_accedida_por_mensaje();

	/**
	 * Sets the value of the '{@link proyectomm.Mensaje#getTabla_accedida_por_mensaje <em>Tabla accedida por mensaje</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tabla accedida por mensaje</em>' reference.
	 * @see #getTabla_accedida_por_mensaje()
	 * @generated
	 */
	void setTabla_accedida_por_mensaje(Tabla value);

} // Mensaje
