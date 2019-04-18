/**
 */
package petriNet.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import petriNet.PetriNet;
import petriNet.PetriNetElt;
import petriNet.PetriNetPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Elt</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link petriNet.impl.PetriNetEltImpl#getNet <em>Net</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class PetriNetEltImpl extends MinimalEObjectImpl.Container implements PetriNetElt {
	/**
	 * The cached value of the '{@link #getNet() <em>Net</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNet()
	 * @generated
	 * @ordered
	 */
	protected PetriNet net;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PetriNetEltImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PetriNetPackage.Literals.PETRI_NET_ELT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PetriNet getNet() {
		if (net != null && net.eIsProxy()) {
			InternalEObject oldNet = (InternalEObject)net;
			net = (PetriNet)eResolveProxy(oldNet);
			if (net != oldNet) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PetriNetPackage.PETRI_NET_ELT__NET, oldNet, net));
			}
		}
		return net;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PetriNet basicGetNet() {
		return net;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNet(PetriNet newNet) {
		PetriNet oldNet = net;
		net = newNet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PetriNetPackage.PETRI_NET_ELT__NET, oldNet, net));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PetriNetPackage.PETRI_NET_ELT__NET:
				if (resolve) return getNet();
				return basicGetNet();
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
			case PetriNetPackage.PETRI_NET_ELT__NET:
				setNet((PetriNet)newValue);
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
			case PetriNetPackage.PETRI_NET_ELT__NET:
				setNet((PetriNet)null);
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
			case PetriNetPackage.PETRI_NET_ELT__NET:
				return net != null;
		}
		return super.eIsSet(featureID);
	}

} //PetriNetEltImpl
