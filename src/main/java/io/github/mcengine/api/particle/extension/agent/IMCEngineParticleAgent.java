package io.github.mcengine.api.particle.extension.agent;

import org.bukkit.plugin.Plugin;

/**
 * Represents a Particle Agent module that can be dynamically loaded into the MCEngine.
 * <p>
 * Implement this interface to integrate particle agents into the system.
 */
public interface IMCEngineParticleAgent {
    /**
     * Called when the Particle Agent is loaded by the engine.
     *
     * @param plugin The plugin instance providing context.
     */
    void onLoad(Plugin plugin);

    /**
     * Called when the Particle Agent is unloaded or disabled by the engine.
     *
     * @param plugin The plugin instance providing context.
     */
    void onDisload(Plugin plugin);

    /**
     * Sets a unique ID for this Particle Agent instance.
     *
     * @param id The unique ID assigned by the engine.
     */
    void setId(String id);
}
