package io.github.mcengine.api.particle.extension.api;

import org.bukkit.plugin.Plugin;

/**
 * Represents a Particle API module that can be dynamically loaded into the MCEngine.
 * <p>
 * Implement this interface to expose particle APIs to other modules.
 */
public interface IMCEngineParticleAPI {
    /**
     * Called when the Particle API is loaded by the engine.
     *
     * @param plugin The plugin instance providing context.
     */
    void onLoad(Plugin plugin);

    /**
     * Called when the Particle API is unloaded or disabled by the engine.
     *
     * @param plugin The plugin instance providing context.
     */
    void onDisload(Plugin plugin);

    /**
     * Sets a unique ID for this Particle API instance.
     *
     * @param id The unique ID assigned by the engine.
     */
    void setId(String id);
}
