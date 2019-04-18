/**
 */
package petriNet;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Arc</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link petriNet.Arc#getPredecesseur <em>Predecesseur</em>}</li>
 *   <li>{@link petriNet.Arc#getSuccesseur <em>Successeur</em>}</li>
 *   <li>{@link petriNet.Arc#getPoids <em>Poids</em>}</li>
 *   <li>{@link petriNet.Arc#getTypeArc <em>Type Arc</em>}</li>
 * </ul>
 *
 * @see petriNet.PetriNetPackage#getArc()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='poidsNonNul'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot poidsNonNul='poids &gt; 0'"
 * @generated
 */
public interface Arc extends PetriNetElt {
	/**
	 * Returns the value of the '<em><b>Predecesseur</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link petriNet.Noeud#getNoeudsSuccesseurs <em>Noeuds Successeurs</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Predecesseur</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Predecesseur</em>' reference.
	 * @see #setPredecesseur(Noeud)
	 * @see petriNet.PetriNetPackage#getArc_Predecesseur()
	 * @see petriNet.Noeud#getNoeudsSuccesseurs
	 * @model opposite="noeudsSuccesseurs"
	 * @generated
	 */
	Noeud getPredecesseur();

	/**
	 * Sets the value of the '{@link petriNet.Arc#getPredecesseur <em>Predecesseur</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Predecesseur</em>' reference.
	 * @see #getPredecesseur()
	 * @generated
	 */
	void setPredecesseur(Noeud value);

	/**
	 * Returns the value of the '<em><b>Successeur</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link petriNet.Noeud#getNoeudsPredecesseurs <em>Noeuds Predecesseurs</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Successeur</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Successeur</em>' reference.
	 * @see #setSuccesseur(Noeud)
	 * @see petriNet.PetriNetPackage#getArc_Successeur()
	 * @see petriNet.Noeud#getNoeudsPredecesseurs
	 * @model opposite="noeudsPredecesseurs"
	 * @generated
	 */
	Noeud getSuccesseur();

	/**
	 * Sets the value of the '{@link petriNet.Arc#getSuccesseur <em>Successeur</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Successeur</em>' reference.
	 * @see #getSuccesseur()
	 * @generated
	 */
	void setSuccesseur(Noeud value);

	/**
	 * Returns the value of the '<em><b>Poids</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Poids</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Poids</em>' attribute.
	 * @see #setPoids(int)
	 * @see petriNet.PetriNetPackage#getArc_Poids()
	 * @model required="true"
	 * @generated
	 */
	int getPoids();

	/**
	 * Sets the value of the '{@link petriNet.Arc#getPoids <em>Poids</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Poids</em>' attribute.
	 * @see #getPoids()
	 * @generated
	 */
	void setPoids(int value);

	/**
	 * Returns the value of the '<em><b>Type Arc</b></em>' attribute.
	 * The literals are from the enumeration {@link petriNet.TypeArc}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Arc</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Arc</em>' attribute.
	 * @see petriNet.TypeArc
	 * @see #setTypeArc(TypeArc)
	 * @see petriNet.PetriNetPackage#getArc_TypeArc()
	 * @model
	 * @generated
	 */
	TypeArc getTypeArc();

	/**
	 * Sets the value of the '{@link petriNet.Arc#getTypeArc <em>Type Arc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Arc</em>' attribute.
	 * @see petriNet.TypeArc
	 * @see #getTypeArc()
	 * @generated
	 */
	void setTypeArc(TypeArc value);

} // Arc
