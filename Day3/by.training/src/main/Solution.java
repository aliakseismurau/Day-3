package main;

import entity.Ball;
import entity.Basket;
import entity.Color;
import report.SameColorReport;
import report.WeightReport;
import service.BallsWithSameColor;
import service.BasketWeight;

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        ArrayList<Ball> balls = new ArrayList<>();
        balls.add(new Ball(1, Color.RED));
        balls.add(new Ball(0.6, Color.BROWN));
        balls.add(new Ball(1, Color.BLUE));
        balls.add(new Ball(2, Color.BLACK));
        balls.add(new Ball(0.2, Color.YELLOW));
        balls.add(new Ball(0.5, Color.BLUE));
        balls.add(new Ball(1, Color.GREEN));
        Basket basket = new Basket(balls);
        BasketWeight basketWeight = new BasketWeight();
        double ballsWeight = basketWeight.calculateWeight(basket);
        BallsWithSameColor ballsWithSameColor = new BallsWithSameColor();
        int blueBallsAmount = ballsWithSameColor.calculateAmount(basket, Color.BLUE);
        SameColorReport sameColorReport = new SameColorReport();
        sameColorReport.amountOfSameColorBalls(blueBallsAmount, Color.BLUE);
        WeightReport weightReport = new WeightReport();
        weightReport.finalWeight(ballsWeight);
    }
}
