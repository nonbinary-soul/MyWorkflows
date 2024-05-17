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

			case TablaEditPart.VISUAL_ID:
				return new TablaEditPart(view);

			case TablaNombreEditPart.VISUAL_ID:
				return new TablaNombreEditPart(view);

			case PrimaryKeyEditPart.VISUAL_ID:
				return new PrimaryKeyEditPart(view);

			case PrimaryKeyNombreTipoEditPart.VISUAL_ID:
				return new PrimaryKeyNombreTipoEditPart(view);

			case OpcionEditPart.VISUAL_ID:
				return new OpcionEditPart(view);

			case OpcionNombreEditPart.VISUAL_ID:
				return new OpcionNombreEditPart(view);

			case ForeignKeyEditPart.VISUAL_ID:
				return new ForeignKeyEditPart(view);

			case ForeignKeyNombreTipoEditPart.VISUAL_ID:
				return new ForeignKeyNombreTipoEditPart(view);

			case AtributoEditPart.VISUAL_ID:
				return new AtributoEditPart(view);

			case AtributoNombreTipoEditPart.VISUAL_ID:
				return new AtributoNombreTipoEditPart(view);

			case EnvioEditPart.VISUAL_ID:
				return new EnvioEditPart(view);

			case EnvioNombreEditPart.VISUAL_ID:
				return new EnvioNombreEditPart(view);

			case RecepcionEditPart.VISUAL_ID:
				return new RecepcionEditPart(view);

			case RecepcionNombreEditPart.VISUAL_ID:
				return new RecepcionNombreEditPart(view);

			case BorradoEditPart.VISUAL_ID:
				return new BorradoEditPart(view);

			case BorradoNombreEditPart.VISUAL_ID:
				return new BorradoNombreEditPart(view);

			case LecturaEditPart.VISUAL_ID:
				return new LecturaEditPart(view);

			case LecturaNombreEditPart.VISUAL_ID:
				return new LecturaNombreEditPart(view);

			case UsuarioEditPart.VISUAL_ID:
				return new UsuarioEditPart(view);

			case UsuarioNombreEditPart.VISUAL_ID:
				return new UsuarioNombreEditPart(view);

			case ServicioEditPart.VISUAL_ID:
				return new ServicioEditPart(view);

			case ServicioNombreEditPart.VISUAL_ID:
				return new ServicioNombreEditPart(view);

			case InicioEditPart.VISUAL_ID:
				return new InicioEditPart(view);

			case FinEditPart.VISUAL_ID:
				return new FinEditPart(view);

			case BaseDeDatosBaseDeDatosTablasCompartmentEditPart.VISUAL_ID:
				return new BaseDeDatosBaseDeDatosTablasCompartmentEditPart(view);

			case TablaTablaAtributosCompartmentEditPart.VISUAL_ID:
				return new TablaTablaAtributosCompartmentEditPart(view);

			case PrimaryKeyPrimaryKeyOpcionesCompartmentEditPart.VISUAL_ID:
				return new PrimaryKeyPrimaryKeyOpcionesCompartmentEditPart(view);

			case ForeignKeyForeignKeyOpcionesCompartmentEditPart.VISUAL_ID:
				return new ForeignKeyForeignKeyOpcionesCompartmentEditPart(view);

			case AtributoAtributoOpcionesCompartmentEditPart.VISUAL_ID:
				return new AtributoAtributoOpcionesCompartmentEditPart(view);

			case ActorActorTareasCompartmentEditPart.VISUAL_ID:
				return new ActorActorTareasCompartmentEditPart(view);

			case TareaSucesorEditPart.VISUAL_ID:
				return new TareaSucesorEditPart(view);

			case WrappingLabelEditPart.VISUAL_ID:
				return new WrappingLabelEditPart(view);

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
