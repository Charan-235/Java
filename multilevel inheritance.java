class vehicle
{
  void vdisplay()
  {
    System.out.println("vehicle");
  }
}
class twowheeler extends vehicle
{
  void tdisplay()
  {
    System.out.println("2 wheeler");
  }
}
class R192311316 extends twowheeler
{
  void rdisplay()
  {
    System.out.println("bike display");
  }

  public static void main(String[] args)
  {
  R192311316 R = new R192311316();
  R.vdisplay();
  R.tdisplay();
  R.rdisplay();
  }
}
