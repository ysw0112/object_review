package chapter01.sub01;

public class Audience {
  private Bag bag;

  public Audience(Bag bag) {
    this.bag = bag;
  }

  public Bag getBag() {
    return bag;
  }

  @Override
  public String toString() {
    return "Audience{" +
        "bag=" + bag +
        '}';
  }
}
