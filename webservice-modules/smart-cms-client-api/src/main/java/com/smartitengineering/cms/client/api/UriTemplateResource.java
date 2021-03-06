/*
 *
 * This is a simple Content Management System (CMS)
 * Copyright (C) 2010  Imran M Yousuf (imyousuf@smartitengineering.com)
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.smartitengineering.cms.client.api;

import com.smartitengineering.util.opensearch.api.OpenSearchDescriptor;
import com.smartitengineering.util.rest.client.Resource;

/**
 *
 * @author imyousuf
 */
public interface UriTemplateResource extends Resource<OpenSearchDescriptor> {

  WorkspaceFeedResource getWorkspaceResource(String workspaceNS, String workspaceId);

  ContentTypeFeedResource getContentTypeResource(String workspaceNS, String workspaceId, String typeNS, String typeId);

  FriendlyContentTypeResource getFriendlyContentTypeResource(String workspaceNS, String workspaceId,
                                                             String friendlyWorkspaceNS, String friendlyWorkspaceId,
                                                             String friendlyTypeNS, String friendlyTypeId);

  ContentResource getContentResource(String workspaceNS, String workspaceId, String contentId);
}
