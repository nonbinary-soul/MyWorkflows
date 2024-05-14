
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
		paletteContainer.add(createAtributo2CreationTool());
		paletteContainer.add(createBaseDeDatos3CreationTool());
		paletteContainer.add(createBorrado4CreationTool());
		paletteContainer.add(createEnvio5CreationTool());
		paletteContainer.add(createForeignKey6CreationTool());
		paletteContainer.add(createLectura7CreationTool());
		paletteContainer.add(createOpcion8CreationTool());
		paletteContainer.add(createPrimaryKey9CreationTool());
		paletteContainer.add(createRecepcion10CreationTool());
		paletteContainer.add(createServicio11CreationTool());
		paletteContainer.add(createTabla12CreationTool());
		paletteContainer.add(createUsuario13CreationTool());
		return paletteContainer;
	}

	/**
	* @generated
	*/
	private ToolEntry createActor1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Actor1CreationTool_title,
				Messages.Actor1CreationTool_desc, Collections.singletonList(ProyectommElementTypes.Actor_2002));
		entry.setId("createActor1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ProyectommElementTypes.getImageDescriptor(ProyectommElementTypes.Actor_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createAtributo2CreationTool() {
		ToolEntry entry = new ToolEntry(Messages.Atributo2CreationTool_title, Messages.Atributo2CreationTool_desc, null,
				null) {
		};
		entry.setId("createAtributo2CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createBaseDeDatos3CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.BaseDeDatos3CreationTool_title,
				Messages.BaseDeDatos3CreationTool_desc,
				Collections.singletonList(ProyectommElementTypes.BaseDeDatos_2001));
		entry.setId("createBaseDeDatos3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ProyectommElementTypes.getImageDescriptor(ProyectommElementTypes.BaseDeDatos_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createBorrado4CreationTool() {
		ToolEntry entry = new ToolEntry(Messages.Borrado4CreationTool_title, Messages.Borrado4CreationTool_desc, null,
				null) {
		};
		entry.setId("createBorrado4CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createEnvio5CreationTool() {
		ToolEntry entry = new ToolEntry(Messages.Envio5CreationTool_title, Messages.Envio5CreationTool_desc, null,
				null) {
		};
		entry.setId("createEnvio5CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createForeignKey6CreationTool() {
		ToolEntry entry = new ToolEntry(Messages.ForeignKey6CreationTool_title, Messages.ForeignKey6CreationTool_desc,
				null, null) {
		};
		entry.setId("createForeignKey6CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createLectura7CreationTool() {
		ToolEntry entry = new ToolEntry(Messages.Lectura7CreationTool_title, Messages.Lectura7CreationTool_desc, null,
				null) {
		};
		entry.setId("createLectura7CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createOpcion8CreationTool() {
		ToolEntry entry = new ToolEntry(Messages.Opcion8CreationTool_title, Messages.Opcion8CreationTool_desc, null,
				null) {
		};
		entry.setId("createOpcion8CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createPrimaryKey9CreationTool() {
		ToolEntry entry = new ToolEntry(Messages.PrimaryKey9CreationTool_title, Messages.PrimaryKey9CreationTool_desc,
				null, null) {
		};
		entry.setId("createPrimaryKey9CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createRecepcion10CreationTool() {
		ToolEntry entry = new ToolEntry(Messages.Recepcion10CreationTool_title, Messages.Recepcion10CreationTool_desc,
				null, null) {
		};
		entry.setId("createRecepcion10CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createServicio11CreationTool() {
		ToolEntry entry = new ToolEntry(Messages.Servicio11CreationTool_title, Messages.Servicio11CreationTool_desc,
				null, null) {
		};
		entry.setId("createServicio11CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createTabla12CreationTool() {
		ToolEntry entry = new ToolEntry(Messages.Tabla12CreationTool_title, Messages.Tabla12CreationTool_desc, null,
				null) {
		};
		entry.setId("createTabla12CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createUsuario13CreationTool() {
		ToolEntry entry = new ToolEntry(Messages.Usuario13CreationTool_title, Messages.Usuario13CreationTool_desc, null,
				null) {
		};
		entry.setId("createUsuario13CreationTool"); //$NON-NLS-1$
		return entry;
	}

}
