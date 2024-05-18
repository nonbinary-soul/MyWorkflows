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
 *   <li>{@link proyectomm.Servicio#getTabla_entrada_servicio <em>Tabla entrada servicio</em>}</li>
 *   <li>{@link proyectomm.Servicio#getTabla_salida_servicio <em>Tabla salida servicio</em>}</li>
 * </ul>
 *
 * @see proyectomm.ProyectommPackage#getServicio()
 * @model annotation="gmf.node label='nombre' figure='svg' svg.uri='platform:/plugin/proyecto/icons/service.svg' label.icon='false' label.placement='external'"
 * @generated
 */
public interface Servicio extends Intermedia {
	/**
	 * Returns the value of the '<em><b>Tabla entrada servicio</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tabla entrada servicio</em>' reference.
	 * @see #setTabla_entrada_servicio(Tabla)
	 * @see proyectomm.ProyectommPackage#getServicio_Tabla_entrada_servicio()
	 * @model required="true"
	 *        annotation="gmf.link color='0,0,0' label='Acceso a la tabla de entrada...' target.decoration='filledclosedarrow' style='dash' width='2'"
	 * @generated
	 */
	Tabla getTabla_entrada_servicio();

	/**
	 * Sets the value of the '{@link proyectomm.Servicio#getTabla_entrada_servicio <em>Tabla entrada servicio</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tabla entrada servicio</em>' reference.
	 * @see #getTabla_entrada_servicio()
	 * @generated
	 */
	void setTabla_entrada_servicio(Tabla value);

	/**
	 * Returns the value of the '<em><b>Tabla salida servicio</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tabla salida servicio</em>' reference.
	 * @see #setTabla_salida_servicio(Tabla)
	 * @see proyectomm.ProyectommPackage#getServicio_Tabla_salida_servicio()
	 * @model annotation="gmf.link color='153,153,0' label='Acceso a la tabla de salida...' target.decoration='filledclosedarrow' style='dash' width='2'"
	 * @generated
	 */
	Tabla getTabla_salida_servicio();

	/**
	 * Sets the value of the '{@link proyectomm.Servicio#getTabla_salida_servicio <em>Tabla salida servicio</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tabla salida servicio</em>' reference.
	 * @see #getTabla_salida_servicio()
	 * @generated
	 */
	void setTabla_salida_servicio(Tabla value);

} // Servicio
