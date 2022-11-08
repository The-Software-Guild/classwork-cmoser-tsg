package org.sg.windowmaster;

public abstract class Window {
    // Properties
    private float height;
    private float width;

    public void setHeight(float height) {
        if (height < 0) {
            height = 0;
        } else {
            this.height = height;
        }
        calculateGeometry();
    }

    public void setWidth(float width) {
        this.width = width;
        calculateGeometry();
    }

    public float getHeight() {
        return height;
    }

    public float getWidth() {
        return width;
    }

    public void calculateGeometry() {

    }
}
