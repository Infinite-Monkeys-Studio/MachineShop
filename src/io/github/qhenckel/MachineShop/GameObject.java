package io.github.qhenckel.MachineShop;

/**
 * Created by Quinn on 3/13/2016.
 */
public class GameObject {
    public static Main app;
    public Position position;
    public Renderer renderer;

    public GameObject(Main app) {
        this.app = app;
    }
}
