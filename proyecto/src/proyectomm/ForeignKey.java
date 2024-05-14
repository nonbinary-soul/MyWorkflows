/**
 */
package proyectomm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Foreign Key</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link proyectomm.ForeignKey#getReferencia_a <em>Referencia a</em>}</li>
 * </ul>
 *
 * @see proyectomm.ProyectommPackage#getForeignKey()
 * @model annotation="gmf.node label='nombre' figure='svg' svg.uri='platform:/plugin/proyecto/icons/fk.svg' label.icon='false' label.placement='external'"
 * @generated
 */
public interface ForeignKey extends Atributo {
	/**
	 * Returns the value of the '<em><b>Referencia a</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referencia a</em>' reference.
	 * @see #setReferencia_a(PrimaryKey)
	 * @see proyectomm.ProyectommPackage#getForeignKey_Referencia_a()
	 * @model required="true"
	 * @generated
	 */
	PrimaryKey getReferencia_a();

	/**
	 * Sets the value of the '{@link proyectomm.ForeignKey#getReferencia_a <em>Referencia a</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referencia a</em>' reference.
	 * @see #getReferencia_a()
	 * @generated
	 */
	void setReferencia_a(PrimaryKey value);

} // ForeignKey
