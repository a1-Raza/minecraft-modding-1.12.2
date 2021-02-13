package X_Blocks1.firstmod.init;

import X_Blocks1.firstmod.Main;
import X_Blocks1.firstmod.entity.EntitySickEnderman;
import X_Blocks1.firstmod.util.Reference;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class ModEntities
{
	public static void registerEntities()
	{
		registerEntity("sick_enderman", EntitySickEnderman.class, Reference.ENTITY_SICK_ENDERMAN, 50, 0, 3935843);
	}
	
	private static void registerEntity(String name, Class<? extends Entity> entity, int id, int range, int color1, int color2)
	{
		EntityRegistry.registerModEntity(new ResourceLocation(Reference.MOD_ID + ":" + name), entity, name, id, Main.instance, range, 1, true, color1, color2);
	}
}
