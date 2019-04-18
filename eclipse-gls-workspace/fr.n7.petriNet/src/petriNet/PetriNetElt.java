/**
 */
package petriNet;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Elt</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link petriNet.PetriNetElt#getNet <em>Net</em>}</li>
 * </ul>
 *
 * @see petriNet.PetriNetPackage#getPetriNetElt()
 * @model abstract="true"
 *        annotation="http://www.obeo.fr/dsl/dnc/archetype archetype='Role'"
 * @generated
 */
public interface PetriNetElt extends EObject {

	/**
	 * Returns the value of the '<em><b>Net</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Net</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Net</em>' reference.
	 * @see #setNet(PetriNet)
	 * @see petriNet.PetriNetPackage#getPetriNetElt_Net()
	 * @model required="true"
	 * @generated
	 */
	PetriNet getNet();

	/**
	 * Sets the value of the '{@link petriNet.PetriNetElt#getNet <em>Net</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Net</em>' reference.
	 * @see #getNet()
	 * @generated
	 */
	void setNet(PetriNet value);
} // PetriNetElt
