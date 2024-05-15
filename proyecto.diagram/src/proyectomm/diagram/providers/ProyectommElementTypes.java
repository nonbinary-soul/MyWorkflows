/*
 * 
 */
package proyectomm.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypeImages;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypes;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;

import proyectomm.ProyectommPackage;
import proyectomm.diagram.edit.parts.ActorEditPart;
import proyectomm.diagram.edit.parts.AtributoEditPart;
import proyectomm.diagram.edit.parts.BaseDeDatosEditPart;
import proyectomm.diagram.edit.parts.BorradoEditPart;
import proyectomm.diagram.edit.parts.EnvioEditPart;
import proyectomm.diagram.edit.parts.FinEditPart;
import proyectomm.diagram.edit.parts.ForeignKeyEditPart;
import proyectomm.diagram.edit.parts.InicioEditPart;
import proyectomm.diagram.edit.parts.LecturaEditPart;
import proyectomm.diagram.edit.parts.OpcionEditPart;
import proyectomm.diagram.edit.parts.PrimaryKeyEditPart;
import proyectomm.diagram.edit.parts.ProcesoDeNegocioEditPart;
import proyectomm.diagram.edit.parts.RecepcionEditPart;
import proyectomm.diagram.edit.parts.ServicioEditPart;
import proyectomm.diagram.edit.parts.TablaEditPart;
import proyectomm.diagram.edit.parts.UsuarioEditPart;
import proyectomm.diagram.part.ProyectommDiagramEditorPlugin;

/**
 * @generated
 */
public class ProyectommElementTypes {

	/**
	* @generated
	*/
	private ProyectommElementTypes() {
	}

	/**
	* @generated
	*/
	private static Map<IElementType, ENamedElement> elements;

	/**
	* @generated
	*/
	private static DiagramElementTypeImages elementTypeImages = new DiagramElementTypeImages(
			ProyectommDiagramEditorPlugin.getInstance().getItemProvidersAdapterFactory());

