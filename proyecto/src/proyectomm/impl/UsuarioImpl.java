/**
 */
package proyectomm.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import proyectomm.ProyectommPackage;
import proyectomm.Tabla;
import proyectomm.Usuario;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Usuario</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link proyectomm.impl.UsuarioImpl#getTabla_accedida_por_usuario <em>Tabla accedida por usuario</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UsuarioImpl extends IntermediaImpl implements Usuario {
	/**
	 * The cached value of the '{@link #getTabla_accedida_por_usuario() <em>Tabla accedida por usuario</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTabla_accedida_por_usuario()
	 * @generated
	 * @ordered
	 */
	protected Tabla tabla_accedida_por_usuario;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UsuarioImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProyectommPackage.Literals.USUARIO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Tabla getTabla_accedida_por_usuario() {
		if (tabla_accedida_por_usuario != null && tabla_accedida_por_usuario.eIsProxy()) {
			InternalEObject oldTabla_accedida_por_usuario = (InternalEObject)tabla_accedida_por_usuario;
			tabla_accedida_por_usuario = (Tabla)eResolveProxy(oldTabla_accedida_por_usuario);
			if (tabla_accedida_por_usuario != oldTabla_accedida_por_usuario) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProyectommPackage.USUARIO__TABLA_ACCEDIDA_POR_USUARIO, oldTabla_accedida_por_usuario, tabla_accedida_por_usuario));
			}
		}
		return tabla_accedida_por_usuario;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tabla basicGetTabla_accedida_por_usuario() {
		return tabla_accedida_por_usuario;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTabla_accedida_por_usuario(Tabla newTabla_accedida_por_usuario) {
		Tabla oldTabla_accedida_por_usuario = tabla_accedida_por_usuario;
		tabla_accedida_por_usuario = newTabla_accedida_por_usuario;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProyectommPackage.USUARIO__TABLA_ACCEDIDA_POR_USUARIO, oldTabla_accedida_por_usuario, tabla_accedida_por_usuario));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProyectommPackage.USUARIO__TABLA_ACCEDIDA_POR_USUARIO:
				if (resolve) return getTabla_accedida_por_usuario();
				return basicGetTabla_accedida_por_usuario();
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
			case ProyectommPackage.USUARIO__TABLA_ACCEDIDA_POR_USUARIO:
				setTabla_accedida_por_usuario((Tabla)newValue);
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
			case ProyectommPackage.USUARIO__TABLA_ACCEDIDA_POR_USUARIO:
				setTabla_accedida_por_usuario((Tabla)null);
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
			case ProyectommPackage.USUARIO__TABLA_ACCEDIDA_POR_USUARIO:
				return tabla_accedida_por_usuario != null;
		}
		return super.eIsSet(featureID);
	}

} //UsuarioImpl
