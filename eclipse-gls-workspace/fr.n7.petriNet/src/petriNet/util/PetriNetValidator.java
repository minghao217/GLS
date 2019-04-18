/**
 */
package petriNet.util;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import petriNet.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see petriNet.PetriNetPackage
 * @generated
 */
public class PetriNetValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final PetriNetValidator INSTANCE = new PetriNetValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "petriNet";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PetriNetValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return PetriNetPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case PetriNetPackage.PLACE:
				return validatePlace((Place)value, diagnostics, context);
			case PetriNetPackage.TRANSITION:
				return validateTransition((Transition)value, diagnostics, context);
			case PetriNetPackage.NOEUD:
				return validateNoeud((Noeud)value, diagnostics, context);
			case PetriNetPackage.ARC:
				return validateArc((Arc)value, diagnostics, context);
			case PetriNetPackage.PETRI_NET_ELT:
				return validatePetriNetElt((PetriNetElt)value, diagnostics, context);
			case PetriNetPackage.PETRI_NET:
				return validatePetriNet((PetriNet)value, diagnostics, context);
			case PetriNetPackage.TYPE_ARC:
				return validateTypeArc((TypeArc)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlace(Place place, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(place, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(place, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(place, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(place, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(place, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(place, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(place, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(place, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(place, diagnostics, context);
		if (result || diagnostics != null) result &= validateNoeud_noEmptyName(place, diagnostics, context);
		if (result || diagnostics != null) result &= validatePlace_nombreJetonNonNul(place, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the nombreJetonNonNul constraint of '<em>Place</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PLACE__NOMBRE_JETON_NON_NUL__EEXPRESSION = "jeton >= 0";

	/**
	 * Validates the nombreJetonNonNul constraint of '<em>Place</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlace_nombreJetonNonNul(Place place, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(PetriNetPackage.Literals.PLACE,
				 place,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "nombreJetonNonNul",
				 PLACE__NOMBRE_JETON_NON_NUL__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransition(Transition transition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(transition, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(transition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(transition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(transition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(transition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(transition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(transition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(transition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(transition, diagnostics, context);
		if (result || diagnostics != null) result &= validateNoeud_noEmptyName(transition, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNoeud(Noeud noeud, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(noeud, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(noeud, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(noeud, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(noeud, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(noeud, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(noeud, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(noeud, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(noeud, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(noeud, diagnostics, context);
		if (result || diagnostics != null) result &= validateNoeud_noEmptyName(noeud, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the noEmptyName constraint of '<em>Noeud</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String NOEUD__NO_EMPTY_NAME__EEXPRESSION = "name.size() > 0";

	/**
	 * Validates the noEmptyName constraint of '<em>Noeud</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNoeud_noEmptyName(Noeud noeud, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(PetriNetPackage.Literals.NOEUD,
				 noeud,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "noEmptyName",
				 NOEUD__NO_EMPTY_NAME__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArc(Arc arc, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(arc, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(arc, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(arc, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(arc, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(arc, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(arc, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(arc, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(arc, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(arc, diagnostics, context);
		if (result || diagnostics != null) result &= validateArc_poidsNonNul(arc, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the poidsNonNul constraint of '<em>Arc</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ARC__POIDS_NON_NUL__EEXPRESSION = "poids > 0";

	/**
	 * Validates the poidsNonNul constraint of '<em>Arc</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArc_poidsNonNul(Arc arc, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(PetriNetPackage.Literals.ARC,
				 arc,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "poidsNonNul",
				 ARC__POIDS_NON_NUL__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePetriNetElt(PetriNetElt petriNetElt, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(petriNetElt, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePetriNet(PetriNet petriNet, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(petriNet, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(petriNet, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(petriNet, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(petriNet, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(petriNet, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(petriNet, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(petriNet, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(petriNet, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(petriNet, diagnostics, context);
		if (result || diagnostics != null) result &= validatePetriNet_placeNoSameName(petriNet, diagnostics, context);
		if (result || diagnostics != null) result &= validatePetriNet_transitionNoSameName(petriNet, diagnostics, context);
		if (result || diagnostics != null) result &= validatePetriNet_notSameSuccessorPredecessor(petriNet, diagnostics, context);
		if (result || diagnostics != null) result &= validatePetriNet_notPlaceToPlaceOrTransitionToTransition(petriNet, diagnostics, context);
		if (result || diagnostics != null) result &= validatePetriNet_noEmptyName(petriNet, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the placeNoSameName constraint of '<em>Petri Net</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PETRI_NET__PLACE_NO_SAME_NAME__EEXPRESSION = "\n" +
		"\t\t\t\tself.petrinetelt\n" +
		"\t\t\t\t->select(e: PetriNetElt | e.oclIsKindOf(Place))\n" +
		"\t\t\t\t->collect(e: PetriNetElt | e.oclAsType(Place))\n" +
		"\t\t\t\t->forAll(w1, w2: Place | w1 = w2 or w1.name <> w2.name)";

	/**
	 * Validates the placeNoSameName constraint of '<em>Petri Net</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePetriNet_placeNoSameName(PetriNet petriNet, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(PetriNetPackage.Literals.PETRI_NET,
				 petriNet,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "placeNoSameName",
				 PETRI_NET__PLACE_NO_SAME_NAME__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the transitionNoSameName constraint of '<em>Petri Net</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PETRI_NET__TRANSITION_NO_SAME_NAME__EEXPRESSION = "\n" +
		"\t\t\t\tself.petrinetelt\n" +
		"\t\t\t\t->select(e: PetriNetElt | e.oclIsKindOf(Transition))\n" +
		"\t\t\t\t->collect(e: PetriNetElt | e.oclAsType(Transition))\n" +
		"\t\t\t\t->forAll(w1, w2: Transition | w1 = w2 or w1.name <> w2.name)";

	/**
	 * Validates the transitionNoSameName constraint of '<em>Petri Net</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePetriNet_transitionNoSameName(PetriNet petriNet, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(PetriNetPackage.Literals.PETRI_NET,
				 petriNet,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "transitionNoSameName",
				 PETRI_NET__TRANSITION_NO_SAME_NAME__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the notSameSuccessorPredecessor constraint of '<em>Petri Net</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PETRI_NET__NOT_SAME_SUCCESSOR_PREDECESSOR__EEXPRESSION = "\n" +
		"\t\t\t\tself.petrinetelt\n" +
		"\t\t\t\t->select(e: PetriNetElt | e.oclIsKindOf(Arc))\n" +
		"\t\t\t\t->collect(e: PetriNetElt | e.oclAsType(Arc))\n" +
		"\t\t\t\t->forAll(a: Arc| a.successeur <> a.predecesseur )";

	/**
	 * Validates the notSameSuccessorPredecessor constraint of '<em>Petri Net</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePetriNet_notSameSuccessorPredecessor(PetriNet petriNet, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(PetriNetPackage.Literals.PETRI_NET,
				 petriNet,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "notSameSuccessorPredecessor",
				 PETRI_NET__NOT_SAME_SUCCESSOR_PREDECESSOR__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the notPlaceToPlaceOrTransitionToTransition constraint of '<em>Petri Net</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PETRI_NET__NOT_PLACE_TO_PLACE_OR_TRANSITION_TO_TRANSITION__EEXPRESSION = "\n" +
		"\t\t\t\tself.petrinetelt\n" +
		"\t\t\t\t->select(e: PetriNetElt | e.oclIsKindOf(Arc))\n" +
		"\t\t\t\t->collect(e: PetriNetElt | e.oclAsType(Arc))\n" +
		"\t\t\t\t->forAll(a: Arc| (a.successeur.oclIsTypeOf(Place) and a.predecesseur.oclIsTypeOf(Transition)) or (a.successeur.oclIsTypeOf(Transition) and a.predecesseur.oclIsTypeOf(Place) ) )";

	/**
	 * Validates the notPlaceToPlaceOrTransitionToTransition constraint of '<em>Petri Net</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePetriNet_notPlaceToPlaceOrTransitionToTransition(PetriNet petriNet, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(PetriNetPackage.Literals.PETRI_NET,
				 petriNet,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "notPlaceToPlaceOrTransitionToTransition",
				 PETRI_NET__NOT_PLACE_TO_PLACE_OR_TRANSITION_TO_TRANSITION__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the noEmptyName constraint of '<em>Petri Net</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PETRI_NET__NO_EMPTY_NAME__EEXPRESSION = "name.size() > 0";

	/**
	 * Validates the noEmptyName constraint of '<em>Petri Net</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePetriNet_noEmptyName(PetriNet petriNet, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(PetriNetPackage.Literals.PETRI_NET,
				 petriNet,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "noEmptyName",
				 PETRI_NET__NO_EMPTY_NAME__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeArc(TypeArc typeArc, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //PetriNetValidator
