/*
 * 
 */
package proyectomm.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

import proyectomm.Servicio;
import proyectomm.Tabla;
import proyectomm.diagram.edit.policies.ProyectommBaseItemSemanticEditPolicy;

/**
 * @generated
 */
public class ServicioTabla_accedida_por_servicioReorientCommand extends EditElementCommand {

	/**
	* @generated
	*/
	private final int reorientDirection;

	/**
	* @generated
	*/
	private final EObject referenceOwner;

	/**
	* @generated
	*/
	private final EObject oldEnd;

	/**
	* @generated
	*/
	private final EObject newEnd;

	/**
	* @generated
	*/
	public ServicioTabla_accedida_por_servicioReorientCommand(ReorientReferenceRelationshipRequest request) {
		super(request.getLabel(), null, request);
		reorientDirection = request.getDirection();
		referenceOwner = request.getReferenceOwner();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	* @generated
	*/
	public boolean canExecute() {
		if (false == referenceOwner instanceof Servicio) {
			return false;
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return canReorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return canReorientTarget();
		}
		return false;
	}

	/**
	* @generated
	*/
	protected boolean canReorientSource() {
		if (!(oldEnd instanceof Tabla && newEnd instanceof Servicio)) {
			return false;
		}
		return ProyectommBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistServicioTabla_accedida_por_servicio_4003(getNewSource(), getOldTarget());
	}

	/**
	* @generated
	*/
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof Tabla && newEnd instanceof Tabla)) {
			return false;
		}
		return ProyectommBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistServicioTabla_accedida_por_servicio_4003(getOldSource(), getNewTarget());
	}

	/**
	* @generated
	*/
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
		if (!canExecute()) {
			throw new ExecutionException("Invalid arguments in reorient link command"); //$NON-NLS-1$
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return reorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return reorientTarget();
		}
		throw new IllegalStateException();
	}

	/**
	* @generated
	*/
	protected CommandResult reorientSource() throws ExecutionException {
		getOldSource().setTabla_accedida_por_servicio(null);
		getNewSource().setTabla_accedida_por_servicio(getOldTarget());
		return CommandResult.newOKCommandResult(referenceOwner);
	}

	/**
	* @generated
	*/
	protected CommandResult reorientTarget() throws ExecutionException {
		getOldSource().setTabla_accedida_por_servicio(getNewTarget());
		return CommandResult.newOKCommandResult(referenceOwner);
	}

	/**
	* @generated
	*/
	protected Servicio getOldSource() {
		return (Servicio) referenceOwner;
	}

	/**
	* @generated
	*/
	protected Servicio getNewSource() {
		return (Servicio) newEnd;
	}

	/**
	* @generated
	*/
	protected Tabla getOldTarget() {
		return (Tabla) oldEnd;
	}

	/**
	* @generated
	*/
	protected Tabla getNewTarget() {
		return (Tabla) newEnd;
	}
}
