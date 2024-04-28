# AGP Fixer

A project that exists to fix the guava issue that sometimes shows up in AGP 8.3 when used with Gradle 8.6+. See Google issue tracker [AGP issue 330202433](https://issuetracker.google.com/issues/330202433) for more details. 


## Usage

Agp Fixer should be added as a settings plugin to your Gradle settings script. As we have not yet formally
published the plugin, you should consume it via a Gradle
[Composite Build](https://docs.gradle.org/current/userguide/composite_builds.html). Start by cloning this
repo into the same directory as the project you want to use it in. If your Android project is named 
"my-awesome-app", your directory structure should look like something like this

```
my-code
 | \
 |  | my-awesome-app
 |  | agp-fixer
 |  | <other cool projects>
```

Once you've cloned this repo, you'll need to configure your `settings.gradle` file to start and consume an included build. 


```kotlin
// settings.gradle.kts
rootProject.name = "my-awesome-app"
pluginManagement {
    repositories {
        // normal repositories here
    }
    // included build!!
    includeBuild("../agp-fixer")
}

// register the settings plugin
plugins {
    id("com.mavenclinic.agp.fixer")
}

include(":normal-modules-go-here")
```

If you're already using the pluginManagement block, all you need to do is add the plugin and included
build, and that's it, the correct version of Guava will be added to your classpath, and you should be
able to bundle again. 

## Test and Deploy

TODO

- [ ] [Get started with GitLab CI/CD](https://docs.gitlab.com/ee/ci/quick_start/index.html)
- [ ] [Analyze your code for known vulnerabilities with Static Application Security Testing (SAST)](https://docs.gitlab.com/ee/user/application_security/sast/)
- [ ] [Deploy to Kubernetes, Amazon EC2, or Amazon ECS using Auto Deploy](https://docs.gitlab.com/ee/topics/autodevops/requirements.html)
- [ ] [Use pull-based deployments for improved Kubernetes management](https://docs.gitlab.com/ee/user/clusters/agent/)
- [ ] [Set up protected environments](https://docs.gitlab.com/ee/ci/environments/protected_environments.html)

***


## Contributing

TODO, but we're generally ammenable to it!

## License

    Copyright 2024 Maven Clinic, Inc.

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
