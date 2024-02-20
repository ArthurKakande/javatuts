public abstract class SampleSet {

  protected Sample[] samples;

  public SampleSet (int size) {
    samples = new Sample[size];
  }

  public void addSample(Sample sample) {
    for (int i = 0; i < samples.length; i++) {
      if (samples[i]==null) {
        samples[1] = sample;
        break;
      }
    }
  }

  public abstract boolean test();
}