
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

 
public class Juego extends Application{

		public static void main(String[] args) {
			// TODO Auto-generated method stub
				Application.launch(args);
		}
	
		
		static Text text= new Text(); 
		static Text text1= new Text(); 
		Text text2= new Text(); 
		
		
		static Circle circle=new Circle();
		static Circle circle1=new Circle();
		static Circle circle2=new Circle();
		static Circle circle3=new Circle();

		static Polygon polygon=new Polygon();
		
		static Group g = new Group();
		static Pane pane= new Pane();
		
		static double puntos=0;

		public static void crearEscudo() {
			// TODO Auto-generated method stub
			Random generadorAleatorios = new Random();
		    double radio = 10+generadorAleatorios.nextInt(100);
		    circle1.setRadius(100);
	    	  circle2.setRadius(circle1.getRadius()-20);
				circle3.setRadius(circle2.getRadius()-20);
				circle.setRadius(circle3.getRadius()-20);
				polygon.getPoints().addAll(new Double[]{
						
						circle.getRadius()*Math.sin(Math.PI/5),-circle.getRadius()*Math.cos(Math.PI/5),
					    
						   0.0, circle.getRadius(),
					    
						  
					    -circle.getRadius()*(Math.sin(Math.PI/5)),-circle.getRadius()*(Math.cos(Math.PI/5)),
					    
						
					    circle.getRadius()*Math.sin((2*(Math.PI/5))), circle.getRadius()*Math.cos((2*(Math.PI/5))),
					    
					    
						   -circle.getRadius()*Math.sin((2*(Math.PI/5))), circle.getRadius()*Math.cos((2*(Math.PI/5))) ,
					    
						   
					    
							});
				
				
				polygon.setFill(Color.GHOSTWHITE);
				polygon.setRotate(35);
				//circle.setRotate(20);
				polygon.setTranslateX(400);
				polygon.setTranslateY(300);
				
				Escudo escudof= new Escudo(circle1,circle2,circle3,circle,polygon);

		    	  escudof.setEvent();
		    	  escudof.getAnimation();
		    	  
		    	  g=escudof.esc;
		    	  
		    	  
				
			
			
		}
		
		public static void	metodoprueba(){
		
			pane.getChildren().removeAll(g,text,text1);
			text1.setText(Double.toString(puntos));
			pane.getChildren().addAll( g, text,text1);
		}
		
		

