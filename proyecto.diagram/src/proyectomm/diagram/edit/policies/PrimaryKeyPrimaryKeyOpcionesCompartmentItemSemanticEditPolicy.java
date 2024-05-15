/*
* 
*/
package proyectomm.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import proyectomm.diagram.edit.commands.OpcionCreateCommand;
import proyectomm.diagram.providers.ProyectommElementTypes;

/**
 * @generated
 */
public class PrimaryKeyPrimaryKeyOpcionesCompartmentItemSemanticEditPolicy
		extends ProyectommBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public PrimaryKeyPrimaryKeyOpcionesCompartmentItemSemanticEditPolicy() {
		super(ProyectommElementTypes.PrimaryKey_3002);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (ProyectommElementTypes.Opcion_3003 == req.getElementType()) {
			return getGEFWrapper(new OpcionCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
