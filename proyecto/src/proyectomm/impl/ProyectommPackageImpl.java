/**
 */
package proyectomm.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import proyectomm.Actor;
import proyectomm.Atributo;
import proyectomm.BaseDeDatos;
import proyectomm.Borrado;
import proyectomm.EAtributo;
import proyectomm.Envio;
import proyectomm.Fin;
import proyectomm.ForeignKey;
import proyectomm.Inicio;
import proyectomm.Intermedia;
import proyectomm.Lectura;
import proyectomm.Mensaje;
import proyectomm.Opcion;
import proyectomm.PrimaryKey;
import proyectomm.ProcesoDeNegocio;
import proyectomm.ProyectommFactory;
import proyectomm.ProyectommPackage;
import proyectomm.Recepcion;
import proyectomm.Servicio;
import proyectomm.Tabla;
import proyectomm.Tarea;
import proyectomm.Usuario;

import proyectomm.util.ProyectommValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProyectommPackageImpl extends EPackageImpl implements ProyectommPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass procesoDeNegocioEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass baseDeDatosEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tablaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass atributoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tareaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inicioEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass finEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass intermediaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass usuarioEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass servicioEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mensajeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass envioEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass recepcionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass borradoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lecturaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass primaryKeyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass foreignKeyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass opcionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum eAtributoEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see proyectomm.ProyectommPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ProyectommPackageImpl() {
		super(eNS_URI, ProyectommFactory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link ProyectommPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ProyectommPackage init() {
		if (isInited) return (ProyectommPackage)EPackage.Registry.INSTANCE.getEPackage(ProyectommPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredProyectommPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ProyectommPackageImpl theProyectommPackage = registeredProyectommPackage instanceof ProyectommPackageImpl ? (ProyectommPackageImpl)registeredProyectommPackage : new ProyectommPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theProyectommPackage.createPackageContents();

		// Initialize created meta-data
		theProyectommPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theProyectommPackage,
			 new EValidator.Descriptor() {
				 @Override
				 public EValidator getEValidator() {
					 return ProyectommValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theProyectommPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ProyectommPackage.eNS_URI, theProyectommPackage);
		return theProyectommPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProcesoDeNegocio() {
		return procesoDeNegocioEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProcesoDeNegocio_Bases_de_datos() {
		return (EReference)procesoDeNegocioEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProcesoDeNegocio_Actores() {
		return (EReference)procesoDeNegocioEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProcesoDeNegocio_Nombre() {
		return (EAttribute)procesoDeNegocioEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getProcesoDeNegocio__R01_unaTareaInicial__DiagnosticChain_Map() {
		return procesoDeNegocioEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getProcesoDeNegocio__R02_unaTareaFinal__DiagnosticChain_Map() {
		return procesoDeNegocioEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getActor() {
		return actorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getActor_Nombre() {
		return (EAttribute)actorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getActor_Tareas() {
		return (EReference)actorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getActor_Num_tareas() {
		return (EAttribute)actorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getActor__R05_minTareaIntermedia__DiagnosticChain_Map() {
		return actorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBaseDeDatos() {
		return baseDeDatosEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBaseDeDatos_Nombre() {
		return (EAttribute)baseDeDatosEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBaseDeDatos_Tablas() {
		return (EReference)baseDeDatosEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTabla() {
		return tablaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTabla_Nombre() {
		return (EAttribute)tablaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTabla_Atributos() {
		return (EReference)tablaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTabla__P02_soloUnaClavePrimaria__DiagnosticChain_Map() {
		return tablaEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTabla__P03_clavesTipoInteger__DiagnosticChain_Map() {
		return tablaEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAtributo() {
		return atributoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAtributo_Nombre() {
		return (EAttribute)atributoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAtributo_Tipo() {
		return (EAttribute)atributoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAtributo_Opciones() {
		return (EReference)atributoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAtributo__P01_tieneOpciones__DiagnosticChain_Map() {
		return atributoEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAtributo__P05_sinEspaciosEnBlanco__DiagnosticChain_Map() {
		return atributoEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTarea() {
		return tareaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTarea_Sucesor() {
		return (EReference)tareaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTarea_Predecesor() {
		return (EReference)tareaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTarea__R09_unidireccionalidad__DiagnosticChain_Map() {
		return tareaEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTarea__R06_noReflexiva__DiagnosticChain_Map() {
		return tareaEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTarea__R08_ConexionesEntreTareas__DiagnosticChain_Map() {
		return tareaEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInicio() {
		return inicioEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInicio__R03_sinPredecesor__DiagnosticChain_Map() {
		return inicioEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFin() {
		return finEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFin__R04_sinSucesor__DiagnosticChain_Map() {
		return finEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIntermedia() {
		return intermediaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIntermedia_Id() {
		return (EAttribute)intermediaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIntermedia_Nombre() {
		return (EAttribute)intermediaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIntermedia_Descripcion() {
		return (EAttribute)intermediaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUsuario() {
		return usuarioEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUsuario_Tabla_accedida() {
		return (EReference)usuarioEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getServicio() {
		return servicioEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getServicio_Tabla_accedida() {
		return (EReference)servicioEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMensaje() {
		return mensajeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMensaje_Tabla_accedida() {
		return (EReference)mensajeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEnvio() {
		return envioEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRecepcion() {
		return recepcionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRecepcion__R07_envioAsociado__DiagnosticChain_Map() {
		return recepcionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRecepcion__P06_mismaTablaQueEnvio__DiagnosticChain_Map() {
		return recepcionEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBorrado() {
		return borradoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getBorrado__P04_borradoConClavePrimaria__DiagnosticChain_Map() {
		return borradoEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLectura() {
		return lecturaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLectura_Datos_a_leer() {
		return (EReference)lecturaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBD() {
		return bdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBD_Atributo_seleccionado() {
		return (EReference)bdEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPrimaryKey() {
		return primaryKeyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getForeignKey() {
		return foreignKeyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getForeignKey_Referencia_a() {
		return (EReference)foreignKeyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOpcion() {
		return opcionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOpcion_Nombre() {
		return (EAttribute)opcionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getEAtributo() {
		return eAtributoEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProyectommFactory getProyectommFactory() {
		return (ProyectommFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		procesoDeNegocioEClass = createEClass(PROCESO_DE_NEGOCIO);
		createEReference(procesoDeNegocioEClass, PROCESO_DE_NEGOCIO__BASES_DE_DATOS);
		createEReference(procesoDeNegocioEClass, PROCESO_DE_NEGOCIO__ACTORES);
		createEAttribute(procesoDeNegocioEClass, PROCESO_DE_NEGOCIO__NOMBRE);
		createEOperation(procesoDeNegocioEClass, PROCESO_DE_NEGOCIO___R01_UNA_TAREA_INICIAL__DIAGNOSTICCHAIN_MAP);
		createEOperation(procesoDeNegocioEClass, PROCESO_DE_NEGOCIO___R02_UNA_TAREA_FINAL__DIAGNOSTICCHAIN_MAP);

		actorEClass = createEClass(ACTOR);
		createEAttribute(actorEClass, ACTOR__NOMBRE);
		createEReference(actorEClass, ACTOR__TAREAS);
		createEAttribute(actorEClass, ACTOR__NUM_TAREAS);
		createEOperation(actorEClass, ACTOR___R05_MIN_TAREA_INTERMEDIA__DIAGNOSTICCHAIN_MAP);

		baseDeDatosEClass = createEClass(BASE_DE_DATOS);
		createEAttribute(baseDeDatosEClass, BASE_DE_DATOS__NOMBRE);
		createEReference(baseDeDatosEClass, BASE_DE_DATOS__TABLAS);

		tablaEClass = createEClass(TABLA);
		createEAttribute(tablaEClass, TABLA__NOMBRE);
		createEReference(tablaEClass, TABLA__ATRIBUTOS);
		createEOperation(tablaEClass, TABLA___P02_SOLO_UNA_CLAVE_PRIMARIA__DIAGNOSTICCHAIN_MAP);
		createEOperation(tablaEClass, TABLA___P03_CLAVES_TIPO_INTEGER__DIAGNOSTICCHAIN_MAP);

		atributoEClass = createEClass(ATRIBUTO);
		createEAttribute(atributoEClass, ATRIBUTO__NOMBRE);
		createEAttribute(atributoEClass, ATRIBUTO__TIPO);
		createEReference(atributoEClass, ATRIBUTO__OPCIONES);
		createEOperation(atributoEClass, ATRIBUTO___P01_TIENE_OPCIONES__DIAGNOSTICCHAIN_MAP);
		createEOperation(atributoEClass, ATRIBUTO___P05_SIN_ESPACIOS_EN_BLANCO__DIAGNOSTICCHAIN_MAP);

		tareaEClass = createEClass(TAREA);
		createEReference(tareaEClass, TAREA__SUCESOR);
		createEReference(tareaEClass, TAREA__PREDECESOR);
		createEOperation(tareaEClass, TAREA___R09_UNIDIRECCIONALIDAD__DIAGNOSTICCHAIN_MAP);
		createEOperation(tareaEClass, TAREA___R06_NO_REFLEXIVA__DIAGNOSTICCHAIN_MAP);
		createEOperation(tareaEClass, TAREA___R08_CONEXIONES_ENTRE_TAREAS__DIAGNOSTICCHAIN_MAP);

		inicioEClass = createEClass(INICIO);
		createEOperation(inicioEClass, INICIO___R03_SIN_PREDECESOR__DIAGNOSTICCHAIN_MAP);

		finEClass = createEClass(FIN);
		createEOperation(finEClass, FIN___R04_SIN_SUCESOR__DIAGNOSTICCHAIN_MAP);

		intermediaEClass = createEClass(INTERMEDIA);
		createEAttribute(intermediaEClass, INTERMEDIA__ID);
		createEAttribute(intermediaEClass, INTERMEDIA__NOMBRE);
		createEAttribute(intermediaEClass, INTERMEDIA__DESCRIPCION);

		usuarioEClass = createEClass(USUARIO);
		createEReference(usuarioEClass, USUARIO__TABLA_ACCEDIDA);

		servicioEClass = createEClass(SERVICIO);
		createEReference(servicioEClass, SERVICIO__TABLA_ACCEDIDA);

		mensajeEClass = createEClass(MENSAJE);
		createEReference(mensajeEClass, MENSAJE__TABLA_ACCEDIDA);

		envioEClass = createEClass(ENVIO);

		recepcionEClass = createEClass(RECEPCION);
		createEOperation(recepcionEClass, RECEPCION___R07_ENVIO_ASOCIADO__DIAGNOSTICCHAIN_MAP);
		createEOperation(recepcionEClass, RECEPCION___P06_MISMA_TABLA_QUE_ENVIO__DIAGNOSTICCHAIN_MAP);

		borradoEClass = createEClass(BORRADO);
		createEOperation(borradoEClass, BORRADO___P04_BORRADO_CON_CLAVE_PRIMARIA__DIAGNOSTICCHAIN_MAP);

		lecturaEClass = createEClass(LECTURA);
		createEReference(lecturaEClass, LECTURA__DATOS_ALEER);

		bdEClass = createEClass(BD);
		createEReference(bdEClass, BD__ATRIBUTO_SELECCIONADO);

		primaryKeyEClass = createEClass(PRIMARY_KEY);

		foreignKeyEClass = createEClass(FOREIGN_KEY);
		createEReference(foreignKeyEClass, FOREIGN_KEY__REFERENCIA_A);

		opcionEClass = createEClass(OPCION);
		createEAttribute(opcionEClass, OPCION__NOMBRE);

		// Create enums
		eAtributoEEnum = createEEnum(EATRIBUTO);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		inicioEClass.getESuperTypes().add(this.getTarea());
		finEClass.getESuperTypes().add(this.getTarea());
		intermediaEClass.getESuperTypes().add(this.getTarea());
		usuarioEClass.getESuperTypes().add(this.getIntermedia());
		servicioEClass.getESuperTypes().add(this.getIntermedia());
		mensajeEClass.getESuperTypes().add(this.getIntermedia());
		envioEClass.getESuperTypes().add(this.getMensaje());
		recepcionEClass.getESuperTypes().add(this.getMensaje());
		borradoEClass.getESuperTypes().add(this.getBD());
		lecturaEClass.getESuperTypes().add(this.getBD());
		bdEClass.getESuperTypes().add(this.getIntermedia());
		primaryKeyEClass.getESuperTypes().add(this.getAtributo());
		foreignKeyEClass.getESuperTypes().add(this.getAtributo());

		// Initialize classes, features, and operations; add parameters
		initEClass(procesoDeNegocioEClass, ProcesoDeNegocio.class, "ProcesoDeNegocio", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProcesoDeNegocio_Bases_de_datos(), this.getBaseDeDatos(), null, "bases_de_datos", null, 1, -1, ProcesoDeNegocio.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcesoDeNegocio_Actores(), this.getActor(), null, "actores", null, 1, -1, ProcesoDeNegocio.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProcesoDeNegocio_Nombre(), ecorePackage.getEString(), "nombre", null, 1, 1, ProcesoDeNegocio.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getProcesoDeNegocio__R01_unaTareaInicial__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "R01_unaTareaInicial", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEMap());
		EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getProcesoDeNegocio__R02_unaTareaFinal__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "R02_unaTareaFinal", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(actorEClass, Actor.class, "Actor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getActor_Nombre(), ecorePackage.getEString(), "nombre", null, 1, 1, Actor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActor_Tareas(), this.getTarea(), null, "tareas", null, 0, -1, Actor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActor_Num_tareas(), ecorePackage.getEInt(), "num_tareas", null, 1, 1, Actor.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		op = initEOperation(getActor__R05_minTareaIntermedia__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "R05_minTareaIntermedia", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(baseDeDatosEClass, BaseDeDatos.class, "BaseDeDatos", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBaseDeDatos_Nombre(), ecorePackage.getEString(), "nombre", null, 1, 1, BaseDeDatos.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBaseDeDatos_Tablas(), this.getTabla(), null, "tablas", null, 1, -1, BaseDeDatos.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tablaEClass, Tabla.class, "Tabla", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTabla_Nombre(), ecorePackage.getEString(), "nombre", null, 1, 1, Tabla.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTabla_Atributos(), this.getAtributo(), null, "atributos", null, 1, -1, Tabla.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getTabla__P02_soloUnaClavePrimaria__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "P02_soloUnaClavePrimaria", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTabla__P03_clavesTipoInteger__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "P03_clavesTipoInteger", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(atributoEClass, Atributo.class, "Atributo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAtributo_Nombre(), ecorePackage.getEString(), "nombre", null, 1, 1, Atributo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAtributo_Tipo(), this.getEAtributo(), "tipo", null, 1, 1, Atributo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAtributo_Opciones(), this.getOpcion(), null, "opciones", null, 0, -1, Atributo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getAtributo__P01_tieneOpciones__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "P01_tieneOpciones", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAtributo__P05_sinEspaciosEnBlanco__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "P05_sinEspaciosEnBlanco", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(tareaEClass, Tarea.class, "Tarea", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTarea_Sucesor(), this.getTarea(), this.getTarea_Predecesor(), "sucesor", null, 0, 1, Tarea.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTarea_Predecesor(), this.getTarea(), this.getTarea_Sucesor(), "predecesor", null, 0, 1, Tarea.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getTarea__R09_unidireccionalidad__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "R09_unidireccionalidad", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTarea__R06_noReflexiva__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "R06_noReflexiva", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTarea__R08_ConexionesEntreTareas__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "R08_ConexionesEntreTareas", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(inicioEClass, Inicio.class, "Inicio", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getInicio__R03_sinPredecesor__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "R03_sinPredecesor", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(finEClass, Fin.class, "Fin", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getFin__R04_sinSucesor__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "R04_sinSucesor", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(intermediaEClass, Intermedia.class, "Intermedia", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIntermedia_Id(), ecorePackage.getEInt(), "id", null, 1, 1, Intermedia.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIntermedia_Nombre(), ecorePackage.getEString(), "nombre", null, 0, 1, Intermedia.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIntermedia_Descripcion(), ecorePackage.getEString(), "descripcion", null, 0, 1, Intermedia.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(usuarioEClass, Usuario.class, "Usuario", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUsuario_Tabla_accedida(), this.getTabla(), null, "tabla_accedida", null, 1, 1, Usuario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(servicioEClass, Servicio.class, "Servicio", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getServicio_Tabla_accedida(), this.getTabla(), null, "tabla_accedida", null, 1, 1, Servicio.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mensajeEClass, Mensaje.class, "Mensaje", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMensaje_Tabla_accedida(), this.getTabla(), null, "tabla_accedida", null, 1, 1, Mensaje.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(envioEClass, Envio.class, "Envio", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(recepcionEClass, Recepcion.class, "Recepcion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getRecepcion__R07_envioAsociado__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "R07_envioAsociado", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getRecepcion__P06_mismaTablaQueEnvio__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "P06_mismaTablaQueEnvio", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(borradoEClass, Borrado.class, "Borrado", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getBorrado__P04_borradoConClavePrimaria__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "P04_borradoConClavePrimaria", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(lecturaEClass, Lectura.class, "Lectura", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLectura_Datos_a_leer(), this.getTabla(), null, "datos_a_leer", null, 1, 1, Lectura.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(bdEClass, proyectomm.BD.class, "BD", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBD_Atributo_seleccionado(), this.getAtributo(), null, "atributo_seleccionado", null, 1, 1, proyectomm.BD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(primaryKeyEClass, PrimaryKey.class, "PrimaryKey", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(foreignKeyEClass, ForeignKey.class, "ForeignKey", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getForeignKey_Referencia_a(), this.getPrimaryKey(), null, "referencia_a", null, 1, 1, ForeignKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(opcionEClass, Opcion.class, "Opcion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOpcion_Nombre(), ecorePackage.getEString(), "nombre", null, 1, 1, Opcion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(eAtributoEEnum, EAtributo.class, "EAtributo");
		addEEnumLiteral(eAtributoEEnum, EAtributo.INTEGER);
		addEEnumLiteral(eAtributoEEnum, EAtributo.REAL);
		addEEnumLiteral(eAtributoEEnum, EAtributo.TEXT);
		addEEnumLiteral(eAtributoEEnum, EAtributo.BOOLEAN);
		addEEnumLiteral(eAtributoEEnum, EAtributo.LIST);
		addEEnumLiteral(eAtributoEEnum, EAtributo.DATE);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// gmf
		createGmfAnnotations();
		// gmf.diagram
		createGmf_1Annotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
		createPivotAnnotations();
		// gmf.node
		createGmf_2Annotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";
		addAnnotation
		  (this,
		   source,
		   new String[] {
		   });
		addAnnotation
		  (procesoDeNegocioEClass,
		   source,
		   new String[] {
			   "constraints", "R02_unaTareaFinal"
		   });
		addAnnotation
		  (actorEClass,
		   source,
		   new String[] {
			   "constraints", "R05_minTareaIntermedia"
		   });
		addAnnotation
		  (tablaEClass,
		   source,
		   new String[] {
			   "constraints", "P03_clavesTipoInteger"
		   });
		addAnnotation
		  (atributoEClass,
		   source,
		   new String[] {
			   "constraints", "P05_sinEspaciosEnBlanco"
		   });
		addAnnotation
		  (tareaEClass,
		   source,
		   new String[] {
			   "constraints", "R08_ConexionesEntreTareas"
		   });
		addAnnotation
		  (inicioEClass,
		   source,
		   new String[] {
			   "constraints", "R03_sinPredecesor"
		   });
		addAnnotation
		  (finEClass,
		   source,
		   new String[] {
			   "constraints", "R04_sinSucesor"
		   });
		addAnnotation
		  (recepcionEClass,
		   source,
		   new String[] {
			   "constraints", "P06_mismaTablaQueEnvio"
		   });
		addAnnotation
		  (borradoEClass,
		   source,
		   new String[] {
			   "constraints", "P04_borradoConClavePrimaria"
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmfAnnotations() {
		String source = "gmf";
		addAnnotation
		  (this,
		   source,
		   new String[] {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.diagram</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_1Annotations() {
		String source = "gmf.diagram";
		addAnnotation
		  (procesoDeNegocioEClass,
		   source,
		   new String[] {
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPivotAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot";
		addAnnotation
		  (getProcesoDeNegocio__R01_unaTareaInicial__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "Inicio.allInstances()->size() = 1"
		   });
		addAnnotation
		  (getProcesoDeNegocio__R02_unaTareaFinal__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "Fin.allInstances()->size() = 1"
		   });
		addAnnotation
		  (getActor__R05_minTareaIntermedia__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "tareas->select(oclIsKindOf(Intermedia))->size() > 0"
		   });
		addAnnotation
		  (getTabla__P02_soloUnaClavePrimaria__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "\n\t\t        self.atributos->select(a | a.oclIsTypeOf(PrimaryKey))->size() = 1"
		   });
		addAnnotation
		  (getTabla__P03_clavesTipoInteger__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "\n\t\t\t    self.atributos->select(a | a.oclIsTypeOf(PrimaryKey) or a.oclIsTypeOf(ForeignKey))\n\t\t\t                 ->forAll(at | at.tipo = EAtributo::INTEGER)"
		   });
		addAnnotation
		  (getAtributo__P01_tieneOpciones__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "\n\t\t\t    if self.tipo = EAtributo::LIST then\n\t\t\t        self.opciones->notEmpty()\n\t\t\t    else\n\t\t\t        self.opciones->isEmpty()\n\t\t\t    endif"
		   });
		addAnnotation
		  (getAtributo__P05_sinEspaciosEnBlanco__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "\n\t\t        not self.nombre->includes(\' \')"
		   });
		addAnnotation
		  (getTarea__R09_unidireccionalidad__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "\n\t\tself.predecesor->size() <= 1 and self.sucesor->size() <= 1"
		   });
		addAnnotation
		  (getTarea__R06_noReflexiva__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "sucesor <> self"
		   });
		addAnnotation
		  (getTarea__R08_ConexionesEntreTareas__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "\n\t\t  if self.oclIsTypeOf(Envio) then\n\t\t    -- Se eval\u00ef\u00bf\u00bda que Envio y Recepcion sean de distinto actor\n\t\t    self.oclContainer() <> self.sucesor.oclContainer() \n\t\t  else\n\t\t    -- El resto de conexiones deben ser del mismo actor\n\t\t    self.sucesor->isEmpty() or\n\t\t    self.sucesor.oclContainer() = self.oclContainer()\n\t\t  endif"
		   });
		addAnnotation
		  (getInicio__R03_sinPredecesor__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "predecesor = null"
		   });
		addAnnotation
		  (getFin__R04_sinSucesor__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "sucesor = null"
		   });
		addAnnotation
		  (getRecepcion__R07_envioAsociado__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "predecesor.oclIsTypeOf(Envio)"
		   });
		addAnnotation
		  (getRecepcion__P06_mismaTablaQueEnvio__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "self.tabla_accedida = self.predecesor.oclAsType(Envio).tabla_accedida"
		   });
		addAnnotation
		  (getBorrado__P04_borradoConClavePrimaria__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "\n\t\t        self.atributo_seleccionado.oclIsTypeOf(PrimaryKey)"
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.node</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_2Annotations() {
		String source = "gmf.node";
		addAnnotation
		  (actorEClass,
		   source,
		   new String[] {
			   "label", "nombre",
			   "figure", "svg",
			   "svg.uri", "platform:/plugin/proyecto/icons/start.svg",
			   "label.icon", "false",
			   "label.placement", "external"
		   });
		addAnnotation
		  (baseDeDatosEClass,
		   source,
		   new String[] {
			   "label", "nombre",
			   "figure", "svg",
			   "svg.uri", "platform:/plugin/proyecto/icons/database.svg",
			   "label.icon", "false",
			   "label.placement", "external"
		   });
		addAnnotation
		  (tablaEClass,
		   source,
		   new String[] {
			   "label", "nombre",
			   "figure", "svg",
			   "svg.uri", "platform:/plugin/proyecto/icons/table.svg",
			   "label.icon", "false",
			   "label.placement", "external"
		   });
		addAnnotation
		  (atributoEClass,
		   source,
		   new String[] {
			   "label", "nombre",
			   "figure", "svg",
			   "svg.uri", "platform:/plugin/proyecto/icons/attribute.svg",
			   "label.icon", "false",
			   "label.placement", "external"
		   });
		addAnnotation
		  (usuarioEClass,
		   source,
		   new String[] {
			   "label", "nombre",
			   "figure", "svg",
			   "svg.uri", "platform:/plugin/proyecto/icons/form.svg",
			   "label.icon", "false",
			   "label.placement", "external"
		   });
		addAnnotation
		  (servicioEClass,
		   source,
		   new String[] {
			   "label", "nombre",
			   "figure", "svg",
			   "svg.uri", "platform:/plugin/proyecto/icons/service.svg",
			   "label.icon", "false",
			   "label.placement", "external"
		   });
		addAnnotation
		  (envioEClass,
		   source,
		   new String[] {
			   "label", "nombre",
			   "figure", "svg",
			   "svg.uri", "platform:/plugin/proyecto/icons/sent-message.svg",
			   "label.icon", "false",
			   "label.placement", "external"
		   });
		addAnnotation
		  (recepcionEClass,
		   source,
		   new String[] {
			   "label", "nombre",
			   "figure", "svg",
			   "svg.uri", "platform:/plugin/proyecto/icons/received-message.svg",
			   "label.icon", "false",
			   "label.placement", "external"
		   });
		addAnnotation
		  (borradoEClass,
		   source,
		   new String[] {
			   "label", "nombre",
			   "figure", "svg",
			   "svg.uri", "platform:/plugin/proyecto/icons/delete.svg",
			   "label.icon", "false",
			   "label.placement", "external"
		   });
		addAnnotation
		  (lecturaEClass,
		   source,
		   new String[] {
			   "label", "nombre",
			   "figure", "svg",
			   "svg.uri", "platform:/plugin/proyecto/icons/read.svg",
			   "label.icon", "false",
			   "label.placement", "external"
		   });
		addAnnotation
		  (primaryKeyEClass,
		   source,
		   new String[] {
			   "label", "nombre",
			   "figure", "svg",
			   "svg.uri", "platform:/plugin/proyecto/icons/pk.svg",
			   "label.icon", "false",
			   "label.placement", "external"
		   });
		addAnnotation
		  (foreignKeyEClass,
		   source,
		   new String[] {
			   "label", "nombre",
			   "figure", "svg",
			   "svg.uri", "platform:/plugin/proyecto/icons/fk.svg",
			   "label.icon", "false",
			   "label.placement", "external"
		   });
		addAnnotation
		  (opcionEClass,
		   source,
		   new String[] {
			   "label", "nombre",
			   "figure", "svg",
			   "svg.uri", "platform:/plugin/proyecto/icons/option.svg",
			   "label.icon", "false",
			   "label.placement", "external"
		   });
	}

} //ProyectommPackageImpl
