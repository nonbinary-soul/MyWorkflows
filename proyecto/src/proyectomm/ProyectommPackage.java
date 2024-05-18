/**
 */
package proyectomm;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see proyectomm.ProyectommFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore"
 *        annotation="gmf"
 * @generated
 */
public interface ProyectommPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "proyectomm";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/proyectomm";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "proyectomm";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ProyectommPackage eINSTANCE = proyectomm.impl.ProyectommPackageImpl.init();

	/**
	 * The meta object id for the '{@link proyectomm.impl.ProcesoDeNegocioImpl <em>Proceso De Negocio</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see proyectomm.impl.ProcesoDeNegocioImpl
	 * @see proyectomm.impl.ProyectommPackageImpl#getProcesoDeNegocio()
	 * @generated
	 */
	int PROCESO_DE_NEGOCIO = 0;

	/**
	 * The feature id for the '<em><b>Bases de datos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESO_DE_NEGOCIO__BASES_DE_DATOS = 0;

	/**
	 * The feature id for the '<em><b>Actores</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESO_DE_NEGOCIO__ACTORES = 1;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESO_DE_NEGOCIO__NOMBRE = 2;

	/**
	 * The number of structural features of the '<em>Proceso De Negocio</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESO_DE_NEGOCIO_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>R01 una Tarea Inicial</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESO_DE_NEGOCIO___R01_UNA_TAREA_INICIAL__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The operation id for the '<em>R02 una Tarea Final</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESO_DE_NEGOCIO___R02_UNA_TAREA_FINAL__DIAGNOSTICCHAIN_MAP = 1;

	/**
	 * The number of operations of the '<em>Proceso De Negocio</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESO_DE_NEGOCIO_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link proyectomm.impl.ActorImpl <em>Actor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see proyectomm.impl.ActorImpl
	 * @see proyectomm.impl.ProyectommPackageImpl#getActor()
	 * @generated
	 */
	int ACTOR = 1;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__NOMBRE = 0;

	/**
	 * The feature id for the '<em><b>Tareas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__TAREAS = 1;

	/**
	 * The feature id for the '<em><b>Num tareas</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__NUM_TAREAS = 2;

	/**
	 * The number of structural features of the '<em>Actor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>R05 min Tarea Intermedia</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR___R05_MIN_TAREA_INTERMEDIA__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The number of operations of the '<em>Actor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link proyectomm.impl.BaseDeDatosImpl <em>Base De Datos</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see proyectomm.impl.BaseDeDatosImpl
	 * @see proyectomm.impl.ProyectommPackageImpl#getBaseDeDatos()
	 * @generated
	 */
	int BASE_DE_DATOS = 2;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_DE_DATOS__NOMBRE = 0;

	/**
	 * The feature id for the '<em><b>Tablas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_DE_DATOS__TABLAS = 1;

	/**
	 * The number of structural features of the '<em>Base De Datos</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_DE_DATOS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Base De Datos</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_DE_DATOS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link proyectomm.impl.TablaImpl <em>Tabla</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see proyectomm.impl.TablaImpl
	 * @see proyectomm.impl.ProyectommPackageImpl#getTabla()
	 * @generated
	 */
	int TABLA = 3;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLA__NOMBRE = 0;

	/**
	 * The feature id for the '<em><b>Atributos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLA__ATRIBUTOS = 1;

	/**
	 * The number of structural features of the '<em>Tabla</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLA_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>P02 solo Una Clave Primaria</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLA___P02_SOLO_UNA_CLAVE_PRIMARIA__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The operation id for the '<em>P07 solo Una Clave Foranea</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLA___P07_SOLO_UNA_CLAVE_FORANEA__DIAGNOSTICCHAIN_MAP = 1;

	/**
	 * The number of operations of the '<em>Tabla</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLA_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link proyectomm.impl.AtributoImpl <em>Atributo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see proyectomm.impl.AtributoImpl
	 * @see proyectomm.impl.ProyectommPackageImpl#getAtributo()
	 * @generated
	 */
	int ATRIBUTO = 4;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO__NOMBRE = 0;

	/**
	 * The feature id for the '<em><b>Tipo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO__TIPO = 1;

	/**
	 * The feature id for the '<em><b>Opciones</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO__OPCIONES = 2;

	/**
	 * The number of structural features of the '<em>Atributo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>P01 tiene Opciones</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO___P01_TIENE_OPCIONES__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The operation id for the '<em>P04 sin Espacios En Blanco</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO___P04_SIN_ESPACIOS_EN_BLANCO__DIAGNOSTICCHAIN_MAP = 1;

	/**
	 * The number of operations of the '<em>Atributo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link proyectomm.impl.TareaImpl <em>Tarea</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see proyectomm.impl.TareaImpl
	 * @see proyectomm.impl.ProyectommPackageImpl#getTarea()
	 * @generated
	 */
	int TAREA = 5;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAREA__NOMBRE = 0;

	/**
	 * The feature id for the '<em><b>Sucesor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAREA__SUCESOR = 1;

	/**
	 * The feature id for the '<em><b>Predecesor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAREA__PREDECESOR = 2;

	/**
	 * The number of structural features of the '<em>Tarea</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAREA_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>R09 unidireccionalidad</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAREA___R09_UNIDIRECCIONALIDAD__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The operation id for the '<em>R06 no Reflexiva</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAREA___R06_NO_REFLEXIVA__DIAGNOSTICCHAIN_MAP = 1;

	/**
	 * The operation id for the '<em>R08 Conexiones Entre Tareas</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAREA___R08_CONEXIONES_ENTRE_TAREAS__DIAGNOSTICCHAIN_MAP = 2;

	/**
	 * The number of operations of the '<em>Tarea</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAREA_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link proyectomm.impl.InicioImpl <em>Inicio</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see proyectomm.impl.InicioImpl
	 * @see proyectomm.impl.ProyectommPackageImpl#getInicio()
	 * @generated
	 */
	int INICIO = 6;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INICIO__NOMBRE = TAREA__NOMBRE;

	/**
	 * The feature id for the '<em><b>Sucesor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INICIO__SUCESOR = TAREA__SUCESOR;

	/**
	 * The feature id for the '<em><b>Predecesor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INICIO__PREDECESOR = TAREA__PREDECESOR;

	/**
	 * The number of structural features of the '<em>Inicio</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INICIO_FEATURE_COUNT = TAREA_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>R09 unidireccionalidad</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INICIO___R09_UNIDIRECCIONALIDAD__DIAGNOSTICCHAIN_MAP = TAREA___R09_UNIDIRECCIONALIDAD__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>R06 no Reflexiva</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INICIO___R06_NO_REFLEXIVA__DIAGNOSTICCHAIN_MAP = TAREA___R06_NO_REFLEXIVA__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>R08 Conexiones Entre Tareas</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INICIO___R08_CONEXIONES_ENTRE_TAREAS__DIAGNOSTICCHAIN_MAP = TAREA___R08_CONEXIONES_ENTRE_TAREAS__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>R03 sin Predecesor</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INICIO___R03_SIN_PREDECESOR__DIAGNOSTICCHAIN_MAP = TAREA_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Inicio</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INICIO_OPERATION_COUNT = TAREA_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link proyectomm.impl.FinImpl <em>Fin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see proyectomm.impl.FinImpl
	 * @see proyectomm.impl.ProyectommPackageImpl#getFin()
	 * @generated
	 */
	int FIN = 7;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN__NOMBRE = TAREA__NOMBRE;

	/**
	 * The feature id for the '<em><b>Sucesor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN__SUCESOR = TAREA__SUCESOR;

	/**
	 * The feature id for the '<em><b>Predecesor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN__PREDECESOR = TAREA__PREDECESOR;

	/**
	 * The number of structural features of the '<em>Fin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_FEATURE_COUNT = TAREA_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>R09 unidireccionalidad</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN___R09_UNIDIRECCIONALIDAD__DIAGNOSTICCHAIN_MAP = TAREA___R09_UNIDIRECCIONALIDAD__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>R06 no Reflexiva</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN___R06_NO_REFLEXIVA__DIAGNOSTICCHAIN_MAP = TAREA___R06_NO_REFLEXIVA__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>R08 Conexiones Entre Tareas</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN___R08_CONEXIONES_ENTRE_TAREAS__DIAGNOSTICCHAIN_MAP = TAREA___R08_CONEXIONES_ENTRE_TAREAS__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>R04 sin Sucesor</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN___R04_SIN_SUCESOR__DIAGNOSTICCHAIN_MAP = TAREA_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Fin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_OPERATION_COUNT = TAREA_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link proyectomm.impl.IntermediaImpl <em>Intermedia</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see proyectomm.impl.IntermediaImpl
	 * @see proyectomm.impl.ProyectommPackageImpl#getIntermedia()
	 * @generated
	 */
	int INTERMEDIA = 8;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIA__NOMBRE = TAREA__NOMBRE;

	/**
	 * The feature id for the '<em><b>Sucesor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIA__SUCESOR = TAREA__SUCESOR;

	/**
	 * The feature id for the '<em><b>Predecesor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIA__PREDECESOR = TAREA__PREDECESOR;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIA__ID = TAREA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Descripcion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIA__DESCRIPCION = TAREA_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Intermedia</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIA_FEATURE_COUNT = TAREA_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>R09 unidireccionalidad</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIA___R09_UNIDIRECCIONALIDAD__DIAGNOSTICCHAIN_MAP = TAREA___R09_UNIDIRECCIONALIDAD__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>R06 no Reflexiva</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIA___R06_NO_REFLEXIVA__DIAGNOSTICCHAIN_MAP = TAREA___R06_NO_REFLEXIVA__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>R08 Conexiones Entre Tareas</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIA___R08_CONEXIONES_ENTRE_TAREAS__DIAGNOSTICCHAIN_MAP = TAREA___R08_CONEXIONES_ENTRE_TAREAS__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Intermedia</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIA_OPERATION_COUNT = TAREA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link proyectomm.impl.UsuarioImpl <em>Usuario</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see proyectomm.impl.UsuarioImpl
	 * @see proyectomm.impl.ProyectommPackageImpl#getUsuario()
	 * @generated
	 */
	int USUARIO = 9;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUARIO__NOMBRE = INTERMEDIA__NOMBRE;

	/**
	 * The feature id for the '<em><b>Sucesor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUARIO__SUCESOR = INTERMEDIA__SUCESOR;

	/**
	 * The feature id for the '<em><b>Predecesor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUARIO__PREDECESOR = INTERMEDIA__PREDECESOR;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUARIO__ID = INTERMEDIA__ID;

	/**
	 * The feature id for the '<em><b>Descripcion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUARIO__DESCRIPCION = INTERMEDIA__DESCRIPCION;

	/**
	 * The feature id for the '<em><b>Tabla accedida por usuario</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUARIO__TABLA_ACCEDIDA_POR_USUARIO = INTERMEDIA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Usuario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUARIO_FEATURE_COUNT = INTERMEDIA_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>R09 unidireccionalidad</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUARIO___R09_UNIDIRECCIONALIDAD__DIAGNOSTICCHAIN_MAP = INTERMEDIA___R09_UNIDIRECCIONALIDAD__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>R06 no Reflexiva</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUARIO___R06_NO_REFLEXIVA__DIAGNOSTICCHAIN_MAP = INTERMEDIA___R06_NO_REFLEXIVA__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>R08 Conexiones Entre Tareas</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUARIO___R08_CONEXIONES_ENTRE_TAREAS__DIAGNOSTICCHAIN_MAP = INTERMEDIA___R08_CONEXIONES_ENTRE_TAREAS__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Usuario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUARIO_OPERATION_COUNT = INTERMEDIA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link proyectomm.impl.ServicioImpl <em>Servicio</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see proyectomm.impl.ServicioImpl
	 * @see proyectomm.impl.ProyectommPackageImpl#getServicio()
	 * @generated
	 */
	int SERVICIO = 10;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICIO__NOMBRE = INTERMEDIA__NOMBRE;

	/**
	 * The feature id for the '<em><b>Sucesor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICIO__SUCESOR = INTERMEDIA__SUCESOR;

	/**
	 * The feature id for the '<em><b>Predecesor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICIO__PREDECESOR = INTERMEDIA__PREDECESOR;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICIO__ID = INTERMEDIA__ID;

	/**
	 * The feature id for the '<em><b>Descripcion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICIO__DESCRIPCION = INTERMEDIA__DESCRIPCION;

	/**
	 * The feature id for the '<em><b>Tabla entrada servicio</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICIO__TABLA_ENTRADA_SERVICIO = INTERMEDIA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Tabla salida servicio</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICIO__TABLA_SALIDA_SERVICIO = INTERMEDIA_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Servicio</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICIO_FEATURE_COUNT = INTERMEDIA_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>R09 unidireccionalidad</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICIO___R09_UNIDIRECCIONALIDAD__DIAGNOSTICCHAIN_MAP = INTERMEDIA___R09_UNIDIRECCIONALIDAD__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>R06 no Reflexiva</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICIO___R06_NO_REFLEXIVA__DIAGNOSTICCHAIN_MAP = INTERMEDIA___R06_NO_REFLEXIVA__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>R08 Conexiones Entre Tareas</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICIO___R08_CONEXIONES_ENTRE_TAREAS__DIAGNOSTICCHAIN_MAP = INTERMEDIA___R08_CONEXIONES_ENTRE_TAREAS__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Servicio</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICIO_OPERATION_COUNT = INTERMEDIA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link proyectomm.impl.MensajeImpl <em>Mensaje</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see proyectomm.impl.MensajeImpl
	 * @see proyectomm.impl.ProyectommPackageImpl#getMensaje()
	 * @generated
	 */
	int MENSAJE = 11;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENSAJE__NOMBRE = INTERMEDIA__NOMBRE;

	/**
	 * The feature id for the '<em><b>Sucesor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENSAJE__SUCESOR = INTERMEDIA__SUCESOR;

	/**
	 * The feature id for the '<em><b>Predecesor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENSAJE__PREDECESOR = INTERMEDIA__PREDECESOR;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENSAJE__ID = INTERMEDIA__ID;

	/**
	 * The feature id for the '<em><b>Descripcion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENSAJE__DESCRIPCION = INTERMEDIA__DESCRIPCION;

	/**
	 * The feature id for the '<em><b>Tabla accedida por mensaje</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENSAJE__TABLA_ACCEDIDA_POR_MENSAJE = INTERMEDIA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Mensaje</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENSAJE_FEATURE_COUNT = INTERMEDIA_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>R09 unidireccionalidad</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENSAJE___R09_UNIDIRECCIONALIDAD__DIAGNOSTICCHAIN_MAP = INTERMEDIA___R09_UNIDIRECCIONALIDAD__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>R06 no Reflexiva</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENSAJE___R06_NO_REFLEXIVA__DIAGNOSTICCHAIN_MAP = INTERMEDIA___R06_NO_REFLEXIVA__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>R08 Conexiones Entre Tareas</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENSAJE___R08_CONEXIONES_ENTRE_TAREAS__DIAGNOSTICCHAIN_MAP = INTERMEDIA___R08_CONEXIONES_ENTRE_TAREAS__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Mensaje</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENSAJE_OPERATION_COUNT = INTERMEDIA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link proyectomm.impl.EnvioImpl <em>Envio</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see proyectomm.impl.EnvioImpl
	 * @see proyectomm.impl.ProyectommPackageImpl#getEnvio()
	 * @generated
	 */
	int ENVIO = 12;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIO__NOMBRE = MENSAJE__NOMBRE;

	/**
	 * The feature id for the '<em><b>Sucesor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIO__SUCESOR = MENSAJE__SUCESOR;

	/**
	 * The feature id for the '<em><b>Predecesor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIO__PREDECESOR = MENSAJE__PREDECESOR;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIO__ID = MENSAJE__ID;

	/**
	 * The feature id for the '<em><b>Descripcion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIO__DESCRIPCION = MENSAJE__DESCRIPCION;

	/**
	 * The feature id for the '<em><b>Tabla accedida por mensaje</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIO__TABLA_ACCEDIDA_POR_MENSAJE = MENSAJE__TABLA_ACCEDIDA_POR_MENSAJE;

	/**
	 * The number of structural features of the '<em>Envio</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIO_FEATURE_COUNT = MENSAJE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>R09 unidireccionalidad</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIO___R09_UNIDIRECCIONALIDAD__DIAGNOSTICCHAIN_MAP = MENSAJE___R09_UNIDIRECCIONALIDAD__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>R06 no Reflexiva</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIO___R06_NO_REFLEXIVA__DIAGNOSTICCHAIN_MAP = MENSAJE___R06_NO_REFLEXIVA__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>R08 Conexiones Entre Tareas</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIO___R08_CONEXIONES_ENTRE_TAREAS__DIAGNOSTICCHAIN_MAP = MENSAJE___R08_CONEXIONES_ENTRE_TAREAS__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Envio</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIO_OPERATION_COUNT = MENSAJE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link proyectomm.impl.RecepcionImpl <em>Recepcion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see proyectomm.impl.RecepcionImpl
	 * @see proyectomm.impl.ProyectommPackageImpl#getRecepcion()
	 * @generated
	 */
	int RECEPCION = 13;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEPCION__NOMBRE = MENSAJE__NOMBRE;

	/**
	 * The feature id for the '<em><b>Sucesor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEPCION__SUCESOR = MENSAJE__SUCESOR;

	/**
	 * The feature id for the '<em><b>Predecesor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEPCION__PREDECESOR = MENSAJE__PREDECESOR;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEPCION__ID = MENSAJE__ID;

	/**
	 * The feature id for the '<em><b>Descripcion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEPCION__DESCRIPCION = MENSAJE__DESCRIPCION;

	/**
	 * The feature id for the '<em><b>Tabla accedida por mensaje</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEPCION__TABLA_ACCEDIDA_POR_MENSAJE = MENSAJE__TABLA_ACCEDIDA_POR_MENSAJE;

	/**
	 * The number of structural features of the '<em>Recepcion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEPCION_FEATURE_COUNT = MENSAJE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>R09 unidireccionalidad</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEPCION___R09_UNIDIRECCIONALIDAD__DIAGNOSTICCHAIN_MAP = MENSAJE___R09_UNIDIRECCIONALIDAD__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>R06 no Reflexiva</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEPCION___R06_NO_REFLEXIVA__DIAGNOSTICCHAIN_MAP = MENSAJE___R06_NO_REFLEXIVA__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>R08 Conexiones Entre Tareas</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEPCION___R08_CONEXIONES_ENTRE_TAREAS__DIAGNOSTICCHAIN_MAP = MENSAJE___R08_CONEXIONES_ENTRE_TAREAS__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>R07 envio Asociado</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEPCION___R07_ENVIO_ASOCIADO__DIAGNOSTICCHAIN_MAP = MENSAJE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>P05 misma Tabla Que Envio</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEPCION___P05_MISMA_TABLA_QUE_ENVIO__DIAGNOSTICCHAIN_MAP = MENSAJE_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Recepcion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEPCION_OPERATION_COUNT = MENSAJE_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link proyectomm.impl.BDImpl <em>BD</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see proyectomm.impl.BDImpl
	 * @see proyectomm.impl.ProyectommPackageImpl#getBD()
	 * @generated
	 */
	int BD = 16;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BD__NOMBRE = INTERMEDIA__NOMBRE;

	/**
	 * The feature id for the '<em><b>Sucesor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BD__SUCESOR = INTERMEDIA__SUCESOR;

	/**
	 * The feature id for the '<em><b>Predecesor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BD__PREDECESOR = INTERMEDIA__PREDECESOR;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BD__ID = INTERMEDIA__ID;

	/**
	 * The feature id for the '<em><b>Descripcion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BD__DESCRIPCION = INTERMEDIA__DESCRIPCION;

	/**
	 * The feature id for the '<em><b>Atributo seleccionado</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BD__ATRIBUTO_SELECCIONADO = INTERMEDIA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>BD</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BD_FEATURE_COUNT = INTERMEDIA_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>R09 unidireccionalidad</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BD___R09_UNIDIRECCIONALIDAD__DIAGNOSTICCHAIN_MAP = INTERMEDIA___R09_UNIDIRECCIONALIDAD__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>R06 no Reflexiva</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BD___R06_NO_REFLEXIVA__DIAGNOSTICCHAIN_MAP = INTERMEDIA___R06_NO_REFLEXIVA__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>R08 Conexiones Entre Tareas</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BD___R08_CONEXIONES_ENTRE_TAREAS__DIAGNOSTICCHAIN_MAP = INTERMEDIA___R08_CONEXIONES_ENTRE_TAREAS__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>BD</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BD_OPERATION_COUNT = INTERMEDIA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link proyectomm.impl.BorradoImpl <em>Borrado</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see proyectomm.impl.BorradoImpl
	 * @see proyectomm.impl.ProyectommPackageImpl#getBorrado()
	 * @generated
	 */
	int BORRADO = 14;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BORRADO__NOMBRE = BD__NOMBRE;

	/**
	 * The feature id for the '<em><b>Sucesor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BORRADO__SUCESOR = BD__SUCESOR;

	/**
	 * The feature id for the '<em><b>Predecesor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BORRADO__PREDECESOR = BD__PREDECESOR;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BORRADO__ID = BD__ID;

	/**
	 * The feature id for the '<em><b>Descripcion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BORRADO__DESCRIPCION = BD__DESCRIPCION;

	/**
	 * The feature id for the '<em><b>Atributo seleccionado</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BORRADO__ATRIBUTO_SELECCIONADO = BD__ATRIBUTO_SELECCIONADO;

	/**
	 * The number of structural features of the '<em>Borrado</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BORRADO_FEATURE_COUNT = BD_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>R09 unidireccionalidad</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BORRADO___R09_UNIDIRECCIONALIDAD__DIAGNOSTICCHAIN_MAP = BD___R09_UNIDIRECCIONALIDAD__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>R06 no Reflexiva</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BORRADO___R06_NO_REFLEXIVA__DIAGNOSTICCHAIN_MAP = BD___R06_NO_REFLEXIVA__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>R08 Conexiones Entre Tareas</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BORRADO___R08_CONEXIONES_ENTRE_TAREAS__DIAGNOSTICCHAIN_MAP = BD___R08_CONEXIONES_ENTRE_TAREAS__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>P03 borrado Con Clave Primaria</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BORRADO___P03_BORRADO_CON_CLAVE_PRIMARIA__DIAGNOSTICCHAIN_MAP = BD_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Borrado</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BORRADO_OPERATION_COUNT = BD_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link proyectomm.impl.LecturaImpl <em>Lectura</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see proyectomm.impl.LecturaImpl
	 * @see proyectomm.impl.ProyectommPackageImpl#getLectura()
	 * @generated
	 */
	int LECTURA = 15;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LECTURA__NOMBRE = BD__NOMBRE;

	/**
	 * The feature id for the '<em><b>Sucesor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LECTURA__SUCESOR = BD__SUCESOR;

	/**
	 * The feature id for the '<em><b>Predecesor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LECTURA__PREDECESOR = BD__PREDECESOR;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LECTURA__ID = BD__ID;

	/**
	 * The feature id for the '<em><b>Descripcion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LECTURA__DESCRIPCION = BD__DESCRIPCION;

	/**
	 * The feature id for the '<em><b>Atributo seleccionado</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LECTURA__ATRIBUTO_SELECCIONADO = BD__ATRIBUTO_SELECCIONADO;

	/**
	 * The feature id for the '<em><b>Datos aleer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LECTURA__DATOS_ALEER = BD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Lectura</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LECTURA_FEATURE_COUNT = BD_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>R09 unidireccionalidad</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LECTURA___R09_UNIDIRECCIONALIDAD__DIAGNOSTICCHAIN_MAP = BD___R09_UNIDIRECCIONALIDAD__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>R06 no Reflexiva</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LECTURA___R06_NO_REFLEXIVA__DIAGNOSTICCHAIN_MAP = BD___R06_NO_REFLEXIVA__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>R08 Conexiones Entre Tareas</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LECTURA___R08_CONEXIONES_ENTRE_TAREAS__DIAGNOSTICCHAIN_MAP = BD___R08_CONEXIONES_ENTRE_TAREAS__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Lectura</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LECTURA_OPERATION_COUNT = BD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link proyectomm.impl.PrimaryKeyImpl <em>Primary Key</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see proyectomm.impl.PrimaryKeyImpl
	 * @see proyectomm.impl.ProyectommPackageImpl#getPrimaryKey()
	 * @generated
	 */
	int PRIMARY_KEY = 17;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_KEY__NOMBRE = ATRIBUTO__NOMBRE;

	/**
	 * The feature id for the '<em><b>Tipo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_KEY__TIPO = ATRIBUTO__TIPO;

	/**
	 * The feature id for the '<em><b>Opciones</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_KEY__OPCIONES = ATRIBUTO__OPCIONES;

	/**
	 * The number of structural features of the '<em>Primary Key</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_KEY_FEATURE_COUNT = ATRIBUTO_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>P01 tiene Opciones</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_KEY___P01_TIENE_OPCIONES__DIAGNOSTICCHAIN_MAP = ATRIBUTO___P01_TIENE_OPCIONES__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>P04 sin Espacios En Blanco</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_KEY___P04_SIN_ESPACIOS_EN_BLANCO__DIAGNOSTICCHAIN_MAP = ATRIBUTO___P04_SIN_ESPACIOS_EN_BLANCO__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Primary Key</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_KEY_OPERATION_COUNT = ATRIBUTO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link proyectomm.impl.ForeignKeyImpl <em>Foreign Key</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see proyectomm.impl.ForeignKeyImpl
	 * @see proyectomm.impl.ProyectommPackageImpl#getForeignKey()
	 * @generated
	 */
	int FOREIGN_KEY = 18;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_KEY__NOMBRE = ATRIBUTO__NOMBRE;

	/**
	 * The feature id for the '<em><b>Tipo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_KEY__TIPO = ATRIBUTO__TIPO;

	/**
	 * The feature id for the '<em><b>Opciones</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_KEY__OPCIONES = ATRIBUTO__OPCIONES;

	/**
	 * The feature id for the '<em><b>Referencia a</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_KEY__REFERENCIA_A = ATRIBUTO_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Foreign Key</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_KEY_FEATURE_COUNT = ATRIBUTO_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>P01 tiene Opciones</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_KEY___P01_TIENE_OPCIONES__DIAGNOSTICCHAIN_MAP = ATRIBUTO___P01_TIENE_OPCIONES__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>P04 sin Espacios En Blanco</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_KEY___P04_SIN_ESPACIOS_EN_BLANCO__DIAGNOSTICCHAIN_MAP = ATRIBUTO___P04_SIN_ESPACIOS_EN_BLANCO__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>P06 mismo Tipo Que PK</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_KEY___P06_MISMO_TIPO_QUE_PK__DIAGNOSTICCHAIN_MAP = ATRIBUTO_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>P07 PK En Otra Tabla</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_KEY___P07_PK_EN_OTRA_TABLA__DIAGNOSTICCHAIN_MAP = ATRIBUTO_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Foreign Key</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_KEY_OPERATION_COUNT = ATRIBUTO_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link proyectomm.impl.OpcionImpl <em>Opcion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see proyectomm.impl.OpcionImpl
	 * @see proyectomm.impl.ProyectommPackageImpl#getOpcion()
	 * @generated
	 */
	int OPCION = 19;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPCION__NOMBRE = 0;

	/**
	 * The number of structural features of the '<em>Opcion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPCION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Opcion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPCION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link proyectomm.EAtributo <em>EAtributo</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see proyectomm.EAtributo
	 * @see proyectomm.impl.ProyectommPackageImpl#getEAtributo()
	 * @generated
	 */
	int EATRIBUTO = 20;


	/**
	 * Returns the meta object for class '{@link proyectomm.ProcesoDeNegocio <em>Proceso De Negocio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Proceso De Negocio</em>'.
	 * @see proyectomm.ProcesoDeNegocio
	 * @generated
	 */
	EClass getProcesoDeNegocio();

	/**
	 * Returns the meta object for the containment reference list '{@link proyectomm.ProcesoDeNegocio#getBases_de_datos <em>Bases de datos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bases de datos</em>'.
	 * @see proyectomm.ProcesoDeNegocio#getBases_de_datos()
	 * @see #getProcesoDeNegocio()
	 * @generated
	 */
	EReference getProcesoDeNegocio_Bases_de_datos();

	/**
	 * Returns the meta object for the containment reference list '{@link proyectomm.ProcesoDeNegocio#getActores <em>Actores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actores</em>'.
	 * @see proyectomm.ProcesoDeNegocio#getActores()
	 * @see #getProcesoDeNegocio()
	 * @generated
	 */
	EReference getProcesoDeNegocio_Actores();

	/**
	 * Returns the meta object for the attribute '{@link proyectomm.ProcesoDeNegocio#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see proyectomm.ProcesoDeNegocio#getNombre()
	 * @see #getProcesoDeNegocio()
	 * @generated
	 */
	EAttribute getProcesoDeNegocio_Nombre();

	/**
	 * Returns the meta object for the '{@link proyectomm.ProcesoDeNegocio#R01_unaTareaInicial(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>R01 una Tarea Inicial</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>R01 una Tarea Inicial</em>' operation.
	 * @see proyectomm.ProcesoDeNegocio#R01_unaTareaInicial(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getProcesoDeNegocio__R01_unaTareaInicial__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link proyectomm.ProcesoDeNegocio#R02_unaTareaFinal(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>R02 una Tarea Final</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>R02 una Tarea Final</em>' operation.
	 * @see proyectomm.ProcesoDeNegocio#R02_unaTareaFinal(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getProcesoDeNegocio__R02_unaTareaFinal__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link proyectomm.Actor <em>Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actor</em>'.
	 * @see proyectomm.Actor
	 * @generated
	 */
	EClass getActor();

	/**
	 * Returns the meta object for the attribute '{@link proyectomm.Actor#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see proyectomm.Actor#getNombre()
	 * @see #getActor()
	 * @generated
	 */
	EAttribute getActor_Nombre();

	/**
	 * Returns the meta object for the containment reference list '{@link proyectomm.Actor#getTareas <em>Tareas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tareas</em>'.
	 * @see proyectomm.Actor#getTareas()
	 * @see #getActor()
	 * @generated
	 */
	EReference getActor_Tareas();

	/**
	 * Returns the meta object for the attribute '{@link proyectomm.Actor#getNum_tareas <em>Num tareas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Num tareas</em>'.
	 * @see proyectomm.Actor#getNum_tareas()
	 * @see #getActor()
	 * @generated
	 */
	EAttribute getActor_Num_tareas();

	/**
	 * Returns the meta object for the '{@link proyectomm.Actor#R05_minTareaIntermedia(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>R05 min Tarea Intermedia</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>R05 min Tarea Intermedia</em>' operation.
	 * @see proyectomm.Actor#R05_minTareaIntermedia(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getActor__R05_minTareaIntermedia__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link proyectomm.BaseDeDatos <em>Base De Datos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Base De Datos</em>'.
	 * @see proyectomm.BaseDeDatos
	 * @generated
	 */
	EClass getBaseDeDatos();

	/**
	 * Returns the meta object for the attribute '{@link proyectomm.BaseDeDatos#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see proyectomm.BaseDeDatos#getNombre()
	 * @see #getBaseDeDatos()
	 * @generated
	 */
	EAttribute getBaseDeDatos_Nombre();

	/**
	 * Returns the meta object for the containment reference list '{@link proyectomm.BaseDeDatos#getTablas <em>Tablas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tablas</em>'.
	 * @see proyectomm.BaseDeDatos#getTablas()
	 * @see #getBaseDeDatos()
	 * @generated
	 */
	EReference getBaseDeDatos_Tablas();

	/**
	 * Returns the meta object for class '{@link proyectomm.Tabla <em>Tabla</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tabla</em>'.
	 * @see proyectomm.Tabla
	 * @generated
	 */
	EClass getTabla();

	/**
	 * Returns the meta object for the attribute '{@link proyectomm.Tabla#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see proyectomm.Tabla#getNombre()
	 * @see #getTabla()
	 * @generated
	 */
	EAttribute getTabla_Nombre();

	/**
	 * Returns the meta object for the containment reference list '{@link proyectomm.Tabla#getAtributos <em>Atributos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Atributos</em>'.
	 * @see proyectomm.Tabla#getAtributos()
	 * @see #getTabla()
	 * @generated
	 */
	EReference getTabla_Atributos();

	/**
	 * Returns the meta object for the '{@link proyectomm.Tabla#P02_soloUnaClavePrimaria(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>P02 solo Una Clave Primaria</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>P02 solo Una Clave Primaria</em>' operation.
	 * @see proyectomm.Tabla#P02_soloUnaClavePrimaria(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getTabla__P02_soloUnaClavePrimaria__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link proyectomm.Tabla#P07_soloUnaClaveForanea(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>P07 solo Una Clave Foranea</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>P07 solo Una Clave Foranea</em>' operation.
	 * @see proyectomm.Tabla#P07_soloUnaClaveForanea(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getTabla__P07_soloUnaClaveForanea__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link proyectomm.Atributo <em>Atributo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Atributo</em>'.
	 * @see proyectomm.Atributo
	 * @generated
	 */
	EClass getAtributo();

	/**
	 * Returns the meta object for the attribute '{@link proyectomm.Atributo#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see proyectomm.Atributo#getNombre()
	 * @see #getAtributo()
	 * @generated
	 */
	EAttribute getAtributo_Nombre();

	/**
	 * Returns the meta object for the attribute '{@link proyectomm.Atributo#getTipo <em>Tipo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tipo</em>'.
	 * @see proyectomm.Atributo#getTipo()
	 * @see #getAtributo()
	 * @generated
	 */
	EAttribute getAtributo_Tipo();

	/**
	 * Returns the meta object for the containment reference list '{@link proyectomm.Atributo#getOpciones <em>Opciones</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Opciones</em>'.
	 * @see proyectomm.Atributo#getOpciones()
	 * @see #getAtributo()
	 * @generated
	 */
	EReference getAtributo_Opciones();

	/**
	 * Returns the meta object for the '{@link proyectomm.Atributo#P01_tieneOpciones(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>P01 tiene Opciones</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>P01 tiene Opciones</em>' operation.
	 * @see proyectomm.Atributo#P01_tieneOpciones(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getAtributo__P01_tieneOpciones__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link proyectomm.Atributo#P04_sinEspaciosEnBlanco(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>P04 sin Espacios En Blanco</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>P04 sin Espacios En Blanco</em>' operation.
	 * @see proyectomm.Atributo#P04_sinEspaciosEnBlanco(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getAtributo__P04_sinEspaciosEnBlanco__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link proyectomm.Tarea <em>Tarea</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tarea</em>'.
	 * @see proyectomm.Tarea
	 * @generated
	 */
	EClass getTarea();

	/**
	 * Returns the meta object for the attribute '{@link proyectomm.Tarea#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see proyectomm.Tarea#getNombre()
	 * @see #getTarea()
	 * @generated
	 */
	EAttribute getTarea_Nombre();

	/**
	 * Returns the meta object for the reference '{@link proyectomm.Tarea#getSucesor <em>Sucesor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sucesor</em>'.
	 * @see proyectomm.Tarea#getSucesor()
	 * @see #getTarea()
	 * @generated
	 */
	EReference getTarea_Sucesor();

	/**
	 * Returns the meta object for the reference '{@link proyectomm.Tarea#getPredecesor <em>Predecesor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Predecesor</em>'.
	 * @see proyectomm.Tarea#getPredecesor()
	 * @see #getTarea()
	 * @generated
	 */
	EReference getTarea_Predecesor();

	/**
	 * Returns the meta object for the '{@link proyectomm.Tarea#R09_unidireccionalidad(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>R09 unidireccionalidad</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>R09 unidireccionalidad</em>' operation.
	 * @see proyectomm.Tarea#R09_unidireccionalidad(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getTarea__R09_unidireccionalidad__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link proyectomm.Tarea#R06_noReflexiva(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>R06 no Reflexiva</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>R06 no Reflexiva</em>' operation.
	 * @see proyectomm.Tarea#R06_noReflexiva(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getTarea__R06_noReflexiva__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link proyectomm.Tarea#R08_ConexionesEntreTareas(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>R08 Conexiones Entre Tareas</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>R08 Conexiones Entre Tareas</em>' operation.
	 * @see proyectomm.Tarea#R08_ConexionesEntreTareas(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getTarea__R08_ConexionesEntreTareas__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link proyectomm.Inicio <em>Inicio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inicio</em>'.
	 * @see proyectomm.Inicio
	 * @generated
	 */
	EClass getInicio();

	/**
	 * Returns the meta object for the '{@link proyectomm.Inicio#R03_sinPredecesor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>R03 sin Predecesor</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>R03 sin Predecesor</em>' operation.
	 * @see proyectomm.Inicio#R03_sinPredecesor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getInicio__R03_sinPredecesor__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link proyectomm.Fin <em>Fin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fin</em>'.
	 * @see proyectomm.Fin
	 * @generated
	 */
	EClass getFin();

	/**
	 * Returns the meta object for the '{@link proyectomm.Fin#R04_sinSucesor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>R04 sin Sucesor</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>R04 sin Sucesor</em>' operation.
	 * @see proyectomm.Fin#R04_sinSucesor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getFin__R04_sinSucesor__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link proyectomm.Intermedia <em>Intermedia</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Intermedia</em>'.
	 * @see proyectomm.Intermedia
	 * @generated
	 */
	EClass getIntermedia();

	/**
	 * Returns the meta object for the attribute '{@link proyectomm.Intermedia#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see proyectomm.Intermedia#getId()
	 * @see #getIntermedia()
	 * @generated
	 */
	EAttribute getIntermedia_Id();

	/**
	 * Returns the meta object for the attribute '{@link proyectomm.Intermedia#getDescripcion <em>Descripcion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Descripcion</em>'.
	 * @see proyectomm.Intermedia#getDescripcion()
	 * @see #getIntermedia()
	 * @generated
	 */
	EAttribute getIntermedia_Descripcion();

	/**
	 * Returns the meta object for class '{@link proyectomm.Usuario <em>Usuario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Usuario</em>'.
	 * @see proyectomm.Usuario
	 * @generated
	 */
	EClass getUsuario();

	/**
	 * Returns the meta object for the reference '{@link proyectomm.Usuario#getTabla_accedida_por_usuario <em>Tabla accedida por usuario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tabla accedida por usuario</em>'.
	 * @see proyectomm.Usuario#getTabla_accedida_por_usuario()
	 * @see #getUsuario()
	 * @generated
	 */
	EReference getUsuario_Tabla_accedida_por_usuario();

	/**
	 * Returns the meta object for class '{@link proyectomm.Servicio <em>Servicio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Servicio</em>'.
	 * @see proyectomm.Servicio
	 * @generated
	 */
	EClass getServicio();

	/**
	 * Returns the meta object for the reference '{@link proyectomm.Servicio#getTabla_entrada_servicio <em>Tabla entrada servicio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tabla entrada servicio</em>'.
	 * @see proyectomm.Servicio#getTabla_entrada_servicio()
	 * @see #getServicio()
	 * @generated
	 */
	EReference getServicio_Tabla_entrada_servicio();

	/**
	 * Returns the meta object for the reference '{@link proyectomm.Servicio#getTabla_salida_servicio <em>Tabla salida servicio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tabla salida servicio</em>'.
	 * @see proyectomm.Servicio#getTabla_salida_servicio()
	 * @see #getServicio()
	 * @generated
	 */
	EReference getServicio_Tabla_salida_servicio();

	/**
	 * Returns the meta object for class '{@link proyectomm.Mensaje <em>Mensaje</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mensaje</em>'.
	 * @see proyectomm.Mensaje
	 * @generated
	 */
	EClass getMensaje();

	/**
	 * Returns the meta object for the reference '{@link proyectomm.Mensaje#getTabla_accedida_por_mensaje <em>Tabla accedida por mensaje</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tabla accedida por mensaje</em>'.
	 * @see proyectomm.Mensaje#getTabla_accedida_por_mensaje()
	 * @see #getMensaje()
	 * @generated
	 */
	EReference getMensaje_Tabla_accedida_por_mensaje();

	/**
	 * Returns the meta object for class '{@link proyectomm.Envio <em>Envio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Envio</em>'.
	 * @see proyectomm.Envio
	 * @generated
	 */
	EClass getEnvio();

	/**
	 * Returns the meta object for class '{@link proyectomm.Recepcion <em>Recepcion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Recepcion</em>'.
	 * @see proyectomm.Recepcion
	 * @generated
	 */
	EClass getRecepcion();

	/**
	 * Returns the meta object for the '{@link proyectomm.Recepcion#R07_envioAsociado(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>R07 envio Asociado</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>R07 envio Asociado</em>' operation.
	 * @see proyectomm.Recepcion#R07_envioAsociado(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getRecepcion__R07_envioAsociado__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link proyectomm.Recepcion#P05_mismaTablaQueEnvio(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>P05 misma Tabla Que Envio</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>P05 misma Tabla Que Envio</em>' operation.
	 * @see proyectomm.Recepcion#P05_mismaTablaQueEnvio(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getRecepcion__P05_mismaTablaQueEnvio__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link proyectomm.Borrado <em>Borrado</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Borrado</em>'.
	 * @see proyectomm.Borrado
	 * @generated
	 */
	EClass getBorrado();

	/**
	 * Returns the meta object for the '{@link proyectomm.Borrado#P03_borradoConClavePrimaria(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>P03 borrado Con Clave Primaria</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>P03 borrado Con Clave Primaria</em>' operation.
	 * @see proyectomm.Borrado#P03_borradoConClavePrimaria(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getBorrado__P03_borradoConClavePrimaria__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link proyectomm.Lectura <em>Lectura</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lectura</em>'.
	 * @see proyectomm.Lectura
	 * @generated
	 */
	EClass getLectura();

	/**
	 * Returns the meta object for the reference '{@link proyectomm.Lectura#getDatos_a_leer <em>Datos aleer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Datos aleer</em>'.
	 * @see proyectomm.Lectura#getDatos_a_leer()
	 * @see #getLectura()
	 * @generated
	 */
	EReference getLectura_Datos_a_leer();

	/**
	 * Returns the meta object for class '{@link proyectomm.BD <em>BD</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BD</em>'.
	 * @see proyectomm.BD
	 * @generated
	 */
	EClass getBD();

	/**
	 * Returns the meta object for the reference '{@link proyectomm.BD#getAtributo_seleccionado <em>Atributo seleccionado</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Atributo seleccionado</em>'.
	 * @see proyectomm.BD#getAtributo_seleccionado()
	 * @see #getBD()
	 * @generated
	 */
	EReference getBD_Atributo_seleccionado();

	/**
	 * Returns the meta object for class '{@link proyectomm.PrimaryKey <em>Primary Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primary Key</em>'.
	 * @see proyectomm.PrimaryKey
	 * @generated
	 */
	EClass getPrimaryKey();

	/**
	 * Returns the meta object for class '{@link proyectomm.ForeignKey <em>Foreign Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Foreign Key</em>'.
	 * @see proyectomm.ForeignKey
	 * @generated
	 */
	EClass getForeignKey();

	/**
	 * Returns the meta object for the reference '{@link proyectomm.ForeignKey#getReferencia_a <em>Referencia a</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Referencia a</em>'.
	 * @see proyectomm.ForeignKey#getReferencia_a()
	 * @see #getForeignKey()
	 * @generated
	 */
	EReference getForeignKey_Referencia_a();

	/**
	 * Returns the meta object for the '{@link proyectomm.ForeignKey#P06_mismoTipoQuePK(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>P06 mismo Tipo Que PK</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>P06 mismo Tipo Que PK</em>' operation.
	 * @see proyectomm.ForeignKey#P06_mismoTipoQuePK(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getForeignKey__P06_mismoTipoQuePK__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link proyectomm.ForeignKey#P07_PKEnOtraTabla(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>P07 PK En Otra Tabla</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>P07 PK En Otra Tabla</em>' operation.
	 * @see proyectomm.ForeignKey#P07_PKEnOtraTabla(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getForeignKey__P07_PKEnOtraTabla__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link proyectomm.Opcion <em>Opcion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Opcion</em>'.
	 * @see proyectomm.Opcion
	 * @generated
	 */
	EClass getOpcion();

	/**
	 * Returns the meta object for the attribute '{@link proyectomm.Opcion#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see proyectomm.Opcion#getNombre()
	 * @see #getOpcion()
	 * @generated
	 */
	EAttribute getOpcion_Nombre();

	/**
	 * Returns the meta object for enum '{@link proyectomm.EAtributo <em>EAtributo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>EAtributo</em>'.
	 * @see proyectomm.EAtributo
	 * @generated
	 */
	EEnum getEAtributo();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ProyectommFactory getProyectommFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link proyectomm.impl.ProcesoDeNegocioImpl <em>Proceso De Negocio</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see proyectomm.impl.ProcesoDeNegocioImpl
		 * @see proyectomm.impl.ProyectommPackageImpl#getProcesoDeNegocio()
		 * @generated
		 */
		EClass PROCESO_DE_NEGOCIO = eINSTANCE.getProcesoDeNegocio();

		/**
		 * The meta object literal for the '<em><b>Bases de datos</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESO_DE_NEGOCIO__BASES_DE_DATOS = eINSTANCE.getProcesoDeNegocio_Bases_de_datos();

		/**
		 * The meta object literal for the '<em><b>Actores</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESO_DE_NEGOCIO__ACTORES = eINSTANCE.getProcesoDeNegocio_Actores();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESO_DE_NEGOCIO__NOMBRE = eINSTANCE.getProcesoDeNegocio_Nombre();

		/**
		 * The meta object literal for the '<em><b>R01 una Tarea Inicial</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PROCESO_DE_NEGOCIO___R01_UNA_TAREA_INICIAL__DIAGNOSTICCHAIN_MAP = eINSTANCE.getProcesoDeNegocio__R01_unaTareaInicial__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>R02 una Tarea Final</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PROCESO_DE_NEGOCIO___R02_UNA_TAREA_FINAL__DIAGNOSTICCHAIN_MAP = eINSTANCE.getProcesoDeNegocio__R02_unaTareaFinal__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link proyectomm.impl.ActorImpl <em>Actor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see proyectomm.impl.ActorImpl
		 * @see proyectomm.impl.ProyectommPackageImpl#getActor()
		 * @generated
		 */
		EClass ACTOR = eINSTANCE.getActor();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTOR__NOMBRE = eINSTANCE.getActor_Nombre();

		/**
		 * The meta object literal for the '<em><b>Tareas</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTOR__TAREAS = eINSTANCE.getActor_Tareas();

		/**
		 * The meta object literal for the '<em><b>Num tareas</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTOR__NUM_TAREAS = eINSTANCE.getActor_Num_tareas();

		/**
		 * The meta object literal for the '<em><b>R05 min Tarea Intermedia</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACTOR___R05_MIN_TAREA_INTERMEDIA__DIAGNOSTICCHAIN_MAP = eINSTANCE.getActor__R05_minTareaIntermedia__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link proyectomm.impl.BaseDeDatosImpl <em>Base De Datos</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see proyectomm.impl.BaseDeDatosImpl
		 * @see proyectomm.impl.ProyectommPackageImpl#getBaseDeDatos()
		 * @generated
		 */
		EClass BASE_DE_DATOS = eINSTANCE.getBaseDeDatos();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASE_DE_DATOS__NOMBRE = eINSTANCE.getBaseDeDatos_Nombre();

		/**
		 * The meta object literal for the '<em><b>Tablas</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BASE_DE_DATOS__TABLAS = eINSTANCE.getBaseDeDatos_Tablas();

		/**
		 * The meta object literal for the '{@link proyectomm.impl.TablaImpl <em>Tabla</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see proyectomm.impl.TablaImpl
		 * @see proyectomm.impl.ProyectommPackageImpl#getTabla()
		 * @generated
		 */
		EClass TABLA = eINSTANCE.getTabla();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLA__NOMBRE = eINSTANCE.getTabla_Nombre();

		/**
		 * The meta object literal for the '<em><b>Atributos</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLA__ATRIBUTOS = eINSTANCE.getTabla_Atributos();

		/**
		 * The meta object literal for the '<em><b>P02 solo Una Clave Primaria</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TABLA___P02_SOLO_UNA_CLAVE_PRIMARIA__DIAGNOSTICCHAIN_MAP = eINSTANCE.getTabla__P02_soloUnaClavePrimaria__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>P07 solo Una Clave Foranea</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TABLA___P07_SOLO_UNA_CLAVE_FORANEA__DIAGNOSTICCHAIN_MAP = eINSTANCE.getTabla__P07_soloUnaClaveForanea__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link proyectomm.impl.AtributoImpl <em>Atributo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see proyectomm.impl.AtributoImpl
		 * @see proyectomm.impl.ProyectommPackageImpl#getAtributo()
		 * @generated
		 */
		EClass ATRIBUTO = eINSTANCE.getAtributo();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATRIBUTO__NOMBRE = eINSTANCE.getAtributo_Nombre();

		/**
		 * The meta object literal for the '<em><b>Tipo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATRIBUTO__TIPO = eINSTANCE.getAtributo_Tipo();

		/**
		 * The meta object literal for the '<em><b>Opciones</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATRIBUTO__OPCIONES = eINSTANCE.getAtributo_Opciones();

		/**
		 * The meta object literal for the '<em><b>P01 tiene Opciones</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ATRIBUTO___P01_TIENE_OPCIONES__DIAGNOSTICCHAIN_MAP = eINSTANCE.getAtributo__P01_tieneOpciones__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>P04 sin Espacios En Blanco</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ATRIBUTO___P04_SIN_ESPACIOS_EN_BLANCO__DIAGNOSTICCHAIN_MAP = eINSTANCE.getAtributo__P04_sinEspaciosEnBlanco__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link proyectomm.impl.TareaImpl <em>Tarea</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see proyectomm.impl.TareaImpl
		 * @see proyectomm.impl.ProyectommPackageImpl#getTarea()
		 * @generated
		 */
		EClass TAREA = eINSTANCE.getTarea();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAREA__NOMBRE = eINSTANCE.getTarea_Nombre();

		/**
		 * The meta object literal for the '<em><b>Sucesor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TAREA__SUCESOR = eINSTANCE.getTarea_Sucesor();

		/**
		 * The meta object literal for the '<em><b>Predecesor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TAREA__PREDECESOR = eINSTANCE.getTarea_Predecesor();

		/**
		 * The meta object literal for the '<em><b>R09 unidireccionalidad</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TAREA___R09_UNIDIRECCIONALIDAD__DIAGNOSTICCHAIN_MAP = eINSTANCE.getTarea__R09_unidireccionalidad__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>R06 no Reflexiva</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TAREA___R06_NO_REFLEXIVA__DIAGNOSTICCHAIN_MAP = eINSTANCE.getTarea__R06_noReflexiva__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>R08 Conexiones Entre Tareas</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TAREA___R08_CONEXIONES_ENTRE_TAREAS__DIAGNOSTICCHAIN_MAP = eINSTANCE.getTarea__R08_ConexionesEntreTareas__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link proyectomm.impl.InicioImpl <em>Inicio</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see proyectomm.impl.InicioImpl
		 * @see proyectomm.impl.ProyectommPackageImpl#getInicio()
		 * @generated
		 */
		EClass INICIO = eINSTANCE.getInicio();

		/**
		 * The meta object literal for the '<em><b>R03 sin Predecesor</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INICIO___R03_SIN_PREDECESOR__DIAGNOSTICCHAIN_MAP = eINSTANCE.getInicio__R03_sinPredecesor__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link proyectomm.impl.FinImpl <em>Fin</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see proyectomm.impl.FinImpl
		 * @see proyectomm.impl.ProyectommPackageImpl#getFin()
		 * @generated
		 */
		EClass FIN = eINSTANCE.getFin();

		/**
		 * The meta object literal for the '<em><b>R04 sin Sucesor</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FIN___R04_SIN_SUCESOR__DIAGNOSTICCHAIN_MAP = eINSTANCE.getFin__R04_sinSucesor__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link proyectomm.impl.IntermediaImpl <em>Intermedia</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see proyectomm.impl.IntermediaImpl
		 * @see proyectomm.impl.ProyectommPackageImpl#getIntermedia()
		 * @generated
		 */
		EClass INTERMEDIA = eINSTANCE.getIntermedia();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERMEDIA__ID = eINSTANCE.getIntermedia_Id();

		/**
		 * The meta object literal for the '<em><b>Descripcion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERMEDIA__DESCRIPCION = eINSTANCE.getIntermedia_Descripcion();

		/**
		 * The meta object literal for the '{@link proyectomm.impl.UsuarioImpl <em>Usuario</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see proyectomm.impl.UsuarioImpl
		 * @see proyectomm.impl.ProyectommPackageImpl#getUsuario()
		 * @generated
		 */
		EClass USUARIO = eINSTANCE.getUsuario();

		/**
		 * The meta object literal for the '<em><b>Tabla accedida por usuario</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USUARIO__TABLA_ACCEDIDA_POR_USUARIO = eINSTANCE.getUsuario_Tabla_accedida_por_usuario();

		/**
		 * The meta object literal for the '{@link proyectomm.impl.ServicioImpl <em>Servicio</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see proyectomm.impl.ServicioImpl
		 * @see proyectomm.impl.ProyectommPackageImpl#getServicio()
		 * @generated
		 */
		EClass SERVICIO = eINSTANCE.getServicio();

		/**
		 * The meta object literal for the '<em><b>Tabla entrada servicio</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICIO__TABLA_ENTRADA_SERVICIO = eINSTANCE.getServicio_Tabla_entrada_servicio();

		/**
		 * The meta object literal for the '<em><b>Tabla salida servicio</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICIO__TABLA_SALIDA_SERVICIO = eINSTANCE.getServicio_Tabla_salida_servicio();

		/**
		 * The meta object literal for the '{@link proyectomm.impl.MensajeImpl <em>Mensaje</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see proyectomm.impl.MensajeImpl
		 * @see proyectomm.impl.ProyectommPackageImpl#getMensaje()
		 * @generated
		 */
		EClass MENSAJE = eINSTANCE.getMensaje();

		/**
		 * The meta object literal for the '<em><b>Tabla accedida por mensaje</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MENSAJE__TABLA_ACCEDIDA_POR_MENSAJE = eINSTANCE.getMensaje_Tabla_accedida_por_mensaje();

		/**
		 * The meta object literal for the '{@link proyectomm.impl.EnvioImpl <em>Envio</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see proyectomm.impl.EnvioImpl
		 * @see proyectomm.impl.ProyectommPackageImpl#getEnvio()
		 * @generated
		 */
		EClass ENVIO = eINSTANCE.getEnvio();

		/**
		 * The meta object literal for the '{@link proyectomm.impl.RecepcionImpl <em>Recepcion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see proyectomm.impl.RecepcionImpl
		 * @see proyectomm.impl.ProyectommPackageImpl#getRecepcion()
		 * @generated
		 */
		EClass RECEPCION = eINSTANCE.getRecepcion();

		/**
		 * The meta object literal for the '<em><b>R07 envio Asociado</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RECEPCION___R07_ENVIO_ASOCIADO__DIAGNOSTICCHAIN_MAP = eINSTANCE.getRecepcion__R07_envioAsociado__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>P05 misma Tabla Que Envio</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RECEPCION___P05_MISMA_TABLA_QUE_ENVIO__DIAGNOSTICCHAIN_MAP = eINSTANCE.getRecepcion__P05_mismaTablaQueEnvio__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link proyectomm.impl.BorradoImpl <em>Borrado</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see proyectomm.impl.BorradoImpl
		 * @see proyectomm.impl.ProyectommPackageImpl#getBorrado()
		 * @generated
		 */
		EClass BORRADO = eINSTANCE.getBorrado();

		/**
		 * The meta object literal for the '<em><b>P03 borrado Con Clave Primaria</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BORRADO___P03_BORRADO_CON_CLAVE_PRIMARIA__DIAGNOSTICCHAIN_MAP = eINSTANCE.getBorrado__P03_borradoConClavePrimaria__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link proyectomm.impl.LecturaImpl <em>Lectura</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see proyectomm.impl.LecturaImpl
		 * @see proyectomm.impl.ProyectommPackageImpl#getLectura()
		 * @generated
		 */
		EClass LECTURA = eINSTANCE.getLectura();

		/**
		 * The meta object literal for the '<em><b>Datos aleer</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LECTURA__DATOS_ALEER = eINSTANCE.getLectura_Datos_a_leer();

		/**
		 * The meta object literal for the '{@link proyectomm.impl.BDImpl <em>BD</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see proyectomm.impl.BDImpl
		 * @see proyectomm.impl.ProyectommPackageImpl#getBD()
		 * @generated
		 */
		EClass BD = eINSTANCE.getBD();

		/**
		 * The meta object literal for the '<em><b>Atributo seleccionado</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BD__ATRIBUTO_SELECCIONADO = eINSTANCE.getBD_Atributo_seleccionado();

		/**
		 * The meta object literal for the '{@link proyectomm.impl.PrimaryKeyImpl <em>Primary Key</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see proyectomm.impl.PrimaryKeyImpl
		 * @see proyectomm.impl.ProyectommPackageImpl#getPrimaryKey()
		 * @generated
		 */
		EClass PRIMARY_KEY = eINSTANCE.getPrimaryKey();

		/**
		 * The meta object literal for the '{@link proyectomm.impl.ForeignKeyImpl <em>Foreign Key</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see proyectomm.impl.ForeignKeyImpl
		 * @see proyectomm.impl.ProyectommPackageImpl#getForeignKey()
		 * @generated
		 */
		EClass FOREIGN_KEY = eINSTANCE.getForeignKey();

		/**
		 * The meta object literal for the '<em><b>Referencia a</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOREIGN_KEY__REFERENCIA_A = eINSTANCE.getForeignKey_Referencia_a();

		/**
		 * The meta object literal for the '<em><b>P06 mismo Tipo Que PK</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FOREIGN_KEY___P06_MISMO_TIPO_QUE_PK__DIAGNOSTICCHAIN_MAP = eINSTANCE.getForeignKey__P06_mismoTipoQuePK__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>P07 PK En Otra Tabla</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FOREIGN_KEY___P07_PK_EN_OTRA_TABLA__DIAGNOSTICCHAIN_MAP = eINSTANCE.getForeignKey__P07_PKEnOtraTabla__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link proyectomm.impl.OpcionImpl <em>Opcion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see proyectomm.impl.OpcionImpl
		 * @see proyectomm.impl.ProyectommPackageImpl#getOpcion()
		 * @generated
		 */
		EClass OPCION = eINSTANCE.getOpcion();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPCION__NOMBRE = eINSTANCE.getOpcion_Nombre();

		/**
		 * The meta object literal for the '{@link proyectomm.EAtributo <em>EAtributo</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see proyectomm.EAtributo
		 * @see proyectomm.impl.ProyectommPackageImpl#getEAtributo()
		 * @generated
		 */
		EEnum EATRIBUTO = eINSTANCE.getEAtributo();

	}

} //ProyectommPackage
