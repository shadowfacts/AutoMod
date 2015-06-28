package net.shadowfacts.automod;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;

/**
 * @author shadowfacts
 */
public class GuiAutoMod extends GuiScreen {

	private GuiButton setKeybind;
	private GuiButton openConfigGui;

	@Override
	public void initGui() {
		mc = Minecraft.getMinecraft();

		setKeybind = new GuiButton(3654, 0, 0, "Set Keybind");
		openConfigGui = new GuiButton(3655, 0, 50, "Open Config GUI");


		buttonList.add(setKeybind);
		buttonList.add(openConfigGui);
	}

	@Override
	protected void actionPerformed(GuiButton button) {
		if (button.id == setKeybind.id) {
			AutoMod.setKeybindMode = true;
		}
	}

	@Override
	public void updateScreen() {
		super.updateScreen();
	}

	@Override
	public void drawScreen(int mouseX, int mouseY, float partialTicks) {
		super.drawScreen(mouseX, mouseY, partialTicks);
	}

	@Override
	public void drawBackground(int tint) {
		super.drawBackground(tint);
	}
}
