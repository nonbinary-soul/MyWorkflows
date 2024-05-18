/*
* 
*/
package proyectomm.diagram.navigator;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.common.ui.services.parser.CommonParserHint;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

import proyectomm.Fin;
import proyectomm.Inicio;
import proyectomm.ProcesoDeNegocio;
import proyectomm.diagram.edit.parts.ActorEditPart;
import proyectomm.diagram.edit.parts.ActorNombreEditPart;
import proyectomm.diagram.edit.parts.AtributoEditPart;
import proyectomm.diagram.edit.parts.AtributoNombreTipoEditPart;
import proyectomm.diagram.edit.parts.BDAtributo_seleccionadoEditPart;
import proyectomm.diagram.edit.parts.BaseDeDatosEditPart;
import proyectomm.diagram.edit.parts.BaseDeDatosNombreEditPart;
import proyectomm.diagram.edit.parts.BorradoEditPart;
import proyectomm.diagram.edit.parts.BorradoNombreEditPart;
import proyectomm.diagram.edit.parts.EnvioEditPart;
import proyectomm.diagram.edit.parts.EnvioNombreEditPart;
import proyectomm.diagram.edit.parts.FinEditPart;
import proyectomm.diagram.edit.parts.ForeignKeyEditPart;
import proyectomm.diagram.edit.parts.ForeignKeyNombreTipoEditPart;
import proyectomm.diagram.edit.parts.ForeignKeyReferencia_aEditPart;
import proyectomm.diagram.edit.parts.InicioEditPart;
import proyectomm.diagram.edit.parts.LecturaEditPart;
import proyectomm.diagram.edit.parts.LecturaNombreEditPart;
import proyectomm.diagram.edit.parts.MensajeTabla_accedida_por_mensajeEditPart;
import proyectomm.diagram.edit.parts.OpcionEditPart;
import proyectomm.diagram.edit.parts.OpcionNombreEditPart;
import proyectomm.diagram.edit.parts.PrimaryKeyEditPart;
import proyectomm.diagram.edit.parts.PrimaryKeyNombreTipoEditPart;
import proyectomm.diagram.edit.parts.ProcesoDeNegocioEditPart;
import proyectomm.diagram.edit.parts.RecepcionEditPart;
import proyectomm.diagram.edit.parts.RecepcionNombreEditPart;
import proyectomm.diagram.edit.parts.ServicioEditPart;
import proyectomm.diagram.edit.parts.ServicioNombreEditPart;
import proyectomm.diagram.edit.parts.ServicioTabla_entrada_servicioEditPart;
import proyectomm.diagram.edit.parts.ServicioTabla_salida_servicioEditPart;
import proyectomm.diagram.edit.parts.TablaEditPart;
import proyectomm.diagram.edit.parts.TablaNombreEditPart;
import proyectomm.diagram.edit.parts.TareaSucesorEditPart;
import proyectomm.diagram.edit.parts.UsuarioEditPart;
import proyectomm.diagram.edit.parts.UsuarioNombreEditPart;
import proyectomm.diagram.edit.parts.UsuarioTabla_accedida_por_usuarioEditPart;
import proyectomm.diagram.part.ProyectommDiagramEditorPlugin;
import proyectomm.diagram.part.ProyectommVisualIDRegistry;
import proyectomm.diagram.providers.ProyectommElementTypes;
import proyectomm.diagram.providers.ProyectommParserProvider;

/**
 * @generated
 */
