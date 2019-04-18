/**
 */
package petriNet.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import petriNet.Arc;
import petriNet.Noeud;
import petriNet.PetriNetPackage;
import petriNet.TypeArc;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Arc</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link petriNet.impl.ArcImpl#getPredecesseur <em>Predecesseur</em>}</li>
 *   <li>{@link petriNet.impl.ArcImpl#getSuccesseur <em>Successeur</em>}</li>
 *   <li>{@link petriNet.impl.ArcImpl#getPoids <em>Poids</em>}</li>
 *   <li>{@link petriNet.impl.ArcImpl#getTypeArc <em>Type Arc</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArcImpl extends PetriNetEltImpl implements Arc {
	/**
	 * The cached value of the '{@link #getPredecesseur() <em>Predecesseur</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPredecesseur()
	 * @generated
	 * @ordered
	 */
	protected Noeud predecesseur;

	/**
	 * The cached value of the '{@link #getSuccesseur() <em>Successeur</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuccesseur()
	 * @generated
	 * @ordered
	 */
	protected Noeud successeur;

	/**
	 * The default value of the '{@link #getPoids() <em>Poids</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPoids()
	 * @generated
	 * @ordered
	 */
	protected static final int POIDS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPoids() <em>Poids</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPoids()
	 * @generated
	 * @ordered
	 */
	protected int poids = POIDS_EDEFAULT;

	/**
	 * The default value of the '{@link #getTypeArc() <em>Type Arc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeArc()
	 * @generated
	 * @ordered
	 */
	protected static final TypeArc TYPE_ARC_EDEFAULT = TypeArc.ARC_SIMPLE;

	/**
	 * The cached value of the '{@link #getTypeArc() <em>Type Arc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeArc()
	 * @generated
	 * @ordered
	 */
	protected TypeArc typeArc = TYPE_ARC_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArcImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PetriNetPackage.Literals.ARC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Noeud getPredecesseur() {
		if (predecesseur != null && predecesseur.eIsProxy()) {
			InternalEObject oldPredecesseur = (InternalEObject)predecesseur;
			predecesseur = (Noeud)eResolveProxy(oldPredecesseur);
			if (predecesseur != oldPredecesseur) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PetriNetPackage.ARC__PREDECESSEUR, oldPredecesseur, predecesseur));
			}
		}
		return predecesseur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Noeud basicGetPredecesseur() {
		return predecesseur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPredecesseur(Noeud newPredecesseur, NotificationChain msgs) {
		Noeud oldPredecesseur = predecesseur;
		predecesseur = newPredecesseur;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PetriNetPackage.ARC__PREDECESSEUR, oldPredecesseur, newPredecesseur);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPredecesseur(Noeud newPredecesseur) {
		if (newPredecesseur != predecesseur) {
			NotificationChain msgs = null;
			if (predecesseur != null)
				msgs = ((InternalEObject)predecesseur).eInverseRemove(this, PetriNetPackage.NOEUD__NOEUDS_SUCCESSEURS, Noeud.class, msgs);
			if (newPredecesseur != null)
				msgs = ((InternalEObject)newPredecesseur).eInverseAdd(this, PetriNetPackage.NOEUD__NOEUDS_SUCCESSEURS, Noeud.class, msgs);
			msgs = basicSetPredecesseur(newPredecesseur, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PetriNetPackage.ARC__PREDECESSEUR, newPredecesseur, newPredecesseur));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Noeud getSuccesseur() {
		if (successeur != null && successeur.eIsProxy()) {
			InternalEObject oldSuccesseur = (InternalEObject)successeur;
			successeur = (Noeud)eResolveProxy(oldSuccesseur);
			if (successeur != oldSuccesseur) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PetriNetPackage.ARC__SUCCESSEUR, oldSuccesseur, successeur));
			}
		}
		return successeur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Noeud basicGetSuccesseur() {
		return successeur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSuccesseur(Noeud newSuccesseur, NotificationChain msgs) {
		Noeud oldSuccesseur = successeur;
		successeur = newSuccesseur;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PetriNetPackage.ARC__SUCCESSEUR, oldSuccesseur, newSuccesseur);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuccesseur(Noeud newSuccesseur) {
		if (newSuccesseur != successeur) {
			NotificationChain msgs = null;
			if (successeur != null)
				msgs = ((InternalEObject)successeur).eInverseRemove(this, PetriNetPackage.NOEUD__NOEUDS_PREDECESSEURS, Noeud.class, msgs);
			if (newSuccesseur != null)
				msgs = ((InternalEObject)newSuccesseur).eInverseAdd(this, PetriNetPackage.NOEUD__NOEUDS_PREDECESSEURS, Noeud.class, msgs);
			msgs = basicSetSuccesseur(newSuccesseur, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PetriNetPackage.ARC__SUCCESSEUR, newSuccesseur, newSuccesseur));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPoids() {
		return poids;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPoids(int newPoids) {
		int oldPoids = poids;
		poids = newPoids;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PetriNetPackage.ARC__POIDS, oldPoids, poids));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeArc getTypeArc() {
		return typeArc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeArc(TypeArc newTypeArc) {
		TypeArc oldTypeArc = typeArc;
		typeArc = newTypeArc == null ? TYPE_ARC_EDEFAULT : newTypeArc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PetriNetPackage.ARC__TYPE_ARC, oldTypeArc, typeArc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PetriNetPackage.ARC__PREDECESSEUR:
				if (predecesseur != null)
					msgs = ((InternalEObject)predecesseur).eInverseRemove(this, PetriNetPackage.NOEUD__NOEUDS_SUCCESSEURS, Noeud.class, msgs);
				return basicSetPredecesseur((Noeud)otherEnd, msgs);
			case PetriNetPackage.ARC__SUCCESSEUR:
				if (successeur != null)
					msgs = ((InternalEObject)successeur).eInverseRemove(this, PetriNetPackage.NOEUD__NOEUDS_PREDECESSEURS, Noeud.class, msgs);
				return basicSetSuccesseur((Noeud)otherEnd, msgs);
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
			case PetriNetPackage.ARC__PREDECESSEUR:
				return basicSetPredecesseur(null, msgs);
			case PetriNetPackage.ARC__SUCCESSEUR:
				return basicSetSuccesseur(null, msgs);
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
			case PetriNetPackage.ARC__PREDECESSEUR:
				if (resolve) return getPredecesseur();
				return basicGetPredecesseur();
			case PetriNetPackage.ARC__SUCCESSEUR:
				if (resolve) return getSuccesseur();
				return basicGetSuccesseur();
			case PetriNetPackage.ARC__POIDS:
				return getPoids();
			case PetriNetPackage.ARC__TYPE_ARC:
				return getTypeArc();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PetriNetPackage.ARC__PREDECESSEUR:
				setPredecesseur((Noeud)newValue);
				return;
			case PetriNetPackage.ARC__SUCCESSEUR:
				setSuccesseur((Noeud)newValue);
				return;
			case PetriNetPackage.ARC__POIDS:
				setPoids((Integer)newValue);
				return;
			case PetriNetPackage.ARC__TYPE_ARC:
				setTypeArc((TypeArc)newValue);
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
			case PetriNetPackage.ARC__PREDECESSEUR:
				setPredecesseur((Noeud)null);
				return;
			case PetriNetPackage.ARC__SUCCESSEUR:
				setSuccesseur((Noeud)null);
				return;
			case PetriNetPackage.ARC__POIDS:
				setPoids(POIDS_EDEFAULT);
				return;
			case PetriNetPackage.ARC__TYPE_ARC:
				setTypeArc(TYPE_ARC_EDEFAULT);
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
			case PetriNetPackage.ARC__PREDECESSEUR:
				return predecesseur != null;
			case PetriNetPackage.ARC__SUCCESSEUR:
				return successeur != null;
			case PetriNetPackage.ARC__POIDS:
				return poids != POIDS_EDEFAULT;
			case PetriNetPackage.ARC__TYPE_ARC:
				return typeArc != TYPE_ARC_EDEFAULT;
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
		result.append(" (poids: ");
		result.append(poids);
		result.append(", typeArc: ");
		result.append(typeArc);
		result.append(')');
		return result.toString();
	}

} //ArcImpl
