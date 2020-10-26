package com.neos7m.oresmod.items.tools.axes

import com.neos7m.oresmod.materials.ModItemTier
import net.minecraft.item.AxeItem
import net.minecraft.item.ItemGroup

abstract class Axe(registryName: String, tier: ModItemTier)
	: AxeItem(tier, 1f, 1f, Properties().group(ItemGroup.TOOLS)) {
	init {
		setRegistryName(registryName)
	}
}