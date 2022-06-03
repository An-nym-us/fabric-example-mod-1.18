package net.fabricmc.bettergate;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.bettergate.items.MyNewBlock;
import net.fabricmc.bettergate.items.NewItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



public class Main implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
//

	// Create a ist fo new items!
	public static final Item NEW_ITEM = new NewItem(new FabricItemSettings().group(ItemGroup.MISC));
	public static  final Block MY_BLOCK = new MyNewBlock(FabricBlockSettings.of(Material.CAKE).strength(4.0f));



	public static final Logger LOGGER = LoggerFactory.getLogger("modid");

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		LOGGER.info("Hello Fabric world!");

		//Must regiester each new item below

		Registry.register(Registry.ITEM, new Identifier( "bettergatemod", "new_item"), NEW_ITEM);

		// This will Create the block as a block world block
		Registry.register(Registry.BLOCK, new Identifier("bettergatemod", "my_new_block"), MY_BLOCK);
		// This will create a item that represents the block so that the block can be placed inside the game world and used in your inventory. Both go hand & hand.
		Registry.register(Registry.ITEM, new Identifier( "bettergatemod", "my_new_block"), new BlockItem(MY_BLOCK,new FabricItemSettings().group(ItemGroup.MISC)));
	}
}
