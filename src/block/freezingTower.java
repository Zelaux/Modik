package block;

import mindustry.world.Block;
import mindustry.content.StatusEffects;
import mindustry.entities.Units;
import mindustry.gen.*;

public class freezingTower extends Block {

	public freezingTower(String name) {
		super(name);
	}
public class freezingTowerBuild extends Building {
	@Override
	public void update(){
		super.update();
		Unit target = Units.closestEnemy(this.team, x, y, 120, u -> true);
		if(timer.get(15) && target != null) {
			target.apply(StatusEffects.freezing);
		}
	}
}
	
}
