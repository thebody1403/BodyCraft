package thebodyonpc.bodycraft;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import thebodyonpc.bodycraft.init.ModItems;
import thebodyonpc.bodycraft.proxy.CommonProxy;
import thebodyonpc.bodycraft.util.Utils;

@Mod(modid = Reference.MODID, name = Reference.Name, version = Reference.Version)
public class BodyCraft {
	
	@Mod.Instance(Reference.MODID)
	public static BodyCraft instance;

	@SidedProxy(serverSide = Reference.SERVER_PROXY_CLASS, clientSide = Reference.CLIENT_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		ModItems.init();
		ModItems.register();
		
		proxy.registerRenders();
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event) {
		
	}
	
	@EventHandler
	public void init(FMLPostInitializationEvent event) {
		
	}
}
