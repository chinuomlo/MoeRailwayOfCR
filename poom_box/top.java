package buzz.mloincr.hikanamlora.poom_box;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalFacingBlock;
import net.minecraft.block.ShapeContext;
import net.minecraft.state.StateManager;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.state.property.Properties;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.util.shape.VoxelShapes;
public class top extends HorizontalFacingBlock {
 
	public top(Settings settings) {
		super(settings);
		setDefaultState(getDefaultState().with(Properties.HORIZONTAL_FACING, net.minecraft.util.math.Direction.NORTH));
	}
	
	@Override
	protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
		builder.add(Properties.HORIZONTAL_FACING);
	}
 
	@Override
	public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext ctx) {
		net.minecraft.util.math.Direction dir = state.get(FACING);
		switch(dir) {
			case NORTH:
				return VoxelShapes.cuboid(0, 0,  0, 1, 0.5, 1);
			case SOUTH:
				return VoxelShapes.cuboid(0, 0, 0, 1, 0.5,  1);
			case EAST:
				return VoxelShapes.cuboid(0, 0, 0, 1, 0.5, 1);
			case WEST:
				return VoxelShapes.cuboid(0, 0, 0, 1, 0.5, 1);
			default:
				return VoxelShapes.cuboid(-1, -1, 0, 2, 2, 0.0625);
		}
	}
	@Override
	public BlockState getPlacementState(ItemPlacementContext ctx) {
		return super.getPlacementState(ctx).with(Properties.HORIZONTAL_FACING, ctx.getPlayerFacing().getOpposite());
	}
    
 
}