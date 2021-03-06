/*
 * Copyright (C) 2020 Mathias Åhsberg
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 *
 */
package com.sonarsource.sonarqube.plugin.ce.pullrequest.bitbucket.client.model.server;

import java.io.Serializable;
import java.util.Collections;
import java.util.Set;

public class CreateAnnotationsRequest implements Serializable {
    private final Set<Annotation> annotations;

    public CreateAnnotationsRequest(Set<Annotation> annotations) {
        this.annotations = annotations == null ? Collections.emptySet() : annotations;
    }

    public Set<Annotation> getAnnotations() {
        return annotations;
    }
}
