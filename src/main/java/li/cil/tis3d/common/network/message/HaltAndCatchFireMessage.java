package li.cil.tis3d.common.network.message;

import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public final class HaltAndCatchFireMessage extends AbstractMessageWithLocation {
    public HaltAndCatchFireMessage(final World world, final BlockPos position) {
        super(world, position);
    }

    @SuppressWarnings("unused") // For deserialization.
    public HaltAndCatchFireMessage() {
    }
}
