package strategy.thirdexamp;

import strategy.thirdexamp.WeaponBehavior.AxeBehavior;

public class CharactersDemo {

	public static void main(String[] args) {
		Character king = new King();
		king.fight();
		king.attackWithWeapon();
		king.setWeapon(new WeaponBehavior.AxeBehavior());
		king.attackWithWeapon();
		
		Character queen = new Queen();
		queen.fight();
		queen.attackWithWeapon();
	}

}
