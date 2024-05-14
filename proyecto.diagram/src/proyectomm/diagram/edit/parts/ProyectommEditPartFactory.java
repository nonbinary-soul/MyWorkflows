/*
 * 
 */
package proyectomm.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

import proyectomm.diagram.part.ProyectommVisualIDRegistry;

/**
 * @generated
 */
public class ProyectommEditPartFactory implements EditPartFactory {

	/**
	* @generated
	*/
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (ProyectommVisualIDRegistry.getVisualID(view)) {

			case ProcesoDeNegocioEditPart.VISUAL_ID:
				return new ProcesoDeNegocioEditPart(view);

			case BaseDeDatosEditPart.VISUAL_ID:
				return new BaseDeDatosEditPart(view);

			case BaseDeDatosNombreEditPart.VISUAL_ID:
				return new BaseDeDatosNombreEditPart(view);

			case ActorEditPart.VISUAL_ID:
				return new ActorEditPart(view);

			case ActorNombreEditPart.VISUAL_ID:
				return new ActorNombreEditPart(view);
			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	* @generated
	*/
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	* @generated
	*/
	public static CellEditorLocator getTextCellEditorLocator(ITextAwareEditPart source) {
		return CellEditorLocatorAccess.INSTANCE.getTextCellEditorLocator(source);
	}

}
