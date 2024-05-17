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
public class UsuarioTabla_accedida_por_usuarioItemSemanticEditPolicy extends ProyectommBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public UsuarioTabla_accedida_por_usuarioItemSemanticEditPolicy() {
		super(ProyectommElementTypes.UsuarioTabla_accedida_por_usuario_4002);
	}

	/**
	* @generated
	*/
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return getGEFWrapper(new DestroyReferenceCommand(req));
	}

}
