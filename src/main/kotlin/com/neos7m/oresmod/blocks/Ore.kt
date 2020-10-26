package com.neos7m.oresmod.blocks

import net.minecraft.block.Block
import net.minecraft.block.BlockState
import net.minecraft.block.OreBlock
import net.minecraft.block.material.Material
import net.minecraft.item.ItemStack
import net.minecraft.loot.LootContext
import net.minecraftforge.common.ToolType

abstract class Ore(registryName: String, val size: Int, val count: Int, val maxHeight: Int, val harvestLevel: Int)
	: OreBlock(Properties.create(Material.ROCK)
		.harvestLevel(harvestLevel)
		.harvestTool(ToolType.PICKAXE)
		.hardnessAndResistance(3f)) {
	init {
		setRegistryName(registryName)
	}
}