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
import proyectomm.Atributo;
import proyectomm.BaseDeDatos;
import proyectomm.ForeignKey;
import proyectomm.Opcion;
import proyectomm.PrimaryKey;
import proyectomm.ProcesoDeNegocio;
import proyectomm.Tabla;
import proyectomm.Tarea;
import proyectomm.diagram.edit.parts.ActorActorTareasCompartmentEditPart;
import proyectomm.diagram.edit.parts.ActorEditPart;
import proyectomm.diagram.edit.parts.AtributoAtributoOpcionesCompartmentEditPart;
import proyectomm.diagram.edit.parts.AtributoEditPart;
import proyectomm.diagram.edit.parts.BaseDeDatosBaseDeDatosTablasCompartmentEditPart;
import proyectomm.diagram.edit.parts.BaseDeDatosEditPart;
import proyectomm.diagram.edit.parts.BorradoEditPart;
import proyectomm.diagram.edit.parts.EnvioEditPart;
import proyectomm.diagram.edit.parts.FinEditPart;
import proyectomm.diagram.edit.parts.ForeignKeyEditPart;
import proyectomm.diagram.edit.parts.ForeignKeyForeignKeyOpcionesCompartmentEditPart;
import proyectomm.diagram.edit.parts.InicioEditPart;
import proyectomm.diagram.edit.parts.LecturaEditPart;
import proyectomm.diagram.edit.parts.OpcionEditPart;
import proyectomm.diagram.edit.parts.PrimaryKeyEditPart;
import proyectomm.diagram.edit.parts.PrimaryKeyPrimaryKeyOpcionesCompartmentEditPart;
import proyectomm.diagram.edit.parts.ProcesoDeNegocioEditPart;
import proyectomm.diagram.edit.parts.RecepcionEditPart;
import proyectomm.diagram.edit.parts.ServicioEditPart;
import proyectomm.diagram.edit.parts.TablaEditPart;
import proyectomm.diagram.edit.parts.TablaTablaAtributosCompartmentEditPart;
import proyectomm.diagram.edit.parts.UsuarioEditPart;

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
		case BaseDeDatosBaseDeDatosTablasCompartmentEditPart.VISUAL_ID:
			return getBaseDeDatosBaseDeDatosTablasCompartment_7001SemanticChildren(view);
		case TablaTablaAtributosCompartmentEditPart.VISUAL_ID:
			return getTablaTablaAtributosCompartment_7002SemanticChildren(view);
		case PrimaryKeyPrimaryKeyOpcionesCompartmentEditPart.VISUAL_ID:
			return getPrimaryKeyPrimaryKeyOpcionesCompartment_7003SemanticChildren(view);
		case ForeignKeyForeignKeyOpcionesCompartmentEditPart.VISUAL_ID:
			return getForeignKeyForeignKeyOpcionesCompartment_7004SemanticChildren(view);
		case AtributoAtributoOpcionesCompartmentEditPart.VISUAL_ID:
			return getAtributoAtributoOpcionesCompartment_7005SemanticChildren(view);
		case ActorActorTareasCompartmentEditPart.VISUAL_ID:
			return getActorActorTareasCompartment_7006SemanticChildren(view);
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
		for (Iterator<?> it = modelElement.getBases_de_datos().iterator(); it.hasNext();) {
			BaseDeDatos childElement = (BaseDeDatos) it.next();
			int visualID = ProyectommVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == BaseDeDatosEditPart.VISUAL_ID) {
				result.add(new ProyectommNodeDescriptor(childElement, visualID));
				continue;
			}
		}
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
	public static List<ProyectommNodeDescriptor> getBaseDeDatosBaseDeDatosTablasCompartment_7001SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		BaseDeDatos modelElement = (BaseDeDatos) containerView.getElement();
		LinkedList<ProyectommNodeDescriptor> result = new LinkedList<ProyectommNodeDescriptor>();
		for (Iterator<?> it = modelElement.getTablas().iterator(); it.hasNext();) {
			Tabla childElement = (Tabla) it.next();
			int visualID = ProyectommVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == TablaEditPart.VISUAL_ID) {
				result.add(new ProyectommNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<ProyectommNodeDescriptor> getTablaTablaAtributosCompartment_7002SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Tabla modelElement = (Tabla) containerView.getElement();
		LinkedList<ProyectommNodeDescriptor> result = new LinkedList<ProyectommNodeDescriptor>();
		for (Iterator<?> it = modelElement.getAtributos().iterator(); it.hasNext();) {
			Atributo childElement = (Atributo) it.next();
			int visualID = ProyectommVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PrimaryKeyEditPart.VISUAL_ID) {
				result.add(new ProyectommNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ForeignKeyEditPart.VISUAL_ID) {
				result.add(new ProyectommNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AtributoEditPart.VISUAL_ID) {
				result.add(new ProyectommNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<ProyectommNodeDescriptor> getPrimaryKeyPrimaryKeyOpcionesCompartment_7003SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		PrimaryKey modelElement = (PrimaryKey) containerView.getElement();
		LinkedList<ProyectommNodeDescriptor> result = new LinkedList<ProyectommNodeDescriptor>();
		for (Iterator<?> it = modelElement.getOpciones().iterator(); it.hasNext();) {
			Opcion childElement = (Opcion) it.next();
			int visualID = ProyectommVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == OpcionEditPart.VISUAL_ID) {
				result.add(new ProyectommNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<ProyectommNodeDescriptor> getForeignKeyForeignKeyOpcionesCompartment_7004SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		ForeignKey modelElement = (ForeignKey) containerView.getElement();
		LinkedList<ProyectommNodeDescriptor> result = new LinkedList<ProyectommNodeDescriptor>();
		for (Iterator<?> it = modelElement.getOpciones().iterator(); it.hasNext();) {
			Opcion childElement = (Opcion) it.next();
			int visualID = ProyectommVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == OpcionEditPart.VISUAL_ID) {
				result.add(new ProyectommNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<ProyectommNodeDescriptor> getAtributoAtributoOpcionesCompartment_7005SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Atributo modelElement = (Atributo) containerView.getElement();
		LinkedList<ProyectommNodeDescriptor> result = new LinkedList<ProyectommNodeDescriptor>();
		for (Iterator<?> it = modelElement.getOpciones().iterator(); it.hasNext();) {
			Opcion childElement = (Opcion) it.next();
			int visualID = ProyectommVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == OpcionEditPart.VISUAL_ID) {
				result.add(new ProyectommNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<ProyectommNodeDescriptor> getActorActorTareasCompartment_7006SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Actor modelElement = (Actor) containerView.getElement();
		LinkedList<ProyectommNodeDescriptor> result = new LinkedList<ProyectommNodeDescriptor>();
		for (Iterator<?> it = modelElement.getTareas().iterator(); it.hasNext();) {
			Tarea childElement = (Tarea) it.next();
			int visualID = ProyectommVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == EnvioEditPart.VISUAL_ID) {
				result.add(new ProyectommNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == RecepcionEditPart.VISUAL_ID) {
				result.add(new ProyectommNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == BorradoEditPart.VISUAL_ID) {
				result.add(new ProyectommNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == LecturaEditPart.VISUAL_ID) {
				result.add(new ProyectommNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == UsuarioEditPart.VISUAL_ID) {
				result.add(new ProyectommNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ServicioEditPart.VISUAL_ID) {
				result.add(new ProyectommNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == InicioEditPart.VISUAL_ID) {
				result.add(new ProyectommNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == FinEditPart.VISUAL_ID) {
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
		case BaseDeDatosEditPart.VISUAL_ID:
			return getBaseDeDatos_2001ContainedLinks(view);
		case ActorEditPart.VISUAL_ID:
			return getActor_2002ContainedLinks(view);
		case TablaEditPart.VISUAL_ID:
			return getTabla_3001ContainedLinks(view);
		case PrimaryKeyEditPart.VISUAL_ID:
			return getPrimaryKey_3002ContainedLinks(view);
		case OpcionEditPart.VISUAL_ID:
			return getOpcion_3003ContainedLinks(view);
		case ForeignKeyEditPart.VISUAL_ID:
			return getForeignKey_3004ContainedLinks(view);
		case AtributoEditPart.VISUAL_ID:
			return getAtributo_3005ContainedLinks(view);
		case EnvioEditPart.VISUAL_ID:
			return getEnvio_3006ContainedLinks(view);
		case RecepcionEditPart.VISUAL_ID:
			return getRecepcion_3007ContainedLinks(view);
		case BorradoEditPart.VISUAL_ID:
			return getBorrado_3008ContainedLinks(view);
		case LecturaEditPart.VISUAL_ID:
			return getLectura_3009ContainedLinks(view);
		case UsuarioEditPart.VISUAL_ID:
			return getUsuario_3010ContainedLinks(view);
		case ServicioEditPart.VISUAL_ID:
			return getServicio_3011ContainedLinks(view);
		case InicioEditPart.VISUAL_ID:
			return getInicio_3012ContainedLinks(view);
		case FinEditPart.VISUAL_ID:
			return getFin_3013ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<ProyectommLinkDescriptor> getIncomingLinks(View view) {
		switch (ProyectommVisualIDRegistry.getVisualID(view)) {
		case BaseDeDatosEditPart.VISUAL_ID:
			return getBaseDeDatos_2001IncomingLinks(view);
		case ActorEditPart.VISUAL_ID:
			return getActor_2002IncomingLinks(view);
		case TablaEditPart.VISUAL_ID:
			return getTabla_3001IncomingLinks(view);
		case PrimaryKeyEditPart.VISUAL_ID:
			return getPrimaryKey_3002IncomingLinks(view);
		case OpcionEditPart.VISUAL_ID:
			return getOpcion_3003IncomingLinks(view);
		case ForeignKeyEditPart.VISUAL_ID:
			return getForeignKey_3004IncomingLinks(view);
		case AtributoEditPart.VISUAL_ID:
			return getAtributo_3005IncomingLinks(view);
		case EnvioEditPart.VISUAL_ID:
			return getEnvio_3006IncomingLinks(view);
		case RecepcionEditPart.VISUAL_ID:
			return getRecepcion_3007IncomingLinks(view);
		case BorradoEditPart.VISUAL_ID:
			return getBorrado_3008IncomingLinks(view);
		case LecturaEditPart.VISUAL_ID:
			return getLectura_3009IncomingLinks(view);
		case UsuarioEditPart.VISUAL_ID:
			return getUsuario_3010IncomingLinks(view);
		case ServicioEditPart.VISUAL_ID:
			return getServicio_3011IncomingLinks(view);
		case InicioEditPart.VISUAL_ID:
			return getInicio_3012IncomingLinks(view);
		case FinEditPart.VISUAL_ID:
			return getFin_3013IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<ProyectommLinkDescriptor> getOutgoingLinks(View view) {
		switch (ProyectommVisualIDRegistry.getVisualID(view)) {
		case BaseDeDatosEditPart.VISUAL_ID:
			return getBaseDeDatos_2001OutgoingLinks(view);
		case ActorEditPart.VISUAL_ID:
			return getActor_2002OutgoingLinks(view);
		case TablaEditPart.VISUAL_ID:
			return getTabla_3001OutgoingLinks(view);
		case PrimaryKeyEditPart.VISUAL_ID:
			return getPrimaryKey_3002OutgoingLinks(view);
		case OpcionEditPart.VISUAL_ID:
			return getOpcion_3003OutgoingLinks(view);
		case ForeignKeyEditPart.VISUAL_ID:
			return getForeignKey_3004OutgoingLinks(view);
		case AtributoEditPart.VISUAL_ID:
			return getAtributo_3005OutgoingLinks(view);
		case EnvioEditPart.VISUAL_ID:
			return getEnvio_3006OutgoingLinks(view);
		case RecepcionEditPart.VISUAL_ID:
			return getRecepcion_3007OutgoingLinks(view);
		case BorradoEditPart.VISUAL_ID:
			return getBorrado_3008OutgoingLinks(view);
		case LecturaEditPart.VISUAL_ID:
			return getLectura_3009OutgoingLinks(view);
		case UsuarioEditPart.VISUAL_ID:
			return getUsuario_3010OutgoingLinks(view);
		case ServicioEditPart.VISUAL_ID:
			return getServicio_3011OutgoingLinks(view);
		case InicioEditPart.VISUAL_ID:
			return getInicio_3012OutgoingLinks(view);
		case FinEditPart.VISUAL_ID:
			return getFin_3013OutgoingLinks(view);
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
	public static List<ProyectommLinkDescriptor> getBaseDeDatos_2001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ProyectommLinkDescriptor> getActor_2002ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ProyectommLinkDescriptor> getTabla_3001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ProyectommLinkDescriptor> getPrimaryKey_3002ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ProyectommLinkDescriptor> getOpcion_3003ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ProyectommLinkDescriptor> getForeignKey_3004ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ProyectommLinkDescriptor> getAtributo_3005ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ProyectommLinkDescriptor> getEnvio_3006ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ProyectommLinkDescriptor> getRecepcion_3007ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ProyectommLinkDescriptor> getBorrado_3008ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ProyectommLinkDescriptor> getLectura_3009ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ProyectommLinkDescriptor> getUsuario_3010ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ProyectommLinkDescriptor> getServicio_3011ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ProyectommLinkDescriptor> getInicio_3012ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ProyectommLinkDescriptor> getFin_3013ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ProyectommLinkDescriptor> getBaseDeDatos_2001IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ProyectommLinkDescriptor> getActor_2002IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ProyectommLinkDescriptor> getTabla_3001IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ProyectommLinkDescriptor> getPrimaryKey_3002IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ProyectommLinkDescriptor> getOpcion_3003IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ProyectommLinkDescriptor> getForeignKey_3004IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ProyectommLinkDescriptor> getAtributo_3005IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ProyectommLinkDescriptor> getEnvio_3006IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ProyectommLinkDescriptor> getRecepcion_3007IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ProyectommLinkDescriptor> getBorrado_3008IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ProyectommLinkDescriptor> getLectura_3009IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ProyectommLinkDescriptor> getUsuario_3010IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ProyectommLinkDescriptor> getServicio_3011IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ProyectommLinkDescriptor> getInicio_3012IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ProyectommLinkDescriptor> getFin_3013IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ProyectommLinkDescriptor> getBaseDeDatos_2001OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ProyectommLinkDescriptor> getActor_2002OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ProyectommLinkDescriptor> getTabla_3001OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ProyectommLinkDescriptor> getPrimaryKey_3002OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ProyectommLinkDescriptor> getOpcion_3003OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ProyectommLinkDescriptor> getForeignKey_3004OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ProyectommLinkDescriptor> getAtributo_3005OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ProyectommLinkDescriptor> getEnvio_3006OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ProyectommLinkDescriptor> getRecepcion_3007OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ProyectommLinkDescriptor> getBorrado_3008OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ProyectommLinkDescriptor> getLectura_3009OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ProyectommLinkDescriptor> getUsuario_3010OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ProyectommLinkDescriptor> getServicio_3011OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ProyectommLinkDescriptor> getInicio_3012OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ProyectommLinkDescriptor> getFin_3013OutgoingLinks(View view) {
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
