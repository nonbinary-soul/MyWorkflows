/**
 */
package proyectomm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lectura</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link proyectomm.Lectura#getDatos_a_leer <em>Datos aleer</em>}</li>
 * </ul>
 *
 * @see proyectomm.ProyectommPackage#getLectura()
 * @model
 * @generated
 */
public interface Lectura extends BD {
	/**
	 * Returns the value of the '<em><b>Datos aleer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datos aleer</em>' reference.
	 * @see #setDatos_a_leer(Tabla)
	 * @see proyectomm.ProyectommPackage#getLectura_Datos_a_leer()
	 * @model required="true" transient="true" volatile="true" derived="true"
	 * @generated
	 */
	Tabla getDatos_a_leer();

	/**
	 * Sets the value of the '{@link proyectomm.Lectura#getDatos_a_leer <em>Datos aleer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datos aleer</em>' reference.
	 * @see #getDatos_a_leer()
	 * @generated
	 */
	void setDatos_a_leer(Tabla value);

} // Lectura
