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

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Application</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.nantes.univ.alma.mean.Application#getName <em>Name</em>}</li>
 *   <li>{@link fr.nantes.univ.alma.mean.Application#getServer <em>Server</em>}</li>
 *   <li>{@link fr.nantes.univ.alma.mean.Application#getModule <em>Module</em>}</li>
 *   <li>{@link fr.nantes.univ.alma.mean.Application#getEntities <em>Entities</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.nantes.univ.alma.mean.MeanPackage#getApplication()
 * @model
 * @generated
 */
public interface Application extends EObject
{
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
   * @see fr.nantes.univ.alma.mean.MeanPackage#getApplication_Name()
   * @model unique="false"
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link fr.nantes.univ.alma.mean.Application#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Server</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Server</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Server</em>' containment reference.
   * @see #setServer(Server)
   * @see fr.nantes.univ.alma.mean.MeanPackage#getApplication_Server()
   * @model containment="true"
   * @generated
   */
  Server getServer();

  /**
   * Sets the value of the '{@link fr.nantes.univ.alma.mean.Application#getServer <em>Server</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Server</em>' containment reference.
   * @see #getServer()
   * @generated
   */
  void setServer(Server value);

  /**
   * Returns the value of the '<em><b>Module</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Module</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Module</em>' containment reference.
   * @see #setModule(Module)
   * @see fr.nantes.univ.alma.mean.MeanPackage#getApplication_Module()
   * @model containment="true"
   * @generated
   */
  Module getModule();

  /**
   * Sets the value of the '{@link fr.nantes.univ.alma.mean.Application#getModule <em>Module</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Module</em>' containment reference.
   * @see #getModule()
   * @generated
   */
  void setModule(Module value);

  /**
   * Returns the value of the '<em><b>Entities</b></em>' containment reference list.
   * The list contents are of type {@link fr.nantes.univ.alma.mean.Entity}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Entities</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Entities</em>' containment reference list.
   * @see fr.nantes.univ.alma.mean.MeanPackage#getApplication_Entities()
   * @model containment="true"
   * @generated
   */
  EList<Entity> getEntities();

} // Application
