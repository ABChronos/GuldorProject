/**
 * Copyright (c) 2013 Sciences and Technology University of Nantes.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     InsertYourNameHere - initial API and implementation
 */
package fr.nantes.univ.alma.mean.util;

import fr.nantes.univ.alma.mean.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see fr.nantes.univ.alma.mean.MeanPackage
 * @generated
 */
public class MeanAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static MeanPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MeanAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = MeanPackage.eINSTANCE;
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
  protected MeanSwitch<Adapter> modelSwitch =
    new MeanSwitch<Adapter>()
    {
      @Override
      public Adapter caseApplication(Application object)
      {
        return createApplicationAdapter();
      }
      @Override
      public Adapter caseServer(Server object)
      {
        return createServerAdapter();
      }
      @Override
      public Adapter caseModule(Module object)
      {
        return createModuleAdapter();
      }
      @Override
      public Adapter caseEntity(Entity object)
      {
        return createEntityAdapter();
      }
      @Override
      public Adapter caseProperty(Property object)
      {
        return createPropertyAdapter();
      }
      @Override
      public Adapter caseView(View object)
      {
        return createViewAdapter();
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
   * Creates a new adapter for an object of class '{@link fr.nantes.univ.alma.mean.Application <em>Application</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.nantes.univ.alma.mean.Application
   * @generated
   */
  public Adapter createApplicationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.nantes.univ.alma.mean.Server <em>Server</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.nantes.univ.alma.mean.Server
   * @generated
   */
  public Adapter createServerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.nantes.univ.alma.mean.Module <em>Module</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.nantes.univ.alma.mean.Module
   * @generated
   */
  public Adapter createModuleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.nantes.univ.alma.mean.Entity <em>Entity</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.nantes.univ.alma.mean.Entity
   * @generated
   */
  public Adapter createEntityAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.nantes.univ.alma.mean.Property <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.nantes.univ.alma.mean.Property
   * @generated
   */
  public Adapter createPropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.nantes.univ.alma.mean.View <em>View</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.nantes.univ.alma.mean.View
   * @generated
   */
  public Adapter createViewAdapter()
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

} //MeanAdapterFactory
