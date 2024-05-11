/**
 */
package proyectomm.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import proyectomm.Opcion;
import proyectomm.ProyectommFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Opcion</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class OpcionTest extends TestCase {

	/**
	 * The fixture for this Opcion test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Opcion fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(OpcionTest.class);
	}

	/**
	 * Constructs a new Opcion test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpcionTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Opcion test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Opcion fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Opcion test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Opcion getFixture() {
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
		setFixture(ProyectommFactory.eINSTANCE.createOpcion());
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

} //OpcionTest
