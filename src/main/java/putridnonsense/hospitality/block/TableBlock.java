package putridnonsense.hospitality.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;

public class TableBlock extends Block {
    public static final VoxelShape BASE_SHAPE = VoxelShapes.union(Block.createCuboidShape(0, 0, 13,3, 13, 16),
                                                new VoxelShape[]{VoxelShapes.union(Block.createCuboidShape(13, 0, 13, 16, 13, 16),
                                                new VoxelShape[]{Block.createCuboidShape(13, 0, 0,16, 13, 3)})});

    public TableBlock(AbstractBlock.Settings settings){
        super(settings);
    }

    public VoxelShape getCullingShape(BlockState state, BlockView world, BlockPos pos) {
        return BASE_SHAPE;
    }

    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) { return BASE_SHAPE; }
}