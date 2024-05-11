/**
 */
package proyectomm.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import proyectomm.BaseDeDatos;
import proyectomm.ProyectommFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Base De Datos</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class BaseDeDatosTest extends TestCase {

	/**
	 * The fixture for this Base De Datos test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BaseDeDatos fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(BaseDeDatosTest.class);
	}

	/**
	 * Constructs a new Base De Datos test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BaseDeDatosTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Base De Datos test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(BaseDeDatos fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Base De Datos test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BaseDeDatos getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ProyectommFactory.eINSTANCE.createBaseDeDatos());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //BaseDeDatosTest
