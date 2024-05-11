/**
 */
package proyectomm.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import proyectomm.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see proyectomm.ProyectommPackage
 * @generated
 */
public class ProyectommSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ProyectommPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProyectommSwitch() {
		if (modelPackage == null) {
			modelPackage = ProyectommPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ProyectommPackage.PROCESO_DE_NEGOCIO: {
				ProcesoDeNegocio procesoDeNegocio = (ProcesoDeNegocio)theEObject;
				T result = caseProcesoDeNegocio(procesoDeNegocio);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProyectommPackage.ACTOR: {
				Actor actor = (Actor)theEObject;
				T result = caseActor(actor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProyectommPackage.BASE_DE_DATOS: {
				BaseDeDatos baseDeDatos = (BaseDeDatos)theEObject;
				T result = caseBaseDeDatos(baseDeDatos);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProyectommPackage.TABLA: {
				Tabla tabla = (Tabla)theEObject;
				T result = caseTabla(tabla);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProyectommPackage.ATRIBUTO: {
				Atributo atributo = (Atributo)theEObject;
				T result = caseAtributo(atributo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProyectommPackage.TAREA: {
				Tarea tarea = (Tarea)theEObject;
				T result = caseTarea(tarea);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProyectommPackage.INICIO: {
				Inicio inicio = (Inicio)theEObject;
				T result = caseInicio(inicio);
				if (result == null) result = caseTarea(inicio);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProyectommPackage.FIN: {
				Fin fin = (Fin)theEObject;
				T result = caseFin(fin);
				if (result == null) result = caseTarea(fin);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProyectommPackage.INTERMEDIA: {
				Intermedia intermedia = (Intermedia)theEObject;
				T result = caseIntermedia(intermedia);
				if (result == null) result = caseTarea(intermedia);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProyectommPackage.USUARIO: {
				Usuario usuario = (Usuario)theEObject;
				T result = caseUsuario(usuario);
				if (result == null) result = caseIntermedia(usuario);
				if (result == null) result = caseTarea(usuario);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProyectommPackage.SERVICIO: {
				Servicio servicio = (Servicio)theEObject;
				T result = caseServicio(servicio);
				if (result == null) result = caseIntermedia(servicio);
				if (result == null) result = caseTarea(servicio);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProyectommPackage.MENSAJE: {
				Mensaje mensaje = (Mensaje)theEObject;
				T result = caseMensaje(mensaje);
				if (result == null) result = caseIntermedia(mensaje);
				if (result == null) result = caseTarea(mensaje);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProyectommPackage.ENVIO: {
				Envio envio = (Envio)theEObject;
				T result = caseEnvio(envio);
				if (result == null) result = caseMensaje(envio);
				if (result == null) result = caseIntermedia(envio);
				if (result == null) result = caseTarea(envio);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProyectommPackage.RECEPCION: {
				Recepcion recepcion = (Recepcion)theEObject;
				T result = caseRecepcion(recepcion);
				if (result == null) result = caseMensaje(recepcion);
				if (result == null) result = caseIntermedia(recepcion);
				if (result == null) result = caseTarea(recepcion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProyectommPackage.BORRADO: {
				Borrado borrado = (Borrado)theEObject;
				T result = caseBorrado(borrado);
				if (result == null) result = caseBD(borrado);
				if (result == null) result = caseIntermedia(borrado);
				if (result == null) result = caseTarea(borrado);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProyectommPackage.LECTURA: {
				Lectura lectura = (Lectura)theEObject;
				T result = caseLectura(lectura);
				if (result == null) result = caseBD(lectura);
				if (result == null) result = caseIntermedia(lectura);
				if (result == null) result = caseTarea(lectura);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProyectommPackage.BD: {
				BD bd = (BD)theEObject;
				T result = caseBD(bd);
				if (result == null) result = caseIntermedia(bd);
				if (result == null) result = caseTarea(bd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProyectommPackage.PRIMARY_KEY: {
				PrimaryKey primaryKey = (PrimaryKey)theEObject;
				T result = casePrimaryKey(primaryKey);
				if (result == null) result = caseAtributo(primaryKey);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProyectommPackage.FOREIGN_KEY: {
				ForeignKey foreignKey = (ForeignKey)theEObject;
				T result = caseForeignKey(foreignKey);
				if (result == null) result = caseAtributo(foreignKey);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProyectommPackage.OPCION: {
				Opcion opcion = (Opcion)theEObject;
				T result = caseOpcion(opcion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Proceso De Negocio</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Proceso De Negocio</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcesoDeNegocio(ProcesoDeNegocio object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Actor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Actor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActor(Actor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Base De Datos</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Base De Datos</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBaseDeDatos(BaseDeDatos object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tabla</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tabla</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTabla(Tabla object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Atributo</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Atributo</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAtributo(Atributo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tarea</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tarea</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTarea(Tarea object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Inicio</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Inicio</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInicio(Inicio object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fin</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fin</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFin(Fin object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Intermedia</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Intermedia</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntermedia(Intermedia object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Usuario</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Usuario</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUsuario(Usuario object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Servicio</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Servicio</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServicio(Servicio object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mensaje</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mensaje</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMensaje(Mensaje object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Envio</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Envio</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnvio(Envio object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Recepcion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Recepcion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRecepcion(Recepcion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Borrado</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Borrado</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBorrado(Borrado object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lectura</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lectura</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLectura(Lectura object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BD</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BD</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBD(BD object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Primary Key</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Primary Key</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrimaryKey(PrimaryKey object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Foreign Key</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Foreign Key</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseForeignKey(ForeignKey object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Opcion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Opcion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOpcion(Opcion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //ProyectommSwitch
