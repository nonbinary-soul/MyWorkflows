/**
 */
package proyectomm;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see proyectomm.ProyectommPackage
 * @generated
 */
public interface ProyectommFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ProyectommFactory eINSTANCE = proyectomm.impl.ProyectommFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Proceso De Negocio</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Proceso De Negocio</em>'.
	 * @generated
	 */
	ProcesoDeNegocio createProcesoDeNegocio();

	/**
	 * Returns a new object of class '<em>Actor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Actor</em>'.
	 * @generated
	 */
	Actor createActor();

	/**
	 * Returns a new object of class '<em>Base De Datos</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Base De Datos</em>'.
	 * @generated
	 */
	BaseDeDatos createBaseDeDatos();

	/**
	 * Returns a new object of class '<em>Tabla</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tabla</em>'.
	 * @generated
	 */
	Tabla createTabla();

	/**
	 * Returns a new object of class '<em>Atributo</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Atributo</em>'.
	 * @generated
	 */
	Atributo createAtributo();

	/**
	 * Returns a new object of class '<em>Inicio</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Inicio</em>'.
	 * @generated
	 */
	Inicio createInicio();

	/**
	 * Returns a new object of class '<em>Fin</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fin</em>'.
	 * @generated
	 */
	Fin createFin();

	/**
	 * Returns a new object of class '<em>Usuario</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Usuario</em>'.
	 * @generated
	 */
	Usuario createUsuario();

	/**
	 * Returns a new object of class '<em>Servicio</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Servicio</em>'.
	 * @generated
	 */
	Servicio createServicio();

	/**
	 * Returns a new object of class '<em>Envio</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Envio</em>'.
	 * @generated
	 */
	Envio createEnvio();

	/**
	 * Returns a new object of class '<em>Recepcion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Recepcion</em>'.
	 * @generated
	 */
	Recepcion createRecepcion();

	/**
	 * Returns a new object of class '<em>Borrado</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Borrado</em>'.
	 * @generated
	 */
	Borrado createBorrado();

	/**
	 * Returns a new object of class '<em>Lectura</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Lectura</em>'.
	 * @generated
	 */
	Lectura createLectura();

	/**
	 * Returns a new object of class '<em>Primary Key</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Primary Key</em>'.
	 * @generated
	 */
	PrimaryKey createPrimaryKey();

	/**
	 * Returns a new object of class '<em>Foreign Key</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Foreign Key</em>'.
	 * @generated
	 */
	ForeignKey createForeignKey();

	/**
	 * Returns a new object of class '<em>Opcion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Opcion</em>'.
	 * @generated
	 */
	Opcion createOpcion();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ProyectommPackage getProyectommPackage();

} //ProyectommFactory
