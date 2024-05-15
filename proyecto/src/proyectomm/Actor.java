/**
 */
package proyectomm;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Actor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link proyectomm.Actor#getNombre <em>Nombre</em>}</li>
 *   <li>{@link proyectomm.Actor#getTareas <em>Tareas</em>}</li>
 *   <li>{@link proyectomm.Actor#getNum_tareas <em>Num tareas</em>}</li>
 * </ul>
 *
 * @see proyectomm.ProyectommPackage#getActor()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='R05_minTareaIntermedia'"
 *        annotation="gmf.node label='nombre' figure='svg' svg.uri='platform:/plugin/proyecto/icons/actor.svg' label.icon='false' label.placement='external'"
 * @generated
 */
public interface Actor extends EObject {
	/**
	 * Returns the value of the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre</em>' attribute.
	 * @see #setNombre(String)
	 * @see proyectomm.ProyectommPackage#getActor_Nombre()
	 * @model required="true"
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link proyectomm.Actor#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

	/**
	 * Returns the value of the '<em><b>Tareas</b></em>' containment reference list.
	 * The list contents are of type {@link proyectomm.Tarea}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tareas</em>' containment reference list.
	 * @see proyectomm.ProyectommPackage#getActor_Tareas()
	 * @model containment="true"
	 *        annotation="gmf.compartment"
	 * @generated
	 */
	EList<Tarea> getTareas();

	/**
	 * Returns the value of the '<em><b>Num tareas</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Num tareas</em>' attribute.
	 * @see #setNum_tareas(int)
	 * @see proyectomm.ProyectommPackage#getActor_Num_tareas()
	 * @model required="true" transient="true" volatile="true" derived="true"
	 * @generated
	 */
	int getNum_tareas();

	/**
	 * Sets the value of the '{@link proyectomm.Actor#getNum_tareas <em>Num tareas</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Num tareas</em>' attribute.
	 * @see #getNum_tareas()
	 * @generated
	 */
	void setNum_tareas(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='tareas-&gt;select(oclIsKindOf(Intermedia))-&gt;size() &gt; 0'"
	 * @generated
	 */
	boolean R05_minTareaIntermedia(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Actor
