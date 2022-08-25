package com.example.example_mod

import org.quiltmc.loader.api.ModContainer
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer
import org.slf4j.LoggerFactory

object ExampleMod : ModInitializer {
    // This logger is used to write text to the console and the log file.
    // It is considered best practice to use your mod name as the logger's name.
    // That way, it's clear which mod wrote info, warnings, and errors.
    val LOGGER = LoggerFactory.getLogger("Example Mod")

    override fun onInitialize(mod: ModContainer) {
        LOGGER.info("Hello Quilt world from ${mod.metadata().name()}!")
    }
}
