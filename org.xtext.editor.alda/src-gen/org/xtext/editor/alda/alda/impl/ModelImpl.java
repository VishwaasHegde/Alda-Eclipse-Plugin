/**
 * generated by Xtext 2.10.0
 */
package org.xtext.editor.alda.alda.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.editor.alda.alda.AldaPackage;
import org.xtext.editor.alda.alda.DECLRATIONS;
import org.xtext.editor.alda.alda.INSTRUMENTS;
import org.xtext.editor.alda.alda.Model;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.editor.alda.alda.impl.ModelImpl#getDeclarations <em>Declarations</em>}</li>
 *   <li>{@link org.xtext.editor.alda.alda.impl.ModelImpl#getInstruments <em>Instruments</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModelImpl extends MinimalEObjectImpl.Container implements Model
{
  /**
   * The cached value of the '{@link #getDeclarations() <em>Declarations</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDeclarations()
   * @generated
   * @ordered
   */
  protected EList<DECLRATIONS> declarations;

  /**
   * The cached value of the '{@link #getInstruments() <em>Instruments</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInstruments()
   * @generated
   * @ordered
   */
  protected EList<INSTRUMENTS> instruments;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ModelImpl()
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
    return AldaPackage.Literals.MODEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<DECLRATIONS> getDeclarations()
  {
    if (declarations == null)
    {
      declarations = new EObjectContainmentEList<DECLRATIONS>(DECLRATIONS.class, this, AldaPackage.MODEL__DECLARATIONS);
    }
    return declarations;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<INSTRUMENTS> getInstruments()
  {
    if (instruments == null)
    {
      instruments = new EObjectContainmentEList<INSTRUMENTS>(INSTRUMENTS.class, this, AldaPackage.MODEL__INSTRUMENTS);
    }
    return instruments;
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
      case AldaPackage.MODEL__DECLARATIONS:
        return ((InternalEList<?>)getDeclarations()).basicRemove(otherEnd, msgs);
      case AldaPackage.MODEL__INSTRUMENTS:
        return ((InternalEList<?>)getInstruments()).basicRemove(otherEnd, msgs);
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
      case AldaPackage.MODEL__DECLARATIONS:
        return getDeclarations();
      case AldaPackage.MODEL__INSTRUMENTS:
        return getInstruments();
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
      case AldaPackage.MODEL__DECLARATIONS:
        getDeclarations().clear();
        getDeclarations().addAll((Collection<? extends DECLRATIONS>)newValue);
        return;
      case AldaPackage.MODEL__INSTRUMENTS:
        getInstruments().clear();
        getInstruments().addAll((Collection<? extends INSTRUMENTS>)newValue);
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
      case AldaPackage.MODEL__DECLARATIONS:
        getDeclarations().clear();
        return;
      case AldaPackage.MODEL__INSTRUMENTS:
        getInstruments().clear();
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
      case AldaPackage.MODEL__DECLARATIONS:
        return declarations != null && !declarations.isEmpty();
      case AldaPackage.MODEL__INSTRUMENTS:
        return instruments != null && !instruments.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ModelImpl