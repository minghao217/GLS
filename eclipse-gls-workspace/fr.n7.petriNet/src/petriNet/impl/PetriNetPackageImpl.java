/**
 */
package petriNet.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import petriNet.Arc;
import petriNet.Noeud;
import petriNet.PetriNet;
import petriNet.PetriNetElt;
import petriNet.PetriNetFactory;
import petriNet.PetriNetPackage;
import petriNet.Place;
import petriNet.Transition;
import petriNet.TypeArc;

import petriNet.util.PetriNetValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PetriNetPackageImpl extends EPackageImpl implements PetriNetPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass placeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass noeudEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arcEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass petriNetEltEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass petriNetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum typeArcEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see petriNet.PetriNetPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PetriNetPackageImpl() {
		super(eNS_URI, PetriNetFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link PetriNetPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PetriNetPackage init() {
		if (isInited) return (PetriNetPackage)EPackage.Registry.INSTANCE.getEPackage(PetriNetPackage.eNS_URI);

		// Obtain or create and register package
		PetriNetPackageImpl thePetriNetPackage = (PetriNetPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof PetriNetPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new PetriNetPackageImpl());

		isInited = true;

		// Create package meta-data objects
		thePetriNetPackage.createPackageContents();

		// Initialize created meta-data
		thePetriNetPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(thePetriNetPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return PetriNetValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		thePetriNetPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PetriNetPackage.eNS_URI, thePetriNetPackage);
		return thePetriNetPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlace() {
		return placeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlace_Jeton() {
		return (EAttribute)placeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransition() {
		return transitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNoeud() {
		return noeudEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNoeud_Name() {
		return (EAttribute)noeudEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNoeud_NoeudsPredecesseurs() {
		return (EReference)noeudEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNoeud_NoeudsSuccesseurs() {
		return (EReference)noeudEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArc() {
		return arcEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArc_Predecesseur() {
		return (EReference)arcEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArc_Successeur() {
		return (EReference)arcEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArc_Poids() {
		return (EAttribute)arcEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArc_TypeArc() {
		return (EAttribute)arcEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPetriNetElt() {
		return petriNetEltEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPetriNetElt_Net() {
		return (EReference)petriNetEltEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPetriNet() {
		return petriNetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPetriNet_Petrinetelt() {
		return (EReference)petriNetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPetriNet_Name() {
		return (EAttribute)petriNetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTypeArc() {
		return typeArcEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PetriNetFactory getPetriNetFactory() {
		return (PetriNetFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		placeEClass = createEClass(PLACE);
		createEAttribute(placeEClass, PLACE__JETON);

		transitionEClass = createEClass(TRANSITION);

		noeudEClass = createEClass(NOEUD);
		createEAttribute(noeudEClass, NOEUD__NAME);
		createEReference(noeudEClass, NOEUD__NOEUDS_SUCCESSEURS);
		createEReference(noeudEClass, NOEUD__NOEUDS_PREDECESSEURS);

		arcEClass = createEClass(ARC);
		createEReference(arcEClass, ARC__PREDECESSEUR);
		createEReference(arcEClass, ARC__SUCCESSEUR);
		createEAttribute(arcEClass, ARC__POIDS);
		createEAttribute(arcEClass, ARC__TYPE_ARC);

		petriNetEltEClass = createEClass(PETRI_NET_ELT);
		createEReference(petriNetEltEClass, PETRI_NET_ELT__NET);

		petriNetEClass = createEClass(PETRI_NET);
		createEReference(petriNetEClass, PETRI_NET__PETRINETELT);
		createEAttribute(petriNetEClass, PETRI_NET__NAME);

		// Create enums
		typeArcEEnum = createEEnum(TYPE_ARC);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		placeEClass.getESuperTypes().add(this.getNoeud());
		transitionEClass.getESuperTypes().add(this.getNoeud());
		noeudEClass.getESuperTypes().add(this.getPetriNetElt());
		arcEClass.getESuperTypes().add(this.getPetriNetElt());

		// Initialize classes, features, and operations; add parameters
		initEClass(placeEClass, Place.class, "Place", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPlace_Jeton(), ecorePackage.getEInt(), "jeton", null, 1, 1, Place.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transitionEClass, Transition.class, "Transition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(noeudEClass, Noeud.class, "Noeud", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNoeud_Name(), ecorePackage.getEString(), "name", null, 1, 1, Noeud.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNoeud_NoeudsSuccesseurs(), this.getArc(), this.getArc_Predecesseur(), "noeudsSuccesseurs", null, 0, -1, Noeud.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNoeud_NoeudsPredecesseurs(), this.getArc(), this.getArc_Successeur(), "noeudsPredecesseurs", null, 0, -1, Noeud.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arcEClass, Arc.class, "Arc", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArc_Predecesseur(), this.getNoeud(), this.getNoeud_NoeudsSuccesseurs(), "predecesseur", null, 0, 1, Arc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArc_Successeur(), this.getNoeud(), this.getNoeud_NoeudsPredecesseurs(), "successeur", null, 0, 1, Arc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArc_Poids(), ecorePackage.getEInt(), "poids", null, 1, 1, Arc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArc_TypeArc(), this.getTypeArc(), "typeArc", null, 0, 1, Arc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(petriNetEltEClass, PetriNetElt.class, "PetriNetElt", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPetriNetElt_Net(), this.getPetriNet(), null, "net", null, 1, 1, PetriNetElt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(petriNetEClass, PetriNet.class, "PetriNet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPetriNet_Petrinetelt(), this.getPetriNetElt(), null, "petrinetelt", null, 0, -1, PetriNet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPetriNet_Name(), ecorePackage.getEString(), "name", null, 1, 1, PetriNet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(typeArcEEnum, TypeArc.class, "TypeArc");
		addEEnumLiteral(typeArcEEnum, TypeArc.ARC_SIMPLE);
		addEEnumLiteral(typeArcEEnum, TypeArc.READ_ARC);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/OCL/Import
		createImportAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
		createPivotAnnotations();
		// http://www.obeo.fr/dsl/dnc/archetype
		createArchetypeAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/OCL/Import</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createImportAnnotations() {
		String source = "http://www.eclipse.org/OCL/Import";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "ecore", "http://www.eclipse.org/emf/2002/Ecore"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "invocationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			 "settingDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			 "validationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot"
		   });	
		addAnnotation
		  (placeEClass, 
		   source, 
		   new String[] {
			 "constraints", "nombreJetonNonNul"
		   });	
		addAnnotation
		  (noeudEClass, 
		   source, 
		   new String[] {
			 "constraints", "noEmptyName"
		   });	
		addAnnotation
		  (arcEClass, 
		   source, 
		   new String[] {
			 "constraints", "poidsNonNul"
		   });	
		addAnnotation
		  (petriNetEClass, 
		   source, 
		   new String[] {
			 "constraints", "placeNoSameName transitionNoSameName notSameSuccessorPredecessor notPlaceToPlaceOrTransitionToTransition noEmptyName"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPivotAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot";	
		addAnnotation
		  (placeEClass, 
		   source, 
		   new String[] {
			 "nombreJetonNonNul", "jeton >= 0"
		   });	
		addAnnotation
		  (noeudEClass, 
		   source, 
		   new String[] {
			 "noEmptyName", "name.size() > 0"
		   });	
		addAnnotation
		  (arcEClass, 
		   source, 
		   new String[] {
			 "poidsNonNul", "poids > 0"
		   });	
		addAnnotation
		  (petriNetEClass, 
		   source, 
		   new String[] {
			 "placeNoSameName", "\n\t\t\t\tself.petrinetelt\n\t\t\t\t->select(e: PetriNetElt | e.oclIsKindOf(Place))\n\t\t\t\t->collect(e: PetriNetElt | e.oclAsType(Place))\n\t\t\t\t->forAll(w1, w2: Place | w1 = w2 or w1.name <> w2.name)",
			 "transitionNoSameName", "\n\t\t\t\tself.petrinetelt\n\t\t\t\t->select(e: PetriNetElt | e.oclIsKindOf(Transition))\n\t\t\t\t->collect(e: PetriNetElt | e.oclAsType(Transition))\n\t\t\t\t->forAll(w1, w2: Transition | w1 = w2 or w1.name <> w2.name)",
			 "notSameSuccessorPredecessor", "\n\t\t\t\tself.petrinetelt\n\t\t\t\t->select(e: PetriNetElt | e.oclIsKindOf(Arc))\n\t\t\t\t->collect(e: PetriNetElt | e.oclAsType(Arc))\n\t\t\t\t->forAll(a: Arc| a.successeur <> a.predecesseur )",
			 "notPlaceToPlaceOrTransitionToTransition", "\n\t\t\t\tself.petrinetelt\n\t\t\t\t->select(e: PetriNetElt | e.oclIsKindOf(Arc))\n\t\t\t\t->collect(e: PetriNetElt | e.oclAsType(Arc))\n\t\t\t\t->forAll(a: Arc| (a.successeur.oclIsTypeOf(Place) and a.predecesseur.oclIsTypeOf(Transition)) or (a.successeur.oclIsTypeOf(Transition) and a.predecesseur.oclIsTypeOf(Place) ) )",
			 "noEmptyName", "name.size() > 0"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.obeo.fr/dsl/dnc/archetype</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createArchetypeAnnotations() {
		String source = "http://www.obeo.fr/dsl/dnc/archetype";	
		addAnnotation
		  (petriNetEltEClass, 
		   source, 
		   new String[] {
			 "archetype", "Role"
		   });
	}

} //PetriNetPackageImpl
