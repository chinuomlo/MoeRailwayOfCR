package buzz.mloincr.hikanamlora;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.Environment;
import net.fabricmc.api.EnvType;
import buzz.mloincr.hikanamlora.poom_box.crun1;
import buzz.mloincr.hikanamlora.poom_box.sidc1;
import buzz.mloincr.hikanamlora.poom_box.sidc2;
import buzz.mloincr.hikanamlora.poom_box.sp;
import buzz.mloincr.hikanamlora.poom_box.suis;
import buzz.mloincr.hikanamlora.poom_box.trainnum;
import net.fabricmc.fabric.api.client.rendering.v1.BlockEntityRendererRegistry;

@Environment(EnvType.CLIENT)
public class Hikanamlora_cilent implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        // 这里我们放置只在客户端注册的代码
        BlockEntityRendererRegistry.register(buzz.mloincr.hikanamlora.Hikanamlora.trainnumblock_En, trainnum::new);
        BlockEntityRendererRegistry.register(buzz.mloincr.hikanamlora.Hikanamlora.sidc1_En, sidc1::new);
        BlockEntityRendererRegistry.register(buzz.mloincr.hikanamlora.Hikanamlora.sidc2_En, sidc2::new);
        BlockEntityRendererRegistry.register(buzz.mloincr.hikanamlora.Hikanamlora.crun1_En, crun1::new);
        BlockEntityRendererRegistry.register(buzz.mloincr.hikanamlora.Hikanamlora.sui_En, suis::new);
        BlockEntityRendererRegistry.register(buzz.mloincr.hikanamlora.Hikanamlora.sps_En, sp::new);
    }
}













