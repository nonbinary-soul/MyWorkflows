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
 *   <li>{@link proyectomm.Servicio#getTabla_accedida_por_servicio <em>Tabla accedida por servicio</em>}</li>
 * </ul>
 *
 * @see proyectomm.ProyectommPackage#getServicio()
 * @model annotation="gmf.node label='nombre' figure='svg' svg.uri='platform:/plugin/proyecto/icons/service.svg' label.icon='false' label.placement='external'"
 * @generated
 */
public interface Servicio extends Intermedia {
	/**
	 * Returns the value of the '<em><b>Tabla accedida por servicio</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tabla accedida por servicio</em>' reference.
	 * @see #setTabla_accedida_por_servicio(Tabla)
	 * @see proyectomm.ProyectommPackage#getServicio_Tabla_accedida_por_servicio()
	 * @model required="true"
	 *        annotation="gmf.link color='0,0,0' label='Acceso a la tabla...' target.decoration='filledclosedarrow' style='dash' width='2'"
	 * @generated
	 */
	Tabla getTabla_accedida_por_servicio();

	/**
	 * Sets the value of the '{@link proyectomm.Servicio#getTabla_accedida_por_servicio <em>Tabla accedida por servicio</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tabla accedida por servicio</em>' reference.
	 * @see #getTabla_accedida_por_servicio()
	 * @generated
	 */
	void setTabla_accedida_por_servicio(Tabla value);

} // Servicio
