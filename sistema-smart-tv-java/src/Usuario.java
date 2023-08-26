public class Usuario {
  public static void main(String[] args) throws Exception {
      SmartTV lg_smart = new SmartTV();

      lg_smart.ligarTV();
      lg_smart.status();
      System.out.println("--------------");
      lg_smart.abaixarCanal();
      lg_smart.status();

    }
}
