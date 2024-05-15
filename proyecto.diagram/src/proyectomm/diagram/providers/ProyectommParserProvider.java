/*
 * 
 */
package proyectomm.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;

import proyectomm.ProyectommPackage;
import proyectomm.diagram.edit.parts.ActorNombreEditPart;
import proyectomm.diagram.edit.parts.AtributoNombreEditPart;
import proyectomm.diagram.edit.parts.BaseDeDatosNombreEditPart;
import proyectomm.diagram.edit.parts.BorradoNombreEditPart;
import proyectomm.diagram.edit.parts.EnvioNombreEditPart;
import proyectomm.diagram.edit.parts.FinNombreEditPart;
import proyectomm.diagram.edit.parts.ForeignKeyNombreEditPart;
import proyectomm.diagram.edit.parts.InicioNombreEditPart;
import proyectomm.diagram.edit.parts.LecturaNombreEditPart;
import proyectomm.diagram.edit.parts.OpcionNombreEditPart;
import proyectomm.diagram.edit.parts.PrimaryKeyNombreEditPart;
import proyectomm.diagram.edit.parts.RecepcionNombreEditPart;
import proyectomm.diagram.edit.parts.ServicioNombreEditPart;
import proyectomm.diagram.edit.parts.TablaNombreEditPart;
import proyectomm.diagram.edit.parts.UsuarioNombreEditPart;
import proyectomm.diagram.parsers.MessageFormatParser;
import proyectomm.diagram.part.ProyectommVisualIDRegistry;

/**
 * @generated
 */
public class ProyectommParserProvider extends AbstractProvider implements IParserProvider {

	/**
	* @generated
	*/
	private IParser baseDeDatosNombre_5006Parser;

	/**
	* @generated
	*/
	private IParser getBaseDeDatosNombre_5006Parser() {
		if (baseDeDatosNombre_5006Parser == null) {
			EAttribute[] features = new EAttribute[] { ProyectommPackage.eINSTANCE.getBaseDeDatos_Nombre() };
			MessageFormatParser parser = new MessageFormatParser(features);
			baseDeDatosNombre_5006Parser = parser;
		}
		return baseDeDatosNombre_5006Parser;
	}

	/**
	* @generated
	*/
	private IParser actorNombre_5015Parser;

	/**
	* @generated
	*/
	private IParser getActorNombre_5015Parser() {
		if (actorNombre_5015Parser == null) {
			EAttribute[] features = new EAttribute[] { ProyectommPackage.eINSTANCE.getActor_Nombre() };
			MessageFormatParser parser = new MessageFormatParser(features);
			actorNombre_5015Parser = parser;
		}
		return actorNombre_5015Parser;
	}

	/**
	* @generated
	*/
	private IParser tablaNombre_5005Parser;

	/**
	* @generated
	*/
	private IParser getTablaNombre_5005Parser() {
		if (tablaNombre_5005Parser == null) {
			EAttribute[] features = new EAttribute[] { ProyectommPackage.eINSTANCE.getTabla_Nombre() };
			MessageFormatParser parser = new MessageFormatParser(features);
			tablaNombre_5005Parser = parser;
		}
		return tablaNombre_5005Parser;
	}

	/**
	* @generated
	*/
	private IParser primaryKeyNombre_5002Parser;

	/**
	* @generated
	*/
	private IParser getPrimaryKeyNombre_5002Parser() {
		if (primaryKeyNombre_5002Parser == null) {
			EAttribute[] features = new EAttribute[] { ProyectommPackage.eINSTANCE.getAtributo_Nombre() };
			MessageFormatParser parser = new MessageFormatParser(features);
			primaryKeyNombre_5002Parser = parser;
		}
		return primaryKeyNombre_5002Parser;
	}

	/**
	* @generated
	*/
	private IParser opcionNombre_5001Parser;

	/**
	* @generated
	*/
	private IParser getOpcionNombre_5001Parser() {
		if (opcionNombre_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { ProyectommPackage.eINSTANCE.getOpcion_Nombre() };
			MessageFormatParser parser = new MessageFormatParser(features);
			opcionNombre_5001Parser = parser;
		}
		return opcionNombre_5001Parser;
	}

	/**
	* @generated
	*/
	private IParser foreignKeyNombre_5003Parser;

	/**
	* @generated
	*/
	private IParser getForeignKeyNombre_5003Parser() {
		if (foreignKeyNombre_5003Parser == null) {
			EAttribute[] features = new EAttribute[] { ProyectommPackage.eINSTANCE.getAtributo_Nombre() };
			MessageFormatParser parser = new MessageFormatParser(features);
			foreignKeyNombre_5003Parser = parser;
		}
		return foreignKeyNombre_5003Parser;
	}

	/**
	* @generated
	*/
	private IParser atributoNombre_5004Parser;

	/**
	* @generated
	*/
	private IParser getAtributoNombre_5004Parser() {
		if (atributoNombre_5004Parser == null) {
			EAttribute[] features = new EAttribute[] { ProyectommPackage.eINSTANCE.getAtributo_Nombre() };
			MessageFormatParser parser = new MessageFormatParser(features);
			atributoNombre_5004Parser = parser;
		}
		return atributoNombre_5004Parser;
	}

	/**
	* @generated
	*/
	private IParser envioNombre_5007Parser;

	/**
	* @generated
	*/
	private IParser getEnvioNombre_5007Parser() {
		if (envioNombre_5007Parser == null) {
			EAttribute[] features = new EAttribute[] { ProyectommPackage.eINSTANCE.getTarea_Nombre() };
			MessageFormatParser parser = new MessageFormatParser(features);
			envioNombre_5007Parser = parser;
		}
		return envioNombre_5007Parser;
	}

	/**
	* @generated
	*/
	private IParser recepcionNombre_5008Parser;

