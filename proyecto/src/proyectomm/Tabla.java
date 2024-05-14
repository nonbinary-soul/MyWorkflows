/**
 */
package proyectomm;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tabla</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link proyectomm.Tabla#getNombre <em>Nombre</em>}</li>
 *   <li>{@link proyectomm.Tabla#getAtributos <em>Atributos</em>}</li>
 * </ul>
 *
 * @see proyectomm.ProyectommPackage#getTabla()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='P03_clavesTipoInteger'"
 *        annotation="gmf.node label='nombre' figure='svg' svg.uri='platform:/plugin/proyecto/icons/table.svg' label.icon='false' label.placement='external'"
 * @generated
 */
public interface Tabla extends EObject {
	/**
	 * Returns the value of the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre</em>' attribute.
	 * @see #setNombre(String)
	 * @see proyectomm.ProyectommPackage#getTabla_Nombre()
	 * @model required="true"
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link proyectomm.Tabla#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

	/**
	 * Returns the value of the '<em><b>Atributos</b></em>' containment reference list.
	 * The list contents are of type {@link proyectomm.Atributo}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Atributos</em>' containment reference list.
	 * @see proyectomm.ProyectommPackage#getTabla_Atributos()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Atributo> getAtributos();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t        self.atributos-&gt;select(a | a.oclIsTypeOf(PrimaryKey))-&gt;size() = 1'"
	 * @generated
	 */
	boolean P02_soloUnaClavePrimaria(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t\t    self.atributos-&gt;select(a | a.oclIsTypeOf(PrimaryKey) or a.oclIsTypeOf(ForeignKey))\n\t\t\t                 -&gt;forAll(at | at.tipo = EAtributo::INTEGER)'"
	 * @generated
	 */
	boolean P03_clavesTipoInteger(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Tabla
