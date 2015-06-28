package net.shadowfacts.automod;


import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.InputEvent.KeyInputEvent;
import cpw.mods.fml.common.gameevent.TickEvent.ClientTickEvent;
import net.minecraft.client.Minecraft;
import net.minecraft.util.ChatComponentText;
import net.shadowfacts.shadowapi.util.StringHelper;

import java.awt.*;
import java.awt.event.InputEvent;

/**
 * @author shadowfacts
 */
public class FMLEventHandler {

	private Robot robot;

	@SubscribeEvent
	public void onKeyInput(KeyInputEvent event) {
		if (AutoMod.setKeybindMode) {
//			TODO: Set the keybind
		} else if (AutoMod.mainKeybind.isPressed()) {
			AutoMod.isEnabled = !AutoMod.isEnabled;
			if (AutoMod.isEnabled) {
				Minecraft.getMinecraft().thePlayer.addChatMessage(new ChatComponentText("[AutoMod] Toggling auto-clicker state: " + StringHelper.BRIGHT_GREEN + "Enabled" + StringHelper.WHITE));
			} else {
				Minecraft.getMinecraft().thePlayer.addChatMessage(new ChatComponentText("[AutoMod] Toggling auto-clicker state: " + StringHelper.LIGHT_RED + "Disabled" + StringHelper.WHITE));
			}
		}
	}

	@SubscribeEvent
	public void onTick(ClientTickEvent event) {
		if (AutoMod.isEnabled) {
			try {
				if (robot == null) {
					robot = new Robot();
				}
			} catch (AWTException e) {
				AutoMod.logger.error("Uh oh, you're in a headless environment.");
				AutoMod.logger.info("Uh, why are you playing Minecraft in a headless env?");
				e.printStackTrace();
			}
			robot.mousePress(InputEvent.BUTTON1_MASK);
			robot.mousePress(InputEvent.BUTTON1_MASK);
		}
	}


}
