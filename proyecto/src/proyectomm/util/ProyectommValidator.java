/**
 */
package proyectomm.util;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import proyectomm.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see proyectomm.ProyectommPackage
 * @generated
 */
public class ProyectommValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final ProyectommValidator INSTANCE = new ProyectommValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "proyectomm";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'R01 una Tarea Inicial' of 'Proceso De Negocio'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROCESO_DE_NEGOCIO__R01_UNA_TAREA_INICIAL = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'R02 una Tarea Final' of 'Proceso De Negocio'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROCESO_DE_NEGOCIO__R02_UNA_TAREA_FINAL = 2;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'R05 min Tarea Intermedia' of 'Actor'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ACTOR__R05_MIN_TAREA_INTERMEDIA = 3;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'P02 solo Una Clave Primaria' of 'Tabla'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int TABLA__P02_SOLO_UNA_CLAVE_PRIMARIA = 4;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'P07 solo Una Clave Foranea' of 'Tabla'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int TABLA__P07_SOLO_UNA_CLAVE_FORANEA = 5;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'P01 tiene Opciones' of 'Atributo'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ATRIBUTO__P01_TIENE_OPCIONES = 6;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'P04 sin Espacios En Blanco' of 'Atributo'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ATRIBUTO__P04_SIN_ESPACIOS_EN_BLANCO = 7;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'R09 unidireccionalidad' of 'Tarea'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int TAREA__R09_UNIDIRECCIONALIDAD = 8;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'R06 no Reflexiva' of 'Tarea'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int TAREA__R06_NO_REFLEXIVA = 9;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'R08 Conexiones Entre Tareas' of 'Tarea'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int TAREA__R08_CONEXIONES_ENTRE_TAREAS = 10;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'R03 sin Predecesor' of 'Inicio'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int INICIO__R03_SIN_PREDECESOR = 11;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'R04 sin Sucesor' of 'Fin'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FIN__R04_SIN_SUCESOR = 12;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'R07 envio Asociado' of 'Recepcion'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RECEPCION__R07_ENVIO_ASOCIADO = 13;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'P05 misma Tabla Que Envio' of 'Recepcion'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RECEPCION__P05_MISMA_TABLA_QUE_ENVIO = 14;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'P03 borrado Con Clave Primaria' of 'Borrado'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int BORRADO__P03_BORRADO_CON_CLAVE_PRIMARIA = 15;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'P06 mismo Tipo Que PK' of 'Foreign Key'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FOREIGN_KEY__P06_MISMO_TIPO_QUE_PK = 16;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'P07 PK En Otra Tabla' of 'Foreign Key'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FOREIGN_KEY__P07_PK_EN_OTRA_TABLA = 17;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 17;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProyectommValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return ProyectommPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case ProyectommPackage.PROCESO_DE_NEGOCIO:
				return validateProcesoDeNegocio((ProcesoDeNegocio)value, diagnostics, context);
			case ProyectommPackage.ACTOR:
				return validateActor((Actor)value, diagnostics, context);
			case ProyectommPackage.BASE_DE_DATOS:
				return validateBaseDeDatos((BaseDeDatos)value, diagnostics, context);
			case ProyectommPackage.TABLA:
				return validateTabla((Tabla)value, diagnostics, context);
			case ProyectommPackage.ATRIBUTO:
				return validateAtributo((Atributo)value, diagnostics, context);
			case ProyectommPackage.TAREA:
				return validateTarea((Tarea)value, diagnostics, context);
			case ProyectommPackage.INICIO:
				return validateInicio((Inicio)value, diagnostics, context);
			case ProyectommPackage.FIN:
				return validateFin((Fin)value, diagnostics, context);
			case ProyectommPackage.INTERMEDIA:
				return validateIntermedia((Intermedia)value, diagnostics, context);
			case ProyectommPackage.USUARIO:
				return validateUsuario((Usuario)value, diagnostics, context);
			case ProyectommPackage.SERVICIO:
				return validateServicio((Servicio)value, diagnostics, context);
			case ProyectommPackage.MENSAJE:
				return validateMensaje((Mensaje)value, diagnostics, context);
			case ProyectommPackage.ENVIO:
				return validateEnvio((Envio)value, diagnostics, context);
			case ProyectommPackage.RECEPCION:
				return validateRecepcion((Recepcion)value, diagnostics, context);
			case ProyectommPackage.BORRADO:
				return validateBorrado((Borrado)value, diagnostics, context);
			case ProyectommPackage.LECTURA:
				return validateLectura((Lectura)value, diagnostics, context);
			case ProyectommPackage.BD:
				return validateBD((BD)value, diagnostics, context);
			case ProyectommPackage.PRIMARY_KEY:
				return validatePrimaryKey((PrimaryKey)value, diagnostics, context);
			case ProyectommPackage.FOREIGN_KEY:
				return validateForeignKey((ForeignKey)value, diagnostics, context);
			case ProyectommPackage.OPCION:
				return validateOpcion((Opcion)value, diagnostics, context);
			case ProyectommPackage.EATRIBUTO:
				return validateEAtributo((EAtributo)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcesoDeNegocio(ProcesoDeNegocio procesoDeNegocio, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(procesoDeNegocio, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(procesoDeNegocio, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(procesoDeNegocio, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(procesoDeNegocio, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(procesoDeNegocio, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(procesoDeNegocio, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(procesoDeNegocio, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(procesoDeNegocio, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(procesoDeNegocio, diagnostics, context);
		if (result || diagnostics != null) result &= validateProcesoDeNegocio_R02_unaTareaFinal(procesoDeNegocio, diagnostics, context);
		if (result || diagnostics != null) result &= validateProcesoDeNegocio_R01_unaTareaInicial(procesoDeNegocio, diagnostics, context);
		return result;
	}

	/**
	 * Validates the R02_unaTareaFinal constraint of '<em>Proceso De Negocio</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcesoDeNegocio_R02_unaTareaFinal(ProcesoDeNegocio procesoDeNegocio, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return procesoDeNegocio.R02_unaTareaFinal(diagnostics, context);
	}

	/**
	 * Validates the R01_unaTareaInicial constraint of '<em>Proceso De Negocio</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcesoDeNegocio_R01_unaTareaInicial(ProcesoDeNegocio procesoDeNegocio, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return procesoDeNegocio.R01_unaTareaInicial(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActor(Actor actor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(actor, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(actor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(actor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(actor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(actor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(actor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(actor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(actor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(actor, diagnostics, context);
		if (result || diagnostics != null) result &= validateActor_R05_minTareaIntermedia(actor, diagnostics, context);
		return result;
	}

	/**
	 * Validates the R05_minTareaIntermedia constraint of '<em>Actor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActor_R05_minTareaIntermedia(Actor actor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return actor.R05_minTareaIntermedia(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBaseDeDatos(BaseDeDatos baseDeDatos, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(baseDeDatos, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTabla(Tabla tabla, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(tabla, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(tabla, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(tabla, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(tabla, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(tabla, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(tabla, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(tabla, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(tabla, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(tabla, diagnostics, context);
		if (result || diagnostics != null) result &= validateTabla_P07_soloUnaClaveForanea(tabla, diagnostics, context);
		if (result || diagnostics != null) result &= validateTabla_P02_soloUnaClavePrimaria(tabla, diagnostics, context);
		return result;
	}

	/**
	 * Validates the P07_soloUnaClaveForanea constraint of '<em>Tabla</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTabla_P07_soloUnaClaveForanea(Tabla tabla, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return tabla.P07_soloUnaClaveForanea(diagnostics, context);
	}

	/**
	 * Validates the P02_soloUnaClavePrimaria constraint of '<em>Tabla</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTabla_P02_soloUnaClavePrimaria(Tabla tabla, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return tabla.P02_soloUnaClavePrimaria(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAtributo(Atributo atributo, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(atributo, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(atributo, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(atributo, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(atributo, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(atributo, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(atributo, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(atributo, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(atributo, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(atributo, diagnostics, context);
		if (result || diagnostics != null) result &= validateAtributo_P04_sinEspaciosEnBlanco(atributo, diagnostics, context);
		if (result || diagnostics != null) result &= validateAtributo_P01_tieneOpciones(atributo, diagnostics, context);
		return result;
	}

	/**
	 * Validates the P04_sinEspaciosEnBlanco constraint of '<em>Atributo</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAtributo_P04_sinEspaciosEnBlanco(Atributo atributo, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return atributo.P04_sinEspaciosEnBlanco(diagnostics, context);
	}

	/**
	 * Validates the P01_tieneOpciones constraint of '<em>Atributo</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAtributo_P01_tieneOpciones(Atributo atributo, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return atributo.P01_tieneOpciones(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTarea(Tarea tarea, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(tarea, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(tarea, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(tarea, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(tarea, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(tarea, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(tarea, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(tarea, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(tarea, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(tarea, diagnostics, context);
		if (result || diagnostics != null) result &= validateTarea_R08_ConexionesEntreTareas(tarea, diagnostics, context);
		if (result || diagnostics != null) result &= validateTarea_R09_unidireccionalidad(tarea, diagnostics, context);
		if (result || diagnostics != null) result &= validateTarea_R06_noReflexiva(tarea, diagnostics, context);
		return result;
	}

	/**
	 * Validates the R08_ConexionesEntreTareas constraint of '<em>Tarea</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTarea_R08_ConexionesEntreTareas(Tarea tarea, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return tarea.R08_ConexionesEntreTareas(diagnostics, context);
	}

	/**
	 * Validates the R09_unidireccionalidad constraint of '<em>Tarea</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTarea_R09_unidireccionalidad(Tarea tarea, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return tarea.R09_unidireccionalidad(diagnostics, context);
	}

	/**
	 * Validates the R06_noReflexiva constraint of '<em>Tarea</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTarea_R06_noReflexiva(Tarea tarea, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return tarea.R06_noReflexiva(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInicio(Inicio inicio, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(inicio, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(inicio, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(inicio, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(inicio, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(inicio, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(inicio, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(inicio, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(inicio, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(inicio, diagnostics, context);
		if (result || diagnostics != null) result &= validateTarea_R08_ConexionesEntreTareas(inicio, diagnostics, context);
		if (result || diagnostics != null) result &= validateTarea_R09_unidireccionalidad(inicio, diagnostics, context);
		if (result || diagnostics != null) result &= validateTarea_R06_noReflexiva(inicio, diagnostics, context);
		if (result || diagnostics != null) result &= validateInicio_R03_sinPredecesor(inicio, diagnostics, context);
		return result;
	}

	/**
	 * Validates the R03_sinPredecesor constraint of '<em>Inicio</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInicio_R03_sinPredecesor(Inicio inicio, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return inicio.R03_sinPredecesor(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFin(Fin fin, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(fin, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(fin, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(fin, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(fin, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(fin, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(fin, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(fin, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(fin, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(fin, diagnostics, context);
		if (result || diagnostics != null) result &= validateTarea_R08_ConexionesEntreTareas(fin, diagnostics, context);
		if (result || diagnostics != null) result &= validateTarea_R09_unidireccionalidad(fin, diagnostics, context);
		if (result || diagnostics != null) result &= validateTarea_R06_noReflexiva(fin, diagnostics, context);
		if (result || diagnostics != null) result &= validateFin_R04_sinSucesor(fin, diagnostics, context);
		return result;
	}

	/**
	 * Validates the R04_sinSucesor constraint of '<em>Fin</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFin_R04_sinSucesor(Fin fin, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return fin.R04_sinSucesor(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIntermedia(Intermedia intermedia, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(intermedia, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(intermedia, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(intermedia, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(intermedia, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(intermedia, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(intermedia, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(intermedia, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(intermedia, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(intermedia, diagnostics, context);
		if (result || diagnostics != null) result &= validateTarea_R08_ConexionesEntreTareas(intermedia, diagnostics, context);
		if (result || diagnostics != null) result &= validateTarea_R09_unidireccionalidad(intermedia, diagnostics, context);
		if (result || diagnostics != null) result &= validateTarea_R06_noReflexiva(intermedia, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUsuario(Usuario usuario, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(usuario, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(usuario, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(usuario, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(usuario, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(usuario, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(usuario, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(usuario, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(usuario, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(usuario, diagnostics, context);
		if (result || diagnostics != null) result &= validateTarea_R08_ConexionesEntreTareas(usuario, diagnostics, context);
		if (result || diagnostics != null) result &= validateTarea_R09_unidireccionalidad(usuario, diagnostics, context);
		if (result || diagnostics != null) result &= validateTarea_R06_noReflexiva(usuario, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServicio(Servicio servicio, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(servicio, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(servicio, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(servicio, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(servicio, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(servicio, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(servicio, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(servicio, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(servicio, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(servicio, diagnostics, context);
		if (result || diagnostics != null) result &= validateTarea_R08_ConexionesEntreTareas(servicio, diagnostics, context);
		if (result || diagnostics != null) result &= validateTarea_R09_unidireccionalidad(servicio, diagnostics, context);
		if (result || diagnostics != null) result &= validateTarea_R06_noReflexiva(servicio, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMensaje(Mensaje mensaje, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(mensaje, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(mensaje, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(mensaje, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(mensaje, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(mensaje, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(mensaje, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(mensaje, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(mensaje, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(mensaje, diagnostics, context);
		if (result || diagnostics != null) result &= validateTarea_R08_ConexionesEntreTareas(mensaje, diagnostics, context);
		if (result || diagnostics != null) result &= validateTarea_R09_unidireccionalidad(mensaje, diagnostics, context);
		if (result || diagnostics != null) result &= validateTarea_R06_noReflexiva(mensaje, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnvio(Envio envio, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(envio, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(envio, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(envio, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(envio, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(envio, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(envio, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(envio, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(envio, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(envio, diagnostics, context);
		if (result || diagnostics != null) result &= validateTarea_R08_ConexionesEntreTareas(envio, diagnostics, context);
		if (result || diagnostics != null) result &= validateTarea_R09_unidireccionalidad(envio, diagnostics, context);
		if (result || diagnostics != null) result &= validateTarea_R06_noReflexiva(envio, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRecepcion(Recepcion recepcion, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(recepcion, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(recepcion, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(recepcion, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(recepcion, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(recepcion, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(recepcion, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(recepcion, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(recepcion, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(recepcion, diagnostics, context);
		if (result || diagnostics != null) result &= validateTarea_R08_ConexionesEntreTareas(recepcion, diagnostics, context);
		if (result || diagnostics != null) result &= validateTarea_R09_unidireccionalidad(recepcion, diagnostics, context);
		if (result || diagnostics != null) result &= validateTarea_R06_noReflexiva(recepcion, diagnostics, context);
		if (result || diagnostics != null) result &= validateRecepcion_P05_mismaTablaQueEnvio(recepcion, diagnostics, context);
		if (result || diagnostics != null) result &= validateRecepcion_R07_envioAsociado(recepcion, diagnostics, context);
		return result;
	}

	/**
	 * Validates the P05_mismaTablaQueEnvio constraint of '<em>Recepcion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRecepcion_P05_mismaTablaQueEnvio(Recepcion recepcion, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return recepcion.P05_mismaTablaQueEnvio(diagnostics, context);
	}

	/**
	 * Validates the R07_envioAsociado constraint of '<em>Recepcion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRecepcion_R07_envioAsociado(Recepcion recepcion, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return recepcion.R07_envioAsociado(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBorrado(Borrado borrado, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(borrado, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(borrado, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(borrado, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(borrado, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(borrado, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(borrado, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(borrado, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(borrado, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(borrado, diagnostics, context);
		if (result || diagnostics != null) result &= validateTarea_R08_ConexionesEntreTareas(borrado, diagnostics, context);
		if (result || diagnostics != null) result &= validateTarea_R09_unidireccionalidad(borrado, diagnostics, context);
		if (result || diagnostics != null) result &= validateTarea_R06_noReflexiva(borrado, diagnostics, context);
		if (result || diagnostics != null) result &= validateBorrado_P03_borradoConClavePrimaria(borrado, diagnostics, context);
		return result;
	}

	/**
	 * Validates the P03_borradoConClavePrimaria constraint of '<em>Borrado</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBorrado_P03_borradoConClavePrimaria(Borrado borrado, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return borrado.P03_borradoConClavePrimaria(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLectura(Lectura lectura, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(lectura, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(lectura, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(lectura, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(lectura, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(lectura, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(lectura, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(lectura, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(lectura, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(lectura, diagnostics, context);
		if (result || diagnostics != null) result &= validateTarea_R08_ConexionesEntreTareas(lectura, diagnostics, context);
		if (result || diagnostics != null) result &= validateTarea_R09_unidireccionalidad(lectura, diagnostics, context);
		if (result || diagnostics != null) result &= validateTarea_R06_noReflexiva(lectura, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBD(BD bd, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(bd, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(bd, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(bd, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(bd, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(bd, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(bd, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(bd, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(bd, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(bd, diagnostics, context);
		if (result || diagnostics != null) result &= validateTarea_R08_ConexionesEntreTareas(bd, diagnostics, context);
		if (result || diagnostics != null) result &= validateTarea_R09_unidireccionalidad(bd, diagnostics, context);
		if (result || diagnostics != null) result &= validateTarea_R06_noReflexiva(bd, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrimaryKey(PrimaryKey primaryKey, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(primaryKey, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(primaryKey, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(primaryKey, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(primaryKey, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(primaryKey, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(primaryKey, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(primaryKey, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(primaryKey, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(primaryKey, diagnostics, context);
		if (result || diagnostics != null) result &= validateAtributo_P04_sinEspaciosEnBlanco(primaryKey, diagnostics, context);
		if (result || diagnostics != null) result &= validateAtributo_P01_tieneOpciones(primaryKey, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateForeignKey(ForeignKey foreignKey, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(foreignKey, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(foreignKey, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(foreignKey, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(foreignKey, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(foreignKey, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(foreignKey, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(foreignKey, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(foreignKey, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(foreignKey, diagnostics, context);
		if (result || diagnostics != null) result &= validateAtributo_P04_sinEspaciosEnBlanco(foreignKey, diagnostics, context);
		if (result || diagnostics != null) result &= validateAtributo_P01_tieneOpciones(foreignKey, diagnostics, context);
		if (result || diagnostics != null) result &= validateForeignKey_P07_PKEnOtraTabla(foreignKey, diagnostics, context);
		if (result || diagnostics != null) result &= validateForeignKey_P06_mismoTipoQuePK(foreignKey, diagnostics, context);
		return result;
	}

	/**
	 * Validates the P07_PKEnOtraTabla constraint of '<em>Foreign Key</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateForeignKey_P07_PKEnOtraTabla(ForeignKey foreignKey, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return foreignKey.P07_PKEnOtraTabla(diagnostics, context);
	}

	/**
	 * Validates the P06_mismoTipoQuePK constraint of '<em>Foreign Key</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateForeignKey_P06_mismoTipoQuePK(ForeignKey foreignKey, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return foreignKey.P06_mismoTipoQuePK(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOpcion(Opcion opcion, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(opcion, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEAtributo(EAtributo eAtributo, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //ProyectommValidator
