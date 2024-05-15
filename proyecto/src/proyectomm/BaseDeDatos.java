/**
 */
package proyectomm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Base De Datos</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link proyectomm.BaseDeDatos#getNombre <em>Nombre</em>}</li>
 *   <li>{@link proyectomm.BaseDeDatos#getTablas <em>Tablas</em>}</li>
 * </ul>
 *
 * @see proyectomm.ProyectommPackage#getBaseDeDatos()
 * @model annotation="gmf.node label='nombre' figure='svg' svg.uri='platform:/plugin/proyecto/icons/database.svg' label.icon='false' label.placement='external'"
 * @generated
 */
public interface BaseDeDatos extends EObject {
	/**
	 * Returns the value of the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre</em>' attribute.
	 * @see #setNombre(String)
	 * @see proyectomm.ProyectommPackage#getBaseDeDatos_Nombre()
	 * @model required="true"
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link proyectomm.BaseDeDatos#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

	/**
	 * Returns the value of the '<em><b>Tablas</b></em>' containment reference list.
	 * The list contents are of type {@link proyectomm.Tabla}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tablas</em>' containment reference list.
	 * @see proyectomm.ProyectommPackage#getBaseDeDatos_Tablas()
	 * @model containment="true" required="true"
	 *        annotation="gmf.compartment"
	 * @generated
	 */
	EList<Tabla> getTablas();

} // BaseDeDatos