		@Override
		public void start(Stage primaryStage) throws Exception {
			
			Scene scene =new Scene(pane ,800 ,600);
			
			/*Group g1 = new Group();
			Group g2 = new Group();
			Group g3 = new Group();
			Group g4 = new Group();
			Group g5 = new Group();
			Group g6 = new Group();
			    */

			
			text.setX(10);
			text.setY(10);


			//Escudo escudof1= new Escudo(circle,circle1,circle2,circle3,polygon);

			text1.setX(780);
			text1.setY(0);
			
			//circle1.setRadius(escudof1.modificarRadio());
			circle1.setRadius(100);
			circle2.setRadius(circle1.getRadius()-20);
			circle3.setRadius(circle2.getRadius()-20);
			circle.setRadius(circle3.getRadius()-20);
			circle1.setFill(Color.DARKRED);
			circle2.setFill(Color.WHITE);
			circle3.setFill(Color.DARKRED);
			circle.setFill(Color.DARKBLUE);
			
			circle.setCenterX(400);
			circle.setCenterY(300);
			

			circle1.setCenterX(400);
			circle1.setCenterY(300);
			

			circle2.setCenterX(400);
			circle2.setCenterY(300);
			
			circle3.setCenterX(400);
			circle3.setCenterY(300);
			
			
			polygon.getPoints().addAll(new Double[]{
					
					circle.getRadius()*Math.sin(Math.PI/5),-circle.getRadius()*Math.cos(Math.PI/5),
				    
					   0.0, circle.getRadius(),
				    
					  
				    -circle.getRadius()*(Math.sin(Math.PI/5)),-circle.getRadius()*(Math.cos(Math.PI/5)),
				    
					
				    circle.getRadius()*Math.sin((2*(Math.PI/5))), circle.getRadius()*Math.cos((2*(Math.PI/5))),
				    
				    
					   -circle.getRadius()*Math.sin((2*(Math.PI/5))), circle.getRadius()*Math.cos((2*(Math.PI/5))) ,
				    
				    
						});
			
			polygon.setFill(Color.GHOSTWHITE);
			polygon.setRotate(35);
			//circle.setRotate(20);
			polygon.setTranslateX(400);
			polygon.setTranslateY(300);
			
			
			
			Button boton=new Button("EMPEZAR JUEGO");
			
			
			int cont=1;
			//do {
				
				boton.setOnMousePressed(new EventHandler<MouseEvent>() {
				      @Override public void handle(MouseEvent event) {
				    	  
				    	  
				    	  pane.getChildren().removeAll(circle1,circle2,circle3,circle,polygon);
				    	  crearEscudo();
				    	  metodoprueba();
				    	  boton.setVisible(false);
				    	  
				    	  
				    	  //pane.getChildren().addAll( g, text,text1);

							
							//g.getChildren().addAll(circle1,circle2,circle3,circle,polygon);

						
				    	  //escudof.esc.setTranslateX(30);
				    	 // showPoints();
				    	 // text1.setText(Double.toString(escudof.puntosfinales	));

				    	  
				      }

					

					private double getradio() {
						// TODO Auto-generated method stub
						Random generadorAleatorios = new Random();
					    double radio = 10+generadorAleatorios.nextInt(100);
					    return radio;
					}

					private void showPoints() {
						// TODO Auto-generated method stub
						 // while(escudof1.estado==true){
						//		text1.setText(Double.toString(escudof.puntosfinales	));
				    		//  }
						
						
					}
				      
				      
				    });
				
				pane.setOnMouseMoved(new EventHandler<MouseEvent>(){

					@Override
					public void handle(MouseEvent event) {
						// TODO Auto-generated method stub
						String msj =
						          "(x: "       + event.getX()      + ", y: "       + event.getY()       + ") -- " +
						          "(sceneX: "  + event.getSceneX() + ", sceneY: "  + event.getSceneY()  + ") -- " +
						          "(screenX: " + event.getScreenX()+ ", screenY: " + event.getScreenY() + ")";
						text.setText(msj);
						
					}
					
				});
				
				
			//} 
			//while(cont<=7);
						
				
			//pane.setRotate(70);
			//pane1.getChildren().addAll(circle1,circle2,circle3,circle,polygon);
			
		    //g.getChildren().addAll(circle1,circle2,circle3,circle,polygon);
		  
		    /*  g1.getChildren().addAll(circle1,circle2,circle3,circle,polygon);
		    g2.getChildren().addAll(circle1,circle2,circle3,circle,polygon);
		    g3.getChildren().addAll(circle1,circle2,circle3,circle,polygon);
		    g4.getChildren().addAll(circle1,circle2,circle3,circle,polygon);
		    g5.getChildren().addAll(circle1,circle2,circle3,circle,polygon);
		    g6.getChildren().addAll(circle1,circle2,circle3,circle,polygon);
		    
		    g1.relocate(20, 20);
		    g2.scaleXProperty();
		    g2.scaleYProperty();
		    g3.resize(30, 22);
		    g3.relocate(80, 100);*/
				
			
		    pane.getChildren().addAll( circle1,circle2,circle3,circle,polygon, boton);
			//pane1.getChildren().addAll(escudof1.esc);
			//pane.setRotate(70);
			primaryStage.setTitle("Juego");
			primaryStage.setScene(scene);
			primaryStage.show();
			
			
}

		public static void setPuntos(double points) {
			// TODO Auto-generated method stub
	    	  System.out.println("estos son lso puntos que llegan a el panel "+points);

			puntos=points+puntos;
			
		}
		
}