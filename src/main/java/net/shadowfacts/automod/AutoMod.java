package net.shadowfacts.automod;

import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import net.minecraft.client.settings.KeyBinding;
import net.shadowfacts.automod.proxy.CommonProxy;
import net.shadowfacts.shadowapi.command.CommandHandler;
import net.shadowfacts.shadowapi.config.ConfigManager;
import net.shadowfacts.shadowapi.shadowlib.log.Logger;
import org.lwjgl.input.Keyboard;

/**
 * @author shadowfacts
 */
@Mod(modid = AutoMod.id, name = AutoMod.name, version = AutoMod.version)
public class AutoMod {

	public static final String id = "automod";
	public static final String name = "AutoMod";
	public static final String version = "@VERSION@";

	@SidedProxy(serverSide = "net.shadowfacts.automod.proxy.CommonProxy", clientSide = "net.shadowfacts.automod.proxy.ClientProxy")
	public static CommonProxy proxy;

	public static Logger logger = new Logger("AutoMod");

	public static KeyBinding mainKeybind;

	public static boolean isEnabled = false;

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		ConfigManager.instance.configDirPath = event.getModConfigurationDirectory().getAbsolutePath();
		ConfigManager.instance.register("AutoMod", Configuration.class);

		mainKeybind = new KeyBinding("key.enfusion.main", Keyboard.KEY_Y, "key.enfusion.category");
		ClientRegistry.registerKeyBinding(mainKeybind);

		FMLCommonHandler.instance().bus().register(new FMLEventHandler());
	}

	@Mod.EventHandler
	public void serverLoad(FMLServerStartingEvent event) {
		CommandHandler.registerSubCommand(CommandAutoMod.instance);
		CommandHandler.initCommands(event);
	}


}
