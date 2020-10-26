package com.neos7m.oresmod.items.armor.boots

import com.neos7m.oresmod.materials.ModArmorMaterial
import net.minecraft.inventory.EquipmentSlotType
import net.minecraft.item.ArmorItem
import net.minecraft.item.ItemGroup

abstract class Boots(registryName: String, material: ModArmorMaterial)
	: ArmorItem(material, EquipmentSlotType.FEET, Properties().group(ItemGroup.COMBAT)) {
	init {
		setRegistryName(registryName)
	}
}