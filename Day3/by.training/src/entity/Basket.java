package entity;

import java.util.ArrayList;

public class Basket {
    private ArrayList<Ball> balls;

    public Basket(ArrayList<Ball> balls) {
        this.balls = balls;
    }

    public Basket() {
        this.balls = balls;
    }

    public ArrayList<Ball> getBalls() {
        return balls;
    }

    public void setBalls(ArrayList<Ball> balls) {
        this.balls = balls;
    }
}
