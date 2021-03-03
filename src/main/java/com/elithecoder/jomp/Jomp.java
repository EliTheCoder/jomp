package com.elithecoder.jomp;

import com.elithecoder.jomp.blocks.JompBlock;
import com.elithecoder.jomp.blocks.LonchBlock;

import net.fabricmc.api.ModInitializer;
import net.minecraft.block.Material;
import net.minecraft.block.AbstractBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Jomp implements ModInitializer {

	public static final JompBlock JOMP_BLOCK = new JompBlock(
			AbstractBlock.Settings.of(Material.STONE).luminance(state -> 15));
	public static final LonchBlock LONCH_BLOCK = new LonchBlock(
			AbstractBlock.Settings.of(Material.STONE).luminance(state -> 15).noCollision());

	@Override
	public void onInitialize() {
		Registry.register(Registry.BLOCK, new Identifier("jomp", "jomp_block"), JOMP_BLOCK);
		Registry.register(Registry.ITEM, new Identifier("jomp", "jomp_block"),
				new BlockItem(JOMP_BLOCK, new Item.Settings().group(ItemGroup.MISC)));
		Registry.register(Registry.BLOCK, new Identifier("jomp", "lonch_block"), LONCH_BLOCK);
		Registry.register(Registry.ITEM, new Identifier("jomp", "lonch_block"),
				new BlockItem(LONCH_BLOCK, new Item.Settings().group(ItemGroup.MISC)));
	}
}
