/*
 * Copyright (C) 2005-2007 Alfresco Software Limited.
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.

 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.

 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301, USA.

 * As a special exception to the terms and conditions of version 2.0 of 
 * the GPL, you may redistribute this Program in connection with Free/Libre 
 * and Open Source Software ("FLOSS") applications as described in Alfresco's 
 * FLOSS exception.  You should have received a copy of the text describing 
 * the FLOSS exception, and it is also available here: 
 * http://www.alfresco.com/legal/licensing"
 */
package org.alfresco.repo.security.authentication;

/**
 * Implementations of this interface generate a user name
 * 
 * @author glen johnson at Alfresco dot com
 */
public interface UserNameGenerator
{
    /**
     * Returns a generated user name.
     * 
     * A seed value of 0 means first attempt.   A non zero seed value indicates that the obvious user name is already taken 
     * and that some random element needs to be added to make a unique user id. 
     * 
     * @param firstName the given name of the new user
     * @param lastName the family name of the new user
     * @param emailAddress the email address of the new user
     * @param seed a seed for user name generation, the value 0 means "no seed"
     * 
     * @return the generated user name
     */
    public String generateUserName(String firstName, String lastName, String emailAddress, int seed);
}
