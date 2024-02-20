public class FastSampleSet extends SampleSet {

  public FastSampleSet(int size) {
    super(size);
  }

  @Override
  public boolean test(){
    boolean successful = true;

    for (Sample sample : samples) {
      if (sample != null && sample.tainted) {
        successful = false;
        break;
      }
    }

    if (!successful) {
      //any sumple is tainted, so we can't trust the result
      for (Sample sample : samples) {
        if (sample != null) {
          sample.tainted = true;
        }
      }
    }
    return successful;
  }
}