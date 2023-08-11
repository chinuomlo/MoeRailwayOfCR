package buzz.mloincr.hikanamlora.poom_box;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.minecraft.block.Block;
import net.minecraft.block.BlockEntityProvider;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalFacingBlock;
import net.minecraft.block.ShapeContext;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.state.property.IntProperty;

public class sp_pb extends HorizontalFacingBlock implements BlockEntityProvider {
    //无需多言
    public sp_pb (Settings settings){
        super(settings);
	    setDefaultState(getDefaultState().with(Properties.HORIZONTAL_FACING, net.minecraft.util.math.Direction.NORTH).with(CHARGED, 1));}
    public static final IntProperty CHARGED = IntProperty.of("charged",0,4);
		//注册状态变量
    public static final Logger LOGGER = LoggerFactory.getLogger("modid");
		@Override
	protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
		builder.add(Properties.HORIZONTAL_FACING);
		builder.add(CHARGED);
	}
    //设定碰撞箱
    @Override
	public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext ctx) {
		net.minecraft.util.math.Direction dir = state.get(FACING);
		switch(dir) {
			case NORTH:
				return VoxelShapes.cuboid(0, 0, 1.9375, 1, 1, 2);
			case SOUTH:
				return VoxelShapes.cuboid(0, 0, -1, 1, 1, -0.9375);
			case EAST:
				return VoxelShapes.cuboid(-1, 0, 0, -0.9375, 1, 1);
			case WEST:
				return VoxelShapes.cuboid(1.9375, 0, 0, 2, 1, 1);
			default:
				return VoxelShapes.cuboid(-1, -1, 0, 2, 2, 0.0625);
		}
	}
    //获得状态？（大概？）
    @Override
	public BlockState getPlacementState(ItemPlacementContext ctx) {
		return super.getPlacementState(ctx).with(Properties.HORIZONTAL_FACING, ctx.getPlayerFacing().getOpposite());
	}
	@Override
    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return new spEntity(pos, state);
	}
	public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit){
			if (world.getBlockState(pos).get(CHARGED) == 1){
				world.setBlockState(pos, state.with(CHARGED, 2));}
			else if (world.getBlockState(pos).get(CHARGED) == 2){
				world.setBlockState(pos, state.with(CHARGED, 3));}
			else if (world.getBlockState(pos).get(CHARGED) == 3){
				world.setBlockState(pos, state.with(CHARGED, 4));}
			else if (world.getBlockState(pos).get(CHARGED) == 4){
				world.setBlockState(pos, state.with(CHARGED, 1));}
		
		String state_block = String.valueOf(world.getBlockState(pos).get(CHARGED));
		LOGGER.info("当前方块状态为："+state_block);
		return ActionResult.SUCCESS;
	}
}

