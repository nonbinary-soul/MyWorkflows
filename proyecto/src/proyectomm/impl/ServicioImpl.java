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
 *   <li>{@link proyectomm.impl.ServicioImpl#getTabla_entrada_servicio <em>Tabla entrada servicio</em>}</li>
 *   <li>{@link proyectomm.impl.ServicioImpl#getTabla_salida_servicio <em>Tabla salida servicio</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServicioImpl extends IntermediaImpl implements Servicio {
	/**
	 * The cached value of the '{@link #getTabla_entrada_servicio() <em>Tabla entrada servicio</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTabla_entrada_servicio()
	 * @generated
	 * @ordered
	 */
	protected Tabla tabla_entrada_servicio;

	/**
	 * The cached value of the '{@link #getTabla_salida_servicio() <em>Tabla salida servicio</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTabla_salida_servicio()
	 * @generated
	 * @ordered
	 */
	protected Tabla tabla_salida_servicio;

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
	public Tabla getTabla_entrada_servicio() {
		if (tabla_entrada_servicio != null && tabla_entrada_servicio.eIsProxy()) {
			InternalEObject oldTabla_entrada_servicio = (InternalEObject)tabla_entrada_servicio;
			tabla_entrada_servicio = (Tabla)eResolveProxy(oldTabla_entrada_servicio);
			if (tabla_entrada_servicio != oldTabla_entrada_servicio) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProyectommPackage.SERVICIO__TABLA_ENTRADA_SERVICIO, oldTabla_entrada_servicio, tabla_entrada_servicio));
			}
		}
		return tabla_entrada_servicio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tabla basicGetTabla_entrada_servicio() {
		return tabla_entrada_servicio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTabla_entrada_servicio(Tabla newTabla_entrada_servicio) {
		Tabla oldTabla_entrada_servicio = tabla_entrada_servicio;
		tabla_entrada_servicio = newTabla_entrada_servicio;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProyectommPackage.SERVICIO__TABLA_ENTRADA_SERVICIO, oldTabla_entrada_servicio, tabla_entrada_servicio));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Tabla getTabla_salida_servicio() {
		if (tabla_salida_servicio != null && tabla_salida_servicio.eIsProxy()) {
			InternalEObject oldTabla_salida_servicio = (InternalEObject)tabla_salida_servicio;
			tabla_salida_servicio = (Tabla)eResolveProxy(oldTabla_salida_servicio);
			if (tabla_salida_servicio != oldTabla_salida_servicio) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProyectommPackage.SERVICIO__TABLA_SALIDA_SERVICIO, oldTabla_salida_servicio, tabla_salida_servicio));
			}
		}
		return tabla_salida_servicio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tabla basicGetTabla_salida_servicio() {
		return tabla_salida_servicio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTabla_salida_servicio(Tabla newTabla_salida_servicio) {
		Tabla oldTabla_salida_servicio = tabla_salida_servicio;
		tabla_salida_servicio = newTabla_salida_servicio;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProyectommPackage.SERVICIO__TABLA_SALIDA_SERVICIO, oldTabla_salida_servicio, tabla_salida_servicio));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProyectommPackage.SERVICIO__TABLA_ENTRADA_SERVICIO:
				if (resolve) return getTabla_entrada_servicio();
				return basicGetTabla_entrada_servicio();
			case ProyectommPackage.SERVICIO__TABLA_SALIDA_SERVICIO:
				if (resolve) return getTabla_salida_servicio();
				return basicGetTabla_salida_servicio();
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
			case ProyectommPackage.SERVICIO__TABLA_ENTRADA_SERVICIO:
				setTabla_entrada_servicio((Tabla)newValue);
				return;
			case ProyectommPackage.SERVICIO__TABLA_SALIDA_SERVICIO:
				setTabla_salida_servicio((Tabla)newValue);
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
			case ProyectommPackage.SERVICIO__TABLA_ENTRADA_SERVICIO:
				setTabla_entrada_servicio((Tabla)null);
				return;
			case ProyectommPackage.SERVICIO__TABLA_SALIDA_SERVICIO:
				setTabla_salida_servicio((Tabla)null);
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
			case ProyectommPackage.SERVICIO__TABLA_ENTRADA_SERVICIO:
				return tabla_entrada_servicio != null;
			case ProyectommPackage.SERVICIO__TABLA_SALIDA_SERVICIO:
				return tabla_salida_servicio != null;
		}
		return super.eIsSet(featureID);
	}

} //ServicioImpl
