package com.Eternal_plasma.BlueBricks;
import com.Eternal_plasma.BlueBricks.proxy.CommonProxy;
import com.Eternal_plasma.BlueBricks.util.Refrence;
import com.Eternal_plasma.BlueBricks.world.ModWorldGen;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
@Mod(modid = Refrence.MOD_ID,name = Refrence.NAME,version = Refrence.VERSION)
public class Main {

	@net.minecraftforge.fml.common.Mod.Instance
	public static Main Instance;
	@SidedProxy(clientSide = Refrence.CLIENT_PROXY_CLASS,serverSide = Refrence.COMMON_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@EventHandler
	public static void PreInit(FMLPreInitializationEvent event)
	{
		GameRegistry.registerWorldGenerator(new ModWorldGen(), 0);
	}
	@EventHandler
	public static void init(FMLInitializationEvent event)
	{
		
	}
	@EventHandler
	public static void Postinit(FMLPostInitializationEvent event)
	{
		
	}
	
}
