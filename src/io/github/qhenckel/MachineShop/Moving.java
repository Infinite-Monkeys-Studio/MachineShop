package io.github.qhenckel.MachineShop;

import processing.core.PVector;

/**
 * Created by Quinn on 3/14/2016.
 */
public class Moving {
    public GameObject parent;

    public PVector velocity = new PVector(0, 0);
    public float acceleration = 10;
    public float damping = 2;
    public float topSpeed = 50;

    public Moving(GameObject parent) {
        this.parent = parent;
    }

    public void step() {
        parent.position.moveBy(velocity);
        velocity.div(damping);
    }

    public void push(PVector input) {
        input.setMag(acceleration);
        velocity.add(input);
        velocity.limit(topSpeed);
    }
}
