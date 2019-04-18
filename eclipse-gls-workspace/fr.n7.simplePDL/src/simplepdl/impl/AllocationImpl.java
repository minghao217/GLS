/**
 */
package simplepdl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import simplepdl.Allocation;
import simplepdl.Ressource;
import simplepdl.SimplepdlPackage;
import simplepdl.WorkDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Allocation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link simplepdl.impl.AllocationImpl#getCount <em>Count</em>}</li>
 *   <li>{@link simplepdl.impl.AllocationImpl#getRessource <em>Ressource</em>}</li>
 *   <li>{@link simplepdl.impl.AllocationImpl#getWorkdefinition <em>Workdefinition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AllocationImpl extends ProcessElementImpl implements Allocation {
	/**
	 * The default value of the '{@link #getCount() <em>Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCount()
	 * @generated
	 * @ordered
	 */
	protected static final int COUNT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCount() <em>Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCount()
	 * @generated
	 * @ordered
	 */
	protected int count = COUNT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRessource() <em>Ressource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRessource()
	 * @generated
	 * @ordered
	 */
	protected Ressource ressource;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AllocationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimplepdlPackage.Literals.ALLOCATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCount() {
		return count;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCount(int newCount) {
		int oldCount = count;
		count = newCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimplepdlPackage.ALLOCATION__COUNT, oldCount, count));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ressource getRessource() {
		if (ressource != null && ressource.eIsProxy()) {
			InternalEObject oldRessource = (InternalEObject)ressource;
			ressource = (Ressource)eResolveProxy(oldRessource);
			if (ressource != oldRessource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SimplepdlPackage.ALLOCATION__RESSOURCE, oldRessource, ressource));
			}
		}
		return ressource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ressource basicGetRessource() {
		return ressource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRessource(Ressource newRessource) {
		Ressource oldRessource = ressource;
		ressource = newRessource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimplepdlPackage.ALLOCATION__RESSOURCE, oldRessource, ressource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkDefinition getWorkdefinition() {
		if (eContainerFeatureID() != SimplepdlPackage.ALLOCATION__WORKDEFINITION) return null;
		return (WorkDefinition)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWorkdefinition(WorkDefinition newWorkdefinition, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newWorkdefinition, SimplepdlPackage.ALLOCATION__WORKDEFINITION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWorkdefinition(WorkDefinition newWorkdefinition) {
		if (newWorkdefinition != eInternalContainer() || (eContainerFeatureID() != SimplepdlPackage.ALLOCATION__WORKDEFINITION && newWorkdefinition != null)) {
			if (EcoreUtil.isAncestor(this, newWorkdefinition))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newWorkdefinition != null)
				msgs = ((InternalEObject)newWorkdefinition).eInverseAdd(this, SimplepdlPackage.WORK_DEFINITION__ALLOCATION, WorkDefinition.class, msgs);
			msgs = basicSetWorkdefinition(newWorkdefinition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimplepdlPackage.ALLOCATION__WORKDEFINITION, newWorkdefinition, newWorkdefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SimplepdlPackage.ALLOCATION__WORKDEFINITION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetWorkdefinition((WorkDefinition)otherEnd, msgs);
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
			case SimplepdlPackage.ALLOCATION__WORKDEFINITION:
				return basicSetWorkdefinition(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case SimplepdlPackage.ALLOCATION__WORKDEFINITION:
				return eInternalContainer().eInverseRemove(this, SimplepdlPackage.WORK_DEFINITION__ALLOCATION, WorkDefinition.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SimplepdlPackage.ALLOCATION__COUNT:
				return getCount();
			case SimplepdlPackage.ALLOCATION__RESSOURCE:
				if (resolve) return getRessource();
				return basicGetRessource();
			case SimplepdlPackage.ALLOCATION__WORKDEFINITION:
				return getWorkdefinition();
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
			case SimplepdlPackage.ALLOCATION__COUNT:
				setCount((Integer)newValue);
				return;
			case SimplepdlPackage.ALLOCATION__RESSOURCE:
				setRessource((Ressource)newValue);
				return;
			case SimplepdlPackage.ALLOCATION__WORKDEFINITION:
				setWorkdefinition((WorkDefinition)newValue);
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
			case SimplepdlPackage.ALLOCATION__COUNT:
				setCount(COUNT_EDEFAULT);
				return;
			case SimplepdlPackage.ALLOCATION__RESSOURCE:
				setRessource((Ressource)null);
				return;
			case SimplepdlPackage.ALLOCATION__WORKDEFINITION:
				setWorkdefinition((WorkDefinition)null);
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
			case SimplepdlPackage.ALLOCATION__COUNT:
				return count != COUNT_EDEFAULT;
			case SimplepdlPackage.ALLOCATION__RESSOURCE:
				return ressource != null;
			case SimplepdlPackage.ALLOCATION__WORKDEFINITION:
				return getWorkdefinition() != null;
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
		result.append(" (count: ");
		result.append(count);
		result.append(')');
		return result.toString();
	}

} //AllocationImpl
