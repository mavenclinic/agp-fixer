// SPDX-License-Identifier: Apache-2.0 
// Copyright (C) 2024 Maven Clinic, Inc.

package com.mavenclinic.gradle.agp.fixer;


import org.gradle.api.Plugin;
import org.gradle.api.initialization.Settings;

import javax.annotation.Nonnull;

public class AgpFixerPlugin implements Plugin<Settings> {

    @Override
    public void apply(@Nonnull Settings target) {
        // do nothing. This is just here to force a version of guava on the classpath
    }
}
