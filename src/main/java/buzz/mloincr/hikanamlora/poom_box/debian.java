package buzz.mloincr.hikanamlora.poom_box;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalFacingBlock;
import net.minecraft.block.ShapeContext;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;

public class debian extends HorizontalFacingBlock{
    //无需多言
    public debian (Settings settings){
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
            //(StartX,Y,Z,finalX,Y,Z)
			case NORTH:
				return VoxelShapes.cuboid(0, 0.7, 0, 1, 1, 1);
			case SOUTH:
				return VoxelShapes.cuboid(0, 0.7, 0, 1, 1, 1);
			case EAST:
				return VoxelShapes.cuboid(0, 0.7, 0, 1, 1, 1);
			case WEST:
				return VoxelShapes.cuboid(0, 0.7, 0, 1, 1, 1);
			default:
				return VoxelShapes.cuboid(0, 0.7, 0, 1, 1, 1);
		}
	}
    //获得状态？（大概？）
    @Override
	public BlockState getPlacementState(ItemPlacementContext ctx) {
		return super.getPlacementState(ctx).with(Properties.HORIZONTAL_FACING, ctx.getPlayerFacing().getOpposite());
	}
}

