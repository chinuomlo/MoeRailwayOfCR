package buzz.mloincr.hikanamlora.poom_box;

import buzz.mloincr.hikanamlora.Hikanamlora;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.network.listener.ClientPlayPacketListener;
import net.minecraft.network.packet.s2c.play.BlockEntityUpdateS2CPacket;
import net.minecraft.util.math.BlockPos;

import java.util.HashMap;

import javax.annotation.Nullable;

import org.spongepowered.asm.mixin.injection.struct.InjectorGroupInfo.Map;

import net.minecraft.network.Packet;

public class suiEntity extends BlockEntity{
    private String zhanming = "拉白";
    private String quanping = "Labai Railway Station";
    public suiEntity(BlockPos pos, BlockState state) {
        super(Hikanamlora.sui_En,pos, state);
    }
    @Override
    public void writeNbt(NbtCompound nbt) {
        nbt.putString("zhanming", zhanming);
        nbt.putString("quanping", quanping);
        super.writeNbt(nbt);
    }
    @Override
    public void readNbt(NbtCompound nbt) {
        super.readNbt(nbt);
        this.zhanming = nbt.getString("zhanming");
        this.quanping = nbt.getString("quanping");



    }
    @Nullable
    @Override
    public Packet<ClientPlayPacketListener> toUpdatePacket() {
      return BlockEntityUpdateS2CPacket.create(this);
    }
    public HashMap<Integer,String> updateSigns(NbtCompound nbt){
      toUpdatePacket();
      readNbt(nbt);
      HashMap<Integer,String> dist = new HashMap<>();
      dist.put(1,this.zhanming);
      dist.put(2,this.quanping);
      return dist;
    } 
    @Override
    public NbtCompound toInitialChunkDataNbt() {
      return createNbt();
    }
}
