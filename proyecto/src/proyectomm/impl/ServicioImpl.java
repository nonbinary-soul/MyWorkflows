/**
 */
package proyectomm.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Map;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.ocl.pivot.evaluation.Executor;

import org.eclipse.ocl.pivot.ids.TypeId;

import org.eclipse.ocl.pivot.library.collection.CollectionIsEmptyOperation;

import org.eclipse.ocl.pivot.library.oclany.OclAnyOclAsSetOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;

import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;

import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;

import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.InvalidValueException;
import org.eclipse.ocl.pivot.values.SetValue;

import proyectomm.ProyectommPackage;
import proyectomm.ProyectommTables;
import proyectomm.Servicio;
import proyectomm.Tabla;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Servicio</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link proyectomm.impl.ServicioImpl#getTabla_entrada_servicio <em>Tabla entrada servicio</em>}</li>
 *   <li>{@link proyectomm.impl.ServicioImpl#getTabla_salida_servicio <em>Tabla salida servicio</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServicioImpl extends IntermediaImpl implements Servicio {
	/**
	 * The cached value of the '{@link #getTabla_entrada_servicio() <em>Tabla entrada servicio</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTabla_entrada_servicio()
	 * @generated
	 * @ordered
	 */
	protected Tabla tabla_entrada_servicio;

	/**
	 * The cached value of the '{@link #getTabla_salida_servicio() <em>Tabla salida servicio</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTabla_salida_servicio()
	 * @generated
	 * @ordered
	 */
	protected Tabla tabla_salida_servicio;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServicioImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProyectommPackage.Literals.SERVICIO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Tabla getTabla_entrada_servicio() {
		if (tabla_entrada_servicio != null && tabla_entrada_servicio.eIsProxy()) {
			InternalEObject oldTabla_entrada_servicio = (InternalEObject)tabla_entrada_servicio;
			tabla_entrada_servicio = (Tabla)eResolveProxy(oldTabla_entrada_servicio);
			if (tabla_entrada_servicio != oldTabla_entrada_servicio) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProyectommPackage.SERVICIO__TABLA_ENTRADA_SERVICIO, oldTabla_entrada_servicio, tabla_entrada_servicio));
			}
		}
		return tabla_entrada_servicio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tabla basicGetTabla_entrada_servicio() {
		return tabla_entrada_servicio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTabla_entrada_servicio(Tabla newTabla_entrada_servicio) {
		Tabla oldTabla_entrada_servicio = tabla_entrada_servicio;
		tabla_entrada_servicio = newTabla_entrada_servicio;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProyectommPackage.SERVICIO__TABLA_ENTRADA_SERVICIO, oldTabla_entrada_servicio, tabla_entrada_servicio));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Tabla getTabla_salida_servicio() {
		if (tabla_salida_servicio != null && tabla_salida_servicio.eIsProxy()) {
			InternalEObject oldTabla_salida_servicio = (InternalEObject)tabla_salida_servicio;
			tabla_salida_servicio = (Tabla)eResolveProxy(oldTabla_salida_servicio);
			if (tabla_salida_servicio != oldTabla_salida_servicio) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProyectommPackage.SERVICIO__TABLA_SALIDA_SERVICIO, oldTabla_salida_servicio, tabla_salida_servicio));
			}
		}
		return tabla_salida_servicio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tabla basicGetTabla_salida_servicio() {
		return tabla_salida_servicio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTabla_salida_servicio(Tabla newTabla_salida_servicio) {
		Tabla oldTabla_salida_servicio = tabla_salida_servicio;
		tabla_salida_servicio = newTabla_salida_servicio;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProyectommPackage.SERVICIO__TABLA_SALIDA_SERVICIO, oldTabla_salida_servicio, tabla_salida_servicio));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean P09_alMenosUnaTabla(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Servicio::P09_alMenosUnaTabla";
		try {
			/**
			 *
			 * inv P09_alMenosUnaTabla:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[?] = not self.tabla_entrada_servicio->isEmpty() or
			 *         not self.tabla_salida_servicio->isEmpty()
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, ProyectommPackage.Literals.SERVICIO___P09_AL_MENOS_UNA_TABLA__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, ProyectommTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			}
			else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					/*@Caught*/ Object CAUGHT_not;
					try {
						/*@Caught*/ Object CAUGHT_isEmpty;
						try {
							final /*@NonInvalid*/ Tabla tabla_entrada_servicio = this.getTabla_entrada_servicio();
							final /*@Thrown*/ SetValue oclAsSet = OclAnyOclAsSetOperation.INSTANCE.evaluate(executor, ProyectommTables.SET_CLSSid_Tabla, tabla_entrada_servicio);
							final /*@Thrown*/ boolean isEmpty = CollectionIsEmptyOperation.INSTANCE.evaluate(oclAsSet).booleanValue();
							CAUGHT_isEmpty = isEmpty;
						}
						catch (Exception e) {
							CAUGHT_isEmpty = ValueUtil.createInvalidValue(e);
						}
						if (CAUGHT_isEmpty instanceof InvalidValueException) {
							throw (InvalidValueException)CAUGHT_isEmpty;
						}
						final /*@Thrown*/ Boolean not;
						if (CAUGHT_isEmpty == ValueUtil.FALSE_VALUE) {
							not = ValueUtil.TRUE_VALUE;
						}
						else {
							if (CAUGHT_isEmpty == ValueUtil.TRUE_VALUE) {
								not = ValueUtil.FALSE_VALUE;
							}
							else {
								not = null;
							}
						}
						CAUGHT_not = not;
					}
					catch (Exception e) {
						CAUGHT_not = ValueUtil.createInvalidValue(e);
					}
					final /*@Thrown*/ Boolean result;
					if (CAUGHT_not == ValueUtil.TRUE_VALUE) {
						result = ValueUtil.TRUE_VALUE;
					}
					else {
						/*@Caught*/ Object CAUGHT_not_0;
						try {
							/*@Caught*/ Object CAUGHT_isEmpty_0;
							try {
								final /*@NonInvalid*/ Tabla tabla_salida_servicio = this.getTabla_salida_servicio();
								final /*@Thrown*/ SetValue oclAsSet_0 = OclAnyOclAsSetOperation.INSTANCE.evaluate(executor, ProyectommTables.SET_CLSSid_Tabla, tabla_salida_servicio);
								final /*@Thrown*/ boolean isEmpty_0 = CollectionIsEmptyOperation.INSTANCE.evaluate(oclAsSet_0).booleanValue();
								CAUGHT_isEmpty_0 = isEmpty_0;
							}
							catch (Exception e) {
								CAUGHT_isEmpty_0 = ValueUtil.createInvalidValue(e);
							}
							if (CAUGHT_isEmpty_0 instanceof InvalidValueException) {
								throw (InvalidValueException)CAUGHT_isEmpty_0;
							}
							final /*@Thrown*/ Boolean not_0;
							if (CAUGHT_isEmpty_0 == ValueUtil.FALSE_VALUE) {
								not_0 = ValueUtil.TRUE_VALUE;
							}
							else {
								if (CAUGHT_isEmpty_0 == ValueUtil.TRUE_VALUE) {
									not_0 = ValueUtil.FALSE_VALUE;
								}
								else {
									not_0 = null;
								}
							}
							CAUGHT_not_0 = not_0;
						}
						catch (Exception e) {
							CAUGHT_not_0 = ValueUtil.createInvalidValue(e);
						}
						if (CAUGHT_not_0 == ValueUtil.TRUE_VALUE) {
							result = ValueUtil.TRUE_VALUE;
						}
						else {
							if (CAUGHT_not instanceof InvalidValueException) {
								throw (InvalidValueException)CAUGHT_not;
							}
							if (CAUGHT_not_0 instanceof InvalidValueException) {
								throw (InvalidValueException)CAUGHT_not_0;
							}
							if ((CAUGHT_not == null) || (CAUGHT_not_0 == null)) {
								result = null;
							}
							else {
								result = ValueUtil.FALSE_VALUE;
							}
						}
					}
					CAUGHT_result = result;
				}
				catch (Exception e) {
					CAUGHT_result = ValueUtil.createInvalidValue(e);
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_result, ProyectommTables.INT_0).booleanValue();
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProyectommPackage.SERVICIO__TABLA_ENTRADA_SERVICIO:
				if (resolve) return getTabla_entrada_servicio();
				return basicGetTabla_entrada_servicio();
			case ProyectommPackage.SERVICIO__TABLA_SALIDA_SERVICIO:
				if (resolve) return getTabla_salida_servicio();
				return basicGetTabla_salida_servicio();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ProyectommPackage.SERVICIO__TABLA_ENTRADA_SERVICIO:
				setTabla_entrada_servicio((Tabla)newValue);
				return;
			case ProyectommPackage.SERVICIO__TABLA_SALIDA_SERVICIO:
				setTabla_salida_servicio((Tabla)newValue);
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
			case ProyectommPackage.SERVICIO__TABLA_ENTRADA_SERVICIO:
				setTabla_entrada_servicio((Tabla)null);
				return;
			case ProyectommPackage.SERVICIO__TABLA_SALIDA_SERVICIO:
				setTabla_salida_servicio((Tabla)null);
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
			case ProyectommPackage.SERVICIO__TABLA_ENTRADA_SERVICIO:
				return tabla_entrada_servicio != null;
			case ProyectommPackage.SERVICIO__TABLA_SALIDA_SERVICIO:
				return tabla_salida_servicio != null;
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
			case ProyectommPackage.SERVICIO___P09_AL_MENOS_UNA_TABLA__DIAGNOSTICCHAIN_MAP:
				return P09_alMenosUnaTabla((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //ServicioImpl
