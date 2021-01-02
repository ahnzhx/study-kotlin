package kotlinInAction.ch04;

import org.jetbrains.annotations.NotNull;

public class JavaButton implements View {

    @NotNull
    @Override
    public State getCurrentState() {
        return new ButtonState();
    }

    @Override
    public void restoreState(@NotNull State state) {

    }

    public static class ButtonState implements  State{}
}
