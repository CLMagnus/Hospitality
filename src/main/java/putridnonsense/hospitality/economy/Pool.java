package putridnonsense.hospitality.economy;

import net.minecraft.nbt.NbtCompound;
import net.minecraft.server.MinecraftServer;
import net.minecraft.world.*;

import static putridnonsense.hospitality.Hospitality.*;

public class Pool extends PersistentState {
    // https://fabricmc.net/wiki/tutorial:persistent_states
    // Server variables:
    // Pool (total money)
    int ServerPool = 0;
    // PoolOut (Money taken out of pool (total of all balances)
    int PoolOut = 0;
    // Balance (One player's balance)
    int Balance;

    @Override
    public NbtCompound writeNbt(NbtCompound nbt) {
        nbt.putInt("ServerPool", ServerPool);
        nbt.putInt("PoolOut", PoolOut);
        nbt.putInt("Balance", Balance);
        return nbt;
    }

    public static Pool createFromNbt(NbtCompound tag) {
        Pool playerState = new Pool();
        playerState.ServerPool = tag.getInt("ServerPool");
        playerState.PoolOut = tag.getInt("PoolOut");
        playerState.Balance = tag.getInt("Balance");
        return playerState;
    }

    public static Pool getServerState(MinecraftServer server) {
        // First we get the persistentStateManager for the OVERWORLD
        PersistentStateManager persistentStateManager = server
                .getWorld(World.OVERWORLD).getPersistentStateManager();

        // Calling this reads the file from the disk if it exists, or creates a new one and saves it to the disk
        Pool serverState = persistentStateManager.getOrCreate(
                Pool::createFromNbt,
                Pool::new,
                MOD_ID);

        return serverState;
    }
}
