package thebodyonpc.bodycraft.proxy;

import thebodyonpc.bodycraft.init.ModItems;

public class ClientProxy extends CommonProxy {
	
	@Override
	public void registerRenders() {
		ModItems.registerRenders();
	}
	
}
