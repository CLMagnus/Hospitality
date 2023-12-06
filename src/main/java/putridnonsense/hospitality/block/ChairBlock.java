package putridnonsense.hospitality.block;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.BlockEntityProvider;
import net.minecraft.block.BlockState;
import net.minecraft.block.FacingBlock;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.enums.DoubleBlockHalf;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.state.property.EnumProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.BlockPos;
import org.jetbrains.annotations.Nullable;

public class ChairBlock extends FacingBlock implements BlockEntityProvider {
    public static final DirectionProperty FACING;
    public static final EnumProperty<DoubleBlockHalf> HALF;

    public ChairBlock(AbstractBlock.Settings settings){
        super(settings);
    }

    @Nullable
    @Override
    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return null;
    }

    static {
        FACING = Properties.FACING;
        HALF = null;
    }
}
