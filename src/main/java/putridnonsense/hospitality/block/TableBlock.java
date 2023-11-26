package putridnonsense.hospitality.block;

import net.minecraft.block.*;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;

public class TableBlock extends Block implements Waterloggable {
    public static final BooleanProperty WATERLOGGED;
    public static final VoxelShape LEGS;
    public static final VoxelShape TOP;
    public static final VoxelShape BASE_SHAPE;

    public TableBlock(AbstractBlock.Settings settings){
        super(settings);
        this.setDefaultState(this.stateManager.getDefaultState().with(WATERLOGGED, false));
    }

    public VoxelShape getCullingShape(BlockState state, BlockView world, BlockPos pos) {
        return BASE_SHAPE;
    }

    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) { return BASE_SHAPE; }

    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(WATERLOGGED);
    }

    public FluidState getFluidState(BlockState state) {
        return state.get(WATERLOGGED) ? Fluids.WATER.getStill(false) : super.getFluidState(state);
    }

    static{
        WATERLOGGED = Properties.WATERLOGGED;
        LEGS = VoxelShapes.union(Block.createCuboidShape(0, 0, 13,3, 13, 16), Block.createCuboidShape(13, 0, 13, 16, 13, 16), Block.createCuboidShape(13, 0, 0,16, 13, 3), Block.createCuboidShape(0, 0, 0, 3, 13, 3));
        TOP = Block.createCuboidShape(0, 13, 0,16, 16, 16);
        BASE_SHAPE = VoxelShapes.union(LEGS, TOP);
    }
}