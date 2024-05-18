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

import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;

import org.eclipse.ocl.pivot.library.classifier.ClassifierOclContainerOperation;

import org.eclipse.ocl.pivot.library.oclany.OclAnyOclAsTypeOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;

import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;

import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;

import org.eclipse.ocl.pivot.values.IntegerValue;

import proyectomm.EAtributo;
import proyectomm.ForeignKey;
import proyectomm.PrimaryKey;
import proyectomm.ProyectommPackage;
import proyectomm.ProyectommTables;
import proyectomm.Tabla;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Foreign Key</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link proyectomm.impl.ForeignKeyImpl#getReferencia_a <em>Referencia a</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ForeignKeyImpl extends AtributoImpl implements ForeignKey {
	/**
	 * The cached value of the '{@link #getReferencia_a() <em>Referencia a</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencia_a()
	 * @generated
	 * @ordered
	 */
	protected PrimaryKey referencia_a;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ForeignKeyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProyectommPackage.Literals.FOREIGN_KEY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PrimaryKey getReferencia_a() {
		if (referencia_a != null && referencia_a.eIsProxy()) {
			InternalEObject oldReferencia_a = (InternalEObject)referencia_a;
			referencia_a = (PrimaryKey)eResolveProxy(oldReferencia_a);
			if (referencia_a != oldReferencia_a) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProyectommPackage.FOREIGN_KEY__REFERENCIA_A, oldReferencia_a, referencia_a));
			}
		}
		return referencia_a;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimaryKey basicGetReferencia_a() {
		return referencia_a;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReferencia_a(PrimaryKey newReferencia_a) {
		PrimaryKey oldReferencia_a = referencia_a;
		referencia_a = newReferencia_a;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProyectommPackage.FOREIGN_KEY__REFERENCIA_A, oldReferencia_a, referencia_a));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean P06_mismoTipoQuePK(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "ForeignKey::P06_mismoTipoQuePK";
		try {
			/**
			 *
			 * inv P06_mismoTipoQuePK:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[1] = self.tipo = self.referencia_a.tipo
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, ProyectommPackage.Literals.FOREIGN_KEY___P06_MISMO_TIPO_QUE_PK__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, ProyectommTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			}
			else {
				final /*@NonInvalid*/ EAtributo tipo = this.getTipo();
				final /*@NonInvalid*/ PrimaryKey referencia_a = this.getReferencia_a();
				final /*@NonInvalid*/ EAtributo tipo_0 = referencia_a.getTipo();
				final /*@NonInvalid*/ boolean result = tipo.equals(tipo_0);
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
	public boolean P07_PKEnOtraTabla(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "ForeignKey::P07_PKEnOtraTabla";
		try {
			/**
			 *
			 * inv P07_PKEnOtraTabla:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[1] = self.oclContainer()
			 *         .oclAsType(Tabla) <>
			 *         self.referencia_a.oclContainer()
			 *         .oclAsType(Tabla)
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, ProyectommPackage.Literals.FOREIGN_KEY___P07_PK_EN_OTRA_TABLA__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, ProyectommTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			}
			else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_proyectomm_c_c_Tabla_1 = idResolver.getClass(ProyectommTables.CLSSid_Tabla, null);
					final /*@NonInvalid*/ Object oclContainer = ClassifierOclContainerOperation.INSTANCE.evaluate(executor, this);
					final /*@Thrown*/ Tabla oclAsType = (Tabla)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, oclContainer, TYP_proyectomm_c_c_Tabla_1);
					final /*@NonInvalid*/ PrimaryKey referencia_a = this.getReferencia_a();
					final /*@NonInvalid*/ Object oclContainer_0 = ClassifierOclContainerOperation.INSTANCE.evaluate(executor, referencia_a);
					final /*@Thrown*/ Tabla oclAsType_0 = (Tabla)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, oclContainer_0, TYP_proyectomm_c_c_Tabla_1);
					final /*@Thrown*/ boolean result = !oclAsType.equals(oclAsType_0);
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
			case ProyectommPackage.FOREIGN_KEY__REFERENCIA_A:
				if (resolve) return getReferencia_a();
				return basicGetReferencia_a();
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
			case ProyectommPackage.FOREIGN_KEY__REFERENCIA_A:
				setReferencia_a((PrimaryKey)newValue);
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
			case ProyectommPackage.FOREIGN_KEY__REFERENCIA_A:
				setReferencia_a((PrimaryKey)null);
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
			case ProyectommPackage.FOREIGN_KEY__REFERENCIA_A:
				return referencia_a != null;
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
			case ProyectommPackage.FOREIGN_KEY___P06_MISMO_TIPO_QUE_PK__DIAGNOSTICCHAIN_MAP:
				return P06_mismoTipoQuePK((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case ProyectommPackage.FOREIGN_KEY___P07_PK_EN_OTRA_TABLA__DIAGNOSTICCHAIN_MAP:
				return P07_PKEnOtraTabla((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //ForeignKeyImpl
