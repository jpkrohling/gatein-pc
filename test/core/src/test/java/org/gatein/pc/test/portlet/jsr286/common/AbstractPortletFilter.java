/******************************************************************************
 * JBoss, a division of Red Hat                                               *
 * Copyright 2006, Red Hat Middleware, LLC, and individual                    *
 * contributors as indicated by the @authors tag. See the                     *
 * copyright.txt in the distribution for a full listing of                    *
 * individual contributors.                                                   *
 *                                                                            *
 * This is free software; you can redistribute it and/or modify it            *
 * under the terms of the GNU Lesser General Public License as                *
 * published by the Free Software Foundation; either version 2.1 of           *
 * the License, or (at your option) any later version.                        *
 *                                                                            *
 * This software is distributed in the hope that it will be useful,           *
 * but WITHOUT ANY WARRANTY; without even the implied warranty of             *
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU           *
 * Lesser General Public License for more details.                            *
 *                                                                            *
 * You should have received a copy of the GNU Lesser General Public           *
 * License along with this software; if not, write to the Free                *
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA         *
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.                   *
 ******************************************************************************/
package org.gatein.pc.test.portlet.jsr286.common;

import javax.portlet.filter.FilterConfig;
import javax.portlet.filter.FilterChain;
import javax.portlet.filter.PortletFilter;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.EventRequest;
import javax.portlet.EventResponse;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;
import java.io.IOException;

/**
 * @author <a href="mailto:julien@jboss.org">Julien Viet</a>
 * @version $Revision: 630 $
 */
public abstract class AbstractPortletFilter implements PortletFilter
{

   /** . */
   private FilterConfig config;

   public void init(FilterConfig config) throws PortletException
   {
      this.config = config;
   }

   public void destroy()
   {
      this.config = null;
   }

   protected FilterConfig getConfig()
   {
      return config;
   }

   protected String getName()
   {
      if (config != null)
      {
         return config.getFilterName();
      }
      else
      {
         return null;
      }
   }

   public void doFilter(ActionRequest req, ActionResponse resp, FilterChain chain) throws IOException, PortletException
   {
      chain.doFilter(req, resp);
   }

   public void doFilter(EventRequest req, EventResponse resp, FilterChain chain) throws IOException, PortletException
   {
      chain.doFilter(req, resp);
   }

   public void doFilter(RenderRequest req, RenderResponse resp, FilterChain chain) throws IOException, PortletException
   {
      chain.doFilter(req, resp);
   }

   public void doFilter(ResourceRequest req, ResourceResponse resp, FilterChain chain) throws IOException, PortletException
   {
      chain.doFilter(req, resp);
   }
}
