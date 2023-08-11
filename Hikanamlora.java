package buzz.mloincr.hikanamlora;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.Material;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import buzz.mloincr.hikanamlora.poom_box.crun1Entity;
import buzz.mloincr.hikanamlora.poom_box.crun1_pb;
import buzz.mloincr.hikanamlora.poom_box.debian;
import buzz.mloincr.hikanamlora.poom_box.unventi;
import buzz.mloincr.hikanamlora.poom_box.webian;
import buzz.mloincr.hikanamlora.poom_box.door;
import buzz.mloincr.hikanamlora.poom_box.sidc1;
import buzz.mloincr.hikanamlora.poom_box.trainnumEntity;
import buzz.mloincr.hikanamlora.poom_box.sidc1_pb;
import buzz.mloincr.hikanamlora.poom_box.sidc2Entity;
import buzz.mloincr.hikanamlora.poom_box.sidc2_pb;
import buzz.mloincr.hikanamlora.poom_box.spEntity;
import buzz.mloincr.hikanamlora.poom_box.sp_pb;
import buzz.mloincr.hikanamlora.poom_box.suiEntity;
import buzz.mloincr.hikanamlora.poom_box.sui_pb;
import buzz.mloincr.hikanamlora.poom_box.top;
import buzz.mloincr.hikanamlora.poom_box.sidc1Entity;
import buzz.mloincr.hikanamlora.poom_box.trainnum_pb;
import buzz.mloincr.hikanamlora.poom_box.tsp;
public class Hikanamlora implements ModInitializer {
	
