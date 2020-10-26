package com.neos7m.oresmod.items.tools.pickaxes

import com.neos7m.oresmod.materials.ModItemTier
import net.minecraft.item.ItemGroup
import net.minecraft.item.PickaxeItem

abstract class Pickaxe(registryName: String, tier: ModItemTier)
	: PickaxeItem(tier, 1, -2.8f, Properties().group(ItemGroup.TOOLS)) {
	init {
		setRegistryName(registryName)
	}
}