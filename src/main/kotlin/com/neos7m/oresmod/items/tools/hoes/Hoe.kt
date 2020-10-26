package com.neos7m.oresmod.items.tools.hoes

import com.neos7m.oresmod.materials.ModItemTier
import net.minecraft.item.HoeItem
import net.minecraft.item.ItemGroup

abstract class Hoe(registryName: String, tier: ModItemTier)
	: HoeItem(tier, 1, 2f, Properties().group(ItemGroup.TOOLS)) {
	init {
		setRegistryName(registryName)
	}
}