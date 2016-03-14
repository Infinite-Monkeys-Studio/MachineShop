package io.github.qhenckel.MachineShop;

import processing.core.PApplet;

/**
 * Created by Quinn on 3/13/2016.
 */
public class Main extends PApplet {

    public static void main(String args[]) {
        PApplet.main(new String[] { "--present", "io.github.qhenckel.MachineShop.Main" });
    }

    public void settings() {
        size(800, 800);
    }

    // Declare global variables.
    public static final float SCALE = 50;
    GameObject obj1;

    public void setup() {
        obj1 = new GameObject(this);
        obj1.position = new Position(width/3, height/3, obj1);
        obj1.renderer = new Renderer(Renderer.ROBOT, obj1);
    }

    public void draw() {
        background(12, 55, 125);
        ellipse(mouseX, mouseY, 10, 10);
        obj1.renderer.draw(obj1.position.x, obj1.position.y);
    }
}
