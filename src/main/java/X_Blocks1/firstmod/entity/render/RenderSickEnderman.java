package X_Blocks1.firstmod.entity.render;

import X_Blocks1.firstmod.entity.EntitySickEnderman;
import X_Blocks1.firstmod.entity.model.ModelSickEnderman;
import X_Blocks1.firstmod.util.Reference;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderSickEnderman extends RenderLiving<EntitySickEnderman>
{
	public static final ResourceLocation TEXTURES = new ResourceLocation(Reference.MOD_ID + ":textures/entity/sick_enderman.png");
	
	public RenderSickEnderman(RenderManager manager)
	{
		super(manager, new ModelSickEnderman(), 0.5F);
	}
	
	@Override
	protected ResourceLocation getEntityTexture(EntitySickEnderman entity)
	{
		return TEXTURES;
	}
	
	@Override
	protected void applyRotations(EntitySickEnderman entityLiving, float p_77043_2_, float rotationYaw, float partialTicks)
	{
		super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
	}
}
