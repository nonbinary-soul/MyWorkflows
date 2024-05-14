/**
 */
package proyectomm;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Proceso De Negocio</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link proyectomm.ProcesoDeNegocio#getBases_de_datos <em>Bases de datos</em>}</li>
 *   <li>{@link proyectomm.ProcesoDeNegocio#getActores <em>Actores</em>}</li>
 *   <li>{@link proyectomm.ProcesoDeNegocio#getNombre <em>Nombre</em>}</li>
 * </ul>
 *
 * @see proyectomm.ProyectommPackage#getProcesoDeNegocio()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='R02_unaTareaFinal'"
 *        annotation="gmf.diagram"
 * @generated
 */
public interface ProcesoDeNegocio extends EObject {
	/**
	 * Returns the value of the '<em><b>Bases de datos</b></em>' containment reference list.
	 * The list contents are of type {@link proyectomm.BaseDeDatos}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bases de datos</em>' containment reference list.
	 * @see proyectomm.ProyectommPackage#getProcesoDeNegocio_Bases_de_datos()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<BaseDeDatos> getBases_de_datos();

	/**
	 * Returns the value of the '<em><b>Actores</b></em>' containment reference list.
	 * The list contents are of type {@link proyectomm.Actor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actores</em>' containment reference list.
	 * @see proyectomm.ProyectommPackage#getProcesoDeNegocio_Actores()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Actor> getActores();

	/**
	 * Returns the value of the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre</em>' attribute.
	 * @see #setNombre(String)
	 * @see proyectomm.ProyectommPackage#getProcesoDeNegocio_Nombre()
	 * @model required="true"
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link proyectomm.ProcesoDeNegocio#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Inicio.allInstances()-&gt;size() = 1'"
	 * @generated
	 */
	boolean R01_unaTareaInicial(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Fin.allInstances()-&gt;size() = 1'"
	 * @generated
	 */
	boolean R02_unaTareaFinal(DiagnosticChain diagnostics, Map<Object, Object> context);

} // ProcesoDeNegocio
