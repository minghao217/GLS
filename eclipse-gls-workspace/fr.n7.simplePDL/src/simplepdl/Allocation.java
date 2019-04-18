/**
 */
package simplepdl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Allocation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link simplepdl.Allocation#getCount <em>Count</em>}</li>
 *   <li>{@link simplepdl.Allocation#getRessource <em>Ressource</em>}</li>
 *   <li>{@link simplepdl.Allocation#getWorkdefinition <em>Workdefinition</em>}</li>
 * </ul>
 *
 * @see simplepdl.SimplepdlPackage#getAllocation()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='demandeTropGrande'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot demandeTropGrande='count &lt; ressource.count and count &gt; 0'"
 * @generated
 */
public interface Allocation extends ProcessElement {
	/**
	 * Returns the value of the '<em><b>Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Count</em>' attribute.
	 * @see #setCount(int)
	 * @see simplepdl.SimplepdlPackage#getAllocation_Count()
	 * @model required="true"
	 * @generated
	 */
	int getCount();

	/**
	 * Sets the value of the '{@link simplepdl.Allocation#getCount <em>Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Count</em>' attribute.
	 * @see #getCount()
	 * @generated
	 */
	void setCount(int value);

	/**
	 * Returns the value of the '<em><b>Ressource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ressource</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ressource</em>' reference.
	 * @see #setRessource(Ressource)
	 * @see simplepdl.SimplepdlPackage#getAllocation_Ressource()
	 * @model required="true"
	 * @generated
	 */
	Ressource getRessource();

	/**
	 * Sets the value of the '{@link simplepdl.Allocation#getRessource <em>Ressource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ressource</em>' reference.
	 * @see #getRessource()
	 * @generated
	 */
	void setRessource(Ressource value);

	/**
	 * Returns the value of the '<em><b>Workdefinition</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link simplepdl.WorkDefinition#getAllocation <em>Allocation</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Workdefinition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Workdefinition</em>' container reference.
	 * @see #setWorkdefinition(WorkDefinition)
	 * @see simplepdl.SimplepdlPackage#getAllocation_Workdefinition()
	 * @see simplepdl.WorkDefinition#getAllocation
	 * @model opposite="allocation" required="true" transient="false"
	 * @generated
	 */
	WorkDefinition getWorkdefinition();

	/**
	 * Sets the value of the '{@link simplepdl.Allocation#getWorkdefinition <em>Workdefinition</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Workdefinition</em>' container reference.
	 * @see #getWorkdefinition()
	 * @generated
	 */
	void setWorkdefinition(WorkDefinition value);

} // Allocation
