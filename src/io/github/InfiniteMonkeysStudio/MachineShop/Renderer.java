package io.github.InfiniteMonkeysStudio.MachineShop;

import processing.core.PShape;

import java.util.HashMap;

/**
 * Created by Quinn on 3/13/2016.
 */
public class Renderer {
    private static GameObject parent;
    public PShape image;
    public static final String ROBOT = "Sample.svg";
    private static HashMap<String, PShape> SHAPES = new HashMap<String, PShape>();

    public Renderer(String type, GameObject parent) {
        this.parent = parent;
        image = getShape(type);
    }

    public void draw(float x, float y) {
        parent.app.shape(image, x, y, parent.app.SCALE, parent.app.SCALE);
    }

    private PShape getShape(String type) {
        if( SHAPES.containsKey(type)) {
            return SHAPES.get(type);
        } else {
            PShape newS = parent.app.loadShape(type);
            SHAPES.put(type, newS);
            return newS;
        }
    }
}
