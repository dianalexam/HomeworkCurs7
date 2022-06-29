package com.fasttrackit;

public class Bottle {
    private int totalCapacity;
    private int availableLiquid;
    private boolean open;

    public void setTotalCapacity(int totalCapacity) {
        this.totalCapacity = totalCapacity;
    }

    public void setAvailableLiquid(int availableLiquid) {
        if (availableLiquid <= totalCapacity && availableLiquid > 0) {
            this.availableLiquid = availableLiquid;
        } else {
            this.availableLiquid = 0;
        }
    } //nu stiu cum as putea sa generez eroare daca inputul ar fi available liquid > total capacity deja introdus

    public boolean checkIfLiquid() {
        return availableLiquid > 0;
    }

    public int getAvailableLiquid() {
        if (availableLiquid > 0) {
            return availableLiquid;
        }
        return 0;
    }

    public int checkRemainingCapacity() {
        int emptyCapacity;
        emptyCapacity = totalCapacity - this.getAvailableLiquid();
        if (emptyCapacity > 0 || emptyCapacity <= totalCapacity) {
            System.out.println("Available capacity for re-fill: " + emptyCapacity);
        } else if (emptyCapacity == 0) {
            System.out.println("Bottle is full");
        }
        return emptyCapacity;
    }

    public String openBottle() {
        if (open) {
            return "Bottle is already open";
        } else {
            this.open = true;
            return "Opened the bottle";
        }
    }

    public String closeBottle() {
        if (!open) {
            return "Bottle is already closed";
        } else {
            this.open = false;
            return "Closed the bottle";
        }
    }

    public String drinkLiquid(int liquidAmount) {
        if (open) {
            if (this.getAvailableLiquid() > 0 && this.getAvailableLiquid() > liquidAmount && this.getAvailableLiquid() <= totalCapacity) {
                availableLiquid = availableLiquid - liquidAmount;
                return "You've drank: " + liquidAmount;
            } else if (liquidAmount == this.getAvailableLiquid() || liquidAmount == totalCapacity && this.getAvailableLiquid() > 0) {
                availableLiquid = availableLiquid - liquidAmount;
                return "You've drank the whole liquid amount";
            } else if (this.getAvailableLiquid() < liquidAmount || liquidAmount > totalCapacity) {
                return "Liquid amount not enough to match the drinking criteria";
            } else {
                return "Bottle is already empty";
            }
        } else if (!open) {
            return "Bottle is closed! Please open bottle first";
        }
        return null;
    }


}
