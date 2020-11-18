package service;

import entity.Ball;
import entity.Basket;
import entity.Color;

import java.util.List;

public class BallsWithSameColor{
    public int calculateAmount(Basket basket, Color color){
        List<Ball> balls = basket.getBalls();
        int count = 0;
        Color ballColor;
        for (Ball ball : balls){
            ballColor = ball.getColor();
            if (color == ballColor){
                count++;
            }
        }
        return count;
    }
}
