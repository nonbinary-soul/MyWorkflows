/*
* 
*/
package proyectomm.diagram.navigator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.gmf.runtime.emf.core.GMFEditingDomainFactory;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonContentProvider;

import proyectomm.diagram.edit.parts.ActorActorTareasCompartmentEditPart;
import proyectomm.diagram.edit.parts.ActorEditPart;
import proyectomm.diagram.edit.parts.AtributoAtributoOpcionesCompartmentEditPart;
import proyectomm.diagram.edit.parts.AtributoEditPart;
import proyectomm.diagram.edit.parts.BaseDeDatosBaseDeDatosTablasCompartmentEditPart;
import proyectomm.diagram.edit.parts.BaseDeDatosEditPart;
import proyectomm.diagram.edit.parts.BorradoEditPart;
import proyectomm.diagram.edit.parts.EnvioEditPart;
import proyectomm.diagram.edit.parts.FinEditPart;
import proyectomm.diagram.edit.parts.ForeignKeyEditPart;
import proyectomm.diagram.edit.parts.ForeignKeyForeignKeyOpcionesCompartmentEditPart;
import proyectomm.diagram.edit.parts.InicioEditPart;
import proyectomm.diagram.edit.parts.LecturaEditPart;
import proyectomm.diagram.edit.parts.OpcionEditPart;
import proyectomm.diagram.edit.parts.PrimaryKeyEditPart;
import proyectomm.diagram.edit.parts.PrimaryKeyPrimaryKeyOpcionesCompartmentEditPart;
import proyectomm.diagram.edit.parts.ProcesoDeNegocioEditPart;
import proyectomm.diagram.edit.parts.RecepcionEditPart;
import proyectomm.diagram.edit.parts.ServicioEditPart;
import proyectomm.diagram.edit.parts.TablaEditPart;
import proyectomm.diagram.edit.parts.TablaTablaAtributosCompartmentEditPart;
import proyectomm.diagram.edit.parts.TareaSucesorEditPart;
import proyectomm.diagram.edit.parts.UsuarioEditPart;
import proyectomm.diagram.part.Messages;
import proyectomm.diagram.part.ProyectommVisualIDRegistry;

/**
 * @generated
 */
public class ProyectommNavigatorContentProvider implements ICommonContentProvider {

	/**
	* @generated
	*/
	private static final Object[] EMPTY_ARRAY = new Object[0];

	/**
	* @generated
	*/
	private Viewer myViewer;

	/**
	* @generated
	*/
	private AdapterFactoryEditingDomain myEditingDomain;

	/**
	* @generated
	*/
	private WorkspaceSynchronizer myWorkspaceSynchronizer;

	/**
	* @generated
	*/
	private Runnable myViewerRefreshRunnable;

	/**
	* @generated
	*/
	@SuppressWarnings({ "unchecked", "serial", "rawtypes" })
	public ProyectommNavigatorContentProvider() {
		TransactionalEditingDomain editingDomain = GMFEditingDomainFactory.INSTANCE.createEditingDomain();
		myEditingDomain = (AdapterFactoryEditingDomain) editingDomain;
		myEditingDomain.setResourceToReadOnlyMap(new HashMap() {
			public Object get(Object key) {
				if (!containsKey(key)) {
					put(key, Boolean.TRUE);
				}
				return super.get(key);
			}
		});
		myViewerRefreshRunnable = new Runnable() {
			public void run() {
				if (myViewer != null) {
					myViewer.refresh();
				}
			}
		};
		myWorkspaceSynchronizer = new WorkspaceSynchronizer(editingDomain, new WorkspaceSynchronizer.Delegate() {
			public void dispose() {
			}

			public boolean handleResourceChanged(final Resource resource) {
				unloadAllResources();
				asyncRefresh();
				return true;
			}

			public boolean handleResourceDeleted(Resource resource) {
				unloadAllResources();
				asyncRefresh();
				return true;
			}

			public boolean handleResourceMoved(Resource resource, final URI newURI) {
				unloadAllResources();
				asyncRefresh();
				return true;
			}
		});
	}

