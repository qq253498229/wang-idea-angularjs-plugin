package com.github.qq253498229.wangideaangularjsplugin.services

import com.github.qq253498229.wangideaangularjsplugin.MyBundle

class MyApplicationService {

    init {
        println(MyBundle.message("applicationService"))

        System.getenv("CI")
            ?: TODO("Don't forget to remove all non-needed sample code files with their corresponding registration entries in `plugin.xml`.")
    }
}
