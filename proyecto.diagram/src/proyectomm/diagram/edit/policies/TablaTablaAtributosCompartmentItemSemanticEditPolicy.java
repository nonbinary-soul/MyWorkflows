/*
* 
*/
package proyectomm.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import proyectomm.diagram.edit.commands.AtributoCreateCommand;
import proyectomm.diagram.edit.commands.ForeignKeyCreateCommand;
import proyectomm.diagram.edit.commands.PrimaryKeyCreateCommand;
import proyectomm.diagram.providers.ProyectommElementTypes;

/**
 * @generated
 */
public class TablaTablaAtributosCompartmentItemSemanticEditPolicy extends ProyectommBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public TablaTablaAtributosCompartmentItemSemanticEditPolicy() {
		super(ProyectommElementTypes.Tabla_3001);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (ProyectommElementTypes.PrimaryKey_3002 == req.getElementType()) {
			return getGEFWrapper(new PrimaryKeyCreateCommand(req));
		}
		if (ProyectommElementTypes.ForeignKey_3004 == req.getElementType()) {
			return getGEFWrapper(new ForeignKeyCreateCommand(req));
		}
		if (ProyectommElementTypes.Atributo_3005 == req.getElementType()) {
			return getGEFWrapper(new AtributoCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
