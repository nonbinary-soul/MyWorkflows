/*
* 
*/
package proyectomm.diagram.edit.policies;

import java.util.Iterator;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.common.core.command.ICompositeCommand;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;

import proyectomm.diagram.edit.commands.MensajeTabla_accedida_por_mensajeCreateCommand;
import proyectomm.diagram.edit.commands.MensajeTabla_accedida_por_mensajeReorientCommand;
import proyectomm.diagram.edit.commands.ServicioTabla_entrada_servicioCreateCommand;
import proyectomm.diagram.edit.commands.ServicioTabla_entrada_servicioReorientCommand;
import proyectomm.diagram.edit.commands.ServicioTabla_salida_servicioCreateCommand;
import proyectomm.diagram.edit.commands.ServicioTabla_salida_servicioReorientCommand;
import proyectomm.diagram.edit.commands.UsuarioTabla_accedida_por_usuarioCreateCommand;
import proyectomm.diagram.edit.commands.UsuarioTabla_accedida_por_usuarioReorientCommand;
import proyectomm.diagram.edit.parts.AtributoEditPart;
import proyectomm.diagram.edit.parts.BDAtributo_seleccionadoEditPart;
import proyectomm.diagram.edit.parts.ForeignKeyEditPart;
import proyectomm.diagram.edit.parts.ForeignKeyReferencia_aEditPart;
import proyectomm.diagram.edit.parts.MensajeTabla_accedida_por_mensajeEditPart;
import proyectomm.diagram.edit.parts.PrimaryKeyEditPart;
import proyectomm.diagram.edit.parts.ServicioTabla_entrada_servicioEditPart;
import proyectomm.diagram.edit.parts.ServicioTabla_salida_servicioEditPart;
import proyectomm.diagram.edit.parts.TablaTablaAtributosCompartmentEditPart;
import proyectomm.diagram.edit.parts.UsuarioTabla_accedida_por_usuarioEditPart;
import proyectomm.diagram.part.ProyectommVisualIDRegistry;
import proyectomm.diagram.providers.ProyectommElementTypes;

/**
 * @generated
 */
