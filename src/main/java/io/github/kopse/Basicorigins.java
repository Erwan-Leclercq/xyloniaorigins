package io.github.kopse;

import org.slf4j.Logger;
import com.mojang.logging.LogUtils;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

@Mod(Basicorigins.MODID)
public class Basicorigins {
    public static final String MODID = "basicorigins";
    public static final Logger LOGGER = LogUtils.getLogger();
    
    public Basicorigins(IEventBus modEventBus) {
        LOGGER.info("Basicorigins initializing");
    }
}
