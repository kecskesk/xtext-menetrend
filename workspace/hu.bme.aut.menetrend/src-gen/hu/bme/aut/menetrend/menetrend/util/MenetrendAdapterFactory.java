/**
 * generated by Xtext 2.10.0
 */
package hu.bme.aut.menetrend.menetrend.util;

import hu.bme.aut.menetrend.menetrend.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see hu.bme.aut.menetrend.menetrend.MenetrendPackage
 * @generated
 */
public class MenetrendAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static MenetrendPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MenetrendAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = MenetrendPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MenetrendSwitch<Adapter> modelSwitch =
    new MenetrendSwitch<Adapter>()
    {
      @Override
      public Adapter caseModel(Model object)
      {
        return createModelAdapter();
      }
      @Override
      public Adapter caseSchedule(Schedule object)
      {
        return createScheduleAdapter();
      }
      @Override
      public Adapter caseLineNumber(LineNumber object)
      {
        return createLineNumberAdapter();
      }
      @Override
      public Adapter caseSchedulePart(SchedulePart object)
      {
        return createSchedulePartAdapter();
      }
      @Override
      public Adapter caseRelativeSchedule(RelativeSchedule object)
      {
        return createRelativeScheduleAdapter();
      }
      @Override
      public Adapter caseRelativeTarget(RelativeTarget object)
      {
        return createRelativeTargetAdapter();
      }
      @Override
      public Adapter caseAbsoluteSchedule(AbsoluteSchedule object)
      {
        return createAbsoluteScheduleAdapter();
      }
      @Override
      public Adapter caseDeparture(Departure object)
      {
        return createDepartureAdapter();
      }
      @Override
      public Adapter caseSimpleTimeFormat(SimpleTimeFormat object)
      {
        return createSimpleTimeFormatAdapter();
      }
      @Override
      public Adapter caseComplexTimeMiddle(ComplexTimeMiddle object)
      {
        return createComplexTimeMiddleAdapter();
      }
      @Override
      public Adapter caseComplexTimeEnd(ComplexTimeEnd object)
      {
        return createComplexTimeEndAdapter();
      }
      @Override
      public Adapter caseStop(Stop object)
      {
        return createStopAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link hu.bme.aut.menetrend.menetrend.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.aut.menetrend.menetrend.Model
   * @generated
   */
  public Adapter createModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.aut.menetrend.menetrend.Schedule <em>Schedule</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.aut.menetrend.menetrend.Schedule
   * @generated
   */
  public Adapter createScheduleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.aut.menetrend.menetrend.LineNumber <em>Line Number</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.aut.menetrend.menetrend.LineNumber
   * @generated
   */
  public Adapter createLineNumberAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.aut.menetrend.menetrend.SchedulePart <em>Schedule Part</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.aut.menetrend.menetrend.SchedulePart
   * @generated
   */
  public Adapter createSchedulePartAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.aut.menetrend.menetrend.RelativeSchedule <em>Relative Schedule</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.aut.menetrend.menetrend.RelativeSchedule
   * @generated
   */
  public Adapter createRelativeScheduleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.aut.menetrend.menetrend.RelativeTarget <em>Relative Target</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.aut.menetrend.menetrend.RelativeTarget
   * @generated
   */
  public Adapter createRelativeTargetAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.aut.menetrend.menetrend.AbsoluteSchedule <em>Absolute Schedule</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.aut.menetrend.menetrend.AbsoluteSchedule
   * @generated
   */
  public Adapter createAbsoluteScheduleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.aut.menetrend.menetrend.Departure <em>Departure</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.aut.menetrend.menetrend.Departure
   * @generated
   */
  public Adapter createDepartureAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.aut.menetrend.menetrend.SimpleTimeFormat <em>Simple Time Format</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.aut.menetrend.menetrend.SimpleTimeFormat
   * @generated
   */
  public Adapter createSimpleTimeFormatAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.aut.menetrend.menetrend.ComplexTimeMiddle <em>Complex Time Middle</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.aut.menetrend.menetrend.ComplexTimeMiddle
   * @generated
   */
  public Adapter createComplexTimeMiddleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.aut.menetrend.menetrend.ComplexTimeEnd <em>Complex Time End</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.aut.menetrend.menetrend.ComplexTimeEnd
   * @generated
   */
  public Adapter createComplexTimeEndAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.bme.aut.menetrend.menetrend.Stop <em>Stop</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.bme.aut.menetrend.menetrend.Stop
   * @generated
   */
  public Adapter createStopAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //MenetrendAdapterFactory