public class ProyectommNavigatorLabelProvider extends LabelProvider
		implements ICommonLabelProvider, ITreePathLabelProvider {

	/**
	* @generated
	*/
	static {
		ProyectommDiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?UnknownElement", //$NON-NLS-1$
				ImageDescriptor.getMissingImageDescriptor());
		ProyectommDiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?ImageNotFound", //$NON-NLS-1$
				ImageDescriptor.getMissingImageDescriptor());
	}

	/**
	* @generated
	*/
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof ProyectommNavigatorItem && !isOwnView(((ProyectommNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	* @generated
	*/
	public Image getImage(Object element) {
		if (element instanceof ProyectommNavigatorGroup) {
			ProyectommNavigatorGroup group = (ProyectommNavigatorGroup) element;
			return ProyectommDiagramEditorPlugin.getInstance().getBundledImage(group.getIcon());
		}

		if (element instanceof ProyectommNavigatorItem) {
			ProyectommNavigatorItem navigatorItem = (ProyectommNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getImage(view);
			}
		}

		return super.getImage(element);
	}

	/**
	* @generated
	*/
	public Image getImage(View view) {
		switch (ProyectommVisualIDRegistry.getVisualID(view)) {
		case ProcesoDeNegocioEditPart.VISUAL_ID:
			return getImage("Navigator?Diagram?http://www.example.org/proyectomm?ProcesoDeNegocio", //$NON-NLS-1$
					ProyectommElementTypes.ProcesoDeNegocio_1000);
		case BaseDeDatosEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.example.org/proyectomm?BaseDeDatos", //$NON-NLS-1$
					ProyectommElementTypes.BaseDeDatos_2001);
		case ActorEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.example.org/proyectomm?Actor", //$NON-NLS-1$
					ProyectommElementTypes.Actor_2002);
		case TablaEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.example.org/proyectomm?Tabla", //$NON-NLS-1$
					ProyectommElementTypes.Tabla_3001);
		case PrimaryKeyEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.example.org/proyectomm?PrimaryKey", //$NON-NLS-1$
					ProyectommElementTypes.PrimaryKey_3002);
		case OpcionEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.example.org/proyectomm?Opcion", //$NON-NLS-1$
					ProyectommElementTypes.Opcion_3003);
		case ForeignKeyEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.example.org/proyectomm?ForeignKey", //$NON-NLS-1$
					ProyectommElementTypes.ForeignKey_3004);
		case AtributoEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.example.org/proyectomm?Atributo", //$NON-NLS-1$
					ProyectommElementTypes.Atributo_3005);
		case EnvioEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.example.org/proyectomm?Envio", //$NON-NLS-1$
					ProyectommElementTypes.Envio_3006);
		case RecepcionEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.example.org/proyectomm?Recepcion", //$NON-NLS-1$
					ProyectommElementTypes.Recepcion_3007);
		case BorradoEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.example.org/proyectomm?Borrado", //$NON-NLS-1$
					ProyectommElementTypes.Borrado_3008);
		case LecturaEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.example.org/proyectomm?Lectura", //$NON-NLS-1$
					ProyectommElementTypes.Lectura_3009);
		case UsuarioEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.example.org/proyectomm?Usuario", //$NON-NLS-1$
					ProyectommElementTypes.Usuario_3010);
		case ServicioEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.example.org/proyectomm?Servicio", //$NON-NLS-1$
					ProyectommElementTypes.Servicio_3011);
		case InicioEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.example.org/proyectomm?Inicio", //$NON-NLS-1$
					ProyectommElementTypes.Inicio_3012);
		case FinEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.example.org/proyectomm?Fin", ProyectommElementTypes.Fin_3013); //$NON-NLS-1$
		case TareaSucesorEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://www.example.org/proyectomm?Tarea?sucesor", //$NON-NLS-1$
					ProyectommElementTypes.TareaSucesor_4001);
		case UsuarioTabla_accedida_por_usuarioEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://www.example.org/proyectomm?Usuario?tabla_accedida_por_usuario", //$NON-NLS-1$
					ProyectommElementTypes.UsuarioTabla_accedida_por_usuario_4002);
		case ServicioTabla_entrada_servicioEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://www.example.org/proyectomm?Servicio?tabla_entrada_servicio", //$NON-NLS-1$
					ProyectommElementTypes.ServicioTabla_entrada_servicio_4003);
		case ServicioTabla_salida_servicioEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://www.example.org/proyectomm?Servicio?tabla_salida_servicio", //$NON-NLS-1$
					ProyectommElementTypes.ServicioTabla_salida_servicio_4004);
		case MensajeTabla_accedida_por_mensajeEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://www.example.org/proyectomm?Mensaje?tabla_accedida_por_mensaje", //$NON-NLS-1$
					ProyectommElementTypes.MensajeTabla_accedida_por_mensaje_4005);
		case BDAtributo_seleccionadoEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://www.example.org/proyectomm?BD?atributo_seleccionado", //$NON-NLS-1$
					ProyectommElementTypes.BDAtributo_seleccionado_4006);
		case ForeignKeyReferencia_aEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://www.example.org/proyectomm?ForeignKey?referencia_a", //$NON-NLS-1$
					ProyectommElementTypes.ForeignKeyReferencia_a_4007);
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = ProyectommDiagramEditorPlugin.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null && ProyectommElementTypes.isKnownElementType(elementType)) {
			image = ProyectommElementTypes.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	* @generated
	*/
	public String getText(Object element) {
		if (element instanceof ProyectommNavigatorGroup) {
			ProyectommNavigatorGroup group = (ProyectommNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof ProyectommNavigatorItem) {
			ProyectommNavigatorItem navigatorItem = (ProyectommNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getText(view);
			}
		}

		return super.getText(element);
	}

	/**
	* @generated
	*/
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (ProyectommVisualIDRegistry.getVisualID(view)) {
		case ProcesoDeNegocioEditPart.VISUAL_ID:
			return getProcesoDeNegocio_1000Text(view);
		case BaseDeDatosEditPart.VISUAL_ID:
			return getBaseDeDatos_2001Text(view);
		case ActorEditPart.VISUAL_ID:
			return getActor_2002Text(view);
		case TablaEditPart.VISUAL_ID:
			return getTabla_3001Text(view);
		case PrimaryKeyEditPart.VISUAL_ID:
			return getPrimaryKey_3002Text(view);
		case OpcionEditPart.VISUAL_ID:
			return getOpcion_3003Text(view);
		case ForeignKeyEditPart.VISUAL_ID:
			return getForeignKey_3004Text(view);
		case AtributoEditPart.VISUAL_ID:
			return getAtributo_3005Text(view);
		case EnvioEditPart.VISUAL_ID:
			return getEnvio_3006Text(view);
		case RecepcionEditPart.VISUAL_ID:
			return getRecepcion_3007Text(view);
		case BorradoEditPart.VISUAL_ID:
			return getBorrado_3008Text(view);
		case LecturaEditPart.VISUAL_ID:
			return getLectura_3009Text(view);
		case UsuarioEditPart.VISUAL_ID:
			return getUsuario_3010Text(view);
		case ServicioEditPart.VISUAL_ID:
			return getServicio_3011Text(view);
		case InicioEditPart.VISUAL_ID:
			return getInicio_3012Text(view);
		case FinEditPart.VISUAL_ID:
			return getFin_3013Text(view);
		case TareaSucesorEditPart.VISUAL_ID:
			return getTareaSucesor_4001Text(view);
		case UsuarioTabla_accedida_por_usuarioEditPart.VISUAL_ID:
			return getUsuarioTabla_accedida_por_usuario_4002Text(view);
		case ServicioTabla_entrada_servicioEditPart.VISUAL_ID:
			return getServicioTabla_entrada_servicio_4003Text(view);
		case ServicioTabla_salida_servicioEditPart.VISUAL_ID:
			return getServicioTabla_salida_servicio_4004Text(view);
		case MensajeTabla_accedida_por_mensajeEditPart.VISUAL_ID:
			return getMensajeTabla_accedida_por_mensaje_4005Text(view);
		case BDAtributo_seleccionadoEditPart.VISUAL_ID:
			return getBDAtributo_seleccionado_4006Text(view);
		case ForeignKeyReferencia_aEditPart.VISUAL_ID:
			return getForeignKeyReferencia_a_4007Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	* @generated
	*/
	private String getProcesoDeNegocio_1000Text(View view) {
		ProcesoDeNegocio domainModelElement = (ProcesoDeNegocio) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getNombre();
		} else {
			ProyectommDiagramEditorPlugin.getInstance().logError("No domain element for view with visualID = " + 1000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getBaseDeDatos_2001Text(View view) {
		IParser parser = ProyectommParserProvider.getParser(ProyectommElementTypes.BaseDeDatos_2001,
				view.getElement() != null ? view.getElement() : view,
				ProyectommVisualIDRegistry.getType(BaseDeDatosNombreEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ProyectommDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5006); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getActor_2002Text(View view) {
		IParser parser = ProyectommParserProvider.getParser(ProyectommElementTypes.Actor_2002,
				view.getElement() != null ? view.getElement() : view,
				ProyectommVisualIDRegistry.getType(ActorNombreEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ProyectommDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5013); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getTabla_3001Text(View view) {
		IParser parser = ProyectommParserProvider.getParser(ProyectommElementTypes.Tabla_3001,
				view.getElement() != null ? view.getElement() : view,
				ProyectommVisualIDRegistry.getType(TablaNombreEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ProyectommDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getPrimaryKey_3002Text(View view) {
		IParser parser = ProyectommParserProvider.getParser(ProyectommElementTypes.PrimaryKey_3002,
				view.getElement() != null ? view.getElement() : view,
				ProyectommVisualIDRegistry.getType(PrimaryKeyNombreTipoEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ProyectommDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getOpcion_3003Text(View view) {
		IParser parser = ProyectommParserProvider.getParser(ProyectommElementTypes.Opcion_3003,
				view.getElement() != null ? view.getElement() : view,
				ProyectommVisualIDRegistry.getType(OpcionNombreEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ProyectommDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getForeignKey_3004Text(View view) {
		IParser parser = ProyectommParserProvider.getParser(ProyectommElementTypes.ForeignKey_3004,
				view.getElement() != null ? view.getElement() : view,
				ProyectommVisualIDRegistry.getType(ForeignKeyNombreTipoEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ProyectommDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getAtributo_3005Text(View view) {
		IParser parser = ProyectommParserProvider.getParser(ProyectommElementTypes.Atributo_3005,
				view.getElement() != null ? view.getElement() : view,
				ProyectommVisualIDRegistry.getType(AtributoNombreTipoEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ProyectommDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getEnvio_3006Text(View view) {
		IParser parser = ProyectommParserProvider.getParser(ProyectommElementTypes.Envio_3006,
				view.getElement() != null ? view.getElement() : view,
				ProyectommVisualIDRegistry.getType(EnvioNombreEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ProyectommDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5007); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getRecepcion_3007Text(View view) {
		IParser parser = ProyectommParserProvider.getParser(ProyectommElementTypes.Recepcion_3007,
				view.getElement() != null ? view.getElement() : view,
				ProyectommVisualIDRegistry.getType(RecepcionNombreEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ProyectommDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5008); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getBorrado_3008Text(View view) {
		IParser parser = ProyectommParserProvider.getParser(ProyectommElementTypes.Borrado_3008,
				view.getElement() != null ? view.getElement() : view,
				ProyectommVisualIDRegistry.getType(BorradoNombreEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ProyectommDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5009); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getLectura_3009Text(View view) {
		IParser parser = ProyectommParserProvider.getParser(ProyectommElementTypes.Lectura_3009,
				view.getElement() != null ? view.getElement() : view,
				ProyectommVisualIDRegistry.getType(LecturaNombreEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ProyectommDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5010); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getUsuario_3010Text(View view) {
		IParser parser = ProyectommParserProvider.getParser(ProyectommElementTypes.Usuario_3010,
				view.getElement() != null ? view.getElement() : view,
				ProyectommVisualIDRegistry.getType(UsuarioNombreEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ProyectommDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5011); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getServicio_3011Text(View view) {
		IParser parser = ProyectommParserProvider.getParser(ProyectommElementTypes.Servicio_3011,
				view.getElement() != null ? view.getElement() : view,
				ProyectommVisualIDRegistry.getType(ServicioNombreEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ProyectommDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5012); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getInicio_3012Text(View view) {
		Inicio domainModelElement = (Inicio) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getNombre();
		} else {
			ProyectommDiagramEditorPlugin.getInstance().logError("No domain element for view with visualID = " + 3012); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getFin_3013Text(View view) {
		Fin domainModelElement = (Fin) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getNombre();
		} else {
			ProyectommDiagramEditorPlugin.getInstance().logError("No domain element for view with visualID = " + 3013); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getTareaSucesor_4001Text(View view) {
		IParser parser = ProyectommParserProvider.getParser(ProyectommElementTypes.TareaSucesor_4001,
				view.getElement() != null ? view.getElement() : view, CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ProyectommDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getUsuarioTabla_accedida_por_usuario_4002Text(View view) {
		IParser parser = ProyectommParserProvider.getParser(
				ProyectommElementTypes.UsuarioTabla_accedida_por_usuario_4002,
				view.getElement() != null ? view.getElement() : view, CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ProyectommDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getServicioTabla_entrada_servicio_4003Text(View view) {
		IParser parser = ProyectommParserProvider.getParser(ProyectommElementTypes.ServicioTabla_entrada_servicio_4003,
				view.getElement() != null ? view.getElement() : view, CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ProyectommDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getServicioTabla_salida_servicio_4004Text(View view) {
		IParser parser = ProyectommParserProvider.getParser(ProyectommElementTypes.ServicioTabla_salida_servicio_4004,
				view.getElement() != null ? view.getElement() : view, CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ProyectommDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getMensajeTabla_accedida_por_mensaje_4005Text(View view) {
		IParser parser = ProyectommParserProvider.getParser(
				ProyectommElementTypes.MensajeTabla_accedida_por_mensaje_4005,
				view.getElement() != null ? view.getElement() : view, CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ProyectommDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getBDAtributo_seleccionado_4006Text(View view) {
		IParser parser = ProyectommParserProvider.getParser(ProyectommElementTypes.BDAtributo_seleccionado_4006,
				view.getElement() != null ? view.getElement() : view, CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ProyectommDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6006); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getForeignKeyReferencia_a_4007Text(View view) {
		IParser parser = ProyectommParserProvider.getParser(ProyectommElementTypes.ForeignKeyReferencia_a_4007,
				view.getElement() != null ? view.getElement() : view, CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ProyectommDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6007); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	* @generated
	*/
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	* @generated
	*/
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	* @generated
	*/
	public void restoreState(IMemento aMemento) {
	}

	/**
	* @generated
	*/
	public void saveState(IMemento aMemento) {
	}

	/**
	* @generated
	*/
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	* @generated
	*/
	private boolean isOwnView(View view) {
		return ProcesoDeNegocioEditPart.MODEL_ID.equals(ProyectommVisualIDRegistry.getModelID(view));
	}

}
