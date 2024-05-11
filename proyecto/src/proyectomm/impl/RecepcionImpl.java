/**
 */
package proyectomm.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.ocl.pivot.evaluation.Executor;

import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;

import org.eclipse.ocl.pivot.library.oclany.OclAnyOclAsTypeOperation;
import org.eclipse.ocl.pivot.library.oclany.OclAnyOclIsTypeOfOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;

import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;

import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;

import org.eclipse.ocl.pivot.values.IntegerValue;

import proyectomm.Envio;
import proyectomm.ProyectommPackage;
import proyectomm.ProyectommTables;
import proyectomm.Recepcion;
import proyectomm.Tabla;
import proyectomm.Tarea;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Recepcion</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class RecepcionImpl extends MensajeImpl implements Recepcion {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RecepcionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProyectommPackage.Literals.RECEPCION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean R07_envioAsociado(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Recepcion::R07_envioAsociado";
		try {
			/**
			 *
			 * inv R07_envioAsociado:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[1] = predecesor.oclIsTypeOf(Envio)
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, ProyectommPackage.Literals.RECEPCION___R07_ENVIO_ASOCIADO__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, ProyectommTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			}
			else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_proyectomm_c_c_Envio_0 = idResolver.getClass(ProyectommTables.CLSSid_Envio, null);
					final /*@NonInvalid*/ Tarea predecesor = this.getPredecesor();
					final /*@Thrown*/ boolean result = OclAnyOclIsTypeOfOperation.INSTANCE.evaluate(executor, predecesor, TYP_proyectomm_c_c_Envio_0).booleanValue();
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
	public boolean P06_mismaTablaQueEnvio(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Recepcion::P06_mismaTablaQueEnvio";
		try {
			/**
			 *
			 * inv P06_mismaTablaQueEnvio:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[1] = self.tabla_accedida =
			 *         self.predecesor.oclAsType(Envio).tabla_accedida
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, ProyectommPackage.Literals.RECEPCION___P06_MISMA_TABLA_QUE_ENVIO__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, ProyectommTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			}
			else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_proyectomm_c_c_Envio_0 = idResolver.getClass(ProyectommTables.CLSSid_Envio, null);
					final /*@NonInvalid*/ Tabla tabla_accedida = this.getTabla_accedida();
					final /*@NonInvalid*/ Tarea predecesor = this.getPredecesor();
					final /*@Thrown*/ Envio oclAsType = (Envio)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, predecesor, TYP_proyectomm_c_c_Envio_0);
					final /*@Thrown*/ Tabla tabla_accedida_0 = oclAsType.getTabla_accedida();
					final /*@Thrown*/ boolean result = tabla_accedida.equals(tabla_accedida_0);
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
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ProyectommPackage.RECEPCION___R07_ENVIO_ASOCIADO__DIAGNOSTICCHAIN_MAP:
				return R07_envioAsociado((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case ProyectommPackage.RECEPCION___P06_MISMA_TABLA_QUE_ENVIO__DIAGNOSTICCHAIN_MAP:
				return P06_mismaTablaQueEnvio((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //RecepcionImpl