	// 注册各类生草方块的地方
	public static final debian ys25g_debian = new debian(FabricBlockSettings.of(Material.METAL));
	public static final debian ys25g_debian_speed = new debian(FabricBlockSettings.of(Material.METAL));
	public static final webian ys25g_dw = new webian(FabricBlockSettings.of(Material.METAL));
	public static final webian ys25g_md = new webian(FabricBlockSettings.of(Material.METAL));
	public static final webian ys25g_up = new webian(FabricBlockSettings.of(Material.METAL));
	public static final webian ys25g_windows = new webian(FabricBlockSettings.of(Material.METAL));
	public static final webian ys25g_windows_l = new webian(FabricBlockSettings.of(Material.METAL));
	public static final webian ys25g_windows_r = new webian(FabricBlockSettings.of(Material.METAL));
	public static final webian ys25g_windows_s = new webian(FabricBlockSettings.of(Material.METAL));
	public static final top ys_top = new top(FabricBlockSettings.of(Material.METAL));
	public static final top ys_top_c = new top(FabricBlockSettings.of(Material.METAL));
	public static final unventi ys25g_unventi = new unventi(FabricBlockSettings.of(Material.METAL));
	public static final door ys25g_door = new door(FabricBlockSettings.of(Material.METAL));
	public static final trainnum_pb trainnumblock = new trainnum_pb(FabricBlockSettings.of(Material.METAL));
	public static final webian ty25k_cr_window_open    = new webian(FabricBlockSettings.of(Material.METAL));
	public static final webian ty25k_cr_window          = new webian(FabricBlockSettings.of(Material.METAL));
	public static final webian ty25k_cr_windowl          = new webian(FabricBlockSettings.of(Material.METAL));
	public static final webian ty25k_cr_window_small   = new webian(FabricBlockSettings.of(Material.METAL));
	public static final webian ty25k_cr_up     			= new webian(FabricBlockSettings.of(Material.METAL));
	public static final webian ty25k_cr_md     			= new webian(FabricBlockSettings.of(Material.METAL));
	public static final webian ty25k_cr_dw     			= new webian(FabricBlockSettings.of(Material.METAL));
	public static final webian ty25k_cr_dw_b   			    = new webian(FabricBlockSettings.of(Material.METAL));
	public static final webian ty25k_cr_dw_b_l 			      = new webian(FabricBlockSettings.of(Material.METAL));
	public static final webian ty25k_cr_dw_b_r 			    = new webian(FabricBlockSettings.of(Material.METAL));
	public static final debian ty25k_floor     			= new debian(FabricBlockSettings.of(Material.METAL));
	public static final debian ty25k_floor_120k   		 = new debian(FabricBlockSettings.of(Material.METAL));
	public static final unventi ty25k_unventi     		         = new unventi(FabricBlockSettings.of(Material.METAL));
	public static final door ty25k_door           		  = new door(FabricBlockSettings.of(Material.METAL));
	public static final sidc1_pb sidc1 = new sidc1_pb(FabricBlockSettings.of(Material.METAL));
	public static final sidc2_pb sidc2 = new sidc2_pb(FabricBlockSettings.of(Material.METAL));
	public static final crun1_pb crun1 = new crun1_pb(FabricBlockSettings.of(Material.METAL));
	public static final sui_pb sui = new sui_pb(FabricBlockSettings.of(Material.METAL));
	public static final tsp tsp = new tsp(FabricBlockSettings.of(Material.METAL));
	public static final sp_pb sps = new sp_pb(FabricBlockSettings.of(Material.METAL));
	public static final webian hxd1_h 			    = new webian(FabricBlockSettings.of(Material.METAL));
	public static final BlockEntityType<trainnumEntity> trainnumblock_En = Registry.register(
        Registry.BLOCK_ENTITY_TYPE,
        new Identifier("hikanamlora", "demo_block_entity"),
        FabricBlockEntityTypeBuilder.create(trainnumEntity::new, trainnumblock).build()
    );
	public static final BlockEntityType<sidc1Entity> sidc1_En = Registry.register(
        Registry.BLOCK_ENTITY_TYPE,
        new Identifier("hikanamlora", "sidc1"),
        FabricBlockEntityTypeBuilder.create(sidc1Entity::new, sidc1).build()
    );
	public static final BlockEntityType<sidc2Entity> sidc2_En = Registry.register(
        Registry.BLOCK_ENTITY_TYPE,
        new Identifier("hikanamlora", "sidc2"),
        FabricBlockEntityTypeBuilder.create(sidc2Entity::new, sidc2).build()
    );
	public static final BlockEntityType<crun1Entity> crun1_En = Registry.register(
        Registry.BLOCK_ENTITY_TYPE,
        new Identifier("hikanamlora", "crun1"),
        FabricBlockEntityTypeBuilder.create(crun1Entity::new, crun1).build()
    );
	public static final BlockEntityType<suiEntity> sui_En = Registry.register(
        Registry.BLOCK_ENTITY_TYPE,
        new Identifier("hikanamlora", "sui"),
        FabricBlockEntityTypeBuilder.create(suiEntity::new, sui).build()
    );
	public static final BlockEntityType<spEntity> sps_En = Registry.register(
        Registry.BLOCK_ENTITY_TYPE,
        new Identifier("hikanamlora", "sps"),
        FabricBlockEntityTypeBuilder.create(spEntity::new, sps).build()
    );
	public static final Logger LOGGER = LoggerFactory.getLogger("modid");
	@Override
	public void onInitialize() {
		LOGGER.info("方块注册完毕");
		//众嗦粥汁，这里是注册各类Block、Item和ItemGroup的地方
		Registry.register(Registry.ITEM,  new Identifier("hikanamlora",  "ys25g_debian"), new BlockItem(ys25g_debian, new FabricItemSettings()));
		Registry.register(Registry.ITEM,  new Identifier("hikanamlora",  "ys25g_debian_speed"), new BlockItem(ys25g_debian_speed, new FabricItemSettings()));
		Registry.register(Registry.ITEM,  new Identifier("hikanamlora",  "ys25g_dw"), new BlockItem(ys25g_dw, new FabricItemSettings()));
		Registry.register(Registry.ITEM,  new Identifier("hikanamlora",  "ys25g_md"), new BlockItem(ys25g_md, new FabricItemSettings()));
		Registry.register(Registry.ITEM,  new Identifier("hikanamlora",  "ys25g_up"), new BlockItem(ys25g_up, new FabricItemSettings()));
    	Registry.register(Registry.ITEM,  new Identifier("hikanamlora",  "ys25g_windows"), new BlockItem(ys25g_windows , new FabricItemSettings()));
		Registry.register(Registry.ITEM,  new Identifier("hikanamlora",  "ys25g_windows_l"), new BlockItem(ys25g_windows_l, new FabricItemSettings()));
		Registry.register(Registry.ITEM,  new Identifier("hikanamlora",  "ys25g_windows_r"), new BlockItem(ys25g_windows_r, new FabricItemSettings()));
		Registry.register(Registry.ITEM,  new Identifier("hikanamlora",  "ys25g_windows_s"), new BlockItem(ys25g_windows_s, new FabricItemSettings()));
		Registry.register(Registry.ITEM,  new Identifier("hikanamlora",  "ys_top"), new BlockItem(ys_top, new FabricItemSettings()));
		Registry.register(Registry.ITEM,  new Identifier("hikanamlora",  "ys_top_c"), new BlockItem(ys_top_c, new FabricItemSettings()));
		Registry.register(Registry.ITEM,  new Identifier("hikanamlora",  "ys25g_unventi"), new BlockItem(ys25g_unventi, new FabricItemSettings()));
		Registry.register(Registry.ITEM,  new Identifier("hikanamlora",  "ys25g_door"), new BlockItem(ys25g_door, new FabricItemSettings()));
		Registry.register(Registry.ITEM,  new Identifier("hikanamlora",  "trainnumblock"), new BlockItem(trainnumblock, new FabricItemSettings()));
		
		
		LOGGER.info("Item注册完毕");
		Registry.register(Registry.BLOCK, new Identifier("hikanamlora",  "ys25g_debian"),ys25g_debian);
		Registry.register(Registry.BLOCK, new Identifier("hikanamlora",  "ys25g_debian_speed"),ys25g_debian_speed);
		Registry.register(Registry.BLOCK, new Identifier("hikanamlora",  "ys25g_dw"),ys25g_dw);
		Registry.register(Registry.BLOCK, new Identifier("hikanamlora",  "ys25g_md"),ys25g_md);
		Registry.register(Registry.BLOCK, new Identifier("hikanamlora",  "ys25g_up"),ys25g_up);
		Registry.register(Registry.BLOCK, new Identifier("hikanamlora",  "ys25g_windows"),ys25g_windows );
		Registry.register(Registry.BLOCK, new Identifier("hikanamlora",  "ys25g_windows_l"),ys25g_windows_l);
		Registry.register(Registry.BLOCK, new Identifier("hikanamlora",  "ys25g_windows_r"),ys25g_windows_r);
		Registry.register(Registry.BLOCK, new Identifier("hikanamlora",  "ys25g_windows_s"),ys25g_windows_s);
		Registry.register(Registry.BLOCK, new Identifier("hikanamlora",  "ys_top"),ys_top);
		Registry.register(Registry.BLOCK, new Identifier("hikanamlora",  "ys_top_c"),ys_top_c);
		Registry.register(Registry.BLOCK, new Identifier("hikanamlora",  "ys25g_unventi"),ys25g_unventi);
		Registry.register(Registry.BLOCK, new Identifier("hikanamlora",  "ys25g_door"),ys25g_door);
		Registry.register(Registry.BLOCK, new Identifier("hikanamlora",  "trainnumblock"),trainnumblock);

        //ty25k_cr_window_open
        Registry.register(Registry.ITEM,  new Identifier("hikanamlora", "ty25k_cr_window_open"), new BlockItem(ty25k_cr_window_open, new FabricItemSettings()));
        Registry.register(Registry.BLOCK, new Identifier("hikanamlora", "ty25k_cr_window_open"),               ty25k_cr_window_open);


        //ty25k_cr_window
        Registry.register(Registry.ITEM,  new Identifier("hikanamlora", "ty25k_cr_window"), new BlockItem(ty25k_cr_window, new FabricItemSettings()));
        Registry.register(Registry.BLOCK, new Identifier("hikanamlora", "ty25k_cr_window"),               ty25k_cr_window);
		Registry.register(Registry.ITEM,  new Identifier("hikanamlora", "ty25k_cr_windowl"), new BlockItem(ty25k_cr_windowl, new FabricItemSettings()));
        Registry.register(Registry.BLOCK, new Identifier("hikanamlora", "ty25k_cr_windowl"),               ty25k_cr_windowl);


        //ty25k_cr_window_small
        Registry.register(Registry.ITEM,  new Identifier("hikanamlora", "ty25k_cr_window_small"), new BlockItem(ty25k_cr_window_small, new FabricItemSettings()));
        Registry.register(Registry.BLOCK, new Identifier("hikanamlora", "ty25k_cr_window_small"),               ty25k_cr_window_small);


        //ty25k_cr_up
        Registry.register(Registry.ITEM,  new Identifier("hikanamlora", "ty25k_cr_up"), new BlockItem(ty25k_cr_up, new FabricItemSettings()));
        Registry.register(Registry.BLOCK, new Identifier("hikanamlora", "ty25k_cr_up"),               ty25k_cr_up);


        //ty25k_cr_md
        Registry.register(Registry.ITEM,  new Identifier("hikanamlora", "ty25k_cr_md"), new BlockItem(ty25k_cr_md, new FabricItemSettings()));
        Registry.register(Registry.BLOCK, new Identifier("hikanamlora", "ty25k_cr_md"),               ty25k_cr_md);


        //ty25k_cr_dw
        Registry.register(Registry.ITEM,  new Identifier("hikanamlora", "ty25k_cr_dw"), new BlockItem(ty25k_cr_dw, new FabricItemSettings()));
        Registry.register(Registry.BLOCK, new Identifier("hikanamlora", "ty25k_cr_dw"),               ty25k_cr_dw);

		Registry.register(Registry.ITEM,  new Identifier("hikanamlora", "ty25k_floor"), new BlockItem(ty25k_floor, new FabricItemSettings()));
		Registry.register(Registry.BLOCK, new Identifier("hikanamlora", "ty25k_floor"),               ty25k_floor);
		Registry.register(Registry.ITEM,  new Identifier("hikanamlora", "ty25k_floor_120k"), new BlockItem(ty25k_floor_120k, new FabricItemSettings()));
		Registry.register(Registry.BLOCK, new Identifier("hikanamlora", "ty25k_floor_120k"),               ty25k_floor_120k);
		Registry.register(Registry.ITEM,  new Identifier("hikanamlora", "ty25k_unventi"), new BlockItem(ty25k_unventi, new FabricItemSettings()));
		Registry.register(Registry.BLOCK, new Identifier("hikanamlora", "ty25k_unventi"),               ty25k_unventi);
		Registry.register(Registry.ITEM,  new Identifier("hikanamlora", "ty25k_door"), new BlockItem(ty25k_door, new FabricItemSettings()));
		Registry.register(Registry.BLOCK, new Identifier("hikanamlora", "ty25k_door"),               ty25k_door);

		Registry.register(Registry.ITEM,  new Identifier("hikanamlora", "ty25k_cr_dw_b"), new BlockItem(ty25k_cr_dw_b, new FabricItemSettings()));
		Registry.register(Registry.BLOCK, new Identifier("hikanamlora", "ty25k_cr_dw_b"),               ty25k_cr_dw_b);

		Registry.register(Registry.ITEM,  new Identifier("hikanamlora", "ty25k_cr_dw_b_l"), new BlockItem(ty25k_cr_dw_b_l, new FabricItemSettings()));
		Registry.register(Registry.BLOCK, new Identifier("hikanamlora", "ty25k_cr_dw_b_l"),               ty25k_cr_dw_b_l);

		Registry.register(Registry.ITEM,  new Identifier("hikanamlora", "ty25k_cr_dw_b_r"), new BlockItem(ty25k_cr_dw_b_r, new FabricItemSettings()));
		Registry.register(Registry.BLOCK, new Identifier("hikanamlora", "ty25k_cr_dw_b_r"),               ty25k_cr_dw_b_r);
		
		Registry.register(Registry.ITEM,  new Identifier("hikanamlora", "sidc1"), new BlockItem(sidc1, new FabricItemSettings()));
		Registry.register(Registry.BLOCK, new Identifier("hikanamlora", "sidc1"),               sidc1);
		Registry.register(Registry.ITEM,  new Identifier("hikanamlora", "sidc2"), new BlockItem(sidc2, new FabricItemSettings()));
		Registry.register(Registry.BLOCK, new Identifier("hikanamlora", "sidc2"),               sidc2);
		Registry.register(Registry.ITEM,  new Identifier("hikanamlora", "tsp"), new BlockItem(tsp, new FabricItemSettings()));
		Registry.register(Registry.BLOCK, new Identifier("hikanamlora", "tsp"),               tsp);
		Registry.register(Registry.ITEM,  new Identifier("hikanamlora", "crun1"), new BlockItem(crun1, new FabricItemSettings()));
		Registry.register(Registry.BLOCK, new Identifier("hikanamlora", "crun1"),               crun1);
		Registry.register(Registry.ITEM,  new Identifier("hikanamlora", "sui"), new BlockItem(sui, new FabricItemSettings()));
		Registry.register(Registry.BLOCK, new Identifier("hikanamlora", "sui"),               sui);
		Registry.register(Registry.ITEM,  new Identifier("hikanamlora", "sps"), new BlockItem(sps, new FabricItemSettings()));
		Registry.register(Registry.BLOCK, new Identifier("hikanamlora", "sps"),               sps);
		Registry.register(Registry.ITEM,  new Identifier("hikanamlora", "hxd1_h"), new BlockItem(hxd1_h, new FabricItemSettings()));
		Registry.register(Registry.BLOCK, new Identifier("hikanamlora", "hxd1_h"),               hxd1_h);
		LOGGER.info("Block注册完毕");

		ItemGroup ys25g = FabricItemGroupBuilder.create(
        new Identifier("hikanamlora", "ys25g"))
        .icon(() -> new ItemStack(ys25g_debian))
        .appendItems(stacks -> {
            stacks.add(new ItemStack(ys25g_debian));
			stacks.add(new ItemStack(ys25g_debian_speed));
			stacks.add(new ItemStack(ys25g_dw));
			stacks.add(new ItemStack(ys25g_md));
			stacks.add(new ItemStack(ys25g_up));
			stacks.add(new ItemStack(ys25g_windows));
			stacks.add(new ItemStack(ys25g_windows_l));
			stacks.add(new ItemStack(ys25g_windows_r));
			stacks.add(new ItemStack(ys25g_windows_s));
			stacks.add(new ItemStack(ys_top));
			stacks.add(new ItemStack(ys_top_c));
			stacks.add(new ItemStack(ys25g_unventi));
			stacks.add(new ItemStack(ys25g_door));
			stacks.add(new ItemStack(trainnumblock));
			stacks.add(new ItemStack(sps));
        })
        .build();
		ItemGroup ys25k = FabricItemGroupBuilder.create(
        new Identifier("hikanamlora", "ys25k"))
        .icon(() -> new ItemStack(ty25k_floor))
        .appendItems(stacks -> {
			stacks.add(new ItemStack(ys_top));
			stacks.add(new ItemStack(ys_top_c));
			stacks.add(new ItemStack(trainnumblock));
			stacks.add(new ItemStack(ty25k_cr_window_open));

			stacks.add(new ItemStack(ty25k_cr_window));

			stacks.add(new ItemStack(ty25k_cr_windowl));

			stacks.add(new ItemStack(ty25k_cr_window_small));

			stacks.add(new ItemStack(ty25k_cr_up));

			stacks.add(new ItemStack(ty25k_cr_md));

			stacks.add(new ItemStack(ty25k_cr_dw));

			stacks.add(new ItemStack(ty25k_cr_dw_b));

			stacks.add(new ItemStack(ty25k_cr_dw_b_l));

			stacks.add(new ItemStack(ty25k_cr_dw_b_r));

			stacks.add(new ItemStack(ty25k_floor));

			stacks.add(new ItemStack(ty25k_floor_120k));

			stacks.add(new ItemStack(ty25k_unventi));
			stacks.add(new ItemStack(sps));
        })
        .build();
		ItemGroup other = FabricItemGroupBuilder.create(
        new Identifier("hikanamlora", "other"))
        .icon(() -> new ItemStack(sidc1))
        .appendItems(stacks -> {
			stacks.add(new ItemStack(sidc1));
			stacks.add(new ItemStack(sidc2));
			stacks.add(new ItemStack(tsp));
			stacks.add(new ItemStack(crun1));
			stacks.add(new ItemStack(sui));
			stacks.add(new ItemStack(hxd1_h));
        })
        .build();
		LOGGER.info("ItemGroup注册完毕");
		
		LOGGER.info("64K+120到64K+520，正常用刑！");
	}
}
