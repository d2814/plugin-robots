package com.binbindo.robots;

import lombok.extern.slf4j.Slf4j;
import org.pf4j.PluginWrapper;
import org.springframework.stereotype.Component;
import run.halo.app.plugin.BasePlugin;

/**
 * @author Eternal
 * @since 1.0.0
 * @halo 2.0.0
 */
@Component
@Slf4j
public class RobotsPlugin extends BasePlugin {

    public RobotsPlugin(PluginWrapper wrapper) {
        super(wrapper);
    }

    @Override
    public void start() {
        log.info("Start plugin-robots");
    }

    @Override
    public void stop() {
        log.info("Stop plugin-robots");
    }

}
