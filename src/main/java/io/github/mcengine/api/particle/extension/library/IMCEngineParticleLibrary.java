package io.github.mcengine.api.particle.extension.library;

import org.bukkit.plugin.Plugin;

/**
 * Represents a Particle Library module that can be dynamically loaded into the MCEngine.
 * <p>
 * Implement this interface to provide reusable particle utilities and services.
 */
public interface IMCEngineParticleLibrary {
    /**
     * Called when the Particle Library is loaded by the engine.
     *
     * @param plugin The plugin instance providing context.
     */
    void onLoad(Plugin plugin);

    /**
     * Called when the Particle Library is unloaded or disabled by the engine.
     *
     * @param plugin The plugin instance providing context.
     */
    void onDisload(Plugin plugin);

    /**
     * Sets a unique ID for this Particle Library instance.
     *
     * @param id The unique ID assigned by the engine.
     */
    void setId(String id);
}
