/**
 */
package proyectomm.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import proyectomm.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see proyectomm.ProyectommPackage
 * @generated
 */
public class ProyectommAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ProyectommPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProyectommAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ProyectommPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProyectommSwitch<Adapter> modelSwitch =
		new ProyectommSwitch<Adapter>() {
			@Override
			public Adapter caseProcesoDeNegocio(ProcesoDeNegocio object) {
				return createProcesoDeNegocioAdapter();
			}
			@Override
			public Adapter caseActor(Actor object) {
				return createActorAdapter();
			}
			@Override
			public Adapter caseBaseDeDatos(BaseDeDatos object) {
				return createBaseDeDatosAdapter();
			}
			@Override
			public Adapter caseTabla(Tabla object) {
				return createTablaAdapter();
			}
			@Override
			public Adapter caseAtributo(Atributo object) {
				return createAtributoAdapter();
			}
			@Override
			public Adapter caseTarea(Tarea object) {
				return createTareaAdapter();
			}
			@Override
			public Adapter caseInicio(Inicio object) {
				return createInicioAdapter();
			}
			@Override
			public Adapter caseFin(Fin object) {
				return createFinAdapter();
			}
			@Override
			public Adapter caseIntermedia(Intermedia object) {
				return createIntermediaAdapter();
			}
			@Override
			public Adapter caseUsuario(Usuario object) {
				return createUsuarioAdapter();
			}
			@Override
			public Adapter caseServicio(Servicio object) {
				return createServicioAdapter();
			}
			@Override
			public Adapter caseMensaje(Mensaje object) {
				return createMensajeAdapter();
			}
			@Override
			public Adapter caseEnvio(Envio object) {
				return createEnvioAdapter();
			}
			@Override
			public Adapter caseRecepcion(Recepcion object) {
				return createRecepcionAdapter();
			}
			@Override
			public Adapter caseBorrado(Borrado object) {
				return createBorradoAdapter();
			}
			@Override
			public Adapter caseLectura(Lectura object) {
				return createLecturaAdapter();
			}
			@Override
			public Adapter caseBD(BD object) {
				return createBDAdapter();
			}
			@Override
			public Adapter casePrimaryKey(PrimaryKey object) {
				return createPrimaryKeyAdapter();
			}
			@Override
			public Adapter caseForeignKey(ForeignKey object) {
				return createForeignKeyAdapter();
			}
			@Override
			public Adapter caseOpcion(Opcion object) {
				return createOpcionAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link proyectomm.ProcesoDeNegocio <em>Proceso De Negocio</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see proyectomm.ProcesoDeNegocio
	 * @generated
	 */
	public Adapter createProcesoDeNegocioAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link proyectomm.Actor <em>Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see proyectomm.Actor
	 * @generated
	 */
	public Adapter createActorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link proyectomm.BaseDeDatos <em>Base De Datos</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see proyectomm.BaseDeDatos
	 * @generated
	 */
	public Adapter createBaseDeDatosAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link proyectomm.Tabla <em>Tabla</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see proyectomm.Tabla
	 * @generated
	 */
	public Adapter createTablaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link proyectomm.Atributo <em>Atributo</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see proyectomm.Atributo
	 * @generated
	 */
	public Adapter createAtributoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link proyectomm.Tarea <em>Tarea</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see proyectomm.Tarea
	 * @generated
	 */
	public Adapter createTareaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link proyectomm.Inicio <em>Inicio</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see proyectomm.Inicio
	 * @generated
	 */
	public Adapter createInicioAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link proyectomm.Fin <em>Fin</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see proyectomm.Fin
	 * @generated
	 */
	public Adapter createFinAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link proyectomm.Intermedia <em>Intermedia</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see proyectomm.Intermedia
	 * @generated
	 */
	public Adapter createIntermediaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link proyectomm.Usuario <em>Usuario</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see proyectomm.Usuario
	 * @generated
	 */
	public Adapter createUsuarioAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link proyectomm.Servicio <em>Servicio</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see proyectomm.Servicio
	 * @generated
	 */
	public Adapter createServicioAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link proyectomm.Mensaje <em>Mensaje</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see proyectomm.Mensaje
	 * @generated
	 */
	public Adapter createMensajeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link proyectomm.Envio <em>Envio</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see proyectomm.Envio
	 * @generated
	 */
	public Adapter createEnvioAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link proyectomm.Recepcion <em>Recepcion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see proyectomm.Recepcion
	 * @generated
	 */
	public Adapter createRecepcionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link proyectomm.Borrado <em>Borrado</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see proyectomm.Borrado
	 * @generated
	 */
	public Adapter createBorradoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link proyectomm.Lectura <em>Lectura</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see proyectomm.Lectura
	 * @generated
	 */
	public Adapter createLecturaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link proyectomm.BD <em>BD</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see proyectomm.BD
	 * @generated
	 */
	public Adapter createBDAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link proyectomm.PrimaryKey <em>Primary Key</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see proyectomm.PrimaryKey
	 * @generated
	 */
	public Adapter createPrimaryKeyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link proyectomm.ForeignKey <em>Foreign Key</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see proyectomm.ForeignKey
	 * @generated
	 */
	public Adapter createForeignKeyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link proyectomm.Opcion <em>Opcion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see proyectomm.Opcion
	 * @generated
	 */
	public Adapter createOpcionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ProyectommAdapterFactory
