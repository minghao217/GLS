/**
 */
package petriNet;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Noeud</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link petriNet.Noeud#getName <em>Name</em>}</li>
 *   <li>{@link petriNet.Noeud#getNoeudsSuccesseurs <em>Noeuds Successeurs</em>}</li>
 *   <li>{@link petriNet.Noeud#getNoeudsPredecesseurs <em>Noeuds Predecesseurs</em>}</li>
 * </ul>
 *
 * @see petriNet.PetriNetPackage#getNoeud()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='noEmptyName'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot noEmptyName='name.size() &gt; 0'"
 * @generated
 */
public interface Noeud extends PetriNetElt {
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
	 * @see petriNet.PetriNetPackage#getNoeud_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link petriNet.Noeud#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Noeuds Predecesseurs</b></em>' reference list.
	 * The list contents are of type {@link petriNet.Arc}.
	 * It is bidirectional and its opposite is '{@link petriNet.Arc#getSuccesseur <em>Successeur</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Noeuds Predecesseurs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Noeuds Predecesseurs</em>' reference list.
	 * @see petriNet.PetriNetPackage#getNoeud_NoeudsPredecesseurs()
	 * @see petriNet.Arc#getSuccesseur
	 * @model opposite="successeur"
	 * @generated
	 */
	EList<Arc> getNoeudsPredecesseurs();

	/**
	 * Returns the value of the '<em><b>Noeuds Successeurs</b></em>' reference list.
	 * The list contents are of type {@link petriNet.Arc}.
	 * It is bidirectional and its opposite is '{@link petriNet.Arc#getPredecesseur <em>Predecesseur</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Noeuds Successeurs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Noeuds Successeurs</em>' reference list.
	 * @see petriNet.PetriNetPackage#getNoeud_NoeudsSuccesseurs()
	 * @see petriNet.Arc#getPredecesseur
	 * @model opposite="predecesseur"
	 * @generated
	 */
	EList<Arc> getNoeudsSuccesseurs();

} // Noeud
