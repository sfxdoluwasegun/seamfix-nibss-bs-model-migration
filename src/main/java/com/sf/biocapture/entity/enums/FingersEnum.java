/**
 * This enum maintains a list of wsq image finger types. It exist to match what
 * was persisted from the smart client.
 */
package com.sf.biocapture.entity.enums;

/**
 *
 * @author wizzyclems
 */
public enum FingersEnum {

    RIGHT_THUMB(1),
    RIGHT_INDEX_FINGER(2),
    RIGHT_MIDDLE_FINGER(3),
    RIGHT_RING_FINGER(4),
    RIGHT_LITTLE_FINGER(5),
    LEFT_THUMB(6),
    LEFT_INDEX_FINGER(7),
    LEFT_MIDDLE_FINGER(8),
    LEFT_RING_FINGER(9),
    LEFT_LITTLE_FINGER(10);
    int value;

    FingersEnum(int finger){
        value = finger;
    }

    public int getValue(){
        return value;
    }

    public boolean isLeft() {
        return this.name().toUpperCase().contains("LEFT");
    }

    public boolean isRight() {
        return this.name().toUpperCase().contains("RIGHT");
    }

    public boolean isPrimary() {
        return this == RIGHT_INDEX_FINGER || this == RIGHT_THUMB || this == LEFT_THUMB || this == LEFT_INDEX_FINGER;
    }

    
}