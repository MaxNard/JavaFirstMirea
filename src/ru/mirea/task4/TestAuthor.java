public class TestAuthor {
  public static void main(String[] args) {
    Author au1 = new Author("Denis Ivanov", "denis2ivanov@yandex.ru", 'M');

    au1.setEmail("denis3ivanov@gmail.com");

    System.out.println(au1);
  }
}