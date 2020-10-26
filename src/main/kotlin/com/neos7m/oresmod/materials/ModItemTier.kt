package com.neos7m.oresmod.materials

import com.neos7m.oresmod.items.materials.*
import net.minecraft.item.IItemTier
import net.minecraft.item.crafting.Ingredient

enum class ModItemTier : IItemTier {
	COPPER,
	RUBY,
	SAPPHIRE,
	TIN,
	ZINC,

	BRASS,
	BRONZE,
	STEEL;

	override fun getMaxUses(): Int {
		return when(this) {
			COPPER -> 180
			RUBY -> 1650
			SAPPHIRE -> 1850
			TIN -> 110
			ZINC -> 120
			BRASS -> 380
			BRONZE -> 350
			STEEL -> 500
		}
	}

	override fun getEfficiency(): Float {
		return when(this) {
			COPPER -> 5f
			RUBY -> 8.5f
			SAPPHIRE -> 9f
			TIN -> 2.5f
			ZINC -> 3f
			BRASS -> 7f
			BRONZE -> 6.5f
			STEEL -> 7.5f
		}
	}

	override fun getAttackDamage(): Float {
		return when(this) {
			COPPER -> 1.5f
			RUBY -> 3.5f
			SAPPHIRE -> 5f
			TIN -> 0.8f
			ZINC -> 1f
			BRASS -> 3.2f
			BRONZE -> 2.8f
			STEEL -> 3.3f
		}
	}

	override fun getHarvestLevel(): Int {
		return when(this) {
			COPPER -> 2
			RUBY -> 4
			SAPPHIRE -> 4
			TIN -> 1
			ZINC -> 1
			BRASS -> 2
			BRONZE -> 2
			STEEL -> 3
		}
	}

	override fun getEnchantability(): Int {
		return when(this) {
			COPPER -> 20 // Very enchant-able
			RUBY -> 10
			SAPPHIRE -> 8
			TIN -> 12
			ZINC -> 11
			BRASS -> 15
			BRONZE -> 15
			STEEL -> 15
		}
	}

	override fun getRepairMaterial(): Ingredient {
		return when(this) {
			COPPER -> Ingredient.fromItems(CopperIngot)
			RUBY -> Ingredient.fromItems(Ruby)
			SAPPHIRE -> Ingredient.fromItems(Sapphire)
			TIN -> Ingredient.fromItems(TinIngot)
			ZINC -> Ingredient.fromItems(ZincIngot)
			BRASS -> Ingredient.fromItems(BrassIngot)
			BRONZE -> Ingredient.fromItems(BronzeIngot)
			STEEL -> Ingredient.fromItems(SteelIngot)
		}
	}
}