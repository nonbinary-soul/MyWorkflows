/*
* 
*/
package proyectomm.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

import proyectomm.ProcesoDeNegocio;
import proyectomm.ProyectommPackage;
import proyectomm.diagram.edit.parts.ActorActorTareasCompartmentEditPart;
import proyectomm.diagram.edit.parts.ActorEditPart;
import proyectomm.diagram.edit.parts.ActorNombreEditPart;
import proyectomm.diagram.edit.parts.AtributoAtributoOpcionesCompartmentEditPart;
import proyectomm.diagram.edit.parts.AtributoEditPart;
import proyectomm.diagram.edit.parts.AtributoNombreTipoEditPart;
import proyectomm.diagram.edit.parts.BDAtributo_seleccionadoEditPart;
import proyectomm.diagram.edit.parts.BDAtributo_seleccionadoExternalLabelEditPart;
import proyectomm.diagram.edit.parts.BaseDeDatosBaseDeDatosTablasCompartmentEditPart;
import proyectomm.diagram.edit.parts.BaseDeDatosEditPart;
import proyectomm.diagram.edit.parts.BaseDeDatosNombreEditPart;
import proyectomm.diagram.edit.parts.BorradoEditPart;
import proyectomm.diagram.edit.parts.BorradoNombreEditPart;
import proyectomm.diagram.edit.parts.EnvioEditPart;
import proyectomm.diagram.edit.parts.EnvioNombreEditPart;
import proyectomm.diagram.edit.parts.FinEditPart;
import proyectomm.diagram.edit.parts.ForeignKeyEditPart;
import proyectomm.diagram.edit.parts.ForeignKeyForeignKeyOpcionesCompartmentEditPart;
import proyectomm.diagram.edit.parts.ForeignKeyNombreTipoEditPart;
import proyectomm.diagram.edit.parts.ForeignKeyReferencia_aEditPart;
import proyectomm.diagram.edit.parts.ForeignKeyReferencia_aExternalLabelEditPart;
import proyectomm.diagram.edit.parts.InicioEditPart;
import proyectomm.diagram.edit.parts.LecturaEditPart;
import proyectomm.diagram.edit.parts.LecturaNombreEditPart;
import proyectomm.diagram.edit.parts.MensajeTabla_accedida_por_mensajeEditPart;
import proyectomm.diagram.edit.parts.MensajeTabla_accedida_por_mensajeExternalLabelEditPart;
import proyectomm.diagram.edit.parts.OpcionEditPart;
import proyectomm.diagram.edit.parts.OpcionNombreEditPart;
import proyectomm.diagram.edit.parts.PrimaryKeyEditPart;
import proyectomm.diagram.edit.parts.PrimaryKeyNombreTipoEditPart;
import proyectomm.diagram.edit.parts.PrimaryKeyPrimaryKeyOpcionesCompartmentEditPart;
import proyectomm.diagram.edit.parts.ProcesoDeNegocioEditPart;
import proyectomm.diagram.edit.parts.RecepcionEditPart;
import proyectomm.diagram.edit.parts.RecepcionNombreEditPart;
import proyectomm.diagram.edit.parts.ServicioEditPart;
import proyectomm.diagram.edit.parts.ServicioNombreEditPart;
import proyectomm.diagram.edit.parts.ServicioTabla_entrada_servicioEditPart;
import proyectomm.diagram.edit.parts.ServicioTabla_entrada_servicioExternalLabelEditPart;
import proyectomm.diagram.edit.parts.ServicioTabla_salida_servicioEditPart;
import proyectomm.diagram.edit.parts.ServicioTabla_salida_servicioExternalLabelEditPart;
import proyectomm.diagram.edit.parts.TablaEditPart;
import proyectomm.diagram.edit.parts.TablaNombreEditPart;
import proyectomm.diagram.edit.parts.TablaTablaAtributosCompartmentEditPart;
import proyectomm.diagram.edit.parts.TareaSucesorEditPart;
import proyectomm.diagram.edit.parts.UsuarioEditPart;
import proyectomm.diagram.edit.parts.UsuarioNombreEditPart;
import proyectomm.diagram.edit.parts.UsuarioTabla_accedida_por_usuarioEditPart;
import proyectomm.diagram.edit.parts.UsuarioTabla_accedida_por_usuarioExternalLabelEditPart;
import proyectomm.diagram.edit.parts.WrappingLabelEditPart;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class ProyectommVisualIDRegistry {

	/**
	* @generated
	*/
	private static final String DEBUG_KEY = "proyecto.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	* @generated
	*/
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (ProcesoDeNegocioEditPart.MODEL_ID.equals(view.getType())) {
				return ProcesoDeNegocioEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return proyectomm.diagram.part.ProyectommVisualIDRegistry.getVisualID(view.getType());
	}

	/**
	* @generated
	*/
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	* @generated
	*/
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(Platform.getDebugOption(DEBUG_KEY))) {
				ProyectommDiagramEditorPlugin.getInstance()
						.logError("Unable to parse view type as a visualID number: " + type);
			}
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static String getType(int visualID) {
		return Integer.toString(visualID);
	}

	/**
	* @generated
	*/
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (ProyectommPackage.eINSTANCE.getProcesoDeNegocio().isSuperTypeOf(domainElement.eClass())
				&& isDiagram((ProcesoDeNegocio) domainElement)) {
			return ProcesoDeNegocioEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = proyectomm.diagram.part.ProyectommVisualIDRegistry.getModelID(containerView);
		if (!ProcesoDeNegocioEditPart.MODEL_ID.equals(containerModelID) && !"proyectomm".equals(containerModelID)) { //$NON-NLS-1$
			return -1;
		}
		int containerVisualID;
		if (ProcesoDeNegocioEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = proyectomm.diagram.part.ProyectommVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = ProcesoDeNegocioEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case ProcesoDeNegocioEditPart.VISUAL_ID:
			if (ProyectommPackage.eINSTANCE.getBaseDeDatos().isSuperTypeOf(domainElement.eClass())) {
				return BaseDeDatosEditPart.VISUAL_ID;
			}
			if (ProyectommPackage.eINSTANCE.getActor().isSuperTypeOf(domainElement.eClass())) {
				return ActorEditPart.VISUAL_ID;
			}
			break;
		case BaseDeDatosBaseDeDatosTablasCompartmentEditPart.VISUAL_ID:
			if (ProyectommPackage.eINSTANCE.getTabla().isSuperTypeOf(domainElement.eClass())) {
				return TablaEditPart.VISUAL_ID;
			}
			break;
		case TablaTablaAtributosCompartmentEditPart.VISUAL_ID:
			if (ProyectommPackage.eINSTANCE.getPrimaryKey().isSuperTypeOf(domainElement.eClass())) {
				return PrimaryKeyEditPart.VISUAL_ID;
			}
			if (ProyectommPackage.eINSTANCE.getForeignKey().isSuperTypeOf(domainElement.eClass())) {
				return ForeignKeyEditPart.VISUAL_ID;
			}
			if (ProyectommPackage.eINSTANCE.getAtributo().isSuperTypeOf(domainElement.eClass())) {
				return AtributoEditPart.VISUAL_ID;
			}
			break;
		case PrimaryKeyPrimaryKeyOpcionesCompartmentEditPart.VISUAL_ID:
			if (ProyectommPackage.eINSTANCE.getOpcion().isSuperTypeOf(domainElement.eClass())) {
				return OpcionEditPart.VISUAL_ID;
			}
			break;
		case ForeignKeyForeignKeyOpcionesCompartmentEditPart.VISUAL_ID:
			if (ProyectommPackage.eINSTANCE.getOpcion().isSuperTypeOf(domainElement.eClass())) {
				return OpcionEditPart.VISUAL_ID;
			}
			break;
		case AtributoAtributoOpcionesCompartmentEditPart.VISUAL_ID:
			if (ProyectommPackage.eINSTANCE.getOpcion().isSuperTypeOf(domainElement.eClass())) {
				return OpcionEditPart.VISUAL_ID;
			}
			break;
		case ActorActorTareasCompartmentEditPart.VISUAL_ID:
			if (ProyectommPackage.eINSTANCE.getEnvio().isSuperTypeOf(domainElement.eClass())) {
				return EnvioEditPart.VISUAL_ID;
			}
			if (ProyectommPackage.eINSTANCE.getRecepcion().isSuperTypeOf(domainElement.eClass())) {
				return RecepcionEditPart.VISUAL_ID;
			}
			if (ProyectommPackage.eINSTANCE.getBorrado().isSuperTypeOf(domainElement.eClass())) {
				return BorradoEditPart.VISUAL_ID;
			}
			if (ProyectommPackage.eINSTANCE.getLectura().isSuperTypeOf(domainElement.eClass())) {
				return LecturaEditPart.VISUAL_ID;
			}
			if (ProyectommPackage.eINSTANCE.getUsuario().isSuperTypeOf(domainElement.eClass())) {
				return UsuarioEditPart.VISUAL_ID;
			}
			if (ProyectommPackage.eINSTANCE.getServicio().isSuperTypeOf(domainElement.eClass())) {
				return ServicioEditPart.VISUAL_ID;
			}
			if (ProyectommPackage.eINSTANCE.getInicio().isSuperTypeOf(domainElement.eClass())) {
				return InicioEditPart.VISUAL_ID;
			}
			if (ProyectommPackage.eINSTANCE.getFin().isSuperTypeOf(domainElement.eClass())) {
				return FinEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = proyectomm.diagram.part.ProyectommVisualIDRegistry.getModelID(containerView);
		if (!ProcesoDeNegocioEditPart.MODEL_ID.equals(containerModelID) && !"proyectomm".equals(containerModelID)) { //$NON-NLS-1$
			return false;
		}
		int containerVisualID;
		if (ProcesoDeNegocioEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = proyectomm.diagram.part.ProyectommVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = ProcesoDeNegocioEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case ProcesoDeNegocioEditPart.VISUAL_ID:
			if (BaseDeDatosEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ActorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case BaseDeDatosEditPart.VISUAL_ID:
			if (BaseDeDatosNombreEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (BaseDeDatosBaseDeDatosTablasCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ActorEditPart.VISUAL_ID:
			if (ActorNombreEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ActorActorTareasCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TablaEditPart.VISUAL_ID:
			if (TablaNombreEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TablaTablaAtributosCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PrimaryKeyEditPart.VISUAL_ID:
			if (PrimaryKeyNombreTipoEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PrimaryKeyPrimaryKeyOpcionesCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case OpcionEditPart.VISUAL_ID:
			if (OpcionNombreEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ForeignKeyEditPart.VISUAL_ID:
			if (ForeignKeyNombreTipoEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ForeignKeyForeignKeyOpcionesCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AtributoEditPart.VISUAL_ID:
			if (AtributoNombreTipoEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AtributoAtributoOpcionesCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case EnvioEditPart.VISUAL_ID:
			if (EnvioNombreEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RecepcionEditPart.VISUAL_ID:
			if (RecepcionNombreEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case BorradoEditPart.VISUAL_ID:
			if (BorradoNombreEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case LecturaEditPart.VISUAL_ID:
			if (LecturaNombreEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case UsuarioEditPart.VISUAL_ID:
			if (UsuarioNombreEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ServicioEditPart.VISUAL_ID:
			if (ServicioNombreEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case BaseDeDatosBaseDeDatosTablasCompartmentEditPart.VISUAL_ID:
			if (TablaEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TablaTablaAtributosCompartmentEditPart.VISUAL_ID:
			if (PrimaryKeyEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ForeignKeyEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AtributoEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PrimaryKeyPrimaryKeyOpcionesCompartmentEditPart.VISUAL_ID:
			if (OpcionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ForeignKeyForeignKeyOpcionesCompartmentEditPart.VISUAL_ID:
			if (OpcionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AtributoAtributoOpcionesCompartmentEditPart.VISUAL_ID:
			if (OpcionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ActorActorTareasCompartmentEditPart.VISUAL_ID:
			if (EnvioEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RecepcionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (BorradoEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (LecturaEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (UsuarioEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ServicioEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InicioEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (FinEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TareaSucesorEditPart.VISUAL_ID:
			if (WrappingLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case UsuarioTabla_accedida_por_usuarioEditPart.VISUAL_ID:
			if (UsuarioTabla_accedida_por_usuarioExternalLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ServicioTabla_entrada_servicioEditPart.VISUAL_ID:
			if (ServicioTabla_entrada_servicioExternalLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ServicioTabla_salida_servicioEditPart.VISUAL_ID:
			if (ServicioTabla_salida_servicioExternalLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MensajeTabla_accedida_por_mensajeEditPart.VISUAL_ID:
			if (MensajeTabla_accedida_por_mensajeExternalLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case BDAtributo_seleccionadoEditPart.VISUAL_ID:
			if (BDAtributo_seleccionadoExternalLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ForeignKeyReferencia_aEditPart.VISUAL_ID:
			if (ForeignKeyReferencia_aExternalLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		return -1;
	}

	/**
	* User can change implementation of this method to handle some specific
	* situations not covered by default logic.
	* 
	* @generated
	*/
	private static boolean isDiagram(ProcesoDeNegocio element) {
		return true;
	}

	/**
	* @generated
	*/
	public static boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
		if (candidate == -1) {
			//unrecognized id is always bad
			return false;
		}
		int basic = getNodeVisualID(containerView, domainElement);
		return basic == candidate;
	}

	/**
	* @generated
	*/
	public static boolean isCompartmentVisualID(int visualID) {
		switch (visualID) {
		case BaseDeDatosBaseDeDatosTablasCompartmentEditPart.VISUAL_ID:
		case TablaTablaAtributosCompartmentEditPart.VISUAL_ID:
		case PrimaryKeyPrimaryKeyOpcionesCompartmentEditPart.VISUAL_ID:
		case ForeignKeyForeignKeyOpcionesCompartmentEditPart.VISUAL_ID:
		case AtributoAtributoOpcionesCompartmentEditPart.VISUAL_ID:
		case ActorActorTareasCompartmentEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static boolean isSemanticLeafVisualID(int visualID) {
		switch (visualID) {
		case ProcesoDeNegocioEditPart.VISUAL_ID:
			return false;
		case OpcionEditPart.VISUAL_ID:
		case EnvioEditPart.VISUAL_ID:
		case RecepcionEditPart.VISUAL_ID:
		case BorradoEditPart.VISUAL_ID:
		case LecturaEditPart.VISUAL_ID:
		case UsuarioEditPart.VISUAL_ID:
		case ServicioEditPart.VISUAL_ID:
		case InicioEditPart.VISUAL_ID:
		case FinEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static final DiagramStructure TYPED_INSTANCE = new DiagramStructure() {
		/**
		* @generated
		*/
		@Override

		public int getVisualID(View view) {
			return proyectomm.diagram.part.ProyectommVisualIDRegistry.getVisualID(view);
		}

		/**
		* @generated
		*/
		@Override

		public String getModelID(View view) {
			return proyectomm.diagram.part.ProyectommVisualIDRegistry.getModelID(view);
		}

		/**
		* @generated
		*/
		@Override

		public int getNodeVisualID(View containerView, EObject domainElement) {
			return proyectomm.diagram.part.ProyectommVisualIDRegistry.getNodeVisualID(containerView, domainElement);
		}

		/**
		* @generated
		*/
		@Override

		public boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
			return proyectomm.diagram.part.ProyectommVisualIDRegistry.checkNodeVisualID(containerView, domainElement,
					candidate);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isCompartmentVisualID(int visualID) {
			return proyectomm.diagram.part.ProyectommVisualIDRegistry.isCompartmentVisualID(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isSemanticLeafVisualID(int visualID) {
			return proyectomm.diagram.part.ProyectommVisualIDRegistry.isSemanticLeafVisualID(visualID);
		}
	};

}
