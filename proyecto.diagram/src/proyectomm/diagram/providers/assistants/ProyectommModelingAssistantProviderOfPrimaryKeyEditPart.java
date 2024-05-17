/*
 * 
 */
package proyectomm.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import proyectomm.diagram.edit.parts.PrimaryKeyEditPart;
import proyectomm.diagram.providers.ProyectommElementTypes;
import proyectomm.diagram.providers.ProyectommModelingAssistantProvider;

/**
 * @generated
 */
public class ProyectommModelingAssistantProviderOfPrimaryKeyEditPart extends ProyectommModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((PrimaryKeyEditPart) targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnTarget(PrimaryKeyEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(2);
		types.add(ProyectommElementTypes.BDAtributo_seleccionado_4005);
		types.add(ProyectommElementTypes.ForeignKeyReferencia_a_4006);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForSource(IAdaptable target, IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource((PrimaryKeyEditPart) targetEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForSource(PrimaryKeyEditPart target, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == ProyectommElementTypes.BDAtributo_seleccionado_4005) {
			types.add(ProyectommElementTypes.Borrado_3008);
			types.add(ProyectommElementTypes.Lectura_3009);
		} else if (relationshipType == ProyectommElementTypes.ForeignKeyReferencia_a_4006) {
			types.add(ProyectommElementTypes.ForeignKey_3004);
		}
		return types;
	}

}
