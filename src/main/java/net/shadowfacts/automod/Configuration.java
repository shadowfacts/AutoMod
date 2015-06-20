package net.shadowfacts.automod;

import net.shadowfacts.shadowapi.config.Config;
import net.shadowfacts.shadowapi.config.ConfigProperty;

/**
 * @author shadowfacts
 */
@Config(name = "AutoMod")
public class Configuration {

	@ConfigProperty
	public static int key;

}
