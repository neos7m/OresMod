package com.neos7m.oresmod.items.armor.chestplates

import com.neos7m.oresmod.materials.ModArmorMaterial
import net.minecraft.inventory.EquipmentSlotType
import net.minecraft.item.ArmorItem
import net.minecraft.item.ItemGroup

abstract class Chestplate(registryName: String, material: ModArmorMaterial)
	: ArmorItem(material, EquipmentSlotType.CHEST, Properties().group(ItemGroup.COMBAT)) {
	init {
		setRegistryName(registryName)
	}
}