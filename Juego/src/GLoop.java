import javafx.animation.AnimationTimer;
import javafx.animation.Timeline;

public class GLoop  extends AnimationTimer {
	    
	    public Timeline animation;
	    Soldier player;
	  Terrorist enemy;
	    
	    GLoop(Soldier player, Terrorist enemy) {
	    
	        this.player = player;
	        this.enemy = enemy;
	    }
	    
	    public GLoop(Soldier player2) {
			// TODO Auto-generated constructor stubp
	    	player2=this.player;
		}

		@Override
	    public void handle(long now) {
	        
	        animation = new Timeline(now);
	        player.Update();
	        enemy.Update();
	    }
	    
	    @Override
	    public void start() {
	        super.start();
	    }
	    
	    @Override
	    public void stop() {
	        super.stop();
	    }
	    
	}


