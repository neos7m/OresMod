package com.neos7m.oresmod.managers

import com.neos7m.oresmod.items.armor.boots.*
import com.neos7m.oresmod.items.armor.chestplates.*
import com.neos7m.oresmod.items.armor.helmets.*
import com.neos7m.oresmod.items.armor.leggings.*
import com.neos7m.oresmod.items.materials.*
import com.neos7m.oresmod.items.tools.axes.*
import com.neos7m.oresmod.items.tools.hoes.*
import com.neos7m.oresmod.items.tools.pickaxes.*
import com.neos7m.oresmod.items.tools.shovels.*
import com.neos7m.oresmod.items.tools.swords.*
import net.minecraft.item.Item

object ItemRegistrar {
	val materialItems = listOf(
			CopperIngot,
			Ruby,
			Sapphire,
			TinIngot,
			ZincIngot,

			BrassIngot,
			BronzeIngot,
			SteelIngot
	)

	val tools: List<Item> = listOf(
			CopperPickaxe,
			RubyPickaxe,
			SapphirePickaxe,
			TinPickaxe,
			ZincPickaxe,
			BrassPickaxe,
			BronzePickaxe,
			SteelPickaxe,

			CopperShovel,
			RubyShovel,
			SapphireShovel,
			TinShovel,
			ZincShovel,
			BrassShovel,
			BronzeShovel,
			SteelShovel,

			CopperAxe,
			RubyAxe,
			SapphireAxe,
			TinAxe,
			ZincAxe,
			BrassAxe,
			BronzeAxe,
			SteelAxe,

			CopperHoe,
			RubyHoe,
			SapphireHoe,
			TinHoe,
			ZincHoe,
			BrassHoe,
			BronzeHoe,
			SteelHoe,

			CopperSword,
			RubySword,
			SapphireSword,
			TinSword,
			ZincSword,
			BrassSword,
			BronzeSword,
			SteelSword
	)

	val armor: List<Item> = listOf(
			CopperBoots,
			CopperChestplate,
			CopperHelmet,
			CopperLeggings,
			TinBoots,
			TinChestplate,
			TinHelmet,
			TinLeggings,
			ZincBoots,
			ZincChestplate,
			ZincHelmet,
			ZincLeggings,
			RubyBoots,
			RubyChestplate,
			RubyHelmet,
			RubyLeggings,
			SapphireBoots,
			SapphireChestplate,
			SapphireHelmet,
			SapphireLeggings,
			BrassBoots,
			BrassChestplate,
			BrassHelmet,
			BrassLeggings,
			BronzeBoots,
			BronzeChestplate,
			BronzeHelmet,
			BronzeLeggings,
			SteelBoots,
			SteelChestplate,
			SteelHelmet,
			SteelLeggings			
	)
}