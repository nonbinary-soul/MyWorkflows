/*
* 
*/
package proyectomm.diagram.edit.policies;

import java.util.Iterator;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.View;

import proyectomm.diagram.edit.commands.MensajeTabla_accedida_por_mensajeCreateCommand;
import proyectomm.diagram.edit.commands.MensajeTabla_accedida_por_mensajeReorientCommand;
import proyectomm.diagram.edit.commands.TareaSucesorCreateCommand;
import proyectomm.diagram.edit.commands.TareaSucesorReorientCommand;
import proyectomm.diagram.edit.parts.MensajeTabla_accedida_por_mensajeEditPart;
import proyectomm.diagram.edit.parts.TareaSucesorEditPart;
import proyectomm.diagram.part.ProyectommVisualIDRegistry;
import proyectomm.diagram.providers.ProyectommElementTypes;

/**
 * @generated
 */
public class RecepcionItemSemanticEditPolicy extends ProyectommBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public RecepcionItemSemanticEditPolicy() {
		super(ProyectommElementTypes.Recepcion_3007);
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
			if (ProyectommVisualIDRegistry.getVisualID(incomingLink) == TareaSucesorEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
		}
		for (Iterator<?> it = view.getSourceEdges().iterator(); it.hasNext();) {
			Edge outgoingLink = (Edge) it.next();
			if (ProyectommVisualIDRegistry.getVisualID(outgoingLink) == TareaSucesorEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (ProyectommVisualIDRegistry
					.getVisualID(outgoingLink) == MensajeTabla_accedida_por_mensajeEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
		}
		EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
		if (annotation == null) {
			// there are indirectly referenced children, need extra commands: false
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
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		Command command = req.getTarget() == null ? getStartCreateRelationshipCommand(req)
				: getCompleteCreateRelationshipCommand(req);
		return command != null ? command : super.getCreateRelationshipCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getStartCreateRelationshipCommand(CreateRelationshipRequest req) {
		if (ProyectommElementTypes.TareaSucesor_4001 == req.getElementType()) {
			return getGEFWrapper(new TareaSucesorCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (ProyectommElementTypes.MensajeTabla_accedida_por_mensaje_4005 == req.getElementType()) {
			return getGEFWrapper(
					new MensajeTabla_accedida_por_mensajeCreateCommand(req, req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(CreateRelationshipRequest req) {
		if (ProyectommElementTypes.TareaSucesor_4001 == req.getElementType()) {
			return getGEFWrapper(new TareaSucesorCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (ProyectommElementTypes.MensajeTabla_accedida_por_mensaje_4005 == req.getElementType()) {
			return null;
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
		case TareaSucesorEditPart.VISUAL_ID:
			return getGEFWrapper(new TareaSucesorReorientCommand(req));
		case MensajeTabla_accedida_por_mensajeEditPart.VISUAL_ID:
			return getGEFWrapper(new MensajeTabla_accedida_por_mensajeReorientCommand(req));
		}
		return super.getReorientReferenceRelationshipCommand(req);
	}

}
