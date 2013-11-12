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
package fr.nantes.univ.alma.mean;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see fr.nantes.univ.alma.mean.MeanFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel basePackage='fr.nantes.univ.alma' editDirectory='/fr.nantes.univ.alma.mean.edit/src-gen' editorDirectory='/fr.nantes.univ.alma.mean.editor/src-gen' fileExtensions='mean' copyrightText='Copyright (c) 2013 Sciences and Technology University of Nantes.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nContributors:\n    InsertYourNameHere - initial API and implementation'"
 * @generated
 */
public interface MeanPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "mean";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.univ-nantes.fr/alma/MEAN/v1.0";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "mean";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  MeanPackage eINSTANCE = fr.nantes.univ.alma.mean.impl.MeanPackageImpl.init();

  /**
   * The meta object id for the '{@link fr.nantes.univ.alma.mean.impl.ApplicationImpl <em>Application</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.nantes.univ.alma.mean.impl.ApplicationImpl
   * @see fr.nantes.univ.alma.mean.impl.MeanPackageImpl#getApplication()
   * @generated
   */
  int APPLICATION = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION__NAME = 0;

  /**
   * The feature id for the '<em><b>Server</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION__SERVER = 1;

  /**
   * The feature id for the '<em><b>Module</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION__MODULE = 2;

  /**
   * The feature id for the '<em><b>Entities</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION__ENTITIES = 3;

  /**
   * The number of structural features of the '<em>Application</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION_FEATURE_COUNT = 4;

  /**
   * The number of operations of the '<em>Application</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION_OPERATION_COUNT = 0;


  /**
   * The meta object id for the '{@link fr.nantes.univ.alma.mean.impl.ServerImpl <em>Server</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.nantes.univ.alma.mean.impl.ServerImpl
   * @see fr.nantes.univ.alma.mean.impl.MeanPackageImpl#getServer()
   * @generated
   */
  int SERVER = 1;

  /**
   * The feature id for the '<em><b>Port</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVER__PORT = 0;

  /**
   * The number of structural features of the '<em>Server</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVER_FEATURE_COUNT = 1;

  /**
   * The number of operations of the '<em>Server</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVER_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link fr.nantes.univ.alma.mean.impl.ModuleImpl <em>Module</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.nantes.univ.alma.mean.impl.ModuleImpl
   * @see fr.nantes.univ.alma.mean.impl.MeanPackageImpl#getModule()
   * @generated
   */
  int MODULE = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE__NAME = 0;

  /**
   * The feature id for the '<em><b>Views</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE__VIEWS = 1;

  /**
   * The number of structural features of the '<em>Module</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE_FEATURE_COUNT = 2;

  /**
   * The number of operations of the '<em>Module</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link fr.nantes.univ.alma.mean.impl.EntityImpl <em>Entity</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.nantes.univ.alma.mean.impl.EntityImpl
   * @see fr.nantes.univ.alma.mean.impl.MeanPackageImpl#getEntity()
   * @generated
   */
  int ENTITY = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__NAME = 0;

  /**
   * The feature id for the '<em><b>Properties</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__PROPERTIES = 1;

  /**
   * The number of structural features of the '<em>Entity</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_FEATURE_COUNT = 2;

  /**
   * The number of operations of the '<em>Entity</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link fr.nantes.univ.alma.mean.impl.PropertyImpl <em>Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.nantes.univ.alma.mean.impl.PropertyImpl
   * @see fr.nantes.univ.alma.mean.impl.MeanPackageImpl#getProperty()
   * @generated
   */
  int PROPERTY = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY__NAME = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY__TYPE = 1;

  /**
   * The number of structural features of the '<em>Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_FEATURE_COUNT = 2;

  /**
   * The number of operations of the '<em>Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link fr.nantes.univ.alma.mean.impl.ViewImpl <em>View</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.nantes.univ.alma.mean.impl.ViewImpl
   * @see fr.nantes.univ.alma.mean.impl.MeanPackageImpl#getView()
   * @generated
   */
  int VIEW = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW__NAME = 0;

  /**
   * The number of structural features of the '<em>View</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW_FEATURE_COUNT = 1;

  /**
   * The number of operations of the '<em>View</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW_OPERATION_COUNT = 0;


  /**
   * Returns the meta object for class '{@link fr.nantes.univ.alma.mean.Application <em>Application</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Application</em>'.
   * @see fr.nantes.univ.alma.mean.Application
   * @generated
   */
  EClass getApplication();

  /**
   * Returns the meta object for the attribute '{@link fr.nantes.univ.alma.mean.Application#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see fr.nantes.univ.alma.mean.Application#getName()
   * @see #getApplication()
   * @generated
   */
  EAttribute getApplication_Name();

  /**
   * Returns the meta object for the containment reference '{@link fr.nantes.univ.alma.mean.Application#getServer <em>Server</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Server</em>'.
   * @see fr.nantes.univ.alma.mean.Application#getServer()
   * @see #getApplication()
   * @generated
   */
  EReference getApplication_Server();

  /**
   * Returns the meta object for the containment reference '{@link fr.nantes.univ.alma.mean.Application#getModule <em>Module</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Module</em>'.
   * @see fr.nantes.univ.alma.mean.Application#getModule()
   * @see #getApplication()
   * @generated
   */
  EReference getApplication_Module();

  /**
   * Returns the meta object for the containment reference list '{@link fr.nantes.univ.alma.mean.Application#getEntities <em>Entities</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Entities</em>'.
   * @see fr.nantes.univ.alma.mean.Application#getEntities()
   * @see #getApplication()
   * @generated
   */
  EReference getApplication_Entities();

  /**
   * Returns the meta object for class '{@link fr.nantes.univ.alma.mean.Server <em>Server</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Server</em>'.
   * @see fr.nantes.univ.alma.mean.Server
   * @generated
   */
  EClass getServer();

  /**
   * Returns the meta object for the attribute '{@link fr.nantes.univ.alma.mean.Server#getPort <em>Port</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Port</em>'.
   * @see fr.nantes.univ.alma.mean.Server#getPort()
   * @see #getServer()
   * @generated
   */
  EAttribute getServer_Port();

  /**
   * Returns the meta object for class '{@link fr.nantes.univ.alma.mean.Module <em>Module</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Module</em>'.
   * @see fr.nantes.univ.alma.mean.Module
   * @generated
   */
  EClass getModule();

  /**
   * Returns the meta object for the attribute '{@link fr.nantes.univ.alma.mean.Module#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see fr.nantes.univ.alma.mean.Module#getName()
   * @see #getModule()
   * @generated
   */
  EAttribute getModule_Name();

  /**
   * Returns the meta object for the containment reference list '{@link fr.nantes.univ.alma.mean.Module#getViews <em>Views</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Views</em>'.
   * @see fr.nantes.univ.alma.mean.Module#getViews()
   * @see #getModule()
   * @generated
   */
  EReference getModule_Views();

  /**
   * Returns the meta object for class '{@link fr.nantes.univ.alma.mean.Entity <em>Entity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Entity</em>'.
   * @see fr.nantes.univ.alma.mean.Entity
   * @generated
   */
  EClass getEntity();

  /**
   * Returns the meta object for the attribute '{@link fr.nantes.univ.alma.mean.Entity#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see fr.nantes.univ.alma.mean.Entity#getName()
   * @see #getEntity()
   * @generated
   */
  EAttribute getEntity_Name();

  /**
   * Returns the meta object for the containment reference list '{@link fr.nantes.univ.alma.mean.Entity#getProperties <em>Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Properties</em>'.
   * @see fr.nantes.univ.alma.mean.Entity#getProperties()
   * @see #getEntity()
   * @generated
   */
  EReference getEntity_Properties();

  /**
   * Returns the meta object for class '{@link fr.nantes.univ.alma.mean.Property <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Property</em>'.
   * @see fr.nantes.univ.alma.mean.Property
   * @generated
   */
  EClass getProperty();

  /**
   * Returns the meta object for the attribute '{@link fr.nantes.univ.alma.mean.Property#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see fr.nantes.univ.alma.mean.Property#getName()
   * @see #getProperty()
   * @generated
   */
  EAttribute getProperty_Name();

  /**
   * Returns the meta object for the attribute '{@link fr.nantes.univ.alma.mean.Property#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see fr.nantes.univ.alma.mean.Property#getType()
   * @see #getProperty()
   * @generated
   */
  EAttribute getProperty_Type();

  /**
   * Returns the meta object for class '{@link fr.nantes.univ.alma.mean.View <em>View</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>View</em>'.
   * @see fr.nantes.univ.alma.mean.View
   * @generated
   */
  EClass getView();

  /**
   * Returns the meta object for the attribute '{@link fr.nantes.univ.alma.mean.View#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see fr.nantes.univ.alma.mean.View#getName()
   * @see #getView()
   * @generated
   */
  EAttribute getView_Name();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  MeanFactory getMeanFactory();

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
  interface Literals
  {
    /**
     * The meta object literal for the '{@link fr.nantes.univ.alma.mean.impl.ApplicationImpl <em>Application</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.nantes.univ.alma.mean.impl.ApplicationImpl
     * @see fr.nantes.univ.alma.mean.impl.MeanPackageImpl#getApplication()
     * @generated
     */
    EClass APPLICATION = eINSTANCE.getApplication();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute APPLICATION__NAME = eINSTANCE.getApplication_Name();

    /**
     * The meta object literal for the '<em><b>Server</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference APPLICATION__SERVER = eINSTANCE.getApplication_Server();

    /**
     * The meta object literal for the '<em><b>Module</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference APPLICATION__MODULE = eINSTANCE.getApplication_Module();

    /**
     * The meta object literal for the '<em><b>Entities</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference APPLICATION__ENTITIES = eINSTANCE.getApplication_Entities();

    /**
     * The meta object literal for the '{@link fr.nantes.univ.alma.mean.impl.ServerImpl <em>Server</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.nantes.univ.alma.mean.impl.ServerImpl
     * @see fr.nantes.univ.alma.mean.impl.MeanPackageImpl#getServer()
     * @generated
     */
    EClass SERVER = eINSTANCE.getServer();

    /**
     * The meta object literal for the '<em><b>Port</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SERVER__PORT = eINSTANCE.getServer_Port();

    /**
     * The meta object literal for the '{@link fr.nantes.univ.alma.mean.impl.ModuleImpl <em>Module</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.nantes.univ.alma.mean.impl.ModuleImpl
     * @see fr.nantes.univ.alma.mean.impl.MeanPackageImpl#getModule()
     * @generated
     */
    EClass MODULE = eINSTANCE.getModule();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MODULE__NAME = eINSTANCE.getModule_Name();

    /**
     * The meta object literal for the '<em><b>Views</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODULE__VIEWS = eINSTANCE.getModule_Views();

    /**
     * The meta object literal for the '{@link fr.nantes.univ.alma.mean.impl.EntityImpl <em>Entity</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.nantes.univ.alma.mean.impl.EntityImpl
     * @see fr.nantes.univ.alma.mean.impl.MeanPackageImpl#getEntity()
     * @generated
     */
    EClass ENTITY = eINSTANCE.getEntity();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENTITY__NAME = eINSTANCE.getEntity_Name();

    /**
     * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENTITY__PROPERTIES = eINSTANCE.getEntity_Properties();

    /**
     * The meta object literal for the '{@link fr.nantes.univ.alma.mean.impl.PropertyImpl <em>Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.nantes.univ.alma.mean.impl.PropertyImpl
     * @see fr.nantes.univ.alma.mean.impl.MeanPackageImpl#getProperty()
     * @generated
     */
    EClass PROPERTY = eINSTANCE.getProperty();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROPERTY__NAME = eINSTANCE.getProperty_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROPERTY__TYPE = eINSTANCE.getProperty_Type();

    /**
     * The meta object literal for the '{@link fr.nantes.univ.alma.mean.impl.ViewImpl <em>View</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.nantes.univ.alma.mean.impl.ViewImpl
     * @see fr.nantes.univ.alma.mean.impl.MeanPackageImpl#getView()
     * @generated
     */
    EClass VIEW = eINSTANCE.getView();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VIEW__NAME = eINSTANCE.getView_Name();

  }

} //MeanPackage
