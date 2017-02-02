public class App {
	public static void main(String args[]){
		
		System.out.println("App.main");
		doStuff();
	}
	private static void doStuff(String caller){
		System.out.println("App.dostuff Smack my bithc up" + caller);
	}
	private void featureY(){
		doStuff("fature1")
	}
}
