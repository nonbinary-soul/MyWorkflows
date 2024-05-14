/*
 * 
 */
package proyectomm.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import proyectomm.diagram.providers.ProyectommElementTypes;
import proyectomm.diagram.providers.ProyectommModelingAssistantProvider;

/**
 * @generated
 */
public class ProyectommModelingAssistantProviderOfProcesoDeNegocioEditPart extends ProyectommModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(2);
		types.add(ProyectommElementTypes.BaseDeDatos_2001);
		types.add(ProyectommElementTypes.Actor_2002);
		return types;
	}

}
