/*
 * 
 */
package proyectomm.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import proyectomm.diagram.edit.parts.BorradoEditPart;
import proyectomm.diagram.edit.parts.EnvioEditPart;
import proyectomm.diagram.edit.parts.FinEditPart;
import proyectomm.diagram.edit.parts.InicioEditPart;
import proyectomm.diagram.edit.parts.LecturaEditPart;
import proyectomm.diagram.edit.parts.RecepcionEditPart;
import proyectomm.diagram.edit.parts.ServicioEditPart;
import proyectomm.diagram.edit.parts.UsuarioEditPart;
import proyectomm.diagram.providers.ProyectommElementTypes;
import proyectomm.diagram.providers.ProyectommModelingAssistantProvider;

/**
 * @generated
 */
public class ProyectommModelingAssistantProviderOfUsuarioEditPart extends ProyectommModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((UsuarioEditPart) sourceEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSource(UsuarioEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(ProyectommElementTypes.TareaSucesor_4001);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSourceAndTarget(IAdaptable source, IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSourceAndTarget((UsuarioEditPart) sourceEditPart, targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSourceAndTarget(UsuarioEditPart source,
			IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof EnvioEditPart) {
			types.add(ProyectommElementTypes.TareaSucesor_4001);
		}
		if (targetEditPart instanceof RecepcionEditPart) {
			types.add(ProyectommElementTypes.TareaSucesor_4001);
		}
		if (targetEditPart instanceof BorradoEditPart) {
			types.add(ProyectommElementTypes.TareaSucesor_4001);
		}
		if (targetEditPart instanceof LecturaEditPart) {
			types.add(ProyectommElementTypes.TareaSucesor_4001);
		}
		if (targetEditPart instanceof UsuarioEditPart) {
			types.add(ProyectommElementTypes.TareaSucesor_4001);
		}
		if (targetEditPart instanceof ServicioEditPart) {
			types.add(ProyectommElementTypes.TareaSucesor_4001);
		}
		if (targetEditPart instanceof InicioEditPart) {
			types.add(ProyectommElementTypes.TareaSucesor_4001);
		}
		if (targetEditPart instanceof FinEditPart) {
			types.add(ProyectommElementTypes.TareaSucesor_4001);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForTarget(IAdaptable source, IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForTarget((UsuarioEditPart) sourceEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForTarget(UsuarioEditPart source, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == ProyectommElementTypes.TareaSucesor_4001) {
			types.add(ProyectommElementTypes.Envio_3006);
			types.add(ProyectommElementTypes.Recepcion_3007);
			types.add(ProyectommElementTypes.Borrado_3008);
			types.add(ProyectommElementTypes.Lectura_3009);
			types.add(ProyectommElementTypes.Usuario_3010);
			types.add(ProyectommElementTypes.Servicio_3011);
			types.add(ProyectommElementTypes.Inicio_3012);
			types.add(ProyectommElementTypes.Fin_3013);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((UsuarioEditPart) targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnTarget(UsuarioEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(ProyectommElementTypes.TareaSucesor_4001);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForSource(IAdaptable target, IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource((UsuarioEditPart) targetEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForSource(UsuarioEditPart target, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == ProyectommElementTypes.TareaSucesor_4001) {
			types.add(ProyectommElementTypes.Envio_3006);
			types.add(ProyectommElementTypes.Recepcion_3007);
			types.add(ProyectommElementTypes.Borrado_3008);
			types.add(ProyectommElementTypes.Lectura_3009);
			types.add(ProyectommElementTypes.Usuario_3010);
			types.add(ProyectommElementTypes.Servicio_3011);
			types.add(ProyectommElementTypes.Inicio_3012);
			types.add(ProyectommElementTypes.Fin_3013);
		}
		return types;
	}

}
