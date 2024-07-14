public class Roti {
  private String jenis;
  private int berat;
  private double harga;
  private boolean berjamur;

  public Roti() {
    System.out.println("Object telah diciptakan, constructor berjalan");
  }

  public void naikkanBerat() {
    this.berat = this.berat + 1;
  }

  public void naikkanBerat(int kenaikan) {
    this.berat = this.berat + kenaikan;
  }

  public int getBerat() {
    return berat;
  }

  public double getHarga() {
    return harga;
  }

  public String getJenis() {
    return jenis;
  }

  public boolean getBerjamur() {
    return berjamur;
  }

  public void setBerat(int berat) {
    this.berat = berat;
  }

  public void setHarga(double harga) {
    this.harga = harga;
  }

  public void setJenis(String jenis) {
    this.jenis = jenis;
  }

  public void setBerjamur(boolean berjamur) {
    this.berjamur = berjamur;
  }
}
