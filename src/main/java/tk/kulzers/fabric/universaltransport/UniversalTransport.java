package tk.kulzers.fabric.universaltransport;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


@SuppressWarnings("unused")
public class UniversalTransport implements ModInitializer {

	public static final ItemGroup ITEM_GROUP = FabricItemGroupBuilder.create(new Identifier("universaltransport", "items")).build(); // Cheating so that I don't need to make an icon
	public static final DuctingBlock DUCTING_BLOCK = new DuctingBlock(Block.Settings.of(Material.METAL));

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		Registry.register(Registry.BLOCK, new Identifier("universaltransport", "ducting"), DUCTING_BLOCK);
		Registry.register(Registry.ITEM, new Identifier("universaltransport", "ducting"), new BlockItem(DUCTING_BLOCK, new Item.Settings().group(ITEM_GROUP)));
		System.out.println("Hello Fabric world!");
	}
}
