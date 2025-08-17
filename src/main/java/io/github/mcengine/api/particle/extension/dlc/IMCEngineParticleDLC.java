package io.github.mcengine.api.particle.extension.dlc;

import org.bukkit.plugin.Plugin;

/**
 * Represents a Particle DLC module that can be dynamically loaded into the MCEngine.
 * <p>
 * Implement this interface to integrate downloadable content related to particle.
 */
public interface IMCEngineParticleDLC {
    /**
     * Called when the Particle DLC is loaded by the engine.
     *
     * @param plugin The plugin instance providing context.
     */
    void onLoad(Plugin plugin);

    /**
     * Called when the Particle DLC is unloaded or disabled by the engine.
     *
     * @param plugin The plugin instance providing context.
     */
    void onDisload(Plugin plugin);

    /**
     * Sets a unique ID for this Particle DLC instance.
     *
     * @param id The unique ID assigned by the engine.
     */
    void setId(String id);
}
