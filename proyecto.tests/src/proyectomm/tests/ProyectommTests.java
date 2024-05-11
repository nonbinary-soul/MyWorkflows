/**
 */
package proyectomm.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>proyectomm</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProyectommTests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new ProyectommTests("proyectomm Tests");
		suite.addTestSuite(ProcesoDeNegocioTest.class);
		suite.addTestSuite(ActorTest.class);
		suite.addTestSuite(TablaTest.class);
		suite.addTestSuite(AtributoTest.class);
		suite.addTestSuite(InicioTest.class);
		suite.addTestSuite(FinTest.class);
		suite.addTestSuite(UsuarioTest.class);
		suite.addTestSuite(ServicioTest.class);
		suite.addTestSuite(EnvioTest.class);
		suite.addTestSuite(RecepcionTest.class);
		suite.addTestSuite(BorradoTest.class);
		suite.addTestSuite(LecturaTest.class);
		suite.addTestSuite(PrimaryKeyTest.class);
		suite.addTestSuite(ForeignKeyTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProyectommTests(String name) {
		super(name);
	}

} //ProyectommTests
