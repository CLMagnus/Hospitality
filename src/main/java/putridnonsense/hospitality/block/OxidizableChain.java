package putridnonsense.hospitality.block;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import com.google.common.collect.ImmutableBiMap;
import net.minecraft.block.*;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;

public class OxidizableChain extends ChainBlock implements Oxidizable {
    private final Oxidizable.OxidationLevel oxidationLevel;

    Supplier<ImmutableBiMap<Object, Object>> OXIDATION_LEVEL_INCREASES = Suppliers.memoize(() -> {
        return ImmutableBiMap.builder().put(ModBlocks.COPPER_CHAIN, ModBlocks.EXPOSED_COPPER_CHAIN).build();
    });

    public OxidizableChain(Oxidizable.OxidationLevel oxidationLevel, AbstractBlock.Settings settings) {
        super(settings);
        this.oxidationLevel = oxidationLevel;
    }

    public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        this.tickDegradation(state, world, pos, random);
    }

    public boolean hasRandomTicks(BlockState state) {
        return Oxidizable.getIncreasedOxidationBlock(state.getBlock()).isPresent();
    }

    public Oxidizable.OxidationLevel getDegradationLevel() {
        return this.oxidationLevel;
    }
}
