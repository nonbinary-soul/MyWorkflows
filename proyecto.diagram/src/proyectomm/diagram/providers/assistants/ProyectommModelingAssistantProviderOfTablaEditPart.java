/*
 * 
 */
package proyectomm.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import proyectomm.diagram.edit.parts.TablaEditPart;
import proyectomm.diagram.providers.ProyectommElementTypes;
import proyectomm.diagram.providers.ProyectommModelingAssistantProvider;

/**
 * @generated
 */
public class ProyectommModelingAssistantProviderOfTablaEditPart extends ProyectommModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((TablaEditPart) targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnTarget(TablaEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(4);
		types.add(ProyectommElementTypes.UsuarioTabla_accedida_por_usuario_4002);
		types.add(ProyectommElementTypes.ServicioTabla_entrada_servicio_4003);
		types.add(ProyectommElementTypes.ServicioTabla_salida_servicio_4004);
		types.add(ProyectommElementTypes.MensajeTabla_accedida_por_mensaje_4005);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForSource(IAdaptable target, IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource((TablaEditPart) targetEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForSource(TablaEditPart target, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == ProyectommElementTypes.UsuarioTabla_accedida_por_usuario_4002) {
			types.add(ProyectommElementTypes.Usuario_3010);
		} else if (relationshipType == ProyectommElementTypes.ServicioTabla_entrada_servicio_4003) {
			types.add(ProyectommElementTypes.Servicio_3011);
		} else if (relationshipType == ProyectommElementTypes.ServicioTabla_salida_servicio_4004) {
			types.add(ProyectommElementTypes.Servicio_3011);
		} else if (relationshipType == ProyectommElementTypes.MensajeTabla_accedida_por_mensaje_4005) {
			types.add(ProyectommElementTypes.Envio_3006);
			types.add(ProyectommElementTypes.Recepcion_3007);
		}
		return types;
	}

}
