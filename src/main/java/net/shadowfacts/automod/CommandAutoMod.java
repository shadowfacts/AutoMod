package net.shadowfacts.automod;

import net.minecraft.command.ICommandSender;
import net.minecraft.util.ChatComponentText;
import net.shadowfacts.shadowapi.command.ISubCommand;

import java.util.List;

/**
 * @author shadowfacts
 */
public class CommandAutoMod implements ISubCommand {

	public static CommandAutoMod instance = new CommandAutoMod();


	@Override
	public String getCommandName() {
		return "automod";
	}

	@Override
	public void handleCommand(ICommandSender sender, String[] args) {
//		TODO: Open the gui
//		TODO: Make the gui
	}

	@Override
	public List<String> addTabCompletionOptions(ICommandSender sender, String[] args) {
		return null;
	}

	@Override
	public void handleHelpRequest(ICommandSender sender, String[] args) {
		sender.addChatMessage(new ChatComponentText("Opens the GUI to set the key/mouse button for AutoMod."));
	}
}
