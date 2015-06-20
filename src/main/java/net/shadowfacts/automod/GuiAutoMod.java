package net.shadowfacts.automod;

import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;

/**
 * @author shadowfacts
 */
public class GuiAutoMod extends GuiScreen {

	private GuiButton setKeybind = new GuiButton(0, 0, 0, "Set Keybind");
	private GuiButton openConfigGui = new GuiButton(0, 300, 300, "Open Config GUI");

	@Override
	public void initGui() {
		buttonList.add(setKeybind);
		buttonList.add(openConfigGui);
	}

	@Override
	public void updateScreen() {
		super.updateScreen();
	}

	@Override
	public void drawScreen(int p_73863_1_, int p_73863_2_, float p_73863_3_) {
		super.drawScreen(p_73863_1_, p_73863_2_, p_73863_3_);
	}

	@Override

	public void drawBackground(int p_146278_1_) {
		super.drawBackground(p_146278_1_);
	}
}
