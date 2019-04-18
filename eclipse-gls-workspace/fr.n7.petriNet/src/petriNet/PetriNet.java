/**
 */
package petriNet;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Petri Net</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link petriNet.PetriNet#getPetrinetelt <em>Petrinetelt</em>}</li>
 *   <li>{@link petriNet.PetriNet#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see petriNet.PetriNetPackage#getPetriNet()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='placeNoSameName transitionNoSameName notSameSuccessorPredecessor notPlaceToPlaceOrTransitionToTransition noEmptyName'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot placeNoSameName='\n\t\t\t\tself.petrinetelt\n\t\t\t\t-&gt;select(e: PetriNetElt | e.oclIsKindOf(Place))\n\t\t\t\t-&gt;collect(e: PetriNetElt | e.oclAsType(Place))\n\t\t\t\t-&gt;forAll(w1, w2: Place | w1 = w2 or w1.name &lt;&gt; w2.name)' transitionNoSameName='\n\t\t\t\tself.petrinetelt\n\t\t\t\t-&gt;select(e: PetriNetElt | e.oclIsKindOf(Transition))\n\t\t\t\t-&gt;collect(e: PetriNetElt | e.oclAsType(Transition))\n\t\t\t\t-&gt;forAll(w1, w2: Transition | w1 = w2 or w1.name &lt;&gt; w2.name)' notSameSuccessorPredecessor='\n\t\t\t\tself.petrinetelt\n\t\t\t\t-&gt;select(e: PetriNetElt | e.oclIsKindOf(Arc))\n\t\t\t\t-&gt;collect(e: PetriNetElt | e.oclAsType(Arc))\n\t\t\t\t-&gt;forAll(a: Arc| a.successeur &lt;&gt; a.predecesseur )' notPlaceToPlaceOrTransitionToTransition='\n\t\t\t\tself.petrinetelt\n\t\t\t\t-&gt;select(e: PetriNetElt | e.oclIsKindOf(Arc))\n\t\t\t\t-&gt;collect(e: PetriNetElt | e.oclAsType(Arc))\n\t\t\t\t-&gt;forAll(a: Arc| (a.successeur.oclIsTypeOf(Place) and a.predecesseur.oclIsTypeOf(Transition)) or (a.successeur.oclIsTypeOf(Transition) and a.predecesseur.oclIsTypeOf(Place) ) )' noEmptyName='name.size() &gt; 0'"
 * @generated
 */
public interface PetriNet extends EObject {
	/**
	 * Returns the value of the '<em><b>Petrinetelt</b></em>' containment reference list.
	 * The list contents are of type {@link petriNet.PetriNetElt}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Petrinetelt</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Petrinetelt</em>' containment reference list.
	 * @see petriNet.PetriNetPackage#getPetriNet_Petrinetelt()
	 * @model containment="true"
	 * @generated
	 */
	EList<PetriNetElt> getPetrinetelt();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see petriNet.PetriNetPackage#getPetriNet_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link petriNet.PetriNet#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // PetriNet
