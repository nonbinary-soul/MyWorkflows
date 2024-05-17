/*
* 
*/
package proyectomm.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;

import proyectomm.diagram.providers.ProyectommElementTypes;

/**
 * @generated
 */
public class MensajeTabla_accedida_por_mensajeItemSemanticEditPolicy extends ProyectommBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public MensajeTabla_accedida_por_mensajeItemSemanticEditPolicy() {
		super(ProyectommElementTypes.MensajeTabla_accedida_por_mensaje_4004);
	}

	/**
	* @generated
	*/
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return getGEFWrapper(new DestroyReferenceCommand(req));
	}

}
