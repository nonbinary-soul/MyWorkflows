/*
 * 
 */
package proyectomm.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import proyectomm.diagram.edit.parts.AtributoEditPart;
import proyectomm.diagram.providers.ProyectommElementTypes;
import proyectomm.diagram.providers.ProyectommModelingAssistantProvider;

/**
 * @generated
 */
public class ProyectommModelingAssistantProviderOfAtributoEditPart extends ProyectommModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((AtributoEditPart) targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnTarget(AtributoEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(ProyectommElementTypes.BDAtributo_seleccionado_4006);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForSource(IAdaptable target, IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource((AtributoEditPart) targetEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForSource(AtributoEditPart target, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == ProyectommElementTypes.BDAtributo_seleccionado_4006) {
			types.add(ProyectommElementTypes.Borrado_3008);
			types.add(ProyectommElementTypes.Lectura_3009);
		}
		return types;
	}

}
