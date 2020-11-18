import entity.Ball;
import entity.Basket;
import entity.Color;
import org.testng.annotations.Test;
import service.BallsWithSameColor;

import java.util.ArrayList;

import static org.testng.Assert.assertEquals;


public class AmountTest {
    @Test
            public void testAmount(){
        BallsWithSameColor ballsWithSameColor = new BallsWithSameColor();
        ArrayList<Ball> balls = new ArrayList<>();
        balls.add(new Ball(0.5, Color.BLUE));
        balls.add(new Ball(0.4, Color.BLUE));
        balls.add(new Ball(0.3, Color.RED));
        Basket basket = new Basket(balls);
        int expected = 2;
        int actual = ballsWithSameColor.calculateAmount(basket, Color.BLUE);
        assertEquals(actual, expected);
    }
}
