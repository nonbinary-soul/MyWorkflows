/*
* 
*/
package proyectomm.diagram.navigator;

import org.eclipse.core.runtime.IAdaptable;
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

import proyectomm.ProcesoDeNegocio;
import proyectomm.diagram.edit.parts.ActorEditPart;
import proyectomm.diagram.edit.parts.ActorNombreEditPart;
import proyectomm.diagram.edit.parts.BaseDeDatosEditPart;
import proyectomm.diagram.edit.parts.BaseDeDatosNombreEditPart;
import proyectomm.diagram.edit.parts.ProcesoDeNegocioEditPart;
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
			ProyectommDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5001); //$NON-NLS-1$
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
			ProyectommDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5002); //$NON-NLS-1$
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
