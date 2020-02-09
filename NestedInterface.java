 public class Demo1 {
  public static void main(String[] args){
  C ob = new C();
  ob.method();
}
}

  class A{

  protected interface B{
  void method();
}
}


 class C implements A.B{
 public void method() {
 System.out.println("Demo: interface nested inside a class");
}
}
