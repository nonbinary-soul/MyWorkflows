/**
 */
package proyectomm.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import proyectomm.Atributo;
import proyectomm.BD;
import proyectomm.ProyectommPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BD</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link proyectomm.impl.BDImpl#getAtributo_seleccionado <em>Atributo seleccionado</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class BDImpl extends IntermediaImpl implements BD {
	/**
	 * The cached value of the '{@link #getAtributo_seleccionado() <em>Atributo seleccionado</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAtributo_seleccionado()
	 * @generated
	 * @ordered
	 */
	protected Atributo atributo_seleccionado;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BDImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProyectommPackage.Literals.BD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Atributo getAtributo_seleccionado() {
		if (atributo_seleccionado != null && atributo_seleccionado.eIsProxy()) {
			InternalEObject oldAtributo_seleccionado = (InternalEObject)atributo_seleccionado;
			atributo_seleccionado = (Atributo)eResolveProxy(oldAtributo_seleccionado);
			if (atributo_seleccionado != oldAtributo_seleccionado) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProyectommPackage.BD__ATRIBUTO_SELECCIONADO, oldAtributo_seleccionado, atributo_seleccionado));
			}
		}
		return atributo_seleccionado;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Atributo basicGetAtributo_seleccionado() {
		return atributo_seleccionado;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAtributo_seleccionado(Atributo newAtributo_seleccionado) {
		Atributo oldAtributo_seleccionado = atributo_seleccionado;
		atributo_seleccionado = newAtributo_seleccionado;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProyectommPackage.BD__ATRIBUTO_SELECCIONADO, oldAtributo_seleccionado, atributo_seleccionado));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProyectommPackage.BD__ATRIBUTO_SELECCIONADO:
				if (resolve) return getAtributo_seleccionado();
				return basicGetAtributo_seleccionado();
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
			case ProyectommPackage.BD__ATRIBUTO_SELECCIONADO:
				setAtributo_seleccionado((Atributo)newValue);
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
			case ProyectommPackage.BD__ATRIBUTO_SELECCIONADO:
				setAtributo_seleccionado((Atributo)null);
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
			case ProyectommPackage.BD__ATRIBUTO_SELECCIONADO:
				return atributo_seleccionado != null;
		}
		return super.eIsSet(featureID);
	}

} //BDImpl
