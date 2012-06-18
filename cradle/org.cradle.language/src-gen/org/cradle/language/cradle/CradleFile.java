/**
 */
package org.cradle.language.cradle;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>File</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.cradle.language.cradle.CradleFile#getImports <em>Imports</em>}</li>
 *   <li>{@link org.cradle.language.cradle.CradleFile#getDeclarations <em>Declarations</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.cradle.language.cradle.CradlePackage#getCradleFile()
 * @model
 * @generated
 */
public interface CradleFile extends EObject
{
  /**
   * Returns the value of the '<em><b>Imports</b></em>' containment reference list.
   * The list contents are of type {@link org.cradle.language.cradle.ImportDeclaration}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Imports</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Imports</em>' containment reference list.
   * @see org.cradle.language.cradle.CradlePackage#getCradleFile_Imports()
   * @model containment="true"
   * @generated
   */
  EList<ImportDeclaration> getImports();

  /**
   * Returns the value of the '<em><b>Declarations</b></em>' containment reference list.
   * The list contents are of type {@link org.cradle.language.cradle.Declaration}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Declarations</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Declarations</em>' containment reference list.
   * @see org.cradle.language.cradle.CradlePackage#getCradleFile_Declarations()
   * @model containment="true"
   * @generated
   */
  EList<Declaration> getDeclarations();

} // CradleFile
