package tk.kulzers.fabric.universaltransport;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;

public class DuctingBlock extends Block {
    public static final BooleanProperty UP = BooleanProperty.of("up");
    public static final BooleanProperty DOWN = BooleanProperty.of("down");
    public static final BooleanProperty EAST = BooleanProperty.of("east");
    public static final BooleanProperty WEST = BooleanProperty.of("west");
    public static final BooleanProperty NORTH = BooleanProperty.of("north");
    public static final BooleanProperty SOUTH = BooleanProperty.of("south");
    
    public DuctingBlock(Settings settings) {
        super(settings);
        setDefaultState(getStateManager().getDefaultState().with(UP,false).with(DOWN, false)
                .with(EAST, false).with(WEST, false).with(NORTH, false).with(SOUTH, false));
    }

    @Override protected void appendProperties(StateManager.Builder<Block, BlockState> stateManager) {
        stateManager.add(UP).add(DOWN).add(EAST).add(WEST).add(NORTH).add(SOUTH);
    }
}
