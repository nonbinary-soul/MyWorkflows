/**
 */
package proyectomm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Servicio</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link proyectomm.Servicio#getTabla_accedida <em>Tabla accedida</em>}</li>
 * </ul>
 *
 * @see proyectomm.ProyectommPackage#getServicio()
 * @model annotation="gmf.node label='nombre' figure='svg' svg.uri='platform:/plugin/proyecto/icons/service.svg' label.icon='false' label.placement='external'"
 * @generated
 */
public interface Servicio extends Intermedia {
	/**
	 * Returns the value of the '<em><b>Tabla accedida</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tabla accedida</em>' reference.
	 * @see #setTabla_accedida(Tabla)
	 * @see proyectomm.ProyectommPackage#getServicio_Tabla_accedida()
	 * @model required="true"
	 * @generated
	 */
	Tabla getTabla_accedida();

	/**
	 * Sets the value of the '{@link proyectomm.Servicio#getTabla_accedida <em>Tabla accedida</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tabla accedida</em>' reference.
	 * @see #getTabla_accedida()
	 * @generated
	 */
	void setTabla_accedida(Tabla value);

} // Servicio
