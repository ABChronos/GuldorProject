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
package fr.nantes.univ.alma.mean.impl;

import fr.nantes.univ.alma.mean.Application;
import fr.nantes.univ.alma.mean.Entity;
import fr.nantes.univ.alma.mean.MeanPackage;

import fr.nantes.univ.alma.mean.Module;
import fr.nantes.univ.alma.mean.Server;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Application</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.nantes.univ.alma.mean.impl.ApplicationImpl#getName <em>Name</em>}</li>
 *   <li>{@link fr.nantes.univ.alma.mean.impl.ApplicationImpl#getServer <em>Server</em>}</li>
 *   <li>{@link fr.nantes.univ.alma.mean.impl.ApplicationImpl#getModule <em>Module</em>}</li>
 *   <li>{@link fr.nantes.univ.alma.mean.impl.ApplicationImpl#getEntities <em>Entities</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ApplicationImpl extends MinimalEObjectImpl.Container implements Application
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getServer() <em>Server</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getServer()
   * @generated
   * @ordered
   */
  protected Server server;

  /**
   * The cached value of the '{@link #getModule() <em>Module</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModule()
   * @generated
   * @ordered
   */
  protected Module module;

  /**
   * The cached value of the '{@link #getEntities() <em>Entities</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEntities()
   * @generated
   * @ordered
   */
  protected EList<Entity> entities;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ApplicationImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return MeanPackage.Literals.APPLICATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MeanPackage.APPLICATION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Server getServer()
  {
    return server;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetServer(Server newServer, NotificationChain msgs)
  {
    Server oldServer = server;
    server = newServer;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MeanPackage.APPLICATION__SERVER, oldServer, newServer);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setServer(Server newServer)
  {
    if (newServer != server)
    {
      NotificationChain msgs = null;
      if (server != null)
        msgs = ((InternalEObject)server).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MeanPackage.APPLICATION__SERVER, null, msgs);
      if (newServer != null)
        msgs = ((InternalEObject)newServer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MeanPackage.APPLICATION__SERVER, null, msgs);
      msgs = basicSetServer(newServer, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MeanPackage.APPLICATION__SERVER, newServer, newServer));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Module getModule()
  {
    return module;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetModule(Module newModule, NotificationChain msgs)
  {
    Module oldModule = module;
    module = newModule;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MeanPackage.APPLICATION__MODULE, oldModule, newModule);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setModule(Module newModule)
  {
    if (newModule != module)
    {
      NotificationChain msgs = null;
      if (module != null)
        msgs = ((InternalEObject)module).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MeanPackage.APPLICATION__MODULE, null, msgs);
      if (newModule != null)
        msgs = ((InternalEObject)newModule).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MeanPackage.APPLICATION__MODULE, null, msgs);
      msgs = basicSetModule(newModule, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MeanPackage.APPLICATION__MODULE, newModule, newModule));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Entity> getEntities()
  {
    if (entities == null)
    {
      entities = new EObjectContainmentEList<Entity>(Entity.class, this, MeanPackage.APPLICATION__ENTITIES);
    }
    return entities;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case MeanPackage.APPLICATION__SERVER:
        return basicSetServer(null, msgs);
      case MeanPackage.APPLICATION__MODULE:
        return basicSetModule(null, msgs);
      case MeanPackage.APPLICATION__ENTITIES:
        return ((InternalEList<?>)getEntities()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case MeanPackage.APPLICATION__NAME:
        return getName();
      case MeanPackage.APPLICATION__SERVER:
        return getServer();
      case MeanPackage.APPLICATION__MODULE:
        return getModule();
      case MeanPackage.APPLICATION__ENTITIES:
        return getEntities();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MeanPackage.APPLICATION__NAME:
        setName((String)newValue);
        return;
      case MeanPackage.APPLICATION__SERVER:
        setServer((Server)newValue);
        return;
      case MeanPackage.APPLICATION__MODULE:
        setModule((Module)newValue);
        return;
      case MeanPackage.APPLICATION__ENTITIES:
        getEntities().clear();
        getEntities().addAll((Collection<? extends Entity>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case MeanPackage.APPLICATION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case MeanPackage.APPLICATION__SERVER:
        setServer((Server)null);
        return;
      case MeanPackage.APPLICATION__MODULE:
        setModule((Module)null);
        return;
      case MeanPackage.APPLICATION__ENTITIES:
        getEntities().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case MeanPackage.APPLICATION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case MeanPackage.APPLICATION__SERVER:
        return server != null;
      case MeanPackage.APPLICATION__MODULE:
        return module != null;
      case MeanPackage.APPLICATION__ENTITIES:
        return entities != null && !entities.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //ApplicationImpl
