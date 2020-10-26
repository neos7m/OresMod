package com.neos7m.oresmod.items.armor.leggings

import com.neos7m.oresmod.materials.ModArmorMaterial
import net.minecraft.inventory.EquipmentSlotType
import net.minecraft.item.ArmorItem
import net.minecraft.item.ItemGroup

abstract class Leggings(registryName: String, material: ModArmorMaterial)
	: ArmorItem(material, EquipmentSlotType.LEGS, Properties().group(ItemGroup.COMBAT)) {
	init {
		setRegistryName(registryName)
	}
}