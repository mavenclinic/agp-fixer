// SPDX-License-Identifier: Apache-2.0 
// Copyright (C) 2024 Maven Clinic, Inc.

package com.mavenclinic.gradle.agp.fixer;

import org.gradle.testfixtures.ProjectBuilder;
import org.gradle.api.Project;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * A simple unit test for the 'org.example.greeting' plugin.
 */
class AgpFixerPluginTest {
    @Test void pluginRegistersATask() {
        // Create a test project and apply the plugin
        Project project = ProjectBuilder.builder().build();
        project.getPlugins().apply("com.mavenclinic.agp.fixer");

        // Verify the result
        // project.pluginman
        // assertNotNull(project.getTasks().findByName("greeting"));
    }
}
