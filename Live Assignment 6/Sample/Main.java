public class Main {
  public static void main(String[] args) {
    FastSampleSet fastSampleSet = new FastSampleSet(5);

    fastSampleSet.addSample(new Sample("Sample1", "2022-01-01", false));
    fastSampleSet.addSample(new Sample("Sample2", "2022-01-02", true));
    fastSampleSet.addSample(new Sample("Sample3", "2022-01-03", false));

    boolean result = fastSampleSet.test();
    System.out.println("Experiment Result: " + result);

    //check status of each sample after the test
    for (Sample sample : fastSampleSet.samples) {
      if (sample != null) {
        System.out.println("Sample: " + sample.name + ", Tainted: " + sample.tainted);
      }
    }
  }
}