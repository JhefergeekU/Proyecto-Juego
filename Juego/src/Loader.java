import Images.Media;
public class Loader {
    
    private final	Main game;
    public Soldier player;
    public Terrorist enemy;
    private final Media images = new Media();
    
    
    public Loader(Main game) {
        this.game = game;
    }
    
    public void loadSprite() {
        //load Soldier(player)
        images.loadSoldier();
        player = new Soldier(game, 280, 0, images.IMAGE1, images.IMAGE2, images.IMAGE3,  images.IMAGE4, images.IMAGE5, images.IMAGE6);
        game.root.getChildren().add(player.getSpriteFrame());
        
                images.loadTerrorist1();
       // enemy = new Terrorist(game, player, 0, 0,images.IMAGE1, images.IMAGE2, images.IMAGE3,  images.IMAGE4, images.IMAGE5, images.IMAGE6);
        
        
        
        
        
       // game.root.getChildren().add(enemy.getSpriteFrame());
    }
} 
