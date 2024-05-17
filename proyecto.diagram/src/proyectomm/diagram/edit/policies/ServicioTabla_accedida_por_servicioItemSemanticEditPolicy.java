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
public class ServicioTabla_accedida_por_servicioItemSemanticEditPolicy extends ProyectommBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public ServicioTabla_accedida_por_servicioItemSemanticEditPolicy() {
		super(ProyectommElementTypes.ServicioTabla_accedida_por_servicio_4003);
	}

	/**
	* @generated
	*/
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return getGEFWrapper(new DestroyReferenceCommand(req));
	}

}
