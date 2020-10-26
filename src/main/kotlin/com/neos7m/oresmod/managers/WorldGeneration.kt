package com.neos7m.oresmod.managers

import com.neos7m.oresmod.OresMod
import com.neos7m.oresmod.blocks.Ore
import net.minecraft.world.biome.Biome
import net.minecraft.world.biome.BiomeGenerationSettings
import net.minecraft.world.gen.GenerationStage
import net.minecraft.world.gen.feature.ConfiguredFeature
import net.minecraft.world.gen.feature.Feature
import net.minecraft.world.gen.feature.OreFeature
import net.minecraft.world.gen.feature.OreFeatureConfig
import net.minecraft.world.gen.feature.template.RuleTest
import net.minecraft.world.gen.placement.Placement
import net.minecraft.world.gen.placement.TopSolidRangeConfig
import net.minecraftforge.common.world.BiomeGenerationSettingsBuilder
import net.minecraftforge.event.world.BiomeLoadingEvent
import net.minecraftforge.eventbus.api.SubscribeEvent
import net.minecraftforge.fml.common.Mod
import net.minecraftforge.registries.ForgeRegistries
import java.util.function.Supplier

@Mod.EventBusSubscriber(modid = OresMod.MOD_ID)
object WorldGeneration {

	@SubscribeEvent
	fun generateOres(event: BiomeLoadingEvent) {
		if (event.category != Biome.Category.NETHER && event.category != Biome.Category.THEEND) {
			for (ore in BlockRegistrar.ores) {
				val config = OreFeatureConfig(OreFeatureConfig.FillerBlockType.field_241882_a, ore.defaultState, ore.size)
				val feature = Feature.ORE
						.withConfiguration(config)
						.withPlacement(Placement.field_242907_l.configure(TopSolidRangeConfig(0, 0, ore.maxHeight)))
						.func_242728_a()
						.func_242731_b(ore.count)

				event.generation.func_242513_a(GenerationStage.Decoration.UNDERGROUND_ORES, feature)
			}
		}
	}
}