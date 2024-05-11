/**
 */
package proyectomm.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import proyectomm.Mensaje;
import proyectomm.ProyectommPackage;
import proyectomm.Tabla;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mensaje</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link proyectomm.impl.MensajeImpl#getTabla_accedida <em>Tabla accedida</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class MensajeImpl extends IntermediaImpl implements Mensaje {
	/**
	 * The cached value of the '{@link #getTabla_accedida() <em>Tabla accedida</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTabla_accedida()
	 * @generated
	 * @ordered
	 */
	protected Tabla tabla_accedida;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MensajeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProyectommPackage.Literals.MENSAJE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Tabla getTabla_accedida() {
		if (tabla_accedida != null && tabla_accedida.eIsProxy()) {
			InternalEObject oldTabla_accedida = (InternalEObject)tabla_accedida;
			tabla_accedida = (Tabla)eResolveProxy(oldTabla_accedida);
			if (tabla_accedida != oldTabla_accedida) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProyectommPackage.MENSAJE__TABLA_ACCEDIDA, oldTabla_accedida, tabla_accedida));
			}
		}
		return tabla_accedida;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tabla basicGetTabla_accedida() {
		return tabla_accedida;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTabla_accedida(Tabla newTabla_accedida) {
		Tabla oldTabla_accedida = tabla_accedida;
		tabla_accedida = newTabla_accedida;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProyectommPackage.MENSAJE__TABLA_ACCEDIDA, oldTabla_accedida, tabla_accedida));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProyectommPackage.MENSAJE__TABLA_ACCEDIDA:
				if (resolve) return getTabla_accedida();
				return basicGetTabla_accedida();
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
			case ProyectommPackage.MENSAJE__TABLA_ACCEDIDA:
				setTabla_accedida((Tabla)newValue);
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
			case ProyectommPackage.MENSAJE__TABLA_ACCEDIDA:
				setTabla_accedida((Tabla)null);
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
			case ProyectommPackage.MENSAJE__TABLA_ACCEDIDA:
				return tabla_accedida != null;
		}
		return super.eIsSet(featureID);
	}

} //MensajeImpl
