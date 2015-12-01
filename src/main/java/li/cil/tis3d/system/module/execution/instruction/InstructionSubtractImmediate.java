package li.cil.tis3d.system.module.execution.instruction;

import li.cil.tis3d.system.module.execution.Machine;
import li.cil.tis3d.system.module.execution.MachineState;

public final class InstructionSubtractImmediate extends AbstractInstruction {
    private final int value;

    public InstructionSubtractImmediate(final int value) {
        this.value = value;
    }

    @Override
    public void step(final Machine machine) {
        final MachineState state = machine.getState();
        state.acc -= value;
        state.pc++;
    }
}