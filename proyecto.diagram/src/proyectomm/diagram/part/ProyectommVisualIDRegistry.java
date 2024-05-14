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
import proyectomm.diagram.edit.parts.ActorEditPart;
import proyectomm.diagram.edit.parts.ActorNombreEditPart;
import proyectomm.diagram.edit.parts.ProcesoDeNegocioEditPart;

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
			if (ProyectommPackage.eINSTANCE.getActor().isSuperTypeOf(domainElement.eClass())) {
				return ActorEditPart.VISUAL_ID;
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
			if (ActorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ActorEditPart.VISUAL_ID:
			if (ActorNombreEditPart.VISUAL_ID == nodeVisualID) {
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
		return false;
	}

	/**
	* @generated
	*/
	public static boolean isSemanticLeafVisualID(int visualID) {
		switch (visualID) {
		case ProcesoDeNegocioEditPart.VISUAL_ID:
			return false;
		case ActorEditPart.VISUAL_ID:
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