	/**
	* @generated
	*/
	private IParser getRecepcionNombre_5008Parser() {
		if (recepcionNombre_5008Parser == null) {
			EAttribute[] features = new EAttribute[] { ProyectommPackage.eINSTANCE.getTarea_Nombre() };
			MessageFormatParser parser = new MessageFormatParser(features);
			recepcionNombre_5008Parser = parser;
		}
		return recepcionNombre_5008Parser;
	}

	/**
	* @generated
	*/
	private IParser borradoNombre_5009Parser;

	/**
	* @generated
	*/
	private IParser getBorradoNombre_5009Parser() {
		if (borradoNombre_5009Parser == null) {
			EAttribute[] features = new EAttribute[] { ProyectommPackage.eINSTANCE.getTarea_Nombre() };
			MessageFormatParser parser = new MessageFormatParser(features);
			borradoNombre_5009Parser = parser;
		}
		return borradoNombre_5009Parser;
	}

	/**
	* @generated
	*/
	private IParser lecturaNombre_5010Parser;

	/**
	* @generated
	*/
	private IParser getLecturaNombre_5010Parser() {
		if (lecturaNombre_5010Parser == null) {
			EAttribute[] features = new EAttribute[] { ProyectommPackage.eINSTANCE.getTarea_Nombre() };
			MessageFormatParser parser = new MessageFormatParser(features);
			lecturaNombre_5010Parser = parser;
		}
		return lecturaNombre_5010Parser;
	}

	/**
	* @generated
	*/
	private IParser usuarioNombre_5011Parser;

	/**
	* @generated
	*/
	private IParser getUsuarioNombre_5011Parser() {
		if (usuarioNombre_5011Parser == null) {
			EAttribute[] features = new EAttribute[] { ProyectommPackage.eINSTANCE.getTarea_Nombre() };
			MessageFormatParser parser = new MessageFormatParser(features);
			usuarioNombre_5011Parser = parser;
		}
		return usuarioNombre_5011Parser;
	}

	/**
	* @generated
	*/
	private IParser servicioNombre_5012Parser;

	/**
	* @generated
	*/
	private IParser getServicioNombre_5012Parser() {
		if (servicioNombre_5012Parser == null) {
			EAttribute[] features = new EAttribute[] { ProyectommPackage.eINSTANCE.getTarea_Nombre() };
			MessageFormatParser parser = new MessageFormatParser(features);
			servicioNombre_5012Parser = parser;
		}
		return servicioNombre_5012Parser;
	}

	/**
	* @generated
	*/
	private IParser inicioNombre_5013Parser;

	/**
	* @generated
	*/
	private IParser getInicioNombre_5013Parser() {
		if (inicioNombre_5013Parser == null) {
			EAttribute[] features = new EAttribute[] { ProyectommPackage.eINSTANCE.getTarea_Nombre() };
			MessageFormatParser parser = new MessageFormatParser(features);
			inicioNombre_5013Parser = parser;
		}
		return inicioNombre_5013Parser;
	}

	/**
	* @generated
	*/
	private IParser finNombre_5014Parser;

	/**
	* @generated
	*/
	private IParser getFinNombre_5014Parser() {
		if (finNombre_5014Parser == null) {
			EAttribute[] features = new EAttribute[] { ProyectommPackage.eINSTANCE.getTarea_Nombre() };
			MessageFormatParser parser = new MessageFormatParser(features);
			finNombre_5014Parser = parser;
		}
		return finNombre_5014Parser;
	}

	/**
	* @generated
	*/
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case BaseDeDatosNombreEditPart.VISUAL_ID:
			return getBaseDeDatosNombre_5006Parser();
		case ActorNombreEditPart.VISUAL_ID:
			return getActorNombre_5015Parser();
		case TablaNombreEditPart.VISUAL_ID:
			return getTablaNombre_5005Parser();
		case PrimaryKeyNombreEditPart.VISUAL_ID:
			return getPrimaryKeyNombre_5002Parser();
		case OpcionNombreEditPart.VISUAL_ID:
			return getOpcionNombre_5001Parser();
		case ForeignKeyNombreEditPart.VISUAL_ID:
			return getForeignKeyNombre_5003Parser();
		case AtributoNombreEditPart.VISUAL_ID:
			return getAtributoNombre_5004Parser();
		case EnvioNombreEditPart.VISUAL_ID:
			return getEnvioNombre_5007Parser();
		case RecepcionNombreEditPart.VISUAL_ID:
			return getRecepcionNombre_5008Parser();
		case BorradoNombreEditPart.VISUAL_ID:
			return getBorradoNombre_5009Parser();
		case LecturaNombreEditPart.VISUAL_ID:
			return getLecturaNombre_5010Parser();
		case UsuarioNombreEditPart.VISUAL_ID:
			return getUsuarioNombre_5011Parser();
		case ServicioNombreEditPart.VISUAL_ID:
			return getServicioNombre_5012Parser();
		case InicioNombreEditPart.VISUAL_ID:
			return getInicioNombre_5013Parser();
		case FinNombreEditPart.VISUAL_ID:
			return getFinNombre_5014Parser();
		}
		return null;
	}

	/**
	* Utility method that consults ParserService
	* @generated
	*/
	public static IParser getParser(IElementType type, EObject object, String parserHint) {
		return ParserService.getInstance().getParser(new HintAdapter(type, object, parserHint));
	}

	/**
	* @generated
	*/
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(ProyectommVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(ProyectommVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	* @generated
	*/
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (ProyectommElementTypes.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	* @generated
	*/
	private static class HintAdapter extends ParserHintAdapter {

		/**
		* @generated
		*/
		private final IElementType elementType;

		/**
		* @generated
		*/
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		* @generated
		*/
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}
