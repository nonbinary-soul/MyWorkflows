/**
 */
package proyectomm;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tarea</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link proyectomm.Tarea#getSucesor <em>Sucesor</em>}</li>
 *   <li>{@link proyectomm.Tarea#getPredecesor <em>Predecesor</em>}</li>
 * </ul>
 *
 * @see proyectomm.ProyectommPackage#getTarea()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='R08_ConexionesEntreTareas'"
 * @generated
 */
public interface Tarea extends EObject {
	/**
	 * Returns the value of the '<em><b>Sucesor</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link proyectomm.Tarea#getPredecesor <em>Predecesor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sucesor</em>' reference.
	 * @see #setSucesor(Tarea)
	 * @see proyectomm.ProyectommPackage#getTarea_Sucesor()
	 * @see proyectomm.Tarea#getPredecesor
	 * @model opposite="predecesor"
	 * @generated
	 */
	Tarea getSucesor();

	/**
	 * Sets the value of the '{@link proyectomm.Tarea#getSucesor <em>Sucesor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sucesor</em>' reference.
	 * @see #getSucesor()
	 * @generated
	 */
	void setSucesor(Tarea value);

	/**
	 * Returns the value of the '<em><b>Predecesor</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link proyectomm.Tarea#getSucesor <em>Sucesor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Predecesor</em>' reference.
	 * @see #setPredecesor(Tarea)
	 * @see proyectomm.ProyectommPackage#getTarea_Predecesor()
	 * @see proyectomm.Tarea#getSucesor
	 * @model opposite="sucesor"
	 * @generated
	 */
	Tarea getPredecesor();

	/**
	 * Sets the value of the '{@link proyectomm.Tarea#getPredecesor <em>Predecesor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Predecesor</em>' reference.
	 * @see #getPredecesor()
	 * @generated
	 */
	void setPredecesor(Tarea value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\tself.predecesor-&gt;size() &lt;= 1 and self.sucesor-&gt;size() &lt;= 1'"
	 * @generated
	 */
	boolean R09_unidireccionalidad(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='sucesor &lt;&gt; self'"
	 * @generated
	 */
	boolean R06_noReflexiva(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t  if self.oclIsTypeOf(Envio) then\n\t\t    -- Se eval\357\277\275a que Envio y Recepcion sean de distinto actor\n\t\t    self.oclContainer() &lt;&gt; self.sucesor.oclContainer() \n\t\t  else\n\t\t    -- El resto de conexiones deben ser del mismo actor\n\t\t    self.sucesor-&gt;isEmpty() or\n\t\t    self.sucesor.oclContainer() = self.oclContainer()\n\t\t  endif'"
	 * @generated
	 */
	boolean R08_ConexionesEntreTareas(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Tarea
