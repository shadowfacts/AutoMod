package net.shadowfacts.automod.proxy;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;

/**
 * @author shadowfacts
 */
public class ClientProxy extends CommonProxy {

	@Override
	public void displayGuiScreen(GuiScreen gui) {
		Minecraft.getMinecraft().displayGuiScreen(gui);
	}
}
