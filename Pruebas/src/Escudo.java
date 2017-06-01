import java.util.Calendar;
import java.util.Random;
import java.util.Timer;
import javax.naming.TimeLimitExceededException;

import javafx.animation.Animation;
import javafx.animation.PathTransition;
import javafx.animation.Transition;
import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Shape;
import javafx.scene.text.Text;
import javafx.util.Duration;

public class Escudo {
	
	Circle circle;
	Circle circle1;
	Circle circle2;
	Circle circle3;
	Polygon polygon;
	static double points=0;
	int radio;
	double puntosfinales=0;
	public boolean estado=false;
	public Group esc= new Group();
	double factor;
	public Object escu;
	Text textt=new Text(String.valueOf(getPoints()));
	
	public Escudo(Circle circle1, Circle circle2, Circle circle3, Circle circle, Polygon polygon) {
		// TODO Auto-generated constructor stub
		this.circle=circle;
		this.circle2=circle2;
		this.circle3=circle3;
		this.circle1=circle1;
		this.polygon=polygon;
		//this.points=getPoints();
		esc.getChildren().addAll(circle1,circle2,circle3,circle,polygon);
		setEscudo();
	//	setEvent();
	//	getAnimation();
		//getPoints();
	}
	
/*	Timer timer = new Timer (5000, new  ActionListener () 
	{ 
	    public void actionPerformed(ActionEvent e) 
	    { 

	    	setEvent();
	    } 
	}); 

	
	//timer.start();
*/
	public void setEvent() {
		
		// TODO Auto-generated method stub
		long time = System.currentTimeMillis();
		
		
		//if(System.currentTimeMillis()-time<5000 ){
		//TimeLimitExceededException

		
		
		esc.setOnMousePressed(new EventHandler<MouseEvent>() {

			@Override public void handle(MouseEvent event) {
		    	  esc.setVisible(false);	
		    	  estado =true;  
		    	  //esc.getChildren().add(textt);
					//puntosfinales=150-circle1.getRadius();
					getPoints();
					Juego.setPuntos(points);
					System.out.println(getPoints());
		    	  Juego.crearEscudo();
					Juego.metodoprueba();

			}
		      
		      
		    });
		//}
		
	//	Juego.crearEscudo();
		//Juego.metodoprueba();
		
	}
	

	public void getAnimation() {
		// TODO Auto-generated method stub
		 final TranslateTransition tt = new TranslateTransition(Duration.millis(700), esc);
		    // tt.setByX(400);
			 //tt.setFromX(220);
		 	//tt.setByX(200);
		 	//tt.setFromX(200);
		     tt.setToX(700);
		     tt.setCycleCount(20);;
		     tt.setAutoReverse(true);
		     tt.play();
		     
			 
			     
			 };
		
	

	public Escudo(Polygon polygon , Circle circle1) {
		
		
	}

	public Escudo(Group g) {
		// TODO Auto-generated constructor stub
	
	}
	
	

	public Group getescudo2() {
		return esc;
		// TODO Auto-generated method stub
		
	}

	private void setEscudo() {
		// TODO Auto-generated method stub
	    Random generadorAleatorios = new Random();

		esc.setTranslateX(generadorAleatorios.nextInt(700));
		esc.setTranslateY(generadorAleatorios.nextInt(600));
		esc.autoSizeChildrenProperty().set(true);
		//esc.setAutoSizeChildren(true);
		esc.isResizable();
		//esc.resize(20, 20);
		factor=0.1+generadorAleatorios.nextDouble();
		esc.scaleYProperty().set(factor);
		esc.scaleXProperty().set(factor);
		System.out.println();
		
		//esc.setTranslateY(0+generadorAleatorios.nextInt(500));

		//esc.setTranslateY(100);
		//Object formas []=esc.getChildren().toArray();
		//esc.resizeRelocate(100, 300, 40, 100);
		esc.minHeight(20);
		esc.maxHeight(10);
		esc.maxWidth(40);
		esc.minWidth(100);
		//Escudo escudo= new Escudo(formas);
		esc.toFront();
		
		
	}

	public Group getEscudo (){ 
		
		return esc;
		
	}
		 
	
	public double modificarRadio(){
	    Random generadorAleatorios = new Random();
	    radio = 10+generadorAleatorios.nextInt(100);
	    return radio;
	}
	
	
	public double getPoints(){
		
			points=150-(factor*100);
		
			puntosfinales=points+puntosfinales;

		
		return points;

	}
}
