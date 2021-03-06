
import javafx.animation.Interpolator;
import javafx.animation.Transition;
import javafx.geometry.Rectangle2D;
import javafx.scene.image.ImageView;
import javafx.util.Duration;

public class SpriteAnimation extends Transition {

    private final ImageView imageView;
    private final int count;
    private final int columns;
    private final int offsetX;
    private final int offsetY;
    private final int width;
    private final int height;

    private int lastIndex;

    public SpriteAnimation(
            ImageView imageView, 
            Duration duration, 
            int count,   int columns,
            int offsetX, int offsetY,
            int width,   int height) {
        this.imageView = imageView;
        this.count     = count;
        this.columns   = columns;
        this.offsetX   = offsetX;
        this.offsetY   = offsetY;
        this.width     = width;
        this.height    = height;
        setCycleDuration(duration);
        setInterpolator(Interpolator.LINEAR);
    }

    protected void interpolate(double k) {
    	
    	
        final int index = Main.listaImagenes.size() ;
        if (index != lastIndex) {
            final int x = (index % columns) * width  + offsetX;
            final int y = (index / columns) * height + offsetY;
            imageView.setViewport(new Rectangle2D(x, y, width, height));
imageView.set
            lastIndex = index;
        }
    }
    
    
    protected ImageView animar(){
    	ImageView p= new ImageView();

    	for (int i=0; i<6; i++ ){
        		
           	 p.setImage(Main.listaImagenes.get(i));
           	 //p=listaImagenes.get(i);
           	 //refresh();

        	//refresh();
        	if(i==5){
        		i=0;
        	}
        }
		return p;
    }
    
}