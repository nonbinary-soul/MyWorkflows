
/*
 * 
 */
package proyectomm.diagram.part;

import java.util.Collections;

import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultNodeToolEntry;

import proyectomm.diagram.providers.ProyectommElementTypes;

/**
 * @generated
 */
public class ProyectommPaletteFactory {

	/**
	* @generated
	*/
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createObjects1Group());
	}

	/**
	* Creates "Objects" palette tool group
	* @generated
	*/
	private PaletteContainer createObjects1Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(Messages.Objects1Group_title);
		paletteContainer.setId("createObjects1Group"); //$NON-NLS-1$
		paletteContainer.add(createActor1CreationTool());
		return paletteContainer;
	}

	/**
	* @generated
	*/
	private ToolEntry createActor1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Actor1CreationTool_title,
				Messages.Actor1CreationTool_desc, Collections.singletonList(ProyectommElementTypes.Actor_2001));
		entry.setId("createActor1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ProyectommElementTypes.getImageDescriptor(ProyectommElementTypes.Actor_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

}
