package io.github.kopse;

import org.slf4j.Logger;
import com.mojang.logging.LogUtils;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

@Mod(xyloniaorigins.MODID)
public class xyloniaorigins {
    public static final String MODID = "xyloniaorigins";
    public static final Logger LOGGER = LogUtils.getLogger();
    
    public xyloniaorigins(IEventBus modEventBus) {
        LOGGER.info("xyloniaorigins initializing");
    }
}
