package com.lambda

import com.lambda.client.LambdaMod
import com.lambda.client.plugin.api.Plugin
import com.lambda.client.util.threads.BackgroundJob
import com.lambda.commands.ExampleCommand
import com.lambda.huds.ExampleLabelHud
import com.lambda.managers.ExampleManager
import com.lambda.modules.ExampleModule

internal object ExamplePlugin : Plugin() {

    override fun onLoad() {
        // Load any modules, commands, or HUD elements here
    }

    override fun onUnload() {
        // Here you can unregister threads etc...
    }
}