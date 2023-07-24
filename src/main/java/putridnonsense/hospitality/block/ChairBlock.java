package putridnonsense.hospitality.block;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.BlockEntityProvider;
import net.minecraft.block.BlockState;
import net.minecraft.block.FacingBlock;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.enums.BedPart;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.BlockPos;
import org.jetbrains.annotations.Nullable;

public class ChairBlock extends FacingBlock implements BlockEntityProvider {
    public static final DirectionProperty FACING;

    public ChairBlock(AbstractBlock.Settings settings){
        super(settings);
    }

    static {
        FACING = Properties.FACING;
    }

    @Nullable
    @Override
    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return null;
    }
}
