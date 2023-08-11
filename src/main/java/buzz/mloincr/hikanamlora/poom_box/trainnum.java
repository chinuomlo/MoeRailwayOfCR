// Source code is decompiled from a .class file using FernFlower decompiler.
package buzz.mloincr.hikanamlora.poom_box;

import com.google.common.collect.ImmutableMap;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.block.AbstractSignBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SignBlock;
import net.minecraft.block.WallSignBlock;
import net.minecraft.block.entity.SignBlockEntity;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.font.TextRenderer;
import net.minecraft.client.model.ModelData;
import net.minecraft.client.model.ModelPartBuilder;
import net.minecraft.client.model.ModelPartData;
import net.minecraft.client.model.ModelTransform;
import net.minecraft.client.model.TexturedModelData;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.client.render.TexturedRenderLayers;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.model.EntityModelLayers;
import net.minecraft.client.render.entity.model.EntityModelLoader;
import net.minecraft.client.texture.NativeImage;
import net.minecraft.client.util.SpriteIdentifier;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.text.OrderedText;
import net.minecraft.util.DyeColor;
import net.minecraft.util.SignType;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.Vec3f;
import net.minecraft.client.render.block.entity.BlockEntityRenderer;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactory;
import net.minecraft.client.render.block.entity.SignBlockEntityRenderer.SignModel;
@Environment(EnvType.CLIENT)
public class trainnum implements BlockEntityRenderer<trainnumEntity> {
   private final TextRenderer textRenderer;
 
