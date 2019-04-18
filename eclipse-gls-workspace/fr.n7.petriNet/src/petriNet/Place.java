/**
 */
package petriNet;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Place</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link petriNet.Place#getJeton <em>Jeton</em>}</li>
 * </ul>
 *
 * @see petriNet.PetriNetPackage#getPlace()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='nombreJetonNonNul'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot nombreJetonNonNul='jeton &gt;= 0'"
 * @generated
 */
public interface Place extends Noeud {
	/**
	 * Returns the value of the '<em><b>Jeton</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Jeton</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jeton</em>' attribute.
	 * @see #setJeton(int)
	 * @see petriNet.PetriNetPackage#getPlace_Jeton()
	 * @model required="true"
	 * @generated
	 */
	int getJeton();

	/**
	 * Sets the value of the '{@link petriNet.Place#getJeton <em>Jeton</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jeton</em>' attribute.
	 * @see #getJeton()
	 * @generated
	 */
	void setJeton(int value);

} // Place
