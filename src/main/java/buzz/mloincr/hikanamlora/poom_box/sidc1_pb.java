package buzz.mloincr.hikanamlora.poom_box;

import net.minecraft.block.Block;
import net.minecraft.block.BlockEntityProvider;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalFacingBlock;
import net.minecraft.block.ShapeContext;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;

public class sidc1_pb extends HorizontalFacingBlock implements BlockEntityProvider {
    //无需多言
    public sidc1_pb (Settings settings){
        super(settings);
	    setDefaultState(getDefaultState().with(Properties.HORIZONTAL_FACING, net.minecraft.util.math.Direction.NORTH));}
    //注册状态变量
    @Override
	protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
		builder.add(Properties.HORIZONTAL_FACING);
	}
    //设定碰撞箱
    @Override
	public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext ctx) {
		net.minecraft.util.math.Direction dir = state.get(FACING);
		switch(dir) {
			case NORTH:
				return VoxelShapes.cuboid(-1, 0, 0.4375, 2, 1, 0.5625);
			case SOUTH:
				return VoxelShapes.cuboid(-1, 0, 0.4375, 2, 1, 0.5625);
			case EAST:
				return VoxelShapes.cuboid(0.4375, 0, -1, 0.5625, 1, 2);
			case WEST:
				return VoxelShapes.cuboid(0.4375, 0, -1, 0.5625, 1, 2);
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
        return new sidc1Entity(pos, state);
	}
}

