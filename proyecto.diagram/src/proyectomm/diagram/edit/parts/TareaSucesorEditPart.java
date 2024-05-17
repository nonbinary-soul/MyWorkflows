/*
 * 
 */
package proyectomm.diagram.edit.parts;

import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.Graphics;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.notation.View;

import proyectomm.diagram.edit.policies.TareaSucesorItemSemanticEditPolicy;

/**
 * @generated
 */
public class TareaSucesorEditPart extends ConnectionNodeEditPart implements ITreeBranchEditPart {

	/**
	* @generated
	*/
	public static final int VISUAL_ID = 4001;

	/**
	* @generated
	*/
	public TareaSucesorEditPart(View view) {
		super(view);
	}

	/**
	* @generated
	*/
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new TareaSucesorItemSemanticEditPolicy());
	}

	/**
	* Creates figure for this edit part.
	* 
	* Body of this method does not depend on settings in generation model
	* so you may safely remove <i>generated</i> tag and modify it.
	* 
	* @generated
	*/

	protected Connection createConnectionFigure() {
		return new TareaSucesorFigure();
	}

	/**
	* @generated
	*/
	public TareaSucesorFigure getPrimaryShape() {
		return (TareaSucesorFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class TareaSucesorFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		public TareaSucesorFigure() {
			this.setLineWidth(2);
			this.setLineStyle(Graphics.LINE_DOT);

		}

	}

}
