package io.github.InfiniteMonkeysStudio.MachineShop;

/**
 * Created by Quinn on 3/13/2016.
 */
public class GameObject {
    public static Main app;
    public Position position;
    public Renderer renderer;
    public Moving moving;
    public Control control;

    public GameObject(Main app) {
        this.app = app;
    }

    public void step() {
        if(renderer != null && position != null) {
            renderer.draw(position.x, position.y);
        }

        if(moving != null) {
            moving.step();
        }

        if(control != null) {
            control.step();
        }
    }
}