public class TablaItemSemanticEditPolicy extends ProyectommBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public TablaItemSemanticEditPolicy() {
		super(ProyectommElementTypes.Tabla_3001);
	}

	/**
	* @generated
	*/
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		View view = (View) getHost().getModel();
		CompositeTransactionalCommand cmd = new CompositeTransactionalCommand(getEditingDomain(), null);
		cmd.setTransactionNestingEnabled(false);
		for (Iterator<?> it = view.getTargetEdges().iterator(); it.hasNext();) {
			Edge incomingLink = (Edge) it.next();
			if (ProyectommVisualIDRegistry
					.getVisualID(incomingLink) == UsuarioTabla_accedida_por_usuarioEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (ProyectommVisualIDRegistry
					.getVisualID(incomingLink) == ServicioTabla_entrada_servicioEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (ProyectommVisualIDRegistry
					.getVisualID(incomingLink) == ServicioTabla_salida_servicioEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (ProyectommVisualIDRegistry
					.getVisualID(incomingLink) == MensajeTabla_accedida_por_mensajeEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
		}
		EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
		if (annotation == null) {
			// there are indirectly referenced children, need extra commands: false
			addDestroyChildNodesCommand(cmd);
			addDestroyShortcutsCommand(cmd, view);
			// delete host element
			cmd.add(new DestroyElementCommand(req));
		} else {
			cmd.add(new DeleteCommand(getEditingDomain(), view));
		}
		return getGEFWrapper(cmd.reduce());
	}

	/**
	* @generated
	*/
	private void addDestroyChildNodesCommand(ICompositeCommand cmd) {
		View view = (View) getHost().getModel();
		for (Iterator<?> nit = view.getChildren().iterator(); nit.hasNext();) {
			Node node = (Node) nit.next();
			switch (ProyectommVisualIDRegistry.getVisualID(node)) {
			case TablaTablaAtributosCompartmentEditPart.VISUAL_ID:
				for (Iterator<?> cit = node.getChildren().iterator(); cit.hasNext();) {
					Node cnode = (Node) cit.next();
					switch (ProyectommVisualIDRegistry.getVisualID(cnode)) {
					case PrimaryKeyEditPart.VISUAL_ID:
						for (Iterator<?> it = cnode.getTargetEdges().iterator(); it.hasNext();) {
							Edge incomingLink = (Edge) it.next();
							if (ProyectommVisualIDRegistry
									.getVisualID(incomingLink) == BDAtributo_seleccionadoEditPart.VISUAL_ID) {
								DestroyReferenceRequest r = new DestroyReferenceRequest(
										incomingLink.getSource().getElement(), null,
										incomingLink.getTarget().getElement(), false);
								cmd.add(new DestroyReferenceCommand(r));
								cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
								continue;
							}
							if (ProyectommVisualIDRegistry
									.getVisualID(incomingLink) == ForeignKeyReferencia_aEditPart.VISUAL_ID) {
								DestroyReferenceRequest r = new DestroyReferenceRequest(
										incomingLink.getSource().getElement(), null,
										incomingLink.getTarget().getElement(), false);
								cmd.add(new DestroyReferenceCommand(r));
								cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
								continue;
							}
						}
						cmd.add(new DestroyElementCommand(
								new DestroyElementRequest(getEditingDomain(), cnode.getElement(), false))); // directlyOwned: true
						// don't need explicit deletion of cnode as parent's view deletion would clean child views as well 
						// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), cnode));
						break;
					case ForeignKeyEditPart.VISUAL_ID:
						for (Iterator<?> it = cnode.getTargetEdges().iterator(); it.hasNext();) {
							Edge incomingLink = (Edge) it.next();
							if (ProyectommVisualIDRegistry
									.getVisualID(incomingLink) == BDAtributo_seleccionadoEditPart.VISUAL_ID) {
								DestroyReferenceRequest r = new DestroyReferenceRequest(
										incomingLink.getSource().getElement(), null,
										incomingLink.getTarget().getElement(), false);
								cmd.add(new DestroyReferenceCommand(r));
								cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
								continue;
							}
						}
						for (Iterator<?> it = cnode.getSourceEdges().iterator(); it.hasNext();) {
							Edge outgoingLink = (Edge) it.next();
							if (ProyectommVisualIDRegistry
									.getVisualID(outgoingLink) == ForeignKeyReferencia_aEditPart.VISUAL_ID) {
								DestroyReferenceRequest r = new DestroyReferenceRequest(
										outgoingLink.getSource().getElement(), null,
										outgoingLink.getTarget().getElement(), false);
								cmd.add(new DestroyReferenceCommand(r));
								cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
								continue;
							}
						}
						cmd.add(new DestroyElementCommand(
								new DestroyElementRequest(getEditingDomain(), cnode.getElement(), false))); // directlyOwned: true
						// don't need explicit deletion of cnode as parent's view deletion would clean child views as well 
						// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), cnode));
						break;
					case AtributoEditPart.VISUAL_ID:
						for (Iterator<?> it = cnode.getTargetEdges().iterator(); it.hasNext();) {
							Edge incomingLink = (Edge) it.next();
							if (ProyectommVisualIDRegistry
									.getVisualID(incomingLink) == BDAtributo_seleccionadoEditPart.VISUAL_ID) {
								DestroyReferenceRequest r = new DestroyReferenceRequest(
										incomingLink.getSource().getElement(), null,
										incomingLink.getTarget().getElement(), false);
								cmd.add(new DestroyReferenceCommand(r));
								cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
								continue;
							}
						}
						cmd.add(new DestroyElementCommand(
								new DestroyElementRequest(getEditingDomain(), cnode.getElement(), false))); // directlyOwned: true
						// don't need explicit deletion of cnode as parent's view deletion would clean child views as well 
						// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), cnode));
						break;
					}
				}
				break;
			}
		}
	}

	/**
	 * @generated
	 */
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		Command command = req.getTarget() == null ? getStartCreateRelationshipCommand(req)
				: getCompleteCreateRelationshipCommand(req);
		return command != null ? command : super.getCreateRelationshipCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getStartCreateRelationshipCommand(CreateRelationshipRequest req) {
		if (ProyectommElementTypes.UsuarioTabla_accedida_por_usuario_4002 == req.getElementType()) {
			return null;
		}
		if (ProyectommElementTypes.ServicioTabla_entrada_servicio_4003 == req.getElementType()) {
			return null;
		}
		if (ProyectommElementTypes.ServicioTabla_salida_servicio_4004 == req.getElementType()) {
			return null;
		}
		if (ProyectommElementTypes.MensajeTabla_accedida_por_mensaje_4005 == req.getElementType()) {
			return null;
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(CreateRelationshipRequest req) {
		if (ProyectommElementTypes.UsuarioTabla_accedida_por_usuario_4002 == req.getElementType()) {
			return getGEFWrapper(
					new UsuarioTabla_accedida_por_usuarioCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (ProyectommElementTypes.ServicioTabla_entrada_servicio_4003 == req.getElementType()) {
			return getGEFWrapper(
					new ServicioTabla_entrada_servicioCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (ProyectommElementTypes.ServicioTabla_salida_servicio_4004 == req.getElementType()) {
			return getGEFWrapper(new ServicioTabla_salida_servicioCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (ProyectommElementTypes.MensajeTabla_accedida_por_mensaje_4005 == req.getElementType()) {
			return getGEFWrapper(
					new MensajeTabla_accedida_por_mensajeCreateCommand(req, req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * Returns command to reorient EReference based link. New link target or source
	 * should be the domain model element associated with this node.
	 * 
	 * @generated
	 */
	protected Command getReorientReferenceRelationshipCommand(ReorientReferenceRelationshipRequest req) {
		switch (getVisualID(req)) {
		case UsuarioTabla_accedida_por_usuarioEditPart.VISUAL_ID:
			return getGEFWrapper(new UsuarioTabla_accedida_por_usuarioReorientCommand(req));
		case ServicioTabla_entrada_servicioEditPart.VISUAL_ID:
			return getGEFWrapper(new ServicioTabla_entrada_servicioReorientCommand(req));
		case ServicioTabla_salida_servicioEditPart.VISUAL_ID:
			return getGEFWrapper(new ServicioTabla_salida_servicioReorientCommand(req));
		case MensajeTabla_accedida_por_mensajeEditPart.VISUAL_ID:
			return getGEFWrapper(new MensajeTabla_accedida_por_mensajeReorientCommand(req));
		}
		return super.getReorientReferenceRelationshipCommand(req);
	}

}
