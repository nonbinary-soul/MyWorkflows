/**
 */
package proyectomm.tests;

import junit.textui.TestRunner;

import proyectomm.Envio;
import proyectomm.ProyectommFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Envio</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class EnvioTest extends MensajeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(EnvioTest.class);
	}

	/**
	 * Constructs a new Envio test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnvioTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Envio test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Envio getFixture() {
		return (Envio)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ProyectommFactory.eINSTANCE.createEnvio());
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

} //EnvioTest
