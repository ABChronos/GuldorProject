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
 * A representation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.nantes.univ.alma.mean.Entity#getName <em>Name</em>}</li>
 *   <li>{@link fr.nantes.univ.alma.mean.Entity#getProperties <em>Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.nantes.univ.alma.mean.MeanPackage#getEntity()
 * @model
 * @generated
 */
public interface Entity extends EObject
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
   * @see fr.nantes.univ.alma.mean.MeanPackage#getEntity_Name()
   * @model unique="false"
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link fr.nantes.univ.alma.mean.Entity#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
   * The list contents are of type {@link fr.nantes.univ.alma.mean.Property}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Properties</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Properties</em>' containment reference list.
   * @see fr.nantes.univ.alma.mean.MeanPackage#getEntity_Properties()
   * @model containment="true"
   * @generated
   */
  EList<Property> getProperties();

} // Entity
