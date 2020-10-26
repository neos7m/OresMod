package com.neos7m.oresmod

import com.neos7m.oresmod.blocks.CopperOre
import com.neos7m.oresmod.managers.EventHandler
import net.minecraft.block.Block
import net.minecraft.item.Item
import net.minecraftforge.api.distmarker.Dist
import net.minecraftforge.common.MinecraftForge
import net.minecraftforge.event.RegistryEvent.Register
import net.minecraftforge.eventbus.api.SubscribeEvent
import net.minecraftforge.fml.common.Mod
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent
import thedarkcolour.kotlinforforge.forge.MOD_CONTEXT

// The value here should match an entry in the META-INF/mods.toml file
@Mod(OresMod.MOD_ID)
object OresMod {
	const val MOD_ID = "oresmod"

	private fun setup(event: FMLCommonSetupEvent) {

	}

	init {
		// Register the setup method for mod loading
		MOD_CONTEXT.getKEventBus().addListener { event: FMLCommonSetupEvent -> setup(event) }

		// Register ourselves for server and other game events we are interested in
		MOD_CONTEXT.getKEventBus().register(EventHandler)
	}
}