	/**
	* @generated
	*/
	public void dispose() {
		myWorkspaceSynchronizer.dispose();
		myWorkspaceSynchronizer = null;
		myViewerRefreshRunnable = null;
		myViewer = null;
		unloadAllResources();
		((TransactionalEditingDomain) myEditingDomain).dispose();
		myEditingDomain = null;
	}

	/**
	* @generated
	*/
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		myViewer = viewer;
	}

	/**
	* @generated
	*/
	void unloadAllResources() {
		for (Resource nextResource : myEditingDomain.getResourceSet().getResources()) {
			nextResource.unload();
		}
	}

	/**
	* @generated
	*/
	void asyncRefresh() {
		if (myViewer != null && !myViewer.getControl().isDisposed()) {
			myViewer.getControl().getDisplay().asyncExec(myViewerRefreshRunnable);
		}
	}

	/**
	* @generated
	*/
	public Object[] getElements(Object inputElement) {
		return getChildren(inputElement);
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
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	* @generated
	*/
	public Object[] getChildren(Object parentElement) {
		if (parentElement instanceof IFile) {
			IFile file = (IFile) parentElement;
			URI fileURI = URI.createPlatformResourceURI(file.getFullPath().toString(), true);
			Resource resource = myEditingDomain.getResourceSet().getResource(fileURI, true);
			ArrayList<ProyectommNavigatorItem> result = new ArrayList<ProyectommNavigatorItem>();
			ArrayList<View> topViews = new ArrayList<View>(resource.getContents().size());
			for (EObject o : resource.getContents()) {
				if (o instanceof View) {
					topViews.add((View) o);
				}
			}
			result.addAll(
					createNavigatorItems(selectViewsByType(topViews, ProcesoDeNegocioEditPart.MODEL_ID), file, false));
			return result.toArray();
		}

		if (parentElement instanceof ProyectommNavigatorGroup) {
			ProyectommNavigatorGroup group = (ProyectommNavigatorGroup) parentElement;
			return group.getChildren();
		}

		if (parentElement instanceof ProyectommNavigatorItem) {
			ProyectommNavigatorItem navigatorItem = (ProyectommNavigatorItem) parentElement;
			if (navigatorItem.isLeaf() || !isOwnView(navigatorItem.getView())) {
				return EMPTY_ARRAY;
			}
			return getViewChildren(navigatorItem.getView(), parentElement);
		}

		/*
		* Due to plugin.xml restrictions this code will be called only for views representing
		* shortcuts to this diagram elements created on other diagrams. 
		*/
		if (parentElement instanceof IAdaptable) {
			View view = (View) ((IAdaptable) parentElement).getAdapter(View.class);
			if (view != null) {
				return getViewChildren(view, parentElement);
			}
		}

		return EMPTY_ARRAY;
	}

	/**
	* @generated
	*/
	private Object[] getViewChildren(View view, Object parentElement) {
		switch (ProyectommVisualIDRegistry.getVisualID(view)) {

		case ProcesoDeNegocioEditPart.VISUAL_ID: {
			LinkedList<ProyectommAbstractNavigatorItem> result = new LinkedList<ProyectommAbstractNavigatorItem>();
			result.addAll(getForeignShortcuts((Diagram) view, parentElement));
			Diagram sv = (Diagram) view;
			ProyectommNavigatorGroup links = new ProyectommNavigatorGroup(
					Messages.NavigatorGroupName_ProcesoDeNegocio_1000_links, "icons/linksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ProyectommVisualIDRegistry.getType(BaseDeDatosEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ProyectommVisualIDRegistry.getType(ActorEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					ProyectommVisualIDRegistry.getType(TareaSucesorEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			if (!links.isEmpty()) {
				result.add(links);
			}
			return result.toArray();
		}

		case BaseDeDatosEditPart.VISUAL_ID: {
			LinkedList<ProyectommAbstractNavigatorItem> result = new LinkedList<ProyectommAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ProyectommVisualIDRegistry.getType(BaseDeDatosBaseDeDatosTablasCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ProyectommVisualIDRegistry.getType(TablaEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case ActorEditPart.VISUAL_ID: {
			LinkedList<ProyectommAbstractNavigatorItem> result = new LinkedList<ProyectommAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ProyectommVisualIDRegistry.getType(ActorActorTareasCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ProyectommVisualIDRegistry.getType(EnvioEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ProyectommVisualIDRegistry.getType(ActorActorTareasCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ProyectommVisualIDRegistry.getType(RecepcionEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ProyectommVisualIDRegistry.getType(ActorActorTareasCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ProyectommVisualIDRegistry.getType(BorradoEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ProyectommVisualIDRegistry.getType(ActorActorTareasCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ProyectommVisualIDRegistry.getType(LecturaEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ProyectommVisualIDRegistry.getType(ActorActorTareasCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ProyectommVisualIDRegistry.getType(UsuarioEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ProyectommVisualIDRegistry.getType(ActorActorTareasCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ProyectommVisualIDRegistry.getType(ServicioEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ProyectommVisualIDRegistry.getType(ActorActorTareasCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ProyectommVisualIDRegistry.getType(InicioEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ProyectommVisualIDRegistry.getType(ActorActorTareasCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ProyectommVisualIDRegistry.getType(FinEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case TablaEditPart.VISUAL_ID: {
			LinkedList<ProyectommAbstractNavigatorItem> result = new LinkedList<ProyectommAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ProyectommVisualIDRegistry.getType(TablaTablaAtributosCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ProyectommVisualIDRegistry.getType(PrimaryKeyEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ProyectommVisualIDRegistry.getType(TablaTablaAtributosCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ProyectommVisualIDRegistry.getType(ForeignKeyEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ProyectommVisualIDRegistry.getType(TablaTablaAtributosCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ProyectommVisualIDRegistry.getType(AtributoEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case PrimaryKeyEditPart.VISUAL_ID: {
			LinkedList<ProyectommAbstractNavigatorItem> result = new LinkedList<ProyectommAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ProyectommVisualIDRegistry.getType(PrimaryKeyPrimaryKeyOpcionesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ProyectommVisualIDRegistry.getType(OpcionEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case ForeignKeyEditPart.VISUAL_ID: {
			LinkedList<ProyectommAbstractNavigatorItem> result = new LinkedList<ProyectommAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ProyectommVisualIDRegistry.getType(ForeignKeyForeignKeyOpcionesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ProyectommVisualIDRegistry.getType(OpcionEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case AtributoEditPart.VISUAL_ID: {
			LinkedList<ProyectommAbstractNavigatorItem> result = new LinkedList<ProyectommAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ProyectommVisualIDRegistry.getType(AtributoAtributoOpcionesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ProyectommVisualIDRegistry.getType(OpcionEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case EnvioEditPart.VISUAL_ID: {
			LinkedList<ProyectommAbstractNavigatorItem> result = new LinkedList<ProyectommAbstractNavigatorItem>();
			Node sv = (Node) view;
			ProyectommNavigatorGroup incominglinks = new ProyectommNavigatorGroup(
					Messages.NavigatorGroupName_Envio_3006_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			ProyectommNavigatorGroup outgoinglinks = new ProyectommNavigatorGroup(
					Messages.NavigatorGroupName_Envio_3006_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ProyectommVisualIDRegistry.getType(TareaSucesorEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ProyectommVisualIDRegistry.getType(TareaSucesorEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case RecepcionEditPart.VISUAL_ID: {
			LinkedList<ProyectommAbstractNavigatorItem> result = new LinkedList<ProyectommAbstractNavigatorItem>();
			Node sv = (Node) view;
			ProyectommNavigatorGroup incominglinks = new ProyectommNavigatorGroup(
					Messages.NavigatorGroupName_Recepcion_3007_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			ProyectommNavigatorGroup outgoinglinks = new ProyectommNavigatorGroup(
					Messages.NavigatorGroupName_Recepcion_3007_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ProyectommVisualIDRegistry.getType(TareaSucesorEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ProyectommVisualIDRegistry.getType(TareaSucesorEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case BorradoEditPart.VISUAL_ID: {
			LinkedList<ProyectommAbstractNavigatorItem> result = new LinkedList<ProyectommAbstractNavigatorItem>();
			Node sv = (Node) view;
			ProyectommNavigatorGroup incominglinks = new ProyectommNavigatorGroup(
					Messages.NavigatorGroupName_Borrado_3008_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			ProyectommNavigatorGroup outgoinglinks = new ProyectommNavigatorGroup(
					Messages.NavigatorGroupName_Borrado_3008_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ProyectommVisualIDRegistry.getType(TareaSucesorEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ProyectommVisualIDRegistry.getType(TareaSucesorEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case LecturaEditPart.VISUAL_ID: {
			LinkedList<ProyectommAbstractNavigatorItem> result = new LinkedList<ProyectommAbstractNavigatorItem>();
			Node sv = (Node) view;
			ProyectommNavigatorGroup incominglinks = new ProyectommNavigatorGroup(
					Messages.NavigatorGroupName_Lectura_3009_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			ProyectommNavigatorGroup outgoinglinks = new ProyectommNavigatorGroup(
					Messages.NavigatorGroupName_Lectura_3009_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ProyectommVisualIDRegistry.getType(TareaSucesorEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ProyectommVisualIDRegistry.getType(TareaSucesorEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case UsuarioEditPart.VISUAL_ID: {
			LinkedList<ProyectommAbstractNavigatorItem> result = new LinkedList<ProyectommAbstractNavigatorItem>();
			Node sv = (Node) view;
			ProyectommNavigatorGroup incominglinks = new ProyectommNavigatorGroup(
					Messages.NavigatorGroupName_Usuario_3010_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			ProyectommNavigatorGroup outgoinglinks = new ProyectommNavigatorGroup(
					Messages.NavigatorGroupName_Usuario_3010_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ProyectommVisualIDRegistry.getType(TareaSucesorEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ProyectommVisualIDRegistry.getType(TareaSucesorEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case ServicioEditPart.VISUAL_ID: {
			LinkedList<ProyectommAbstractNavigatorItem> result = new LinkedList<ProyectommAbstractNavigatorItem>();
			Node sv = (Node) view;
			ProyectommNavigatorGroup incominglinks = new ProyectommNavigatorGroup(
					Messages.NavigatorGroupName_Servicio_3011_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			ProyectommNavigatorGroup outgoinglinks = new ProyectommNavigatorGroup(
					Messages.NavigatorGroupName_Servicio_3011_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ProyectommVisualIDRegistry.getType(TareaSucesorEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ProyectommVisualIDRegistry.getType(TareaSucesorEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case InicioEditPart.VISUAL_ID: {
			LinkedList<ProyectommAbstractNavigatorItem> result = new LinkedList<ProyectommAbstractNavigatorItem>();
			Node sv = (Node) view;
			ProyectommNavigatorGroup incominglinks = new ProyectommNavigatorGroup(
					Messages.NavigatorGroupName_Inicio_3012_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			ProyectommNavigatorGroup outgoinglinks = new ProyectommNavigatorGroup(
					Messages.NavigatorGroupName_Inicio_3012_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ProyectommVisualIDRegistry.getType(TareaSucesorEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ProyectommVisualIDRegistry.getType(TareaSucesorEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case FinEditPart.VISUAL_ID: {
			LinkedList<ProyectommAbstractNavigatorItem> result = new LinkedList<ProyectommAbstractNavigatorItem>();
			Node sv = (Node) view;
			ProyectommNavigatorGroup incominglinks = new ProyectommNavigatorGroup(
					Messages.NavigatorGroupName_Fin_3013_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			ProyectommNavigatorGroup outgoinglinks = new ProyectommNavigatorGroup(
					Messages.NavigatorGroupName_Fin_3013_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ProyectommVisualIDRegistry.getType(TareaSucesorEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ProyectommVisualIDRegistry.getType(TareaSucesorEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case TareaSucesorEditPart.VISUAL_ID: {
			LinkedList<ProyectommAbstractNavigatorItem> result = new LinkedList<ProyectommAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			ProyectommNavigatorGroup target = new ProyectommNavigatorGroup(
					Messages.NavigatorGroupName_TareaSucesor_4001_target, "icons/linkTargetNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			ProyectommNavigatorGroup source = new ProyectommNavigatorGroup(
					Messages.NavigatorGroupName_TareaSucesor_4001_source, "icons/linkSourceNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ProyectommVisualIDRegistry.getType(EnvioEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ProyectommVisualIDRegistry.getType(RecepcionEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ProyectommVisualIDRegistry.getType(BorradoEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ProyectommVisualIDRegistry.getType(LecturaEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ProyectommVisualIDRegistry.getType(UsuarioEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ProyectommVisualIDRegistry.getType(ServicioEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ProyectommVisualIDRegistry.getType(InicioEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ProyectommVisualIDRegistry.getType(FinEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ProyectommVisualIDRegistry.getType(EnvioEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ProyectommVisualIDRegistry.getType(RecepcionEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ProyectommVisualIDRegistry.getType(BorradoEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ProyectommVisualIDRegistry.getType(LecturaEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ProyectommVisualIDRegistry.getType(UsuarioEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ProyectommVisualIDRegistry.getType(ServicioEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ProyectommVisualIDRegistry.getType(InicioEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ProyectommVisualIDRegistry.getType(FinEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}
		}
		return EMPTY_ARRAY;
	}

	/**
	* @generated
	*/
	private Collection<View> getLinksSourceByType(Collection<Edge> edges, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (Edge nextEdge : edges) {
			View nextEdgeSource = nextEdge.getSource();
			if (type.equals(nextEdgeSource.getType()) && isOwnView(nextEdgeSource)) {
				result.add(nextEdgeSource);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getLinksTargetByType(Collection<Edge> edges, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (Edge nextEdge : edges) {
			View nextEdgeTarget = nextEdge.getTarget();
			if (type.equals(nextEdgeTarget.getType()) && isOwnView(nextEdgeTarget)) {
				result.add(nextEdgeTarget);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getOutgoingLinksByType(Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getSourceEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getIncomingLinksByType(Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getTargetEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getChildrenByType(Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getChildren(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getDiagramLinksByType(Collection<Diagram> diagrams, String type) {
		ArrayList<View> result = new ArrayList<View>();
		for (Diagram nextDiagram : diagrams) {
			result.addAll(selectViewsByType(nextDiagram.getEdges(), type));
		}
		return result;
	}

	// TODO refactor as static method
	/**
	 * @generated
	 */
	private Collection<View> selectViewsByType(Collection<View> views, String type) {
		ArrayList<View> result = new ArrayList<View>();
		for (View nextView : views) {
			if (type.equals(nextView.getType()) && isOwnView(nextView)) {
				result.add(nextView);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return ProcesoDeNegocioEditPart.MODEL_ID.equals(ProyectommVisualIDRegistry.getModelID(view));
	}

	/**
	 * @generated
	 */
	private Collection<ProyectommNavigatorItem> createNavigatorItems(Collection<View> views, Object parent,
			boolean isLeafs) {
		ArrayList<ProyectommNavigatorItem> result = new ArrayList<ProyectommNavigatorItem>(views.size());
		for (View nextView : views) {
			result.add(new ProyectommNavigatorItem(nextView, parent, isLeafs));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<ProyectommNavigatorItem> getForeignShortcuts(Diagram diagram, Object parent) {
		LinkedList<View> result = new LinkedList<View>();
		for (Iterator<View> it = diagram.getChildren().iterator(); it.hasNext();) {
			View nextView = it.next();
			if (!isOwnView(nextView) && nextView.getEAnnotation("Shortcut") != null) { //$NON-NLS-1$
				result.add(nextView);
			}
		}
		return createNavigatorItems(result, parent, false);
	}

	/**
	* @generated
	*/
	public Object getParent(Object element) {
		if (element instanceof ProyectommAbstractNavigatorItem) {
			ProyectommAbstractNavigatorItem abstractNavigatorItem = (ProyectommAbstractNavigatorItem) element;
			return abstractNavigatorItem.getParent();
		}
		return null;
	}

	/**
	* @generated
	*/
	public boolean hasChildren(Object element) {
		return element instanceof IFile || getChildren(element).length > 0;
	}

}
