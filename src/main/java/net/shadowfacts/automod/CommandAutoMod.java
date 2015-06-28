package net.shadowfacts.automod;

import net.minecraft.command.CommandBase;
import net.minecraft.command.ICommandSender;
import net.minecraft.util.ChatComponentText;
import net.shadowfacts.shadowapi.command.ISubCommand;

import java.util.List;

/**
 * @author shadowfacts
 */
public class CommandAutoMod extends CommandBase {

	public static CommandAutoMod instance = new CommandAutoMod();


	@Override
	public String getCommandName() {
		return "automod";
	}

	@Override
	public String getCommandUsage(ICommandSender sender) {
		return "Opens the GUI to set the key/mouse button for AutoMod.";
	}

	@Override
	public void processCommand(ICommandSender sender, String[] args) {
		AutoMod.proxy.displayGuiScreen(new GuiAutoMod());
	}

	@Override
	public List<String> addTabCompletionOptions(ICommandSender sender, String[] args) {
		return null;
	}

}
