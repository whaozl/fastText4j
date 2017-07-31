package fasttext;

public class FastTextSynonym {

  private String word;
  private double cosineSimilarity;

  public FastTextSynonym(String word, double cosineSimilarity) {
    this.word = word;
    this.cosineSimilarity = cosineSimilarity;
  }

  public String word() {
    return this.word;
  }

  public double cosineSimilarity() {
    return this.cosineSimilarity;
  }


}
