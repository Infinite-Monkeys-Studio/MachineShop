package io.github.InfiniteMonkeysStudio.MachineShop;

/**
 * Created by Quinn on 3/14/2016.
 */
public abstract class Control {
    public GameObject parent;

    public Control(GameObject parent) {
        this.parent = parent;
    }

    public abstract void step();
}
