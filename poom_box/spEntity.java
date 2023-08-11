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

public class spEntity extends BlockEntity{
    private String zhanming = "还安谷";
    private String quanping = "HUANANGU";
    private String rzhanming = "潼山";
    private String rquanping = "TONGSHAN";
    private String chehao = "K1/2";
    private String ul = "快";
    private String ur = "速";
    public spEntity(BlockPos pos, BlockState state) {
        super(Hikanamlora.sps_En,pos, state);
    }
    @Override
    public void writeNbt(NbtCompound nbt) {
        nbt.putString("zhanming", zhanming);
        nbt.putString("quanping", quanping);
        nbt.putString("rzhanming", rzhanming);
        nbt.putString("rquanping", rquanping);
        nbt.putString("chehao", chehao);
        nbt.putString("ul", ul);
        nbt.putString("ur", ur);
        super.writeNbt(nbt);
    }
    @Override
    public void readNbt(NbtCompound nbt) {
        super.readNbt(nbt);
        this.zhanming   = nbt.getString("zhanming");
        this.quanping   = nbt.getString("quanping");
        this.rzhanming = nbt.getString("rzhanming");
        this.rquanping = nbt.getString("rquanping");
        this.chehao    = nbt.getString("chehao");
        this.ul        = nbt.getString("ul");
        this.ur        = nbt.getString("ur");

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
      dist.put(1,this.zhanming );
      dist.put(2,this.quanping );
      dist.put(3,this.rzhanming);
      dist.put(4,this.rquanping);
      dist.put(5,this.chehao   );
      dist.put(6,this.ul       );
      dist.put(7,this.ur       );
      return dist;
    } 
    @Override
    public NbtCompound toInitialChunkDataNbt() {
      return createNbt();
    }
}
