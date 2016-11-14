/**
 * generated by Xtext 2.10.0
 */
package hu.bme.aut.menetrend.menetrend.impl;

import hu.bme.aut.menetrend.menetrend.AbsoluteSchedule;
import hu.bme.aut.menetrend.menetrend.ComplexTimeEnd;
import hu.bme.aut.menetrend.menetrend.ComplexTimeMiddle;
import hu.bme.aut.menetrend.menetrend.DayType;
import hu.bme.aut.menetrend.menetrend.Departure;
import hu.bme.aut.menetrend.menetrend.LineNumber;
import hu.bme.aut.menetrend.menetrend.MenetrendFactory;
import hu.bme.aut.menetrend.menetrend.MenetrendPackage;
import hu.bme.aut.menetrend.menetrend.Model;
import hu.bme.aut.menetrend.menetrend.RelativeSchedule;
import hu.bme.aut.menetrend.menetrend.RelativeTarget;
import hu.bme.aut.menetrend.menetrend.Schedule;
import hu.bme.aut.menetrend.menetrend.SchedulePart;
import hu.bme.aut.menetrend.menetrend.SimpleTimeFormat;
import hu.bme.aut.menetrend.menetrend.Stop;
import hu.bme.aut.menetrend.menetrend.TransportType;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MenetrendPackageImpl extends EPackageImpl implements MenetrendPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass modelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass scheduleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass lineNumberEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass schedulePartEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass relativeScheduleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass relativeTargetEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass absoluteScheduleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass departureEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass simpleTimeFormatEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass complexTimeMiddleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass complexTimeEndEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass stopEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum transportTypeEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum dayTypeEEnum = null;

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
   * @see hu.bme.aut.menetrend.menetrend.MenetrendPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private MenetrendPackageImpl()
  {
    super(eNS_URI, MenetrendFactory.eINSTANCE);
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
   * <p>This method is used to initialize {@link MenetrendPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static MenetrendPackage init()
  {
    if (isInited) return (MenetrendPackage)EPackage.Registry.INSTANCE.getEPackage(MenetrendPackage.eNS_URI);

    // Obtain or create and register package
    MenetrendPackageImpl theMenetrendPackage = (MenetrendPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof MenetrendPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new MenetrendPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theMenetrendPackage.createPackageContents();

    // Initialize created meta-data
    theMenetrendPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theMenetrendPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(MenetrendPackage.eNS_URI, theMenetrendPackage);
    return theMenetrendPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getModel()
  {
    return modelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModel_Stops()
  {
    return (EReference)modelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModel_Schedules()
  {
    return (EReference)modelEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSchedule()
  {
    return scheduleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSchedule_LineNumber()
  {
    return (EReference)scheduleEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSchedule_ScheduleParts()
  {
    return (EReference)scheduleEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLineNumber()
  {
    return lineNumberEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLineNumber_Type()
  {
    return (EAttribute)lineNumberEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLineNumber_Number()
  {
    return (EAttribute)lineNumberEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSchedulePart()
  {
    return schedulePartEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRelativeSchedule()
  {
    return relativeScheduleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRelativeSchedule_Start()
  {
    return (EReference)relativeScheduleEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRelativeSchedule_Targets()
  {
    return (EReference)relativeScheduleEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRelativeTarget()
  {
    return relativeTargetEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRelativeTarget_Length()
  {
    return (EAttribute)relativeTargetEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRelativeTarget_Target()
  {
    return (EReference)relativeTargetEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAbsoluteSchedule()
  {
    return absoluteScheduleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAbsoluteSchedule_Daytype()
  {
    return (EAttribute)absoluteScheduleEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAbsoluteSchedule_Departures()
  {
    return (EReference)absoluteScheduleEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDeparture()
  {
    return departureEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDeparture_From()
  {
    return (EAttribute)departureEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSimpleTimeFormat()
  {
    return simpleTimeFormatEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getComplexTimeMiddle()
  {
    return complexTimeMiddleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getComplexTimeMiddle_Until()
  {
    return (EAttribute)complexTimeMiddleEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getComplexTimeMiddle_Frequency()
  {
    return (EAttribute)complexTimeMiddleEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getComplexTimeEnd()
  {
    return complexTimeEndEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getComplexTimeEnd_Frequency()
  {
    return (EAttribute)complexTimeEndEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getComplexTimeEnd_Until()
  {
    return (EAttribute)complexTimeEndEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStop()
  {
    return stopEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStop_Name()
  {
    return (EAttribute)stopEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getTransportType()
  {
    return transportTypeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getDayType()
  {
    return dayTypeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MenetrendFactory getMenetrendFactory()
  {
    return (MenetrendFactory)getEFactoryInstance();
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
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    modelEClass = createEClass(MODEL);
    createEReference(modelEClass, MODEL__STOPS);
    createEReference(modelEClass, MODEL__SCHEDULES);

    scheduleEClass = createEClass(SCHEDULE);
    createEReference(scheduleEClass, SCHEDULE__LINE_NUMBER);
    createEReference(scheduleEClass, SCHEDULE__SCHEDULE_PARTS);

    lineNumberEClass = createEClass(LINE_NUMBER);
    createEAttribute(lineNumberEClass, LINE_NUMBER__TYPE);
    createEAttribute(lineNumberEClass, LINE_NUMBER__NUMBER);

    schedulePartEClass = createEClass(SCHEDULE_PART);

    relativeScheduleEClass = createEClass(RELATIVE_SCHEDULE);
    createEReference(relativeScheduleEClass, RELATIVE_SCHEDULE__START);
    createEReference(relativeScheduleEClass, RELATIVE_SCHEDULE__TARGETS);

    relativeTargetEClass = createEClass(RELATIVE_TARGET);
    createEAttribute(relativeTargetEClass, RELATIVE_TARGET__LENGTH);
    createEReference(relativeTargetEClass, RELATIVE_TARGET__TARGET);

    absoluteScheduleEClass = createEClass(ABSOLUTE_SCHEDULE);
    createEAttribute(absoluteScheduleEClass, ABSOLUTE_SCHEDULE__DAYTYPE);
    createEReference(absoluteScheduleEClass, ABSOLUTE_SCHEDULE__DEPARTURES);

    departureEClass = createEClass(DEPARTURE);
    createEAttribute(departureEClass, DEPARTURE__FROM);

    simpleTimeFormatEClass = createEClass(SIMPLE_TIME_FORMAT);

    complexTimeMiddleEClass = createEClass(COMPLEX_TIME_MIDDLE);
    createEAttribute(complexTimeMiddleEClass, COMPLEX_TIME_MIDDLE__UNTIL);
    createEAttribute(complexTimeMiddleEClass, COMPLEX_TIME_MIDDLE__FREQUENCY);

    complexTimeEndEClass = createEClass(COMPLEX_TIME_END);
    createEAttribute(complexTimeEndEClass, COMPLEX_TIME_END__FREQUENCY);
    createEAttribute(complexTimeEndEClass, COMPLEX_TIME_END__UNTIL);

    stopEClass = createEClass(STOP);
    createEAttribute(stopEClass, STOP__NAME);

    // Create enums
    transportTypeEEnum = createEEnum(TRANSPORT_TYPE);
    dayTypeEEnum = createEEnum(DAY_TYPE);
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
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    relativeScheduleEClass.getESuperTypes().add(this.getSchedulePart());
    absoluteScheduleEClass.getESuperTypes().add(this.getSchedulePart());
    simpleTimeFormatEClass.getESuperTypes().add(this.getDeparture());
    complexTimeMiddleEClass.getESuperTypes().add(this.getDeparture());
    complexTimeEndEClass.getESuperTypes().add(this.getDeparture());

    // Initialize classes and features; add operations and parameters
    initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getModel_Stops(), this.getStop(), null, "stops", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModel_Schedules(), this.getSchedule(), null, "schedules", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(scheduleEClass, Schedule.class, "Schedule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSchedule_LineNumber(), this.getLineNumber(), null, "lineNumber", null, 0, 1, Schedule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSchedule_ScheduleParts(), this.getSchedulePart(), null, "scheduleParts", null, 0, -1, Schedule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(lineNumberEClass, LineNumber.class, "LineNumber", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getLineNumber_Type(), this.getTransportType(), "type", null, 0, 1, LineNumber.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLineNumber_Number(), ecorePackage.getEString(), "number", null, 0, 1, LineNumber.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(schedulePartEClass, SchedulePart.class, "SchedulePart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(relativeScheduleEClass, RelativeSchedule.class, "RelativeSchedule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRelativeSchedule_Start(), this.getStop(), null, "start", null, 0, 1, RelativeSchedule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRelativeSchedule_Targets(), this.getRelativeTarget(), null, "targets", null, 0, -1, RelativeSchedule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(relativeTargetEClass, RelativeTarget.class, "RelativeTarget", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRelativeTarget_Length(), ecorePackage.getEInt(), "length", null, 0, 1, RelativeTarget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRelativeTarget_Target(), this.getStop(), null, "target", null, 0, 1, RelativeTarget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(absoluteScheduleEClass, AbsoluteSchedule.class, "AbsoluteSchedule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAbsoluteSchedule_Daytype(), this.getDayType(), "daytype", null, 0, 1, AbsoluteSchedule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAbsoluteSchedule_Departures(), this.getDeparture(), null, "departures", null, 0, -1, AbsoluteSchedule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(departureEClass, Departure.class, "Departure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDeparture_From(), ecorePackage.getEString(), "from", null, 0, 1, Departure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(simpleTimeFormatEClass, SimpleTimeFormat.class, "SimpleTimeFormat", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(complexTimeMiddleEClass, ComplexTimeMiddle.class, "ComplexTimeMiddle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getComplexTimeMiddle_Until(), ecorePackage.getEString(), "until", null, 0, 1, ComplexTimeMiddle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getComplexTimeMiddle_Frequency(), ecorePackage.getEInt(), "frequency", null, 0, 1, ComplexTimeMiddle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(complexTimeEndEClass, ComplexTimeEnd.class, "ComplexTimeEnd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getComplexTimeEnd_Frequency(), ecorePackage.getEInt(), "frequency", null, 0, 1, ComplexTimeEnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getComplexTimeEnd_Until(), ecorePackage.getEString(), "until", null, 0, 1, ComplexTimeEnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(stopEClass, Stop.class, "Stop", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getStop_Name(), ecorePackage.getEString(), "name", null, 0, 1, Stop.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(transportTypeEEnum, TransportType.class, "TransportType");
    addEEnumLiteral(transportTypeEEnum, TransportType.BUS);
    addEEnumLiteral(transportTypeEEnum, TransportType.TRAM);
    addEEnumLiteral(transportTypeEEnum, TransportType.METRO);
    addEEnumLiteral(transportTypeEEnum, TransportType.TROLI);
    addEEnumLiteral(transportTypeEEnum, TransportType.HEV);

    initEEnum(dayTypeEEnum, DayType.class, "DayType");
    addEEnumLiteral(dayTypeEEnum, DayType.WEEKDAYS);
    addEEnumLiteral(dayTypeEEnum, DayType.WEEKENDS);
    addEEnumLiteral(dayTypeEEnum, DayType.MONDAY);
    addEEnumLiteral(dayTypeEEnum, DayType.TUESDAY);
    addEEnumLiteral(dayTypeEEnum, DayType.WEDNESDAY);
    addEEnumLiteral(dayTypeEEnum, DayType.THURSDAY);
    addEEnumLiteral(dayTypeEEnum, DayType.FRIDAY);
    addEEnumLiteral(dayTypeEEnum, DayType.SATURDAY);
    addEEnumLiteral(dayTypeEEnum, DayType.SUNDAY);

    // Create resource
    createResource(eNS_URI);
  }

} //MenetrendPackageImpl