	/**
	* @generated
	*/
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	* @generated
	*/
	public static final IElementType ProcesoDeNegocio_1000 = getElementType("proyecto.diagram.ProcesoDeNegocio_1000"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType BaseDeDatos_2001 = getElementType("proyecto.diagram.BaseDeDatos_2001"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Actor_2002 = getElementType("proyecto.diagram.Actor_2002"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Tabla_3001 = getElementType("proyecto.diagram.Tabla_3001"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType PrimaryKey_3002 = getElementType("proyecto.diagram.PrimaryKey_3002"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Opcion_3003 = getElementType("proyecto.diagram.Opcion_3003"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType ForeignKey_3004 = getElementType("proyecto.diagram.ForeignKey_3004"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Atributo_3005 = getElementType("proyecto.diagram.Atributo_3005"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Envio_3006 = getElementType("proyecto.diagram.Envio_3006"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Recepcion_3007 = getElementType("proyecto.diagram.Recepcion_3007"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Borrado_3008 = getElementType("proyecto.diagram.Borrado_3008"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Lectura_3009 = getElementType("proyecto.diagram.Lectura_3009"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Usuario_3010 = getElementType("proyecto.diagram.Usuario_3010"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Servicio_3011 = getElementType("proyecto.diagram.Servicio_3011"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Inicio_3012 = getElementType("proyecto.diagram.Inicio_3012"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Fin_3013 = getElementType("proyecto.diagram.Fin_3013"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		return elementTypeImages.getImageDescriptor(element);
	}

	/**
	* @generated
	*/
	public static Image getImage(ENamedElement element) {
		return elementTypeImages.getImage(element);
	}

	/**
	* @generated
	*/
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		return getImageDescriptor(getElement(hint));
	}

	/**
	* @generated
	*/
	public static Image getImage(IAdaptable hint) {
		return getImage(getElement(hint));
	}

	/**
	* Returns 'type' of the ecore object associated with the hint.
	* 
	* @generated
	*/
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap<IElementType, ENamedElement>();

			elements.put(ProcesoDeNegocio_1000, ProyectommPackage.eINSTANCE.getProcesoDeNegocio());

			elements.put(BaseDeDatos_2001, ProyectommPackage.eINSTANCE.getBaseDeDatos());

			elements.put(Actor_2002, ProyectommPackage.eINSTANCE.getActor());

			elements.put(Tabla_3001, ProyectommPackage.eINSTANCE.getTabla());

			elements.put(PrimaryKey_3002, ProyectommPackage.eINSTANCE.getPrimaryKey());

			elements.put(Opcion_3003, ProyectommPackage.eINSTANCE.getOpcion());

			elements.put(ForeignKey_3004, ProyectommPackage.eINSTANCE.getForeignKey());

			elements.put(Atributo_3005, ProyectommPackage.eINSTANCE.getAtributo());

			elements.put(Envio_3006, ProyectommPackage.eINSTANCE.getEnvio());

			elements.put(Recepcion_3007, ProyectommPackage.eINSTANCE.getRecepcion());

			elements.put(Borrado_3008, ProyectommPackage.eINSTANCE.getBorrado());

			elements.put(Lectura_3009, ProyectommPackage.eINSTANCE.getLectura());

			elements.put(Usuario_3010, ProyectommPackage.eINSTANCE.getUsuario());

			elements.put(Servicio_3011, ProyectommPackage.eINSTANCE.getServicio());

			elements.put(Inicio_3012, ProyectommPackage.eINSTANCE.getInicio());

			elements.put(Fin_3013, ProyectommPackage.eINSTANCE.getFin());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	* @generated
	*/
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	* @generated
	*/
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(ProcesoDeNegocio_1000);
			KNOWN_ELEMENT_TYPES.add(BaseDeDatos_2001);
			KNOWN_ELEMENT_TYPES.add(Actor_2002);
			KNOWN_ELEMENT_TYPES.add(Tabla_3001);
			KNOWN_ELEMENT_TYPES.add(PrimaryKey_3002);
			KNOWN_ELEMENT_TYPES.add(Opcion_3003);
			KNOWN_ELEMENT_TYPES.add(ForeignKey_3004);
			KNOWN_ELEMENT_TYPES.add(Atributo_3005);
			KNOWN_ELEMENT_TYPES.add(Envio_3006);
			KNOWN_ELEMENT_TYPES.add(Recepcion_3007);
			KNOWN_ELEMENT_TYPES.add(Borrado_3008);
			KNOWN_ELEMENT_TYPES.add(Lectura_3009);
			KNOWN_ELEMENT_TYPES.add(Usuario_3010);
			KNOWN_ELEMENT_TYPES.add(Servicio_3011);
			KNOWN_ELEMENT_TYPES.add(Inicio_3012);
			KNOWN_ELEMENT_TYPES.add(Fin_3013);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	* @generated
	*/
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case ProcesoDeNegocioEditPart.VISUAL_ID:
			return ProcesoDeNegocio_1000;
		case BaseDeDatosEditPart.VISUAL_ID:
			return BaseDeDatos_2001;
		case ActorEditPart.VISUAL_ID:
			return Actor_2002;
		case TablaEditPart.VISUAL_ID:
			return Tabla_3001;
		case PrimaryKeyEditPart.VISUAL_ID:
			return PrimaryKey_3002;
		case OpcionEditPart.VISUAL_ID:
			return Opcion_3003;
		case ForeignKeyEditPart.VISUAL_ID:
			return ForeignKey_3004;
		case AtributoEditPart.VISUAL_ID:
			return Atributo_3005;
		case EnvioEditPart.VISUAL_ID:
			return Envio_3006;
		case RecepcionEditPart.VISUAL_ID:
			return Recepcion_3007;
		case BorradoEditPart.VISUAL_ID:
			return Borrado_3008;
		case LecturaEditPart.VISUAL_ID:
			return Lectura_3009;
		case UsuarioEditPart.VISUAL_ID:
			return Usuario_3010;
		case ServicioEditPart.VISUAL_ID:
			return Servicio_3011;
		case InicioEditPart.VISUAL_ID:
			return Inicio_3012;
		case FinEditPart.VISUAL_ID:
			return Fin_3013;
		}
		return null;
	}

	/**
	* @generated
	*/
	public static final DiagramElementTypes TYPED_INSTANCE = new DiagramElementTypes(elementTypeImages) {

		/**
		* @generated
		*/
		@Override

		public boolean isKnownElementType(IElementType elementType) {
			return proyectomm.diagram.providers.ProyectommElementTypes.isKnownElementType(elementType);
		}

		/**
		* @generated
		*/
		@Override

		public IElementType getElementTypeForVisualId(int visualID) {
			return proyectomm.diagram.providers.ProyectommElementTypes.getElementType(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public ENamedElement getDefiningNamedElement(IAdaptable elementTypeAdapter) {
			return proyectomm.diagram.providers.ProyectommElementTypes.getElement(elementTypeAdapter);
		}
	};

}
