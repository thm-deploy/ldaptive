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
package org.ldaptive;

/**
 * Provides an interface for initializing connections after they are opened.
 *
 * @author  Middleware Services
 * @version  $Revision: 2885 $ $Date: 2014-02-05 16:28:49 -0500 (Wed, 05 Feb 2014) $
 */
public interface ConnectionInitializer
{


  /**
   * Initialize the supplied connection.
   *
   * @param  conn  connection to initialize
   *
   * @return  response associated with the initialization or an empty response
   *
   * @throws  LdapException  if initialization fails
   */
  Response<Void> initialize(Connection conn)
    throws LdapException;
}