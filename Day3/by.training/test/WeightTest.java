import entity.Ball;
import entity.Basket;
import entity.Color;
import org.testng.annotations.Test;
import service.BasketWeight;

import java.util.ArrayList;

import static org.testng.Assert.assertEquals;

public class WeightTest {
    @Test
    public void testAmount() {
        BasketWeight basketWeight = new BasketWeight();
        ArrayList<Ball> balls = new ArrayList<>();
        balls.add(new Ball(0.5, Color.BLUE));
        balls.add(new Ball(0.4, Color.BLUE));
        balls.add(new Ball(0.3, Color.RED));
        Basket basket = new Basket(balls);
        double expected = 0.5 + 0.4 + 0.3;
        double actual = basketWeight.calculateWeight(basket);
        assertEquals(actual, expected);
    }
}
