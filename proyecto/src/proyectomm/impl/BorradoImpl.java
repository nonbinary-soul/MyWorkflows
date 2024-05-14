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

import org.eclipse.ocl.pivot.library.oclany.OclAnyOclIsTypeOfOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;

import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;

import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;

import org.eclipse.ocl.pivot.values.IntegerValue;

import proyectomm.Atributo;
import proyectomm.Borrado;
import proyectomm.ProyectommPackage;
import proyectomm.ProyectommTables;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Borrado</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class BorradoImpl extends BDImpl implements Borrado {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BorradoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProyectommPackage.Literals.BORRADO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean P04_borradoConClavePrimaria(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Borrado::P04_borradoConClavePrimaria";
		try {
			/**
			 *
			 * inv P04_borradoConClavePrimaria:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[1] = self.atributo_seleccionado.oclIsTypeOf(PrimaryKey)
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, ProyectommPackage.Literals.BORRADO___P04_BORRADO_CON_CLAVE_PRIMARIA__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, ProyectommTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			}
			else {
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_proyectomm_c_c_PrimaryKey_0 = idResolver.getClass(ProyectommTables.CLSSid_PrimaryKey, null);
				final /*@NonInvalid*/ Atributo atributo_seleccionado = this.getAtributo_seleccionado();
				final /*@NonInvalid*/ boolean result = OclAnyOclIsTypeOfOperation.INSTANCE.evaluate(executor, atributo_seleccionado, TYP_proyectomm_c_c_PrimaryKey_0).booleanValue();
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
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ProyectommPackage.BORRADO___P04_BORRADO_CON_CLAVE_PRIMARIA__DIAGNOSTICCHAIN_MAP:
				return P04_borradoConClavePrimaria((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //BorradoImpl
