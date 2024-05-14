/*
 * 
 */
package proyectomm.diagram.providers;

import org.eclipse.gmf.tooling.runtime.providers.DefaultEditPartProvider;

import proyectomm.diagram.edit.parts.ProcesoDeNegocioEditPart;
import proyectomm.diagram.edit.parts.ProyectommEditPartFactory;
import proyectomm.diagram.part.ProyectommVisualIDRegistry;

/**
 * @generated
 */
public class ProyectommEditPartProvider extends DefaultEditPartProvider {

	/**
	* @generated
	*/
	public ProyectommEditPartProvider() {
		super(new ProyectommEditPartFactory(), ProyectommVisualIDRegistry.TYPED_INSTANCE,
				ProcesoDeNegocioEditPart.MODEL_ID);
	}

}
