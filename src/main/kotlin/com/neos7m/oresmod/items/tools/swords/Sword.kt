package com.neos7m.oresmod.items.tools.swords

import com.neos7m.oresmod.materials.ModItemTier
import net.minecraft.item.ItemGroup
import net.minecraft.item.SwordItem

abstract class Sword(registryName: String, tier: ModItemTier)
	: SwordItem(tier, 3, -2.4f, Properties().group(ItemGroup.COMBAT)){
	init {
		setRegistryName(registryName)
	}
}