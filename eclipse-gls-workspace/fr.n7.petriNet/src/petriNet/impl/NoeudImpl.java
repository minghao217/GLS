/**
 */
package petriNet.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import petriNet.Arc;
import petriNet.Noeud;
import petriNet.PetriNetPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Noeud</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link petriNet.impl.NoeudImpl#getName <em>Name</em>}</li>
 *   <li>{@link petriNet.impl.NoeudImpl#getNoeudsSuccesseurs <em>Noeuds Successeurs</em>}</li>
 *   <li>{@link petriNet.impl.NoeudImpl#getNoeudsPredecesseurs <em>Noeuds Predecesseurs</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class NoeudImpl extends PetriNetEltImpl implements Noeud {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getNoeudsSuccesseurs() <em>Noeuds Successeurs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNoeudsSuccesseurs()
	 * @generated
	 * @ordered
	 */
	protected EList<Arc> noeudsSuccesseurs;

	/**
	 * The cached value of the '{@link #getNoeudsPredecesseurs() <em>Noeuds Predecesseurs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNoeudsPredecesseurs()
	 * @generated
	 * @ordered
	 */
	protected EList<Arc> noeudsPredecesseurs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NoeudImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PetriNetPackage.Literals.NOEUD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PetriNetPackage.NOEUD__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Arc> getNoeudsPredecesseurs() {
		if (noeudsPredecesseurs == null) {
			noeudsPredecesseurs = new EObjectWithInverseResolvingEList<Arc>(Arc.class, this, PetriNetPackage.NOEUD__NOEUDS_PREDECESSEURS, PetriNetPackage.ARC__SUCCESSEUR);
		}
		return noeudsPredecesseurs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Arc> getNoeudsSuccesseurs() {
		if (noeudsSuccesseurs == null) {
			noeudsSuccesseurs = new EObjectWithInverseResolvingEList<Arc>(Arc.class, this, PetriNetPackage.NOEUD__NOEUDS_SUCCESSEURS, PetriNetPackage.ARC__PREDECESSEUR);
		}
		return noeudsSuccesseurs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PetriNetPackage.NOEUD__NOEUDS_SUCCESSEURS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getNoeudsSuccesseurs()).basicAdd(otherEnd, msgs);
			case PetriNetPackage.NOEUD__NOEUDS_PREDECESSEURS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getNoeudsPredecesseurs()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PetriNetPackage.NOEUD__NOEUDS_SUCCESSEURS:
				return ((InternalEList<?>)getNoeudsSuccesseurs()).basicRemove(otherEnd, msgs);
			case PetriNetPackage.NOEUD__NOEUDS_PREDECESSEURS:
				return ((InternalEList<?>)getNoeudsPredecesseurs()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PetriNetPackage.NOEUD__NAME:
				return getName();
			case PetriNetPackage.NOEUD__NOEUDS_SUCCESSEURS:
				return getNoeudsSuccesseurs();
			case PetriNetPackage.NOEUD__NOEUDS_PREDECESSEURS:
				return getNoeudsPredecesseurs();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PetriNetPackage.NOEUD__NAME:
				setName((String)newValue);
				return;
			case PetriNetPackage.NOEUD__NOEUDS_SUCCESSEURS:
				getNoeudsSuccesseurs().clear();
				getNoeudsSuccesseurs().addAll((Collection<? extends Arc>)newValue);
				return;
			case PetriNetPackage.NOEUD__NOEUDS_PREDECESSEURS:
				getNoeudsPredecesseurs().clear();
				getNoeudsPredecesseurs().addAll((Collection<? extends Arc>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case PetriNetPackage.NOEUD__NAME:
				setName(NAME_EDEFAULT);
				return;
			case PetriNetPackage.NOEUD__NOEUDS_SUCCESSEURS:
				getNoeudsSuccesseurs().clear();
				return;
			case PetriNetPackage.NOEUD__NOEUDS_PREDECESSEURS:
				getNoeudsPredecesseurs().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case PetriNetPackage.NOEUD__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case PetriNetPackage.NOEUD__NOEUDS_SUCCESSEURS:
				return noeudsSuccesseurs != null && !noeudsSuccesseurs.isEmpty();
			case PetriNetPackage.NOEUD__NOEUDS_PREDECESSEURS:
				return noeudsPredecesseurs != null && !noeudsPredecesseurs.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //NoeudImpl
