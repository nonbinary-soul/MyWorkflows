/*
 * 
 */
package proyectomm.diagram.providers;

import proyectomm.diagram.part.ProyectommDiagramEditorPlugin;

/**
 * @generated
 */
public class ElementInitializers {

	protected ElementInitializers() {
		// use #getInstance to access cached instance
	}

	/**
	* @generated
	*/
	public static ElementInitializers getInstance() {
		ElementInitializers cached = ProyectommDiagramEditorPlugin.getInstance().getElementInitializers();
		if (cached == null) {
			ProyectommDiagramEditorPlugin.getInstance().setElementInitializers(cached = new ElementInitializers());
		}
		return cached;
	}
}
