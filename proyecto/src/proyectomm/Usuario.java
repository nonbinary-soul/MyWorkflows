/**
 */
package proyectomm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Usuario</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link proyectomm.Usuario#getTabla_accedida_por_usuario <em>Tabla accedida por usuario</em>}</li>
 * </ul>
 *
 * @see proyectomm.ProyectommPackage#getUsuario()
 * @model annotation="gmf.node label='nombre' figure='svg' svg.uri='platform:/plugin/proyecto/icons/form.svg' label.icon='false' label.placement='external'"
 * @generated
 */
public interface Usuario extends Intermedia {
	/**
	 * Returns the value of the '<em><b>Tabla accedida por usuario</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tabla accedida por usuario</em>' reference.
	 * @see #setTabla_accedida_por_usuario(Tabla)
	 * @see proyectomm.ProyectommPackage#getUsuario_Tabla_accedida_por_usuario()
	 * @model required="true"
	 *        annotation="gmf.link color='0,0,0' label='Acceso a la tabla...' target.decoration='filledclosedarrow' style='dash' width='2'"
	 * @generated
	 */
	Tabla getTabla_accedida_por_usuario();

	/**
	 * Sets the value of the '{@link proyectomm.Usuario#getTabla_accedida_por_usuario <em>Tabla accedida por usuario</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tabla accedida por usuario</em>' reference.
	 * @see #getTabla_accedida_por_usuario()
	 * @generated
	 */
	void setTabla_accedida_por_usuario(Tabla value);

} // Usuario
