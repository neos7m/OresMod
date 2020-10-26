package com.neos7m.oresmod.materials

import com.neos7m.oresmod.OresMod
import com.neos7m.oresmod.items.materials.*
import net.minecraft.client.audio.Sound
import net.minecraft.inventory.EquipmentSlotType
import net.minecraft.item.IArmorMaterial
import net.minecraft.item.crafting.Ingredient
import net.minecraft.util.ResourceLocation
import net.minecraft.util.SoundEvent

enum class ModArmorMaterial : IArmorMaterial {
	COPPER,
	RUBY,
	SAPPHIRE,
	TIN,
	ZINC,

	BRASS,
	BRONZE,
	STEEL;

	override fun getDurability(slotIn: EquipmentSlotType): Int {
		return when(slotIn) {
			EquipmentSlotType.MAINHAND -> 0
			EquipmentSlotType.OFFHAND -> 0
			EquipmentSlotType.FEET -> when(this) {
				COPPER -> 140
				TIN -> 100
				ZINC -> 120
				RUBY -> 450
				SAPPHIRE -> 470
				BRASS -> 250
				BRONZE -> 230
				STEEL -> 320
			}
			EquipmentSlotType.LEGS -> when(this) {
				COPPER -> 190
				TIN -> 130
				ZINC -> 150
				RUBY -> 520
				SAPPHIRE -> 540
				BRASS -> 340
				BRONZE -> 320
				STEEL -> 410
			}
			EquipmentSlotType.CHEST -> when(this) {
				COPPER -> 200
				TIN -> 140
				ZINC -> 160
				RUBY -> 550
				SAPPHIRE -> 570
				BRASS -> 320
				BRONZE -> 300
				STEEL -> 400
			}
			EquipmentSlotType.HEAD -> when(this) {
				COPPER -> 140
				TIN -> 90
				ZINC -> 110
				RUBY -> 375
				SAPPHIRE -> 395
				BRASS -> 220
				BRONZE -> 200
				STEEL -> 300
			}
		}
	}

	override fun getDamageReductionAmount(slotIn: EquipmentSlotType): Int {
		return when(slotIn) {
			EquipmentSlotType.MAINHAND -> 0
			EquipmentSlotType.OFFHAND -> 0
			EquipmentSlotType.FEET -> when(this) {
				COPPER -> 1
				TIN -> 1
				ZINC -> 1
				RUBY -> 3
				SAPPHIRE -> 3
				BRASS -> 2
				BRONZE -> 2
				STEEL -> 2
			}
			EquipmentSlotType.LEGS -> when(this) {
				COPPER -> 4
				TIN -> 3
				ZINC -> 3
				RUBY -> 6
				SAPPHIRE -> 6
				BRASS -> 5
				BRONZE -> 5
				STEEL -> 5
			}
			EquipmentSlotType.CHEST -> when(this) {
				COPPER -> 4
				TIN -> 4
				ZINC -> 4
				RUBY -> 8
				SAPPHIRE -> 8
				BRASS -> 7
				BRONZE -> 7
				STEEL -> 7
			}
			EquipmentSlotType.HEAD -> when(this) {
				COPPER -> 2
				TIN -> 2
				ZINC -> 2
				RUBY -> 3
				SAPPHIRE -> 3
				BRASS -> 2
				BRONZE -> 2
				STEEL -> 2
			}
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

	override fun getSoundEvent(): SoundEvent {
		return when(this) {
			RUBY, SAPPHIRE -> SoundEvent(ResourceLocation("item.armor.equip_diamond"))
			else -> SoundEvent(ResourceLocation("item.armor.equip_iron"))
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

	override fun getName(): String {
		return "${OresMod.MOD_ID}:${this.name.toLowerCase()}"
	}

	override fun getToughness(): Float {
		return when(this) {
			RUBY -> 2f
			SAPPHIRE -> 2f
			BRASS -> 1f
			BRONZE -> 1f
			STEEL -> 1.5f
			else -> 0f
		}
	}

	override fun func_230304_f_(): Float = 0f // No idea what this is but I found someone on GitHub who did it like this
}