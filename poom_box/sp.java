// Source code is decompiled from a .class file using FernFlower decompiler.
package buzz.mloincr.hikanamlora.poom_box;

import java.util.HashMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.block.BlockState;
import net.minecraft.block.SignBlock;
import net.minecraft.block.WallSignBlock;
import net.minecraft.client.font.TextRenderer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.texture.NativeImage;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.util.DyeColor;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Vec3f;
import net.minecraft.client.render.block.entity.BlockEntityRenderer;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactory;
@Environment(EnvType.CLIENT)
public class sp implements BlockEntityRenderer<spEntity> {
   private final TextRenderer textRenderer;
 
   public sp(BlockEntityRendererFactory.Context ctx) {
      this.textRenderer = ctx.getTextRenderer();
      Logger LOGGER = LoggerFactory.getLogger("modid");
      LOGGER.info("进入BER");
   }
   private static int getColor(spEntity sign) {
      int i = 1;
      int r = 0;
      int g = 0;
      int b = 0;
      return i == DyeColor.BLACK.getSignColor() && true ? -988212 : NativeImage.packColor(1, r, g, b);
   }
   @Override
   public void render(spEntity signBlockEntity, float f, MatrixStack matrixStack, VertexConsumerProvider vertexConsumerProvider, int i, int j) {
      Rerender(signBlockEntity, f, matrixStack, vertexConsumerProvider, i, j);
      rRerender(signBlockEntity, f, matrixStack, vertexConsumerProvider, i, j);
      rrender(signBlockEntity, f, matrixStack, vertexConsumerProvider, i, j);
      ulrender(signBlockEntity, f, matrixStack, vertexConsumerProvider, i, j);
      urrender(signBlockEntity, f, matrixStack, vertexConsumerProvider, i, j);
      hrender(signBlockEntity, f, matrixStack, vertexConsumerProvider, i, j);
      BlockState blockState = signBlockEntity.getCachedState();
      matrixStack.push();
      signBlockEntity.toUpdatePacket();
      NbtCompound nbt = signBlockEntity.toInitialChunkDataNbt();
      HashMap<Integer,String> dist = signBlockEntity.updateSigns(nbt);
      int l = getColor(signBlockEntity);
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
      matrixStack.scale(0.011416667F, -0.011416667F, 0.011416667F);
      this.textRenderer.draw(dist.get(1), (float)((-this.textRenderer.getWidth(dist.get(1))/2)-26), (float)(-27), n, false, matrixStack.peek().getPositionMatrix(), vertexConsumerProvider, false, 0, o);      
      matrixStack.pop();
   }
   public void Rerender(spEntity signBlockEntity, float f, MatrixStack matrixStack, VertexConsumerProvider vertexConsumerProvider, int i, int j) {
      BlockState blockState = signBlockEntity.getCachedState();
      matrixStack.push();
      signBlockEntity.toUpdatePacket();
      NbtCompound nbt = signBlockEntity.toInitialChunkDataNbt();
      HashMap<Integer,String> dist = signBlockEntity.updateSigns(nbt);
      int l = getColor(signBlockEntity);
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
      matrixStack.scale(0.005416667F, -0.005416667F, 0.005416667F);
      
      this.textRenderer.draw(dist.get(2), (float)((-this.textRenderer.getWidth(dist.get(2))/2)-56), (float)(-32), n, false, matrixStack.peek().getPositionMatrix(), vertexConsumerProvider, false, 0, o);      
      matrixStack.pop();
   }
   public void rRerender(spEntity signBlockEntity, float f, MatrixStack matrixStack, VertexConsumerProvider vertexConsumerProvider, int i, int j) {
      BlockState blockState = signBlockEntity.getCachedState();
      matrixStack.push();
      signBlockEntity.toUpdatePacket();
      NbtCompound nbt = signBlockEntity.toInitialChunkDataNbt();
      HashMap<Integer,String> dist = signBlockEntity.updateSigns(nbt);
      int l = getColor(signBlockEntity);
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
      matrixStack.scale(0.005416667F, -0.005416667F, 0.005416667F);
      
      this.textRenderer.draw(dist.get(4), (float)((-this.textRenderer.getWidth(dist.get(2))/2)+56), (float)(-32), n, false, matrixStack.peek().getPositionMatrix(), vertexConsumerProvider, false, 0, o);      
      matrixStack.pop();
   }
   public void rrender(spEntity signBlockEntity, float f, MatrixStack matrixStack, VertexConsumerProvider vertexConsumerProvider, int i, int j) {
      BlockState blockState = signBlockEntity.getCachedState();
      matrixStack.push();
      signBlockEntity.toUpdatePacket();
      NbtCompound nbt = signBlockEntity.toInitialChunkDataNbt();
      HashMap<Integer,String> dist = signBlockEntity.updateSigns(nbt);
      int l = getColor(signBlockEntity);
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
      matrixStack.scale(0.011416667F, -0.011416667F, 0.011416667F);
      
      this.textRenderer.draw(dist.get(3), (float)((-this.textRenderer.getWidth(dist.get(1))/2)+26), (float)(-27), n, false, matrixStack.peek().getPositionMatrix(), vertexConsumerProvider, false, 0, o);      
      matrixStack.pop();
   }
   public void hrender(spEntity signBlockEntity, float f, MatrixStack matrixStack, VertexConsumerProvider vertexConsumerProvider, int i, int j) {
      BlockState blockState = signBlockEntity.getCachedState();
      matrixStack.push();
      signBlockEntity.toUpdatePacket();
      NbtCompound nbt = signBlockEntity.toInitialChunkDataNbt();
      HashMap<Integer,String> dist = signBlockEntity.updateSigns(nbt);
      int l = getColor(signBlockEntity);
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
      matrixStack.scale(0.003416667F, -0.003416667F, 0.003416667F);
      
      this.textRenderer.draw(dist.get(5), (float)((-this.textRenderer.getWidth(dist.get(2))/2)+12.5), (float)(-40), n, false, matrixStack.peek().getPositionMatrix(), vertexConsumerProvider, false, 0, o);      
      matrixStack.pop();
   }
   public void ulrender(spEntity signBlockEntity, float f, MatrixStack matrixStack, VertexConsumerProvider vertexConsumerProvider, int i, int j) {
      BlockState blockState = signBlockEntity.getCachedState();
      matrixStack.push();
      signBlockEntity.toUpdatePacket();
      NbtCompound nbt = signBlockEntity.toInitialChunkDataNbt();
      HashMap<Integer,String> dist = signBlockEntity.updateSigns(nbt);
      int l = getColor(signBlockEntity);
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
      matrixStack.scale(0.003416667F, -0.003416667F, 0.003416667F);
      
      this.textRenderer.draw(dist.get(6), (float)((-this.textRenderer.getWidth(dist.get(2))/2)+1), (float)(-90), n, false, matrixStack.peek().getPositionMatrix(), vertexConsumerProvider, false, 0, o);      
      matrixStack.pop();
   }
   public void urrender(spEntity signBlockEntity, float f, MatrixStack matrixStack, VertexConsumerProvider vertexConsumerProvider, int i, int j) {
      BlockState blockState = signBlockEntity.getCachedState();
      matrixStack.push();
      signBlockEntity.toUpdatePacket();
      NbtCompound nbt = signBlockEntity.toInitialChunkDataNbt();
      HashMap<Integer,String> dist = signBlockEntity.updateSigns(nbt);
      int l = getColor(signBlockEntity);
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
      matrixStack.scale(0.003416667F, -0.003416667F, 0.003416667F);
      
      this.textRenderer.draw(dist.get(7), (float)((-this.textRenderer.getWidth(dist.get(2))/2)+43), (float)(-90), n, false, matrixStack.peek().getPositionMatrix(), vertexConsumerProvider, false, 0, o);      
      matrixStack.pop();
   }
}
   