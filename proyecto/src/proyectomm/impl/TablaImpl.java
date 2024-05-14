/**
 */
package proyectomm.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.ocl.pivot.evaluation.Executor;

import org.eclipse.ocl.pivot.ids.EnumerationLiteralId;
import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;

import org.eclipse.ocl.pivot.library.collection.CollectionSizeOperation;

import org.eclipse.ocl.pivot.library.oclany.OclAnyOclIsTypeOfOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;

import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;

import org.eclipse.ocl.pivot.messages.PivotMessages;

import org.eclipse.ocl.pivot.utilities.ClassUtil;
import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;

import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.InvalidValueException;
import org.eclipse.ocl.pivot.values.OrderedSetValue;

import org.eclipse.ocl.pivot.values.OrderedSetValue.Accumulator;

import proyectomm.Atributo;
import proyectomm.EAtributo;
import proyectomm.ProyectommPackage;
import proyectomm.ProyectommTables;
import proyectomm.Tabla;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tabla</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link proyectomm.impl.TablaImpl#getNombre <em>Nombre</em>}</li>
 *   <li>{@link proyectomm.impl.TablaImpl#getAtributos <em>Atributos</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TablaImpl extends EObjectImpl implements Tabla {
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
	 * The cached value of the '{@link #getAtributos() <em>Atributos</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAtributos()
	 * @generated
	 * @ordered
	 */
	protected EList<Atributo> atributos;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TablaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProyectommPackage.Literals.TABLA;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ProyectommPackage.TABLA__NOMBRE, oldNombre, nombre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Atributo> getAtributos() {
		if (atributos == null) {
			atributos = new EObjectContainmentEList<Atributo>(Atributo.class, this, ProyectommPackage.TABLA__ATRIBUTOS);
		}
		return atributos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean P02_soloUnaClavePrimaria(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Tabla::P02_soloUnaClavePrimaria";
		try {
			/**
			 *
			 * inv P02_soloUnaClavePrimaria:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[1] = self.atributos->select(a |
			 *           a.oclIsTypeOf(PrimaryKey))
			 *         ->size() = 1
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, ProyectommPackage.Literals.TABLA___P02_SOLO_UNA_CLAVE_PRIMARIA__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, ProyectommTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			}
			else {
				final /*@NonInvalid*/ List<Atributo> atributos = this.getAtributos();
				final /*@NonInvalid*/ OrderedSetValue BOXED_atributos = idResolver.createOrderedSetOfAll(ProyectommTables.ORD_CLSSid_Atributo, atributos);
				/*@Thrown*/ Accumulator accumulator = ValueUtil.createOrderedSetAccumulatorValue(ProyectommTables.ORD_CLSSid_Atributo);
				Iterator<Object> ITERATOR_a = BOXED_atributos.iterator();
				/*@NonInvalid*/ OrderedSetValue select;
				while (true) {
					if (!ITERATOR_a.hasNext()) {
						select = accumulator;
						break;
					}
					/*@NonInvalid*/ Atributo a = (Atributo)ITERATOR_a.next();
					/**
					 * a.oclIsTypeOf(PrimaryKey)
					 */
					final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_proyectomm_c_c_PrimaryKey = idResolver.getClass(ProyectommTables.CLSSid_PrimaryKey, null);
					final /*@NonInvalid*/ boolean oclIsTypeOf = OclAnyOclIsTypeOfOperation.INSTANCE.evaluate(executor, a, TYP_proyectomm_c_c_PrimaryKey).booleanValue();
					//
					if (oclIsTypeOf) {
						accumulator.add(a);
					}
				}
				final /*@NonInvalid*/ IntegerValue size = CollectionSizeOperation.INSTANCE.evaluate(select);
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
	public boolean P03_clavesTipoInteger(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Tabla::P03_clavesTipoInteger";
		try {
			/**
			 *
			 * inv P03_clavesTipoInteger:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[?] = self.atributos->select(a |
			 *           a.oclIsTypeOf(PrimaryKey) or
			 *           a.oclIsTypeOf(ForeignKey))
			 *         ->forAll(at | at.tipo = EAtributo::INTEGER)
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, ProyectommPackage.Literals.TABLA___P03_CLAVES_TIPO_INTEGER__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, ProyectommTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			}
			else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					final /*@NonInvalid*/ List<Atributo> atributos = this.getAtributos();
					final /*@NonInvalid*/ OrderedSetValue BOXED_atributos = idResolver.createOrderedSetOfAll(ProyectommTables.ORD_CLSSid_Atributo, atributos);
					/*@Thrown*/ Accumulator accumulator = ValueUtil.createOrderedSetAccumulatorValue(ProyectommTables.ORD_CLSSid_Atributo);
					Iterator<Object> ITERATOR_a = BOXED_atributos.iterator();
					/*@Thrown*/ OrderedSetValue select;
					while (true) {
						if (!ITERATOR_a.hasNext()) {
							select = accumulator;
							break;
						}
						/*@NonInvalid*/ Atributo a = (Atributo)ITERATOR_a.next();
						/**
						 * a.oclIsTypeOf(PrimaryKey) or a.oclIsTypeOf(ForeignKey)
						 */
						final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_proyectomm_c_c_ForeignKey = idResolver.getClass(ProyectommTables.CLSSid_ForeignKey, null);
						final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_proyectomm_c_c_PrimaryKey_0 = idResolver.getClass(ProyectommTables.CLSSid_PrimaryKey, null);
						final /*@NonInvalid*/ boolean oclIsTypeOf = OclAnyOclIsTypeOfOperation.INSTANCE.evaluate(executor, a, TYP_proyectomm_c_c_PrimaryKey_0).booleanValue();
						final /*@NonInvalid*/ Boolean or;
						if (oclIsTypeOf) {
							or = ValueUtil.TRUE_VALUE;
						}
						else {
							final /*@NonInvalid*/ boolean oclIsTypeOf_0 = OclAnyOclIsTypeOfOperation.INSTANCE.evaluate(executor, a, TYP_proyectomm_c_c_ForeignKey).booleanValue();
							if (oclIsTypeOf_0) {
								or = ValueUtil.TRUE_VALUE;
							}
							else {
								or = ValueUtil.FALSE_VALUE;
							}
						}
						if (or == null) {
							throw new InvalidValueException("Null body for \'OrderedSet(T).select(OrderedSet.T[?] | Lambda T() : Boolean[1]) : OrderedSet(T)\'");
						}
						//
						if (or == ValueUtil.TRUE_VALUE) {
							accumulator.add(a);
						}
					}
					/*@Thrown*/ Object accumulator_0 = ValueUtil.TRUE_VALUE;
					Iterator<Object> ITERATOR_at = select.iterator();
					/*@Thrown*/ Boolean result;
					while (true) {
						if (!ITERATOR_at.hasNext()) {
							if (accumulator_0 == ValueUtil.TRUE_VALUE) {
								result = ValueUtil.TRUE_VALUE;
							}
							else {
								throw (InvalidValueException)accumulator_0;
							}
							break;
						}
						/*@NonInvalid*/ Atributo at = (Atributo)ITERATOR_at.next();
						/**
						 * at.tipo = EAtributo::INTEGER
						 */
						final /*@NonInvalid*/ EAtributo tipo = at.getTipo();
						final /*@NonInvalid*/ EnumerationLiteralId BOXED_tipo = ProyectommTables.ENUMid_EAtributo.getEnumerationLiteralId(ClassUtil.nonNullState(tipo.getName()));
						final /*@NonInvalid*/ boolean eq = BOXED_tipo == ProyectommTables.ELITid_INTEGER;
						//
						if (!eq) {					// Normal unsuccessful body evaluation result
							result = ValueUtil.FALSE_VALUE;
							break;														// Stop immediately
						}
						else if (eq) {				// Normal successful body evaluation result
							;															// Carry on
						}
						else {															// Impossible badly typed result
							accumulator_0 = new InvalidValueException(PivotMessages.NonBooleanBody, "forAll");
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProyectommPackage.TABLA__ATRIBUTOS:
				return ((InternalEList<?>)getAtributos()).basicRemove(otherEnd, msgs);
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
			case ProyectommPackage.TABLA__NOMBRE:
				return getNombre();
			case ProyectommPackage.TABLA__ATRIBUTOS:
				return getAtributos();
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
			case ProyectommPackage.TABLA__NOMBRE:
				setNombre((String)newValue);
				return;
			case ProyectommPackage.TABLA__ATRIBUTOS:
				getAtributos().clear();
				getAtributos().addAll((Collection<? extends Atributo>)newValue);
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
			case ProyectommPackage.TABLA__NOMBRE:
				setNombre(NOMBRE_EDEFAULT);
				return;
			case ProyectommPackage.TABLA__ATRIBUTOS:
				getAtributos().clear();
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
			case ProyectommPackage.TABLA__NOMBRE:
				return NOMBRE_EDEFAULT == null ? nombre != null : !NOMBRE_EDEFAULT.equals(nombre);
			case ProyectommPackage.TABLA__ATRIBUTOS:
				return atributos != null && !atributos.isEmpty();
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
			case ProyectommPackage.TABLA___P02_SOLO_UNA_CLAVE_PRIMARIA__DIAGNOSTICCHAIN_MAP:
				return P02_soloUnaClavePrimaria((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case ProyectommPackage.TABLA___P03_CLAVES_TIPO_INTEGER__DIAGNOSTICCHAIN_MAP:
				return P03_clavesTipoInteger((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
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

} //TablaImpl
