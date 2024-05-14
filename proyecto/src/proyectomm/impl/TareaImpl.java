/**
 */
package proyectomm.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.ocl.pivot.evaluation.Executor;

import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;

import org.eclipse.ocl.pivot.library.classifier.ClassifierOclContainerOperation;

import org.eclipse.ocl.pivot.library.collection.CollectionIsEmptyOperation;
import org.eclipse.ocl.pivot.library.collection.CollectionSizeOperation;

import org.eclipse.ocl.pivot.library.oclany.OclAnyOclAsSetOperation;
import org.eclipse.ocl.pivot.library.oclany.OclAnyOclIsTypeOfOperation;
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
import proyectomm.Tarea;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tarea</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link proyectomm.impl.TareaImpl#getSucesor <em>Sucesor</em>}</li>
 *   <li>{@link proyectomm.impl.TareaImpl#getPredecesor <em>Predecesor</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class TareaImpl extends EObjectImpl implements Tarea {
	/**
	 * The cached value of the '{@link #getSucesor() <em>Sucesor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSucesor()
	 * @generated
	 * @ordered
	 */
	protected Tarea sucesor;

	/**
	 * The cached value of the '{@link #getPredecesor() <em>Predecesor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPredecesor()
	 * @generated
	 * @ordered
	 */
	protected Tarea predecesor;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TareaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProyectommPackage.Literals.TAREA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Tarea getSucesor() {
		if (sucesor != null && sucesor.eIsProxy()) {
			InternalEObject oldSucesor = (InternalEObject)sucesor;
			sucesor = (Tarea)eResolveProxy(oldSucesor);
			if (sucesor != oldSucesor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProyectommPackage.TAREA__SUCESOR, oldSucesor, sucesor));
			}
		}
		return sucesor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tarea basicGetSucesor() {
		return sucesor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSucesor(Tarea newSucesor, NotificationChain msgs) {
		Tarea oldSucesor = sucesor;
		sucesor = newSucesor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProyectommPackage.TAREA__SUCESOR, oldSucesor, newSucesor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSucesor(Tarea newSucesor) {
		if (newSucesor != sucesor) {
			NotificationChain msgs = null;
			if (sucesor != null)
				msgs = ((InternalEObject)sucesor).eInverseRemove(this, ProyectommPackage.TAREA__PREDECESOR, Tarea.class, msgs);
			if (newSucesor != null)
				msgs = ((InternalEObject)newSucesor).eInverseAdd(this, ProyectommPackage.TAREA__PREDECESOR, Tarea.class, msgs);
			msgs = basicSetSucesor(newSucesor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProyectommPackage.TAREA__SUCESOR, newSucesor, newSucesor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Tarea getPredecesor() {
		if (predecesor != null && predecesor.eIsProxy()) {
			InternalEObject oldPredecesor = (InternalEObject)predecesor;
			predecesor = (Tarea)eResolveProxy(oldPredecesor);
			if (predecesor != oldPredecesor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProyectommPackage.TAREA__PREDECESOR, oldPredecesor, predecesor));
			}
		}
		return predecesor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tarea basicGetPredecesor() {
		return predecesor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPredecesor(Tarea newPredecesor, NotificationChain msgs) {
		Tarea oldPredecesor = predecesor;
		predecesor = newPredecesor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProyectommPackage.TAREA__PREDECESOR, oldPredecesor, newPredecesor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPredecesor(Tarea newPredecesor) {
		if (newPredecesor != predecesor) {
			NotificationChain msgs = null;
			if (predecesor != null)
				msgs = ((InternalEObject)predecesor).eInverseRemove(this, ProyectommPackage.TAREA__SUCESOR, Tarea.class, msgs);
			if (newPredecesor != null)
				msgs = ((InternalEObject)newPredecesor).eInverseAdd(this, ProyectommPackage.TAREA__SUCESOR, Tarea.class, msgs);
			msgs = basicSetPredecesor(newPredecesor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProyectommPackage.TAREA__PREDECESOR, newPredecesor, newPredecesor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean R09_unidireccionalidad(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Tarea::R09_unidireccionalidad";
		try {
			/**
			 *
			 * inv R09_unidireccionalidad:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[?] = self.predecesor->size() <= 1 and
			 *         self.sucesor->size() <= 1
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, ProyectommPackage.Literals.TAREA___R09_UNIDIRECCIONALIDAD__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, ProyectommTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			}
			else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					/*@Caught*/ Object CAUGHT_le_0;
					try {
						final /*@NonInvalid*/ Tarea predecesor = this.getPredecesor();
						final /*@Thrown*/ SetValue oclAsSet = OclAnyOclAsSetOperation.INSTANCE.evaluate(executor, ProyectommTables.SET_CLSSid_Tarea, predecesor);
						final /*@Thrown*/ IntegerValue size = CollectionSizeOperation.INSTANCE.evaluate(oclAsSet);
						final /*@Thrown*/ boolean le_0 = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, size, ProyectommTables.INT_1).booleanValue();
						CAUGHT_le_0 = le_0;
					}
					catch (Exception e) {
						CAUGHT_le_0 = ValueUtil.createInvalidValue(e);
					}
					final /*@Thrown*/ Boolean result;
					if (CAUGHT_le_0 == ValueUtil.FALSE_VALUE) {
						result = ValueUtil.FALSE_VALUE;
					}
					else {
						/*@Caught*/ Object CAUGHT_le_1;
						try {
							final /*@NonInvalid*/ Tarea sucesor = this.getSucesor();
							final /*@Thrown*/ SetValue oclAsSet_0 = OclAnyOclAsSetOperation.INSTANCE.evaluate(executor, ProyectommTables.SET_CLSSid_Tarea, sucesor);
							final /*@Thrown*/ IntegerValue size_0 = CollectionSizeOperation.INSTANCE.evaluate(oclAsSet_0);
							final /*@Thrown*/ boolean le_1 = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, size_0, ProyectommTables.INT_1).booleanValue();
							CAUGHT_le_1 = le_1;
						}
						catch (Exception e) {
							CAUGHT_le_1 = ValueUtil.createInvalidValue(e);
						}
						if (CAUGHT_le_1 == ValueUtil.FALSE_VALUE) {
							result = ValueUtil.FALSE_VALUE;
						}
						else {
							if (CAUGHT_le_0 instanceof InvalidValueException) {
								throw (InvalidValueException)CAUGHT_le_0;
							}
							if (CAUGHT_le_1 instanceof InvalidValueException) {
								throw (InvalidValueException)CAUGHT_le_1;
							}
							result = ValueUtil.TRUE_VALUE;
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
	public boolean R06_noReflexiva(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Tarea::R06_noReflexiva";
		try {
			/**
			 *
			 * inv R06_noReflexiva:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[1] = sucesor <> self
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, ProyectommPackage.Literals.TAREA___R06_NO_REFLEXIVA__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, ProyectommTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			}
			else {
				final /*@NonInvalid*/ Tarea sucesor = this.getSucesor();
				final /*@NonInvalid*/ boolean result = !this.equals(sucesor);
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
	public boolean R08_ConexionesEntreTareas(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Tarea::R08_ConexionesEntreTareas";
		try {
			/**
			 *
			 * inv R08_ConexionesEntreTareas:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[?] = if self.oclIsTypeOf(Envio)
			 *         then self.oclContainer() <> self.sucesor.oclContainer()
			 *         else
			 *           self.sucesor->isEmpty() or
			 *           self.sucesor.oclContainer() =
			 *           self.oclContainer()
			 *         endif
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, ProyectommPackage.Literals.TAREA___R08_CONEXIONES_ENTRE_TAREAS__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, ProyectommTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			}
			else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_proyectomm_c_c_Envio = idResolver.getClass(ProyectommTables.CLSSid_Envio, null);
					final /*@NonInvalid*/ boolean oclIsTypeOf = OclAnyOclIsTypeOfOperation.INSTANCE.evaluate(executor, this, TYP_proyectomm_c_c_Envio).booleanValue();
					/*@Thrown*/ Boolean result;
					if (oclIsTypeOf) {
						final /*@NonInvalid*/ Object oclContainer = ClassifierOclContainerOperation.INSTANCE.evaluate(executor, this);
						final /*@NonInvalid*/ Tarea sucesor = this.getSucesor();
						if (sucesor == null) {
							throw new InvalidValueException("Null \'\'OclElement\'\' rather than \'\'OclVoid\'\' value required");
						}
						final /*@Thrown*/ Object oclContainer_0 = ClassifierOclContainerOperation.INSTANCE.evaluate(executor, sucesor);
						final /*@Thrown*/ boolean ne = (oclContainer != null) ? !oclContainer.equals(oclContainer_0) : (oclContainer_0 != null);
						result = ne;
					}
					else {
						/*@Caught*/ Object CAUGHT_isEmpty;
						try {
							final /*@NonInvalid*/ Tarea sucesor_0 = this.getSucesor();
							final /*@Thrown*/ SetValue oclAsSet = OclAnyOclAsSetOperation.INSTANCE.evaluate(executor, ProyectommTables.SET_CLSSid_Tarea, sucesor_0);
							final /*@Thrown*/ boolean isEmpty = CollectionIsEmptyOperation.INSTANCE.evaluate(oclAsSet).booleanValue();
							CAUGHT_isEmpty = isEmpty;
						}
						catch (Exception e) {
							CAUGHT_isEmpty = ValueUtil.createInvalidValue(e);
						}
						final /*@Thrown*/ Boolean or;
						if (CAUGHT_isEmpty == ValueUtil.TRUE_VALUE) {
							or = ValueUtil.TRUE_VALUE;
						}
						else {
							/*@Caught*/ Object CAUGHT_eq;
							try {
								final /*@NonInvalid*/ Tarea sucesor_1 = this.getSucesor();
								if (sucesor_1 == null) {
									throw new InvalidValueException("Null \'\'OclElement\'\' rather than \'\'OclVoid\'\' value required");
								}
								final /*@Thrown*/ Object oclContainer_1 = ClassifierOclContainerOperation.INSTANCE.evaluate(executor, sucesor_1);
								final /*@NonInvalid*/ Object oclContainer_2 = ClassifierOclContainerOperation.INSTANCE.evaluate(executor, this);
								final /*@Thrown*/ boolean eq = (oclContainer_1 != null) ? oclContainer_1.equals(oclContainer_2) : (oclContainer_2 == null);
								CAUGHT_eq = eq;
							}
							catch (Exception e) {
								CAUGHT_eq = ValueUtil.createInvalidValue(e);
							}
							if (CAUGHT_eq == ValueUtil.TRUE_VALUE) {
								or = ValueUtil.TRUE_VALUE;
							}
							else {
								if (CAUGHT_isEmpty instanceof InvalidValueException) {
									throw (InvalidValueException)CAUGHT_isEmpty;
								}
								if (CAUGHT_eq instanceof InvalidValueException) {
									throw (InvalidValueException)CAUGHT_eq;
								}
								or = ValueUtil.FALSE_VALUE;
							}
						}
						result = or;
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
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProyectommPackage.TAREA__SUCESOR:
				if (sucesor != null)
					msgs = ((InternalEObject)sucesor).eInverseRemove(this, ProyectommPackage.TAREA__PREDECESOR, Tarea.class, msgs);
				return basicSetSucesor((Tarea)otherEnd, msgs);
			case ProyectommPackage.TAREA__PREDECESOR:
				if (predecesor != null)
					msgs = ((InternalEObject)predecesor).eInverseRemove(this, ProyectommPackage.TAREA__SUCESOR, Tarea.class, msgs);
				return basicSetPredecesor((Tarea)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProyectommPackage.TAREA__SUCESOR:
				return basicSetSucesor(null, msgs);
			case ProyectommPackage.TAREA__PREDECESOR:
				return basicSetPredecesor(null, msgs);
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
			case ProyectommPackage.TAREA__SUCESOR:
				if (resolve) return getSucesor();
				return basicGetSucesor();
			case ProyectommPackage.TAREA__PREDECESOR:
				if (resolve) return getPredecesor();
				return basicGetPredecesor();
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
			case ProyectommPackage.TAREA__SUCESOR:
				setSucesor((Tarea)newValue);
				return;
			case ProyectommPackage.TAREA__PREDECESOR:
				setPredecesor((Tarea)newValue);
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
			case ProyectommPackage.TAREA__SUCESOR:
				setSucesor((Tarea)null);
				return;
			case ProyectommPackage.TAREA__PREDECESOR:
				setPredecesor((Tarea)null);
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
			case ProyectommPackage.TAREA__SUCESOR:
				return sucesor != null;
			case ProyectommPackage.TAREA__PREDECESOR:
				return predecesor != null;
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
			case ProyectommPackage.TAREA___R09_UNIDIRECCIONALIDAD__DIAGNOSTICCHAIN_MAP:
				return R09_unidireccionalidad((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case ProyectommPackage.TAREA___R06_NO_REFLEXIVA__DIAGNOSTICCHAIN_MAP:
				return R06_noReflexiva((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case ProyectommPackage.TAREA___R08_CONEXIONES_ENTRE_TAREAS__DIAGNOSTICCHAIN_MAP:
				return R08_ConexionesEntreTareas((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //TareaImpl
