package X_Blocks1.firstmod.entity.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

/**
 * ModelEnderman - Either Mojang or a mod author
 * Created using Tabula 7.1.0
 */
public class ModelSickEnderman extends ModelBase {
    public ModelRenderer em_rightarm;
    public ModelRenderer em_rightleg;
    public ModelRenderer em_head;
    public ModelRenderer em_torso;
    public ModelRenderer em_leftarm;
    public ModelRenderer em_leftleg;
    public ModelRenderer em_lowerjaw;

    public ModelSickEnderman() {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.em_torso = new ModelRenderer(this, 32, 16);
        this.em_torso.setRotationPoint(0.0F, -14.0F, -0.0F);
        this.em_torso.addBox(-4.0F, 0.0F, -2.0F, 8, 12, 4, 0.0F);
        this.em_leftarm = new ModelRenderer(this, 56, 0);
        this.em_leftarm.mirror = true;
        this.em_leftarm.setRotationPoint(5.0F, -12.0F, 0.0F);
        this.em_leftarm.addBox(-1.0F, -2.0F, -1.0F, 2, 30, 2, 0.0F);
        this.setRotateAngle(em_leftarm, 0.0F, 0.0F, -0.10000736613927509F);
        this.em_rightleg = new ModelRenderer(this, 56, 0);
        this.em_rightleg.setRotationPoint(-2.0F, -5.0F, 0.0F);
        this.em_rightleg.addBox(-1.0F, 0.0F, -1.0F, 2, 30, 2, 0.0F);
        this.em_head = new ModelRenderer(this, 0, 0);
        this.em_head.setRotationPoint(0.0F, -13.0F, -0.0F);
        this.em_head.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F);
        this.em_lowerjaw = new ModelRenderer(this, 0, 16);
        this.em_lowerjaw.setRotationPoint(0.0F, -13.0F, -0.0F);
        this.em_lowerjaw.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8, -0.5F);
        this.em_rightarm = new ModelRenderer(this, 56, 0);
        this.em_rightarm.setRotationPoint(-5.0F, -12.0F, 0.0F);
        this.em_rightarm.addBox(-1.0F, -2.0F, -1.0F, 2, 30, 2, 0.0F);
        this.setRotateAngle(em_rightarm, 0.0F, 0.0F, 0.10000736613927509F);
        this.em_leftleg = new ModelRenderer(this, 56, 0);
        this.em_leftleg.mirror = true;
        this.em_leftleg.setRotationPoint(2.0F, -5.0F, 0.0F);
        this.em_leftleg.addBox(-1.0F, 0.0F, -1.0F, 2, 30, 2, 0.0F);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.em_torso.render(f5);
        this.em_leftarm.render(f5);
        this.em_rightleg.render(f5);
        this.em_head.render(f5);
        this.em_lowerjaw.render(f5);
        this.em_rightarm.render(f5);
        this.em_leftleg.render(f5);
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
    
    @Override
    public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor, Entity entityIn)
    {
    	this.em_rightleg.rotateAngleX = -1 * MathHelper.cos(limbSwing * 0.6662F) * 1.1F * limbSwingAmount;
    	this.em_leftleg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.1F * limbSwingAmount;
    	
    	this.em_rightarm.rotateAngleX = -1 * MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.1F * limbSwingAmount;
    	this.em_leftarm.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.1F * limbSwingAmount;
    	
    	this.em_head.rotateAngleX = headPitch * 0.017453292F;
    	this.em_head.rotateAngleY = netHeadYaw * 0.017453292F;
    	this.em_lowerjaw.rotateAngleX = headPitch * 0.017453292F;
    	this.em_lowerjaw.rotateAngleY = netHeadYaw * 0.017453292F;
    }
    
    
}
