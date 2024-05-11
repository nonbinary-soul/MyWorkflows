/**
 */
package proyectomm.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import proyectomm.ForeignKey;
import proyectomm.PrimaryKey;
import proyectomm.ProyectommPackage;

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

} //ForeignKeyImpl
