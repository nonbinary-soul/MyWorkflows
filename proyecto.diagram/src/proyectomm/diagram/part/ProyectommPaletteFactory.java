
/*
 * 
 */
package proyectomm.diagram.part;

import java.util.Collections;

import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultLinkToolEntry;
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
		paletteRoot.add(createConnections2Group());
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
		paletteContainer.add(createFin6CreationTool());
		paletteContainer.add(createForeignKey7CreationTool());
		paletteContainer.add(createInicio8CreationTool());
		paletteContainer.add(createLectura9CreationTool());
		paletteContainer.add(createOpcion10CreationTool());
		paletteContainer.add(createPrimaryKey11CreationTool());
		paletteContainer.add(createRecepcion12CreationTool());
		paletteContainer.add(createServicio13CreationTool());
		paletteContainer.add(createTabla14CreationTool());
		paletteContainer.add(createUsuario15CreationTool());
		return paletteContainer;
	}

	/**
	* Creates "Connections" palette tool group
	* @generated
	*/
	private PaletteContainer createConnections2Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(Messages.Connections2Group_title);
		paletteContainer.setId("createConnections2Group"); //$NON-NLS-1$
		paletteContainer.add(createSucesor1CreationTool());
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
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Atributo2CreationTool_title,
				Messages.Atributo2CreationTool_desc, Collections.singletonList(ProyectommElementTypes.Atributo_3005));
		entry.setId("createAtributo2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ProyectommElementTypes.getImageDescriptor(ProyectommElementTypes.Atributo_3005));
		entry.setLargeIcon(entry.getSmallIcon());
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
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Borrado4CreationTool_title,
				Messages.Borrado4CreationTool_desc, Collections.singletonList(ProyectommElementTypes.Borrado_3008));
		entry.setId("createBorrado4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ProyectommElementTypes.getImageDescriptor(ProyectommElementTypes.Borrado_3008));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createEnvio5CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Envio5CreationTool_title,
				Messages.Envio5CreationTool_desc, Collections.singletonList(ProyectommElementTypes.Envio_3006));
		entry.setId("createEnvio5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ProyectommElementTypes.getImageDescriptor(ProyectommElementTypes.Envio_3006));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createFin6CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Fin6CreationTool_title,
				Messages.Fin6CreationTool_desc, Collections.singletonList(ProyectommElementTypes.Fin_3013));
		entry.setId("createFin6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ProyectommElementTypes.getImageDescriptor(ProyectommElementTypes.Fin_3013));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createForeignKey7CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.ForeignKey7CreationTool_title,
				Messages.ForeignKey7CreationTool_desc,
				Collections.singletonList(ProyectommElementTypes.ForeignKey_3004));
		entry.setId("createForeignKey7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ProyectommElementTypes.getImageDescriptor(ProyectommElementTypes.ForeignKey_3004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createInicio8CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Inicio8CreationTool_title,
				Messages.Inicio8CreationTool_desc, Collections.singletonList(ProyectommElementTypes.Inicio_3012));
		entry.setId("createInicio8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ProyectommElementTypes.getImageDescriptor(ProyectommElementTypes.Inicio_3012));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createLectura9CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Lectura9CreationTool_title,
				Messages.Lectura9CreationTool_desc, Collections.singletonList(ProyectommElementTypes.Lectura_3009));
		entry.setId("createLectura9CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ProyectommElementTypes.getImageDescriptor(ProyectommElementTypes.Lectura_3009));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createOpcion10CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Opcion10CreationTool_title,
				Messages.Opcion10CreationTool_desc, Collections.singletonList(ProyectommElementTypes.Opcion_3003));
		entry.setId("createOpcion10CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ProyectommElementTypes.getImageDescriptor(ProyectommElementTypes.Opcion_3003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createPrimaryKey11CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.PrimaryKey11CreationTool_title,
				Messages.PrimaryKey11CreationTool_desc,
				Collections.singletonList(ProyectommElementTypes.PrimaryKey_3002));
		entry.setId("createPrimaryKey11CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ProyectommElementTypes.getImageDescriptor(ProyectommElementTypes.PrimaryKey_3002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createRecepcion12CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Recepcion12CreationTool_title,
				Messages.Recepcion12CreationTool_desc,
				Collections.singletonList(ProyectommElementTypes.Recepcion_3007));
		entry.setId("createRecepcion12CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ProyectommElementTypes.getImageDescriptor(ProyectommElementTypes.Recepcion_3007));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createServicio13CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Servicio13CreationTool_title,
				Messages.Servicio13CreationTool_desc, Collections.singletonList(ProyectommElementTypes.Servicio_3011));
		entry.setId("createServicio13CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ProyectommElementTypes.getImageDescriptor(ProyectommElementTypes.Servicio_3011));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createTabla14CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Tabla14CreationTool_title,
				Messages.Tabla14CreationTool_desc, Collections.singletonList(ProyectommElementTypes.Tabla_3001));
		entry.setId("createTabla14CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ProyectommElementTypes.getImageDescriptor(ProyectommElementTypes.Tabla_3001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createUsuario15CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Usuario15CreationTool_title,
				Messages.Usuario15CreationTool_desc, Collections.singletonList(ProyectommElementTypes.Usuario_3010));
		entry.setId("createUsuario15CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ProyectommElementTypes.getImageDescriptor(ProyectommElementTypes.Usuario_3010));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createSucesor1CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.Sucesor1CreationTool_title,
				Messages.Sucesor1CreationTool_desc,
				Collections.singletonList(ProyectommElementTypes.TareaSucesor_4001));
		entry.setId("createSucesor1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ProyectommElementTypes.getImageDescriptor(ProyectommElementTypes.TareaSucesor_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

}
