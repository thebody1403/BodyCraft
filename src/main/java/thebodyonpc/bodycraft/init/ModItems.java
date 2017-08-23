package thebodyonpc.bodycraft.init;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import thebodyonpc.bodycraft.Reference;
import thebodyonpc.bodycraft.items.ItemBodiumIngot;
import thebodyonpc.bodycraft.util.Utils;

public class ModItems {
	
	public static Item BodiumIngot;
	
	public static void init() {
		BodiumIngot = new ItemBodiumIngot("bodium_ingot", "bodium_ingot");
		
	}
	
	public static void register() {
		registerItem(BodiumIngot);
		
	}
	
	public static void registerRenders() {
		registerRender(BodiumIngot);
		
	}
	
	public static void registerItem(Item item) {
		GameRegistry.register(item);
		Utils.getLogger().info("Registered item: " + item.getUnlocalizedName().substring(5));
	}
	
	public static void registerRender(Item item) {
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(new ResourceLocation(Reference.MODID, item.getUnlocalizedName().substring(5)), "inventory"));
		Utils.getLogger().info("Register render for " + item.getUnlocalizedName().substring(5));
		 }


}