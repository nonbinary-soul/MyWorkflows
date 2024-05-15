/*
* 
*/
package proyectomm.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import proyectomm.diagram.edit.commands.TablaCreateCommand;
import proyectomm.diagram.providers.ProyectommElementTypes;

/**
 * @generated
 */
public class BaseDeDatosBaseDeDatosTablasCompartmentItemSemanticEditPolicy
		extends ProyectommBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public BaseDeDatosBaseDeDatosTablasCompartmentItemSemanticEditPolicy() {
		super(ProyectommElementTypes.BaseDeDatos_2001);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (ProyectommElementTypes.Tabla_3001 == req.getElementType()) {
			return getGEFWrapper(new TablaCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
