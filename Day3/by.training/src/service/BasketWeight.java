package service;

import entity.Ball;
import entity.Basket;

import java.util.List;

public class BasketWeight {
    public double calculateWeight(Basket basket){
        List<Ball> balls = basket.getBalls();
        double weight = 0;
        for (Ball ball : balls){
            weight += ball.getWeight();
        }
        return weight;
    }
}
