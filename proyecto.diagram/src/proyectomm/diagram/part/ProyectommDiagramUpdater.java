/*
* 
*/
package proyectomm.diagram.part;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

import proyectomm.Actor;
import proyectomm.ProcesoDeNegocio;
import proyectomm.diagram.edit.parts.ActorEditPart;
import proyectomm.diagram.edit.parts.ProcesoDeNegocioEditPart;

/**
 * @generated
 */
public class ProyectommDiagramUpdater {

	/**
	* @generated
	*/
	public static boolean isShortcutOrphaned(View view) {
		return !view.isSetElement() || view.getElement() == null || view.getElement().eIsProxy();
	}

	/**
	* @generated
	*/
	public static List<ProyectommNodeDescriptor> getSemanticChildren(View view) {
		switch (ProyectommVisualIDRegistry.getVisualID(view)) {
		case ProcesoDeNegocioEditPart.VISUAL_ID:
			return getProcesoDeNegocio_1000SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<ProyectommNodeDescriptor> getProcesoDeNegocio_1000SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		ProcesoDeNegocio modelElement = (ProcesoDeNegocio) view.getElement();
		LinkedList<ProyectommNodeDescriptor> result = new LinkedList<ProyectommNodeDescriptor>();
		for (Iterator<?> it = modelElement.getActores().iterator(); it.hasNext();) {
			Actor childElement = (Actor) it.next();
			int visualID = ProyectommVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ActorEditPart.VISUAL_ID) {
				result.add(new ProyectommNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<ProyectommLinkDescriptor> getContainedLinks(View view) {
		switch (ProyectommVisualIDRegistry.getVisualID(view)) {
		case ProcesoDeNegocioEditPart.VISUAL_ID:
			return getProcesoDeNegocio_1000ContainedLinks(view);
		case ActorEditPart.VISUAL_ID:
			return getActor_2001ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<ProyectommLinkDescriptor> getIncomingLinks(View view) {
		switch (ProyectommVisualIDRegistry.getVisualID(view)) {
		case ActorEditPart.VISUAL_ID:
			return getActor_2001IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<ProyectommLinkDescriptor> getOutgoingLinks(View view) {
		switch (ProyectommVisualIDRegistry.getVisualID(view)) {
		case ActorEditPart.VISUAL_ID:
			return getActor_2001OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ProyectommLinkDescriptor> getProcesoDeNegocio_1000ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ProyectommLinkDescriptor> getActor_2001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ProyectommLinkDescriptor> getActor_2001IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ProyectommLinkDescriptor> getActor_2001OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		* @generated
		*/
		@Override

		public List<ProyectommNodeDescriptor> getSemanticChildren(View view) {
			return ProyectommDiagramUpdater.getSemanticChildren(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<ProyectommLinkDescriptor> getContainedLinks(View view) {
			return ProyectommDiagramUpdater.getContainedLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<ProyectommLinkDescriptor> getIncomingLinks(View view) {
			return ProyectommDiagramUpdater.getIncomingLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<ProyectommLinkDescriptor> getOutgoingLinks(View view) {
			return ProyectommDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
