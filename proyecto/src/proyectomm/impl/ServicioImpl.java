/**
 */
package proyectomm.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import proyectomm.ProyectommPackage;
import proyectomm.Servicio;
import proyectomm.Tabla;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Servicio</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link proyectomm.impl.ServicioImpl#getTabla_accedida_por_servicio <em>Tabla accedida por servicio</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServicioImpl extends IntermediaImpl implements Servicio {
	/**
	 * The cached value of the '{@link #getTabla_accedida_por_servicio() <em>Tabla accedida por servicio</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTabla_accedida_por_servicio()
	 * @generated
	 * @ordered
	 */
	protected Tabla tabla_accedida_por_servicio;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServicioImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProyectommPackage.Literals.SERVICIO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Tabla getTabla_accedida_por_servicio() {
		if (tabla_accedida_por_servicio != null && tabla_accedida_por_servicio.eIsProxy()) {
			InternalEObject oldTabla_accedida_por_servicio = (InternalEObject)tabla_accedida_por_servicio;
			tabla_accedida_por_servicio = (Tabla)eResolveProxy(oldTabla_accedida_por_servicio);
			if (tabla_accedida_por_servicio != oldTabla_accedida_por_servicio) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProyectommPackage.SERVICIO__TABLA_ACCEDIDA_POR_SERVICIO, oldTabla_accedida_por_servicio, tabla_accedida_por_servicio));
			}
		}
		return tabla_accedida_por_servicio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tabla basicGetTabla_accedida_por_servicio() {
		return tabla_accedida_por_servicio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTabla_accedida_por_servicio(Tabla newTabla_accedida_por_servicio) {
		Tabla oldTabla_accedida_por_servicio = tabla_accedida_por_servicio;
		tabla_accedida_por_servicio = newTabla_accedida_por_servicio;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProyectommPackage.SERVICIO__TABLA_ACCEDIDA_POR_SERVICIO, oldTabla_accedida_por_servicio, tabla_accedida_por_servicio));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProyectommPackage.SERVICIO__TABLA_ACCEDIDA_POR_SERVICIO:
				if (resolve) return getTabla_accedida_por_servicio();
				return basicGetTabla_accedida_por_servicio();
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
			case ProyectommPackage.SERVICIO__TABLA_ACCEDIDA_POR_SERVICIO:
				setTabla_accedida_por_servicio((Tabla)newValue);
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
			case ProyectommPackage.SERVICIO__TABLA_ACCEDIDA_POR_SERVICIO:
				setTabla_accedida_por_servicio((Tabla)null);
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
			case ProyectommPackage.SERVICIO__TABLA_ACCEDIDA_POR_SERVICIO:
				return tabla_accedida_por_servicio != null;
		}
		return super.eIsSet(featureID);
	}

} //ServicioImpl
