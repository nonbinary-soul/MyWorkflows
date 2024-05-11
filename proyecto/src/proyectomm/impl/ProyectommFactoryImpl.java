/**
 */
package proyectomm.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import proyectomm.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProyectommFactoryImpl extends EFactoryImpl implements ProyectommFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ProyectommFactory init() {
		try {
			ProyectommFactory theProyectommFactory = (ProyectommFactory)EPackage.Registry.INSTANCE.getEFactory(ProyectommPackage.eNS_URI);
			if (theProyectommFactory != null) {
				return theProyectommFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ProyectommFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProyectommFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ProyectommPackage.PROCESO_DE_NEGOCIO: return createProcesoDeNegocio();
			case ProyectommPackage.ACTOR: return createActor();
			case ProyectommPackage.BASE_DE_DATOS: return createBaseDeDatos();
			case ProyectommPackage.TABLA: return createTabla();
			case ProyectommPackage.ATRIBUTO: return createAtributo();
			case ProyectommPackage.INICIO: return createInicio();
			case ProyectommPackage.FIN: return createFin();
			case ProyectommPackage.USUARIO: return createUsuario();
			case ProyectommPackage.SERVICIO: return createServicio();
			case ProyectommPackage.ENVIO: return createEnvio();
			case ProyectommPackage.RECEPCION: return createRecepcion();
			case ProyectommPackage.BORRADO: return createBorrado();
			case ProyectommPackage.LECTURA: return createLectura();
			case ProyectommPackage.PRIMARY_KEY: return createPrimaryKey();
			case ProyectommPackage.FOREIGN_KEY: return createForeignKey();
			case ProyectommPackage.OPCION: return createOpcion();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case ProyectommPackage.EATRIBUTO:
				return createEAtributoFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case ProyectommPackage.EATRIBUTO:
				return convertEAtributoToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProcesoDeNegocio createProcesoDeNegocio() {
		ProcesoDeNegocioImpl procesoDeNegocio = new ProcesoDeNegocioImpl();
		return procesoDeNegocio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Actor createActor() {
		ActorImpl actor = new ActorImpl();
		return actor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BaseDeDatos createBaseDeDatos() {
		BaseDeDatosImpl baseDeDatos = new BaseDeDatosImpl();
		return baseDeDatos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Tabla createTabla() {
		TablaImpl tabla = new TablaImpl();
		return tabla;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Atributo createAtributo() {
		AtributoImpl atributo = new AtributoImpl();
		return atributo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Inicio createInicio() {
		InicioImpl inicio = new InicioImpl();
		return inicio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Fin createFin() {
		FinImpl fin = new FinImpl();
		return fin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Usuario createUsuario() {
		UsuarioImpl usuario = new UsuarioImpl();
		return usuario;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Servicio createServicio() {
		ServicioImpl servicio = new ServicioImpl();
		return servicio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Envio createEnvio() {
		EnvioImpl envio = new EnvioImpl();
		return envio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Recepcion createRecepcion() {
		RecepcionImpl recepcion = new RecepcionImpl();
		return recepcion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Borrado createBorrado() {
		BorradoImpl borrado = new BorradoImpl();
		return borrado;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Lectura createLectura() {
		LecturaImpl lectura = new LecturaImpl();
		return lectura;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PrimaryKey createPrimaryKey() {
		PrimaryKeyImpl primaryKey = new PrimaryKeyImpl();
		return primaryKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ForeignKey createForeignKey() {
		ForeignKeyImpl foreignKey = new ForeignKeyImpl();
		return foreignKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Opcion createOpcion() {
		OpcionImpl opcion = new OpcionImpl();
		return opcion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAtributo createEAtributoFromString(EDataType eDataType, String initialValue) {
		EAtributo result = EAtributo.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEAtributoToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProyectommPackage getProyectommPackage() {
		return (ProyectommPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ProyectommPackage getPackage() {
		return ProyectommPackage.eINSTANCE;
	}

} //ProyectommFactoryImpl
