public class TestBall {
  public static void main(String[] args) {
    Ball ball = new Ball(5, 5);
    ball.move(10 , 15);
    System.out.print ("\nBall has x = "+ball.getX()+", y = "+ball.getY()+"\n");
    ball.setX(52);
    ball.setY(87);
    System.out.println(ball);
  }
}