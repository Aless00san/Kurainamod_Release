package net.fabricmc.kurainamod.client.renderer.entity;


import net.fabricmc.kurainamod.client.model.KurainaModel;
import net.fabricmc.kurainamod.entity.KurainaEntity;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;


public class KurainaRenderer extends GeoEntityRenderer<KurainaEntity> {

    public KurainaRenderer(EntityRendererFactory.Context renderManagerIn) {
        super(renderManagerIn, new KurainaModel());
        this.shadowRadius = 0.2f;
    }

    @Override
    public RenderLayer getRenderType(KurainaEntity animatable, float partialTicks, MatrixStack stack,
                                     VertexConsumerProvider renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn,
                                     Identifier textureLocation) {
        return RenderLayer.getEntityTranslucent(getTextureLocation(animatable));
    }

    @Override
    protected float getDeathMaxRotation(KurainaEntity entityLivingBaseIn) {
        return 0.0F;
    }


}
