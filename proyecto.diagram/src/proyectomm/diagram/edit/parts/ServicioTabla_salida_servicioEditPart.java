/*
 * 
 */
package proyectomm.diagram.edit.parts;

import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.PolygonDecoration;
import org.eclipse.draw2d.RotatableDecoration;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Color;

import proyectomm.diagram.edit.policies.ServicioTabla_salida_servicioItemSemanticEditPolicy;

/**
 * @generated
 */
public class ServicioTabla_salida_servicioEditPart extends ConnectionNodeEditPart implements ITreeBranchEditPart {

	/**
	* @generated
	*/
	public static final int VISUAL_ID = 4004;

	/**
	* @generated
	*/
	public ServicioTabla_salida_servicioEditPart(View view) {
		super(view);
	}

	/**
	* @generated
	*/
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new ServicioTabla_salida_servicioItemSemanticEditPolicy());
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
		return new ServicioTabla_salida_servicioFigure();
	}

	/**
	* @generated
	*/
	public ServicioTabla_salida_servicioFigure getPrimaryShape() {
		return (ServicioTabla_salida_servicioFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class ServicioTabla_salida_servicioFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		public ServicioTabla_salida_servicioFigure() {
			this.setLineWidth(2);
			this.setLineStyle(Graphics.LINE_DASH);
			this.setForegroundColor(THIS_FORE);

			setTargetDecoration(createTargetDecoration());
		}

		/**
		 * @generated
		 */
		private RotatableDecoration createTargetDecoration() {
			PolygonDecoration df = new PolygonDecoration();
			df.setFill(true);
			PointList pl = new PointList();
			pl.addPoint(getMapMode().DPtoLP(0), getMapMode().DPtoLP(0));
			pl.addPoint(getMapMode().DPtoLP(-2), getMapMode().DPtoLP(2));
			pl.addPoint(getMapMode().DPtoLP(-2), getMapMode().DPtoLP(-2));
			pl.addPoint(getMapMode().DPtoLP(0), getMapMode().DPtoLP(0));
			df.setTemplate(pl);
			df.setScale(getMapMode().DPtoLP(7), getMapMode().DPtoLP(3));
			return df;
		}

	}

	/**
	 * @generated
	 */
	static final Color THIS_FORE = new Color(null, 153, 153, 0);

}
