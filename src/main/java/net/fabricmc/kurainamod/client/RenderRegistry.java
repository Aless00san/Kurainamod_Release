package net.fabricmc.kurainamod.client;

import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.fabricmc.kurainamod.client.renderer.entity.KurainaRenderer;
import net.fabricmc.kurainamod.utils.ModEntity;

public class RenderRegistry {

    @SuppressWarnings("unchecked")
    public static void init() {
        EntityRendererRegistry.register(ModEntity.KURAINA, (context) -> {
            return new KurainaRenderer(context);
        });
    }
}
