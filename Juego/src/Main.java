import java.util.ArrayList;
import java.util.HashMap;

import javafx.animation.Animation;
import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Rectangle2D;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Main extends Application {


   // private static  final Image SPRITE1 =new Image();
ImageView imageview2=new ImageView();

public int levelWidth;

    	public static ArrayList<Image> listaImagenes=new ArrayList<Image>(); 
    	
    	    
    
    
    private static final int COLUMNS  =   6;
    private static final int COUNT    =  19;
    private static final int OFFSET_X =  15;
    private static final int OFFSET_Y =  25;
    static final int WIDTH    = 800;
    static final int HEIGHT   = 600;
    
    private Group mainRoot;
    private final HashMap<KeyCode, Boolean> keys = new HashMap<>();
    public MainMenu mainMenu;
    
    public CastingDirector castDirector;
    public Loader spriteLoader;
    public GLoop gameLoop;
    public int score = 0;
    public Label scoreLabel;

	Group root;
   // MapLoader mapLoader;

	Scene scene;

Stage window;

	static Group g = new Group();
	static Pane pane= new Pane();



    public static void main(String[] args) {
        launch(args);
    }
    
    public static ImageView animarsprite(ImageView imageView2){
    	
//    	listaImagenes.addAll(IMAGE1,IMAGE2,IMAGE3,IMAGE4,IMAGE5,IMAGE6);
    	
    	//Image SPRITE1 =new Image("/png/1/run/1_terrorist_1_Run_000.png");
    	
    	
    	ImageView p= new ImageView();

	for (int i=0; i<6; i++ ){
    		
       	 p.setImage(listaImagenes.get(i));
       	 //p=listaImagenes.get(i);
       	 //refresh();

    	//refresh();
    	if(i==5){
    		i=0;
    	}
    }
		return p;
    	
    }
    

    	
    

    private void refresh() {
		// TODO Auto-generated method stub
    	final Animation animation = new SpriteAnimation(
                imageview2,
                Duration.millis(1000),
                COUNT, COLUMNS,
                OFFSET_X, OFFSET_Y,
                WIDTH, HEIGHT
        );
        animation.setCycleCount(Animation.INDEFINITE);
        animation.play();
		
	}

	public void start(Stage primaryStage) {
    	
		/*Scene scene =new Scene(pane ,800 ,600);
		IMAGE2.getWidth();
		IMAGE2.getHeight();
		
		
    	listaImagenes.add(IMAGE1);listaImagenes.add(IMAGE2);listaImagenes.add(IMAGE3);listaImagenes.add(IMAGE4);listaImagenes.add(IMAGE5);listaImagenes.add(IMAGE6);
  */
	   
        //animarsprite(imageview2);

 
		
	
		//r.setfi
		//scene.setFill(IMAGE2);
		
		//scene.windowProperty();

      //  final ImageView imageView = new ImageView(IMAGE);
      // ImageView imageView2 = new ImageView(IMAGE2);
        
        
      //imageview2.setViewport(new Rectangle2D(OFFSET_X, OFFSET_Y, WIDTH, HEIGHT));
      //  g.getChildren().add(imageview2);
        
        
        //imageView2.setRotate();
        
        
       // pane.getChildren().add(imageView);
        
        
        g.setOnKeyPressed(new EventHandler<KeyEvent>(){

			@Override
			public void handle(KeyEvent event) {
				if (event.getText().equalsIgnoreCase("a")){
					//getAnimation();
					
				}
				// TODO Auto-generated method stub
			
				
			}
			
		});
        
        window = primaryStage;
        window.setTitle("G    O    T    C    H    A   !!!");
        //scene.getStylesheets().addAll(this.getClass().getResource("style.css").toExternalForm());
        root = new Group();
        mainRoot = new Group();
        ImageView backGround = new ImageView(new Image("/png/CommandoMap1-1BG.jpg"));
        
        
        scoreLabel = new Label(Integer.toString(score));
        mainRoot.getChildren().addAll(backGround, scoreLabel, root);
        scoreLabel.setTranslateX(750);
        scoreLabel.setTranslateY(8);
        scene = new Scene(mainRoot, WIDTH, HEIGHT);
        
        window = primaryStage;

        window.getIcons().add(new Image("/png/1/run/1_terrorist_1_Run_000.png"));
        window.setScene(scene);
        window.setResizable(false);
        window.show();
        
        setKeyMapper();
        loadMenu();
        loadSprites();
        gameLoop();
     
   }
	
    private void loadMenu() {
		// TODO Auto-generated method stub

        mainMenu = new MainMenu(this);
        mainMenu.main();
	}

	private void setKeyMapper() {
        
        scene.setOnKeyPressed(e -> keys.put(e.getCode(), true)); //true if pressed
        scene.setOnKeyReleased(e -> keys.put(e.getCode(), false)); //false if relesed
    }

	private void loadSprites() {

        spriteLoader = new Loader(this);
        spriteLoader.loadSprite();
    }
    
    private void gameLoop() {
        
        gameLoop = new GLoop(spriteLoader.player);
    }
    
    public boolean isKeyPressed(KeyCode key) {
        
        return keys.getOrDefault(key, false);
    }
    
    
    
	public void getAnimation() {
		// TODO Auto-generated method stub
		 final TranslateTransition tt = new TranslateTransition(Duration.millis(4999),pane);
		    // tt.setByX(400);
			 //tt.setFromX(220);
		 	//tt.setByX(200);
		 	//tt.setFromX(200);
		     tt.setToX(700);
		     tt.setCycleCount(20);;
		     tt.setAutoReverse(true);
		     tt.play();
		     
			 
			     
			 }

	public void setScene(Scene menuScene) {
		// TODO Auto-generated method stub
		
	};
		
    
}