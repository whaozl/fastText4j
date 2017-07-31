package fasttext;

public class Pair<A,B> {

  private A key;
  private B value;

  public Pair(A key, B value) {
    this.key = key;
    this.value = value;
  }

  public A first() {
    return this.key;
  }

  public B last() {
    return this.value;
  }

}
