/*
  $Id$

  Copyright (C) 2003-2014 Virginia Tech.
  All rights reserved.

  SEE LICENSE FOR MORE INFORMATION

  Author:  Middleware Services
  Email:   middleware@vt.edu
  Version: $Revision$
  Updated: $Date$
*/
package org.ldaptive.extended;

/**
 * Marker interface for ldap extended responses.
 *
 * @param  <T>  type of response value
 *
 * @author  Middleware Services
 * @version  $Revision: 2885 $ $Date: 2014-02-05 16:28:49 -0500 (Wed, 05 Feb 2014) $
 */
public interface ExtendedResponse<T>
{


  /**
   * Returns the OID for this extended response. Response OIDs are optional and
   * this value may be null.
   *
   * @return  oid
   */
  String getOID();


  /**
   * Initializes this response with the supplied BER encoded data.
   *
   * @param  encoded  BER encoded response
   */
  void decode(byte[] encoded);


  /**
   * Returns the response value associated with this extended operation or null
   * if no value was generated by this operation.
   *
   * @return  response value
   */
  T getValue();
}