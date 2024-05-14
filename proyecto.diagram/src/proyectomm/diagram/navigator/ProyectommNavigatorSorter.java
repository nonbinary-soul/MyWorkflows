/*
* 
*/
package proyectomm.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

import proyectomm.diagram.part.ProyectommVisualIDRegistry;

/**
 * @generated
 */
public class ProyectommNavigatorSorter extends ViewerSorter {

	/**
	* @generated
	*/
	private static final int GROUP_CATEGORY = 2003;

	/**
	* @generated
	*/
	private static final int SHORTCUTS_CATEGORY = 2002;

	/**
	* @generated
	*/
	public int category(Object element) {
		if (element instanceof ProyectommNavigatorItem) {
			ProyectommNavigatorItem item = (ProyectommNavigatorItem) element;
			if (item.getView().getEAnnotation("Shortcut") != null) { //$NON-NLS-1$
				return SHORTCUTS_CATEGORY;
			}
			return ProyectommVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
