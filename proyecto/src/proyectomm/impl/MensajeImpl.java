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
 *   <li>{@link proyectomm.impl.MensajeImpl#getTabla_accedida_por_mensaje <em>Tabla accedida por mensaje</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class MensajeImpl extends IntermediaImpl implements Mensaje {
	/**
	 * The cached value of the '{@link #getTabla_accedida_por_mensaje() <em>Tabla accedida por mensaje</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTabla_accedida_por_mensaje()
	 * @generated
	 * @ordered
	 */
	protected Tabla tabla_accedida_por_mensaje;
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
	public Tabla getTabla_accedida_por_mensaje() {
		if (tabla_accedida_por_mensaje != null && tabla_accedida_por_mensaje.eIsProxy()) {
			InternalEObject oldTabla_accedida_por_mensaje = (InternalEObject)tabla_accedida_por_mensaje;
			tabla_accedida_por_mensaje = (Tabla)eResolveProxy(oldTabla_accedida_por_mensaje);
			if (tabla_accedida_por_mensaje != oldTabla_accedida_por_mensaje) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProyectommPackage.MENSAJE__TABLA_ACCEDIDA_POR_MENSAJE, oldTabla_accedida_por_mensaje, tabla_accedida_por_mensaje));
			}
		}
		return tabla_accedida_por_mensaje;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tabla basicGetTabla_accedida_por_mensaje() {
		return tabla_accedida_por_mensaje;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTabla_accedida_por_mensaje(Tabla newTabla_accedida_por_mensaje) {
		Tabla oldTabla_accedida_por_mensaje = tabla_accedida_por_mensaje;
		tabla_accedida_por_mensaje = newTabla_accedida_por_mensaje;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProyectommPackage.MENSAJE__TABLA_ACCEDIDA_POR_MENSAJE, oldTabla_accedida_por_mensaje, tabla_accedida_por_mensaje));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProyectommPackage.MENSAJE__TABLA_ACCEDIDA_POR_MENSAJE:
				if (resolve) return getTabla_accedida_por_mensaje();
				return basicGetTabla_accedida_por_mensaje();
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
			case ProyectommPackage.MENSAJE__TABLA_ACCEDIDA_POR_MENSAJE:
				setTabla_accedida_por_mensaje((Tabla)newValue);
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
			case ProyectommPackage.MENSAJE__TABLA_ACCEDIDA_POR_MENSAJE:
				setTabla_accedida_por_mensaje((Tabla)null);
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
			case ProyectommPackage.MENSAJE__TABLA_ACCEDIDA_POR_MENSAJE:
				return tabla_accedida_por_mensaje != null;
		}
		return super.eIsSet(featureID);
	}

} //MensajeImpl
