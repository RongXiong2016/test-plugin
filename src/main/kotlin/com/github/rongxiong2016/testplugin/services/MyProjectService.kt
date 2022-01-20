package com.github.rongxiong2016.testplugin.services

import com.intellij.openapi.project.Project
import com.github.rongxiong2016.testplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
