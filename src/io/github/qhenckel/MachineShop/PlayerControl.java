package io.github.qhenckel.MachineShop;

import processing.core.PVector;

/**
 * Created by Quinn on 3/14/2016.
 */
public class PlayerControl extends Control {



    public PlayerControl(GameObject parent) {
        super(parent);

    }


    public void step() {
        PVector pos = parent.position.asPVector();
        PVector mouse = parent.app.mouseVector();

        PVector push = PVector.sub(mouse, pos);

        parent.moving.push(push);
    }
}