   public trainnum(BlockEntityRendererFactory.Context ctx) {
      this.textRenderer = ctx.getTextRenderer();
      Logger LOGGER = LoggerFactory.getLogger("modid");
      LOGGER.info("进入BER");
   }
   private static int getColor(trainnumEntity sign,NbtCompound nbt) {
      HashMap colornbt = sign.updateColors(nbt);
      int i = 1;
      int r = (int) colornbt.get("r");
      int g = (int) colornbt.get("g");
      int b = (int) colornbt.get("b");
      return i == DyeColor.BLACK.getSignColor() && true ? -988212 : NativeImage.packColor(1, r, g, b);
   }
   @Override
   public void render(trainnumEntity signBlockEntity, float f, MatrixStack matrixStack, VertexConsumerProvider vertexConsumerProvider, int i, int j) {
      Rerender(signBlockEntity, f, matrixStack, vertexConsumerProvider, i, j);
      NUMrender(signBlockEntity, f, matrixStack, vertexConsumerProvider, i, j);
      YS25render(signBlockEntity, f, matrixStack, vertexConsumerProvider, i, j);
      NUMFZrender(signBlockEntity, f, matrixStack, vertexConsumerProvider, i, j);
      BlockState blockState = signBlockEntity.getCachedState();
      matrixStack.push();
      signBlockEntity.toUpdatePacket();
      NbtCompound nbt = signBlockEntity.toInitialChunkDataNbt();
      HashMap<Integer,String> dist = signBlockEntity.updateSigns(nbt);
      int l = getColor(signBlockEntity,nbt);
      int n;
      boolean bl;
      int o;
      n = l;
      bl = false;
      o = 15728880;
      float q = (float)(5);
      float h;
      if (blockState.getBlock() instanceof SignBlock) {
         matrixStack.translate(0.5, 0.5, 0.5);
         h = -((float)((Integer)blockState.get(SignBlock.ROTATION) * 360) / 16.0F);
         matrixStack.multiply(Vec3f.POSITIVE_Y.getDegreesQuaternion(h));
      } else {
         matrixStack.translate(0.5, 0.5, 0.5);
         h = -((Direction)blockState.get(WallSignBlock.FACING)).asRotation();
         matrixStack.multiply(Vec3f.POSITIVE_Y.getDegreesQuaternion(h));
         matrixStack.translate(0.0, -0.3125, -0.4375);
      }
      matrixStack.translate(0.0, 0.3333333432674408, -0.920);
      matrixStack.scale(0.022416667F, -0.022416667F, 0.022416667F);
      this.textRenderer.draw(dist.get(2), (float)(-4.5), (float)(-3.25), n, false, matrixStack.peek().getPositionMatrix(), vertexConsumerProvider, false, 0, o);      
      
      
      
      matrixStack.pop();
   }
   public void Rerender(trainnumEntity signBlockEntity, float f, MatrixStack matrixStack, VertexConsumerProvider vertexConsumerProvider, int i, int j) {
      BlockState blockState = signBlockEntity.getCachedState();
      matrixStack.push();
      signBlockEntity.toUpdatePacket();
      NbtCompound nbt = signBlockEntity.toInitialChunkDataNbt();
      HashMap<Integer,String> dist = signBlockEntity.updateSigns(nbt);
      int l = getColor(signBlockEntity,nbt);
      int n;
      boolean bl;
      int o;
      n = l;
      bl = false;
      o = 15728880;
      float q = (float)(5);
      float h;
      if (blockState.getBlock() instanceof SignBlock) {
         matrixStack.translate(0.5, 0.5, 0.5);
         h = -((float)((Integer)blockState.get(SignBlock.ROTATION) * 360) / 16.0F);
         matrixStack.multiply(Vec3f.POSITIVE_Y.getDegreesQuaternion(h));
      } else {
         matrixStack.translate(0.5, 0.5, 0.5);
         h = -((Direction)blockState.get(WallSignBlock.FACING)).asRotation();
         matrixStack.multiply(Vec3f.POSITIVE_Y.getDegreesQuaternion(h));
         matrixStack.translate(0.0, -0.3125, -0.4375);
      }
      matrixStack.translate(0.0, 0.3333333432674408, -0.920);
      matrixStack.scale(0.007416667F, -0.007416667F, 0.007416667F);
      
      this.textRenderer.draw(dist.get(3), (float)(-1.75), (float)(13.75), n, false, matrixStack.peek().getPositionMatrix(), vertexConsumerProvider, false, 0, o);      
      
      matrixStack.pop();
   }
   public void NUMrender(trainnumEntity signBlockEntity, float f, MatrixStack matrixStack, VertexConsumerProvider vertexConsumerProvider, int i, int j) {
      BlockState blockState = signBlockEntity.getCachedState();
      matrixStack.push();
      signBlockEntity.toUpdatePacket();
      NbtCompound nbt = signBlockEntity.toInitialChunkDataNbt();
      HashMap<Integer,String> dist = signBlockEntity.updateSigns(nbt);
      int l = getColor(signBlockEntity,nbt);
      int n;
      boolean bl;
      int o;
      n = l;
      bl = false;
      o = 15728880;
      float q = (float)(5);
      float h;
      if (blockState.getBlock() instanceof SignBlock) {
         matrixStack.translate(0.5, 0.5, 0.5);
         h = -((float)((Integer)blockState.get(SignBlock.ROTATION) * 360) / 16.0F);
         matrixStack.multiply(Vec3f.POSITIVE_Y.getDegreesQuaternion(h));
      } else {
         matrixStack.translate(0.5, 0.5, 0.5);
         h = -((Direction)blockState.get(WallSignBlock.FACING)).asRotation();
         matrixStack.multiply(Vec3f.POSITIVE_Y.getDegreesQuaternion(h));
         matrixStack.translate(0.0, -0.3125, -0.4375);
      }
      matrixStack.translate(0.0, 0.3333333432674408, -0.920);
      matrixStack.scale(0.030416667F, -0.030416667F, 0.030416667F);
      
      this.textRenderer.draw(dist.get(5), (float)(23), (float)(-2), n, false, matrixStack.peek().getPositionMatrix(), vertexConsumerProvider, false, 0, o);      
      
      matrixStack.pop();
   }
   public void YS25render(trainnumEntity signBlockEntity, float f, MatrixStack matrixStack, VertexConsumerProvider vertexConsumerProvider, int i, int j) {
      BlockState blockState = signBlockEntity.getCachedState();
      matrixStack.push();
      signBlockEntity.toUpdatePacket();
      NbtCompound nbt = signBlockEntity.toInitialChunkDataNbt();
      HashMap<Integer,String> dist = signBlockEntity.updateSigns(nbt);
      int l = getColor(signBlockEntity,nbt);
      int n;
      boolean bl;
      int o;
      n = l;
      bl = false;
      o = 15728880;
      float q = (float)(5);
      float h;
      if (blockState.getBlock() instanceof SignBlock) {
         matrixStack.translate(0.5, 0.5, 0.5);
         h = -((float)((Integer)blockState.get(SignBlock.ROTATION) * 360) / 16.0F);
         matrixStack.multiply(Vec3f.POSITIVE_Y.getDegreesQuaternion(h));
      } else {
         matrixStack.translate(0.5, 0.5, 0.5);
         h = -((Direction)blockState.get(WallSignBlock.FACING)).asRotation();
         matrixStack.multiply(Vec3f.POSITIVE_Y.getDegreesQuaternion(h));
         matrixStack.translate(0.0, -0.3125, -0.4375);
      }
      matrixStack.translate(0.0, 0.3333333432674408, -0.920);
      matrixStack.scale(0.017416667F, -0.017416667F, 0.017416667F);
      
      this.textRenderer.draw(dist.get(1), (float)(58.5), (float)(1), n, false, matrixStack.peek().getPositionMatrix(), vertexConsumerProvider, false, 0, o);      
      
      matrixStack.pop();
   }
   public void NUMFZrender(trainnumEntity signBlockEntity, float f, MatrixStack matrixStack, VertexConsumerProvider vertexConsumerProvider, int i, int j) {
      BlockState blockState = signBlockEntity.getCachedState();
      matrixStack.push();
      signBlockEntity.toUpdatePacket();
      NbtCompound nbt = signBlockEntity.toInitialChunkDataNbt();
      HashMap<Integer,String> dist = signBlockEntity.updateSigns(nbt);
      int l = getColor(signBlockEntity,nbt);
      int n;
      boolean bl;
      int o;
      n = l;
      bl = false;
      o = 15728880;
      float q = (float)(5);
      float h;
      if (blockState.getBlock() instanceof SignBlock) {
         matrixStack.translate(0.5, 0.5, 0.5);
         h = -((float)((Integer)blockState.get(SignBlock.ROTATION) * 360) / 16.0F);
         matrixStack.multiply(Vec3f.POSITIVE_Y.getDegreesQuaternion(h));
      } else {
         matrixStack.translate(0.5, 0.5, 0.5);
         h = -((Direction)blockState.get(WallSignBlock.FACING)).asRotation();
         matrixStack.multiply(Vec3f.POSITIVE_Y.getDegreesQuaternion(h));
         matrixStack.translate(0.0, -0.3125, -0.4375);
      }
      matrixStack.translate(0.0, 0.3333333432674408, -0.920);
      matrixStack.scale(0.030416667F, -0.030416667F, 0.030416667F);
      
      this.textRenderer.draw(dist.get(4), (float)(45), (float)(-2), n, false, matrixStack.peek().getPositionMatrix(), vertexConsumerProvider, false, 0, o);      
      
      matrixStack.pop();
   }
}
