/*
* 
*/
package proyectomm.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import proyectomm.diagram.edit.commands.BorradoCreateCommand;
import proyectomm.diagram.edit.commands.EnvioCreateCommand;
import proyectomm.diagram.edit.commands.FinCreateCommand;
import proyectomm.diagram.edit.commands.InicioCreateCommand;
import proyectomm.diagram.edit.commands.LecturaCreateCommand;
import proyectomm.diagram.edit.commands.RecepcionCreateCommand;
import proyectomm.diagram.edit.commands.ServicioCreateCommand;
import proyectomm.diagram.edit.commands.UsuarioCreateCommand;
import proyectomm.diagram.providers.ProyectommElementTypes;

/**
 * @generated
 */
public class ActorActorTareasCompartmentItemSemanticEditPolicy extends ProyectommBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public ActorActorTareasCompartmentItemSemanticEditPolicy() {
		super(ProyectommElementTypes.Actor_2002);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (ProyectommElementTypes.Envio_3006 == req.getElementType()) {
			return getGEFWrapper(new EnvioCreateCommand(req));
		}
		if (ProyectommElementTypes.Recepcion_3007 == req.getElementType()) {
			return getGEFWrapper(new RecepcionCreateCommand(req));
		}
		if (ProyectommElementTypes.Borrado_3008 == req.getElementType()) {
			return getGEFWrapper(new BorradoCreateCommand(req));
		}
		if (ProyectommElementTypes.Lectura_3009 == req.getElementType()) {
			return getGEFWrapper(new LecturaCreateCommand(req));
		}
		if (ProyectommElementTypes.Usuario_3010 == req.getElementType()) {
			return getGEFWrapper(new UsuarioCreateCommand(req));
		}
		if (ProyectommElementTypes.Servicio_3011 == req.getElementType()) {
			return getGEFWrapper(new ServicioCreateCommand(req));
		}
		if (ProyectommElementTypes.Inicio_3012 == req.getElementType()) {
			return getGEFWrapper(new InicioCreateCommand(req));
		}
		if (ProyectommElementTypes.Fin_3013 == req.getElementType()) {
			return getGEFWrapper(new FinCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
