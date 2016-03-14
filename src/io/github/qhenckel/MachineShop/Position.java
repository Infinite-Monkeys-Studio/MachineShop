package io.github.qhenckel.MachineShop;

/**
 * Created by Quinn on 3/13/2016.
 */
public class Position {
    private static GameObject parent;
    public float x;
    public float y;

    public Position(float x, float y, GameObject parent) {
        this.parent = parent;
        this.x = x;
        this.y = y;
    }

    public void moveTo(float x, float y) {
        this.x = x;
        this.y = y;
    }

}
