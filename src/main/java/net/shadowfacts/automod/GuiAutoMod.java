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
	private GuiButton close;

	@Override
	public void initGui() {
		mc = Minecraft.getMinecraft();

		setKeybind = new GuiButton(3654, 0, 0, "Set Keybind");
		openConfigGui = new GuiButton(3655, 0, 100, "Open Config GUI");
		close = new GuiButton(1599, 500, 100, 100, 100, "x");


		buttonList.add(setKeybind);
		buttonList.add(openConfigGui);
		buttonList.add(close);
	}

	@Override
	protected void actionPerformed(GuiButton p_146284_1_) {
		super.actionPerformed(p_146284_1_);
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
