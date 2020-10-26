package com.neos7m.oresmod.managers

import com.neos7m.oresmod.OresMod
import net.minecraft.block.Block
import net.minecraft.item.Item
import net.minecraftforge.event.RegistryEvent
import net.minecraftforge.eventbus.api.SubscribeEvent
import net.minecraftforge.fml.common.Mod

@Mod.EventBusSubscriber(modid = OresMod.MOD_ID)
object EventHandler {
	@SubscribeEvent
	fun registerBlocks(event: RegistryEvent.Register<Block>) {
		event.registry.registerAll(*BlockRegistrar.ores.toTypedArray())
	}

	@SubscribeEvent
	fun registerItems(event: RegistryEvent.Register<Item>) {
		event.registry.registerAll(*BlockRegistrar.oreItems.toTypedArray())
		event.registry.registerAll(*ItemRegistrar.materialItems.toTypedArray())
		event.registry.registerAll(*ItemRegistrar.tools.toTypedArray())
		event.registry.registerAll(*ItemRegistrar.armor.toTypedArray())
	}
}