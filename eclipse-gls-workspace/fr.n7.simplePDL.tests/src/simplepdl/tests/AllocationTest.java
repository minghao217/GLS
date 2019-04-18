/**
 */
package simplepdl.tests;

import junit.textui.TestRunner;

import simplepdl.Allocation;
import simplepdl.SimplepdlFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Allocation</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AllocationTest extends ProcessElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AllocationTest.class);
	}

	/**
	 * Constructs a new Allocation test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllocationTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Allocation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Allocation getFixture() {
		return (Allocation)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SimplepdlFactory.eINSTANCE.createAllocation());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //AllocationTest
