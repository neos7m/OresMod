package com.neos7m.oresmod.items.materials

import net.minecraft.item.Item
import net.minecraft.item.ItemGroup

abstract class MaterialItem(registryName: String) : Item(Properties().group(ItemGroup.MATERIALS)) {
	init {
		setRegistryName(registryName)
	}
}