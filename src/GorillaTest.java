import com.zookeeper.types.animals.Gorilla;

public class GorillaTest {

	public static void main(String[] args) {
		
		Gorilla koko = new Gorilla(100);
		
		koko.displayEnergy();
		koko.throwSomething();
		koko.throwSomething();
		koko.throwSomething();
		koko.displayEnergy();
		koko.eatBanana();
		koko.eatBanana();
		koko.displayEnergy();
		koko.climb();
		koko.displayEnergy();
	}
}
