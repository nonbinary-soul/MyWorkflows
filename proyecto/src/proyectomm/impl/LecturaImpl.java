/**
 */
package proyectomm.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.ocl.pivot.evaluation.Executor;

import org.eclipse.ocl.pivot.ids.IdResolver;

import org.eclipse.ocl.pivot.library.classifier.ClassifierOclContainerOperation;

import org.eclipse.ocl.pivot.library.oclany.OclAnyOclAsTypeOperation;

import org.eclipse.ocl.pivot.utilities.PivotUtil;

import proyectomm.Atributo;
import proyectomm.Lectura;
import proyectomm.ProyectommPackage;
import proyectomm.ProyectommTables;
import proyectomm.Tabla;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Lectura</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link proyectomm.impl.LecturaImpl#getDatos_a_leer <em>Datos aleer</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LecturaImpl extends BDImpl implements Lectura {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LecturaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProyectommPackage.Literals.LECTURA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Tabla getDatos_a_leer() {
		Tabla datos_a_leer = basicGetDatos_a_leer();
		return datos_a_leer != null && datos_a_leer.eIsProxy() ? (Tabla)eResolveProxy((InternalEObject)datos_a_leer) : datos_a_leer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tabla basicGetDatos_a_leer() {
		/**
		 * self.atributo_seleccionado.oclContainer().oclAsType(Tabla)
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
		final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_proyectomm_c_c_Tabla_0 = idResolver.getClass(ProyectommTables.CLSSid_Tabla, null);
		final /*@NonInvalid*/ Atributo atributo_seleccionado = this.getAtributo_seleccionado();
		final /*@NonInvalid*/ Object oclContainer = ClassifierOclContainerOperation.INSTANCE.evaluate(executor, atributo_seleccionado);
		final /*@Thrown*/ Tabla oclAsType = (Tabla)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, oclContainer, TYP_proyectomm_c_c_Tabla_0);
		return oclAsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDatos_a_leer(Tabla newDatos_a_leer) {
		// TODO: implement this method to set the 'Datos aleer' reference
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProyectommPackage.LECTURA__DATOS_ALEER:
				if (resolve) return getDatos_a_leer();
				return basicGetDatos_a_leer();
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
			case ProyectommPackage.LECTURA__DATOS_ALEER:
				setDatos_a_leer((Tabla)newValue);
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
			case ProyectommPackage.LECTURA__DATOS_ALEER:
				setDatos_a_leer((Tabla)null);
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
			case ProyectommPackage.LECTURA__DATOS_ALEER:
				return basicGetDatos_a_leer() != null;
		}
		return super.eIsSet(featureID);
	}

} //LecturaImpl
