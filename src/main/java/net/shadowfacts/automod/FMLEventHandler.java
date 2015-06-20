package net.shadowfacts.automod;


import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.InputEvent.KeyInputEvent;
import cpw.mods.fml.common.gameevent.TickEvent.ClientTickEvent;

import java.awt.*;
import java.awt.event.InputEvent;

/**
 * @author shadowfacts
 */
public class FMLEventHandler {

	@SubscribeEvent
	public void onKeyInput(KeyInputEvent event) {
		if (!AutoMod.mainKeybind.isPressed()) {
			return;
		}
		AutoMod.isEnabled = !AutoMod.isEnabled;
	}

	private Robot robot;

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
