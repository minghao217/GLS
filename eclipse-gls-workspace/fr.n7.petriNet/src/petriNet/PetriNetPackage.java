/**
 */
package petriNet;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see petriNet.PetriNetFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/OCL/Import ecore='http://www.eclipse.org/emf/2002/Ecore'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface PetriNetPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "petriNet";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://petrinet";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "petrinet";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PetriNetPackage eINSTANCE = petriNet.impl.PetriNetPackageImpl.init();

	/**
	 * The meta object id for the '{@link petriNet.impl.PetriNetEltImpl <em>Elt</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see petriNet.impl.PetriNetEltImpl
	 * @see petriNet.impl.PetriNetPackageImpl#getPetriNetElt()
	 * @generated
	 */
	int PETRI_NET_ELT = 4;

	/**
	 * The feature id for the '<em><b>Net</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRI_NET_ELT__NET = 0;

	/**
	 * The number of structural features of the '<em>Elt</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRI_NET_ELT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Elt</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRI_NET_ELT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link petriNet.impl.NoeudImpl <em>Noeud</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see petriNet.impl.NoeudImpl
	 * @see petriNet.impl.PetriNetPackageImpl#getNoeud()
	 * @generated
	 */
	int NOEUD = 2;

	/**
	 * The feature id for the '<em><b>Net</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOEUD__NET = PETRI_NET_ELT__NET;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOEUD__NAME = PETRI_NET_ELT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Noeuds Successeurs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOEUD__NOEUDS_SUCCESSEURS = PETRI_NET_ELT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Noeuds Predecesseurs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOEUD__NOEUDS_PREDECESSEURS = PETRI_NET_ELT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Noeud</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOEUD_FEATURE_COUNT = PETRI_NET_ELT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Noeud</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOEUD_OPERATION_COUNT = PETRI_NET_ELT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link petriNet.impl.PlaceImpl <em>Place</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see petriNet.impl.PlaceImpl
	 * @see petriNet.impl.PetriNetPackageImpl#getPlace()
	 * @generated
	 */
	int PLACE = 0;

	/**
	 * The feature id for the '<em><b>Net</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__NET = NOEUD__NET;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__NAME = NOEUD__NAME;

	/**
	 * The feature id for the '<em><b>Noeuds Successeurs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__NOEUDS_SUCCESSEURS = NOEUD__NOEUDS_SUCCESSEURS;

	/**
	 * The feature id for the '<em><b>Noeuds Predecesseurs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__NOEUDS_PREDECESSEURS = NOEUD__NOEUDS_PREDECESSEURS;

	/**
	 * The feature id for the '<em><b>Jeton</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__JETON = NOEUD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Place</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_FEATURE_COUNT = NOEUD_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Place</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_OPERATION_COUNT = NOEUD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link petriNet.impl.TransitionImpl <em>Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see petriNet.impl.TransitionImpl
	 * @see petriNet.impl.PetriNetPackageImpl#getTransition()
	 * @generated
	 */
	int TRANSITION = 1;

	/**
	 * The feature id for the '<em><b>Net</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__NET = NOEUD__NET;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__NAME = NOEUD__NAME;

	/**
	 * The feature id for the '<em><b>Noeuds Successeurs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__NOEUDS_SUCCESSEURS = NOEUD__NOEUDS_SUCCESSEURS;

	/**
	 * The feature id for the '<em><b>Noeuds Predecesseurs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__NOEUDS_PREDECESSEURS = NOEUD__NOEUDS_PREDECESSEURS;

	/**
	 * The number of structural features of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FEATURE_COUNT = NOEUD_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_OPERATION_COUNT = NOEUD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link petriNet.impl.ArcImpl <em>Arc</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see petriNet.impl.ArcImpl
	 * @see petriNet.impl.PetriNetPackageImpl#getArc()
	 * @generated
	 */
	int ARC = 3;

	/**
	 * The feature id for the '<em><b>Net</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC__NET = PETRI_NET_ELT__NET;

	/**
	 * The feature id for the '<em><b>Predecesseur</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC__PREDECESSEUR = PETRI_NET_ELT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Successeur</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC__SUCCESSEUR = PETRI_NET_ELT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Poids</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC__POIDS = PETRI_NET_ELT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Type Arc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC__TYPE_ARC = PETRI_NET_ELT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Arc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_FEATURE_COUNT = PETRI_NET_ELT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Arc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_OPERATION_COUNT = PETRI_NET_ELT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link petriNet.impl.PetriNetImpl <em>Petri Net</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see petriNet.impl.PetriNetImpl
	 * @see petriNet.impl.PetriNetPackageImpl#getPetriNet()
	 * @generated
	 */
	int PETRI_NET = 5;

	/**
	 * The feature id for the '<em><b>Petrinetelt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRI_NET__PETRINETELT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRI_NET__NAME = 1;

	/**
	 * The number of structural features of the '<em>Petri Net</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRI_NET_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Petri Net</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRI_NET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link petriNet.TypeArc <em>Type Arc</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see petriNet.TypeArc
	 * @see petriNet.impl.PetriNetPackageImpl#getTypeArc()
	 * @generated
	 */
	int TYPE_ARC = 6;


	/**
	 * Returns the meta object for class '{@link petriNet.Place <em>Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Place</em>'.
	 * @see petriNet.Place
	 * @generated
	 */
	EClass getPlace();

	/**
	 * Returns the meta object for the attribute '{@link petriNet.Place#getJeton <em>Jeton</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Jeton</em>'.
	 * @see petriNet.Place#getJeton()
	 * @see #getPlace()
	 * @generated
	 */
	EAttribute getPlace_Jeton();

	/**
	 * Returns the meta object for class '{@link petriNet.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition</em>'.
	 * @see petriNet.Transition
	 * @generated
	 */
	EClass getTransition();

	/**
	 * Returns the meta object for class '{@link petriNet.Noeud <em>Noeud</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Noeud</em>'.
	 * @see petriNet.Noeud
	 * @generated
	 */
	EClass getNoeud();

	/**
	 * Returns the meta object for the attribute '{@link petriNet.Noeud#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see petriNet.Noeud#getName()
	 * @see #getNoeud()
	 * @generated
	 */
	EAttribute getNoeud_Name();

	/**
	 * Returns the meta object for the reference list '{@link petriNet.Noeud#getNoeudsPredecesseurs <em>Noeuds Predecesseurs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Noeuds Predecesseurs</em>'.
	 * @see petriNet.Noeud#getNoeudsPredecesseurs()
	 * @see #getNoeud()
	 * @generated
	 */
	EReference getNoeud_NoeudsPredecesseurs();

	/**
	 * Returns the meta object for the reference list '{@link petriNet.Noeud#getNoeudsSuccesseurs <em>Noeuds Successeurs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Noeuds Successeurs</em>'.
	 * @see petriNet.Noeud#getNoeudsSuccesseurs()
	 * @see #getNoeud()
	 * @generated
	 */
	EReference getNoeud_NoeudsSuccesseurs();

	/**
	 * Returns the meta object for class '{@link petriNet.Arc <em>Arc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arc</em>'.
	 * @see petriNet.Arc
	 * @generated
	 */
	EClass getArc();

	/**
	 * Returns the meta object for the reference '{@link petriNet.Arc#getPredecesseur <em>Predecesseur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Predecesseur</em>'.
	 * @see petriNet.Arc#getPredecesseur()
	 * @see #getArc()
	 * @generated
	 */
	EReference getArc_Predecesseur();

	/**
	 * Returns the meta object for the reference '{@link petriNet.Arc#getSuccesseur <em>Successeur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Successeur</em>'.
	 * @see petriNet.Arc#getSuccesseur()
	 * @see #getArc()
	 * @generated
	 */
	EReference getArc_Successeur();

	/**
	 * Returns the meta object for the attribute '{@link petriNet.Arc#getPoids <em>Poids</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Poids</em>'.
	 * @see petriNet.Arc#getPoids()
	 * @see #getArc()
	 * @generated
	 */
	EAttribute getArc_Poids();

	/**
	 * Returns the meta object for the attribute '{@link petriNet.Arc#getTypeArc <em>Type Arc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Arc</em>'.
	 * @see petriNet.Arc#getTypeArc()
	 * @see #getArc()
	 * @generated
	 */
	EAttribute getArc_TypeArc();

	/**
	 * Returns the meta object for class '{@link petriNet.PetriNetElt <em>Elt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Elt</em>'.
	 * @see petriNet.PetriNetElt
	 * @generated
	 */
	EClass getPetriNetElt();

	/**
	 * Returns the meta object for the reference '{@link petriNet.PetriNetElt#getNet <em>Net</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Net</em>'.
	 * @see petriNet.PetriNetElt#getNet()
	 * @see #getPetriNetElt()
	 * @generated
	 */
	EReference getPetriNetElt_Net();

	/**
	 * Returns the meta object for class '{@link petriNet.PetriNet <em>Petri Net</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Petri Net</em>'.
	 * @see petriNet.PetriNet
	 * @generated
	 */
	EClass getPetriNet();

	/**
	 * Returns the meta object for the containment reference list '{@link petriNet.PetriNet#getPetrinetelt <em>Petrinetelt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Petrinetelt</em>'.
	 * @see petriNet.PetriNet#getPetrinetelt()
	 * @see #getPetriNet()
	 * @generated
	 */
	EReference getPetriNet_Petrinetelt();

	/**
	 * Returns the meta object for the attribute '{@link petriNet.PetriNet#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see petriNet.PetriNet#getName()
	 * @see #getPetriNet()
	 * @generated
	 */
	EAttribute getPetriNet_Name();

	/**
	 * Returns the meta object for enum '{@link petriNet.TypeArc <em>Type Arc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type Arc</em>'.
	 * @see petriNet.TypeArc
	 * @generated
	 */
	EEnum getTypeArc();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PetriNetFactory getPetriNetFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link petriNet.impl.PlaceImpl <em>Place</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see petriNet.impl.PlaceImpl
		 * @see petriNet.impl.PetriNetPackageImpl#getPlace()
		 * @generated
		 */
		EClass PLACE = eINSTANCE.getPlace();

		/**
		 * The meta object literal for the '<em><b>Jeton</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLACE__JETON = eINSTANCE.getPlace_Jeton();

		/**
		 * The meta object literal for the '{@link petriNet.impl.TransitionImpl <em>Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see petriNet.impl.TransitionImpl
		 * @see petriNet.impl.PetriNetPackageImpl#getTransition()
		 * @generated
		 */
		EClass TRANSITION = eINSTANCE.getTransition();

		/**
		 * The meta object literal for the '{@link petriNet.impl.NoeudImpl <em>Noeud</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see petriNet.impl.NoeudImpl
		 * @see petriNet.impl.PetriNetPackageImpl#getNoeud()
		 * @generated
		 */
		EClass NOEUD = eINSTANCE.getNoeud();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOEUD__NAME = eINSTANCE.getNoeud_Name();

		/**
		 * The meta object literal for the '<em><b>Noeuds Predecesseurs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NOEUD__NOEUDS_PREDECESSEURS = eINSTANCE.getNoeud_NoeudsPredecesseurs();

		/**
		 * The meta object literal for the '<em><b>Noeuds Successeurs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NOEUD__NOEUDS_SUCCESSEURS = eINSTANCE.getNoeud_NoeudsSuccesseurs();

		/**
		 * The meta object literal for the '{@link petriNet.impl.ArcImpl <em>Arc</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see petriNet.impl.ArcImpl
		 * @see petriNet.impl.PetriNetPackageImpl#getArc()
		 * @generated
		 */
		EClass ARC = eINSTANCE.getArc();

		/**
		 * The meta object literal for the '<em><b>Predecesseur</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARC__PREDECESSEUR = eINSTANCE.getArc_Predecesseur();

		/**
		 * The meta object literal for the '<em><b>Successeur</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARC__SUCCESSEUR = eINSTANCE.getArc_Successeur();

		/**
		 * The meta object literal for the '<em><b>Poids</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARC__POIDS = eINSTANCE.getArc_Poids();

		/**
		 * The meta object literal for the '<em><b>Type Arc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARC__TYPE_ARC = eINSTANCE.getArc_TypeArc();

		/**
		 * The meta object literal for the '{@link petriNet.impl.PetriNetEltImpl <em>Elt</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see petriNet.impl.PetriNetEltImpl
		 * @see petriNet.impl.PetriNetPackageImpl#getPetriNetElt()
		 * @generated
		 */
		EClass PETRI_NET_ELT = eINSTANCE.getPetriNetElt();

		/**
		 * The meta object literal for the '<em><b>Net</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PETRI_NET_ELT__NET = eINSTANCE.getPetriNetElt_Net();

		/**
		 * The meta object literal for the '{@link petriNet.impl.PetriNetImpl <em>Petri Net</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see petriNet.impl.PetriNetImpl
		 * @see petriNet.impl.PetriNetPackageImpl#getPetriNet()
		 * @generated
		 */
		EClass PETRI_NET = eINSTANCE.getPetriNet();

		/**
		 * The meta object literal for the '<em><b>Petrinetelt</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PETRI_NET__PETRINETELT = eINSTANCE.getPetriNet_Petrinetelt();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PETRI_NET__NAME = eINSTANCE.getPetriNet_Name();

		/**
		 * The meta object literal for the '{@link petriNet.TypeArc <em>Type Arc</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see petriNet.TypeArc
		 * @see petriNet.impl.PetriNetPackageImpl#getTypeArc()
		 * @generated
		 */
		EEnum TYPE_ARC = eINSTANCE.getTypeArc();

	}

} //PetriNetPackage
