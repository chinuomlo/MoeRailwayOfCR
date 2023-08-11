package buzz.mloincr.hikanamlora.poom_box;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalFacingBlock;
import net.minecraft.block.ShapeContext;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LightningEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.state.StateManager;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.state.property.Properties;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.entity.Entity;
public class door extends HorizontalFacingBlock {
	static boolean stats_block = false;
	public door(Settings settings) {
		super(settings);
		setDefaultState(getDefaultState().with(Properties.HORIZONTAL_FACING, net.minecraft.util.math.Direction.NORTH).with(CHARGED, false));
	}
	public static final BooleanProperty CHARGED = BooleanProperty.of("charged");
	@Override
	protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
		builder.add(Properties.HORIZONTAL_FACING);
        builder.add(CHARGED);
	}
	
	@Override
	public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
		if (world.getBlockState(pos).get(CHARGED)){
			world.setBlockState(pos, state.with(CHARGED, false));
		}
		else{
			world.setBlockState(pos, state.with(CHARGED, true));
		}
		door.stats_block = world.getBlockState(pos).get(CHARGED);
		return ActionResult.SUCCESS;
	}

	@Override
	public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext ctx) {
		net.minecraft.util.math.Direction dir = state.get(FACING);
		switch(dir) {
			case NORTH:
				if (door.stats_block){
					return VoxelShapes.cuboid(0.9375, 0, 0, 1, 0.0625, 1);
				}
				return VoxelShapes.cuboid(0, 0, 0.9375, 1, 0.0625, 1);
			case SOUTH:
				if (door.stats_block){
					
					return VoxelShapes.cuboid(0, 0, 0, 0.0625, 0.0625, 1);
				}
				return VoxelShapes.cuboid(0, 0, 0, 1, 0.0625, 0.0625);
			case EAST:
				if (door.stats_block){
					return VoxelShapes.cuboid(0.9375, 0, 0, 1, 0.0625, 1);
				}
				return VoxelShapes.cuboid(0, 0, 0, 0.0625, 0.0625, 1);
			case WEST:
				if (door.stats_block){
					
					return VoxelShapes.cuboid(0, 0, 0.9375, 1, 0.0625, 1);
				}
				return VoxelShapes.cuboid(0.9375, 0, 0, 1, 0.0625, 1);
			default:
				return VoxelShapes.cuboid(-1, -1, 0, 0.0625, 0.0625, 0.0625);
		}
	}
	
	@Override
	public BlockState getPlacementState(ItemPlacementContext ctx) {
		return super.getPlacementState(ctx).with(Properties.HORIZONTAL_FACING, ctx.getPlayerFacing().getOpposite());
	}
    
 
}