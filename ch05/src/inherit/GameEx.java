package inherit;

public class GameEx {
	public static void main(String[] args) {

		
		Marine marine = new Marine();
		marine.stimPack();
		
		Tank tank = new Tank();
		tank.changeMode();
		
		Dropship ship = new Dropship();
		ship.load();
		ship.upload();		
		

	}

}
