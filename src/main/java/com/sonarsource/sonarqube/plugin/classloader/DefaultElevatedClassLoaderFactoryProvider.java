/*
 * Copyright (C) 2019 Michael Clarke
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
package com.sonarsource.sonarqube.plugin.classloader;

import org.sonar.api.Plugin;

public final class DefaultElevatedClassLoaderFactoryProvider implements ElevatedClassLoaderFactoryProvider {

    private static final DefaultElevatedClassLoaderFactoryProvider INSTANCE =
            new DefaultElevatedClassLoaderFactoryProvider();

    private DefaultElevatedClassLoaderFactoryProvider() {
        super();
    }

    @Override
    public ElevatedClassLoaderFactory createFactory(Plugin.Context context) {
        return ProviderType.fromName(
                context.getBootConfiguration().get(ElevatedClassLoaderFactoryProvider.class.getName() + ".providerType")
                        .orElse(ProviderType.CLASS_REFERENCE.name())).createFactory(context);
    }

    public static DefaultElevatedClassLoaderFactoryProvider getInstance() {
        return INSTANCE;
    }

}
