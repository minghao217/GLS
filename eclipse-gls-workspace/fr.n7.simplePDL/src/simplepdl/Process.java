/**
 */
package simplepdl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Process</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link simplepdl.Process#getName <em>Name</em>}</li>
 *   <li>{@link simplepdl.Process#getProcessElements <em>Process Elements</em>}</li>
 * </ul>
 *
 * @see simplepdl.SimplepdlPackage#getProcess()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='noEmptyName noSameName'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot noEmptyName='name.size() &gt; 0' noSameName='\n\t\t\t\tself.processElements\n\t\t\t\t-&gt;select(e: ProcessElement | e.oclIsKindOf(WorkDefinition))\n\t\t\t\t-&gt;collect(e: ProcessElement | e.oclAsType(WorkDefinition))\n\t\t\t\t-&gt;forAll(w1, w2: WorkDefinition | w1 = w2 or w1.name &lt;&gt; w2.name)'"
 * @generated
 */
public interface Process extends EObject {
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
	 * @see simplepdl.SimplepdlPackage#getProcess_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link simplepdl.Process#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Process Elements</b></em>' containment reference list.
	 * The list contents are of type {@link simplepdl.ProcessElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Process Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Process Elements</em>' containment reference list.
	 * @see simplepdl.SimplepdlPackage#getProcess_ProcessElements()
	 * @model containment="true"
	 * @generated
	 */
	EList<ProcessElement> getProcessElements();

} // Process
