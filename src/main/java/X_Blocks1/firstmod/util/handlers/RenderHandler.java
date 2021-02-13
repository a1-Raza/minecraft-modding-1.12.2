package X_Blocks1.firstmod.util.handlers;

import X_Blocks1.firstmod.entity.EntitySickEnderman;
import X_Blocks1.firstmod.entity.render.RenderSickEnderman;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class RenderHandler
{
	public static void registerEntityRenders()
	{
		RenderingRegistry.registerEntityRenderingHandler(EntitySickEnderman.class, new IRenderFactory<EntitySickEnderman>()
		{
			@Override
			public Render<? super EntitySickEnderman> createRenderFor(RenderManager manager) 
			{
				return new RenderSickEnderman(manager);
			}
		});
	}
}
