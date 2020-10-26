package com.neos7m.oresmod.managers

import com.neos7m.oresmod.blocks.*
import net.minecraft.item.BlockItem
import net.minecraft.item.Item
import net.minecraft.item.ItemGroup

object BlockRegistrar {
	val ores = listOf(
			CopperOre,
			RubyOre,
			SapphireOre,
			TinOre,
			ZincOre
	)

	val oreItems: List<Item> = ores.map {
		BlockItem(it, Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).apply {
			registryName = it.registryName
		}
	}
}