package com.neos7m.oresmod.items.tools.shovels

import com.neos7m.oresmod.materials.ModItemTier
import net.minecraft.item.ItemGroup
import net.minecraft.item.ShovelItem

abstract class Shovel(registryName: String, tier: ModItemTier)
	: ShovelItem(tier, 4f, -3f, Properties().group(ItemGroup.TOOLS)) {
	init {
		setRegistryName(registryName)
	}
}