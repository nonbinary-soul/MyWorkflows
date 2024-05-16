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
import proyectomm.diagram.edit.parts.BaseDeDatosNombreEditPart;
import proyectomm.diagram.edit.parts.TablaNombreEditPart;
import proyectomm.diagram.parsers.MessageFormatParser;
import proyectomm.diagram.part.ProyectommVisualIDRegistry;

/**
 * @generated
 */
public class ProyectommParserProvider extends AbstractProvider implements IParserProvider {

	/**
	* @generated
	*/
	private IParser baseDeDatosNombre_5002Parser;

	/**
	* @generated
	*/
	private IParser getBaseDeDatosNombre_5002Parser() {
		if (baseDeDatosNombre_5002Parser == null) {
			EAttribute[] features = new EAttribute[] { ProyectommPackage.eINSTANCE.getBaseDeDatos_Nombre() };
			MessageFormatParser parser = new MessageFormatParser(features);
			baseDeDatosNombre_5002Parser = parser;
		}
		return baseDeDatosNombre_5002Parser;
	}

	/**
	* @generated
	*/
	private IParser actorNombre_5003Parser;

	/**
	* @generated
	*/
	private IParser getActorNombre_5003Parser() {
		if (actorNombre_5003Parser == null) {
			EAttribute[] features = new EAttribute[] { ProyectommPackage.eINSTANCE.getActor_Nombre() };
			MessageFormatParser parser = new MessageFormatParser(features);
			actorNombre_5003Parser = parser;
		}
		return actorNombre_5003Parser;
	}

	/**
	* @generated
	*/
	private IParser tablaNombre_5001Parser;

	/**
	* @generated
	*/
	private IParser getTablaNombre_5001Parser() {
		if (tablaNombre_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { ProyectommPackage.eINSTANCE.getTabla_Nombre() };
			MessageFormatParser parser = new MessageFormatParser(features);
			tablaNombre_5001Parser = parser;
		}
		return tablaNombre_5001Parser;
	}

	/**
	* @generated
	*/
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case BaseDeDatosNombreEditPart.VISUAL_ID:
			return getBaseDeDatosNombre_5002Parser();
		case ActorNombreEditPart.VISUAL_ID:
			return getActorNombre_5003Parser();
		case TablaNombreEditPart.VISUAL_ID:
			return getTablaNombre_5001Parser();
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
