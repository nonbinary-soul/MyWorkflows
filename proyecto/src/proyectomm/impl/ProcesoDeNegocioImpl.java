/**
 */
package proyectomm.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.ocl.pivot.evaluation.Executor;

import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;

import org.eclipse.ocl.pivot.library.classifier.ClassifierAllInstancesOperation;

import org.eclipse.ocl.pivot.library.collection.CollectionSizeOperation;

import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;

import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;

import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;

import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.SetValue;

import proyectomm.Actor;
import proyectomm.BaseDeDatos;
import proyectomm.ProcesoDeNegocio;
import proyectomm.ProyectommPackage;
import proyectomm.ProyectommTables;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Proceso De Negocio</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link proyectomm.impl.ProcesoDeNegocioImpl#getBases_de_datos <em>Bases de datos</em>}</li>
 *   <li>{@link proyectomm.impl.ProcesoDeNegocioImpl#getActores <em>Actores</em>}</li>
 *   <li>{@link proyectomm.impl.ProcesoDeNegocioImpl#getNombre <em>Nombre</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProcesoDeNegocioImpl extends MinimalEObjectImpl.Container implements ProcesoDeNegocio {
	/**
	 * The cached value of the '{@link #getBases_de_datos() <em>Bases de datos</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBases_de_datos()
	 * @generated
	 * @ordered
	 */
	protected EList<BaseDeDatos> bases_de_datos;

	/**
	 * The cached value of the '{@link #getActores() <em>Actores</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActores()
	 * @generated
	 * @ordered
	 */
	protected EList<Actor> actores;

	/**
	 * The default value of the '{@link #getNombre() <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombre()
	 * @generated
	 * @ordered
	 */
	protected static final String NOMBRE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNombre() <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombre()
	 * @generated
	 * @ordered
	 */
	protected String nombre = NOMBRE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcesoDeNegocioImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProyectommPackage.Literals.PROCESO_DE_NEGOCIO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BaseDeDatos> getBases_de_datos() {
		if (bases_de_datos == null) {
			bases_de_datos = new EObjectContainmentEList<BaseDeDatos>(BaseDeDatos.class, this, ProyectommPackage.PROCESO_DE_NEGOCIO__BASES_DE_DATOS);
		}
		return bases_de_datos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Actor> getActores() {
		if (actores == null) {
			actores = new EObjectContainmentEList<Actor>(Actor.class, this, ProyectommPackage.PROCESO_DE_NEGOCIO__ACTORES);
		}
		return actores;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNombre() {
		return nombre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNombre(String newNombre) {
		String oldNombre = nombre;
		nombre = newNombre;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProyectommPackage.PROCESO_DE_NEGOCIO__NOMBRE, oldNombre, nombre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean R01_unaTareaInicial(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "ProcesoDeNegocio::R01_unaTareaInicial";
		try {
			/**
			 *
			 * inv R01_unaTareaInicial:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[1] = Inicio.allInstances()->size() = 1
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, ProyectommPackage.Literals.PROCESO_DE_NEGOCIO___R01_UNA_TAREA_INICIAL__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, ProyectommTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			}
			else {
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_proyectomm_c_c_Inicio = idResolver.getClass(ProyectommTables.CLSSid_Inicio, null);
				final /*@NonInvalid*/ SetValue allInstances = ClassifierAllInstancesOperation.INSTANCE.evaluate(executor, ProyectommTables.SET_CLSSid_Inicio, TYP_proyectomm_c_c_Inicio);
				final /*@NonInvalid*/ IntegerValue size = CollectionSizeOperation.INSTANCE.evaluate(allInstances);
				final /*@NonInvalid*/ boolean result = size.equals(ProyectommTables.INT_1);
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, ProyectommTables.INT_0).booleanValue();
				local_0 = logDiagnostic;
			}
			return local_0;
		}
		catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean R02_unaTareaFinal(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "ProcesoDeNegocio::R02_unaTareaFinal";
		try {
			/**
			 *
			 * inv R02_unaTareaFinal:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[1] = Fin.allInstances()->size() = 1
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, ProyectommPackage.Literals.PROCESO_DE_NEGOCIO___R02_UNA_TAREA_FINAL__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, ProyectommTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			}
			else {
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_proyectomm_c_c_Fin = idResolver.getClass(ProyectommTables.CLSSid_Fin, null);
				final /*@NonInvalid*/ SetValue allInstances = ClassifierAllInstancesOperation.INSTANCE.evaluate(executor, ProyectommTables.SET_CLSSid_Fin, TYP_proyectomm_c_c_Fin);
				final /*@NonInvalid*/ IntegerValue size = CollectionSizeOperation.INSTANCE.evaluate(allInstances);
				final /*@NonInvalid*/ boolean result = size.equals(ProyectommTables.INT_1);
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, ProyectommTables.INT_0).booleanValue();
				local_0 = logDiagnostic;
			}
			return local_0;
		}
		catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProyectommPackage.PROCESO_DE_NEGOCIO__BASES_DE_DATOS:
				return ((InternalEList<?>)getBases_de_datos()).basicRemove(otherEnd, msgs);
			case ProyectommPackage.PROCESO_DE_NEGOCIO__ACTORES:
				return ((InternalEList<?>)getActores()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProyectommPackage.PROCESO_DE_NEGOCIO__BASES_DE_DATOS:
				return getBases_de_datos();
			case ProyectommPackage.PROCESO_DE_NEGOCIO__ACTORES:
				return getActores();
			case ProyectommPackage.PROCESO_DE_NEGOCIO__NOMBRE:
				return getNombre();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ProyectommPackage.PROCESO_DE_NEGOCIO__BASES_DE_DATOS:
				getBases_de_datos().clear();
				getBases_de_datos().addAll((Collection<? extends BaseDeDatos>)newValue);
				return;
			case ProyectommPackage.PROCESO_DE_NEGOCIO__ACTORES:
				getActores().clear();
				getActores().addAll((Collection<? extends Actor>)newValue);
				return;
			case ProyectommPackage.PROCESO_DE_NEGOCIO__NOMBRE:
				setNombre((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ProyectommPackage.PROCESO_DE_NEGOCIO__BASES_DE_DATOS:
				getBases_de_datos().clear();
				return;
			case ProyectommPackage.PROCESO_DE_NEGOCIO__ACTORES:
				getActores().clear();
				return;
			case ProyectommPackage.PROCESO_DE_NEGOCIO__NOMBRE:
				setNombre(NOMBRE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ProyectommPackage.PROCESO_DE_NEGOCIO__BASES_DE_DATOS:
				return bases_de_datos != null && !bases_de_datos.isEmpty();
			case ProyectommPackage.PROCESO_DE_NEGOCIO__ACTORES:
				return actores != null && !actores.isEmpty();
			case ProyectommPackage.PROCESO_DE_NEGOCIO__NOMBRE:
				return NOMBRE_EDEFAULT == null ? nombre != null : !NOMBRE_EDEFAULT.equals(nombre);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ProyectommPackage.PROCESO_DE_NEGOCIO___R01_UNA_TAREA_INICIAL__DIAGNOSTICCHAIN_MAP:
				return R01_unaTareaInicial((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case ProyectommPackage.PROCESO_DE_NEGOCIO___R02_UNA_TAREA_FINAL__DIAGNOSTICCHAIN_MAP:
				return R02_unaTareaFinal((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (nombre: ");
		result.append(nombre);
		result.append(')');
		return result.toString();
	}

} //ProcesoDeNegocioImpl
