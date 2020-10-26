package com.neos7m.oresmod.items.armor.helmets

import com.neos7m.oresmod.materials.ModArmorMaterial
import net.minecraft.inventory.EquipmentSlotType
import net.minecraft.item.ArmorItem
import net.minecraft.item.ItemGroup

abstract class Helmet(registryName: String, material: ModArmorMaterial)
	: ArmorItem(material, EquipmentSlotType.HEAD, Properties().group(ItemGroup.COMBAT)) {
	init {
		setRegistryName(registryName)
	}
}