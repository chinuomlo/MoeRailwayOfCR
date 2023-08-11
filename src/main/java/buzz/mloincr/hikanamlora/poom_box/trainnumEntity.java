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

public class trainnumEntity extends BlockEntity{
    private String chexing = "25G";
    private String zuoxi = "硬座车";
    private String quanping = "YINGZUOCHE";
    private String chehao = "351240";
    private String zuoping = "YZ";
    private Integer r = 255;
    private Integer g = 24;
    private Integer b = 24;
    public trainnumEntity(BlockPos pos, BlockState state) {
        super(Hikanamlora.trainnumblock_En,pos, state);
    }
    @Override
    public void writeNbt(NbtCompound nbt) {
        //String chexing = "25G";
        //String zuoxi = "硬座车";
        //String quanping = "YINGZUOCHE";
        //String chehao = "351240";
        //String zuoping = "YZ";
        // Save the current value of the number to the tag
        nbt.putString("chexing", chexing);
        nbt.putString("zuoxi", zuoxi);
        nbt.putString("quanping", quanping);
        nbt.putString("chehao", chehao);
        nbt.putString("zuoping", zuoping);
        nbt.putInt("r",r);
        nbt.putInt("g",g);
        nbt.putInt("b",b);
        super.writeNbt(nbt);
    }
    @Override
    public void readNbt(NbtCompound nbt) {
        super.readNbt(nbt);
        this.chexing = nbt.getString("chexing");
        this.zuoxi = nbt.getString("zuoxi");
        this.quanping = nbt.getString("quanping");
        this.chehao = nbt.getString("chehao");
        this.zuoping = nbt.getString("zuoping");
        this.r = nbt.getInt("r");
        this.g = nbt.getInt("g");
        this.b = nbt.getInt("b");


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
      dist.put(1,this.chexing);
      dist.put(2,this.zuoxi);
      dist.put(3,this.quanping);
      dist.put(4,this.chehao);
      dist.put(5,this.zuoping);
      return dist;
    } 
    public HashMap<String,Integer> updateColors(NbtCompound nbt){
      toUpdatePacket();
      readNbt(nbt);
      HashMap<String,Integer> dist = new HashMap<>();
      dist.put("r",this.r);
      dist.put("g",this.g);
      dist.put("b",this.b);
      return dist;
    }
    @Override
    public NbtCompound toInitialChunkDataNbt() {
      return createNbt();
    }
}
