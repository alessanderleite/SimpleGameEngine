package br.com.alessanderleite.simplegameengine;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

public class SimpleGameEngine extends Activity {

    // gameView will be the view of the game
    // It will also hold the logic of the game
    // and respond to screen touches as well
    GameView gameView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Initialize gameView and set it as the view
        gameView = new GameView(this);
        setContentView(gameView);
    }

    // Here is our implementation of GameView
    // It is an inner class.
    // Note how the final closing curly brace }
    // is inside SimpleGameEngine
    class GameView extends SurfaceView implements Runnable {

        // This is our thread
        Thread gameThread = null;

        //This is new. We need a SurfaceHolder
        // When we use Paint and Canvas in a thread
        // We will see it in action in the draw method soon.
        SurfaceHolder ourHolder;

        // A boolean which we will set and unset
        // when the game is running- or not
        volatile boolean playing;

        // A Canvas and a Paint object
        Canvas canvas;
        Paint paint;

        // This variable tracks the game frame rate
        long fps;

        // This is used to help calculate the fps
        private long timeThisFrame;

        // Declare an object of type Bitmap
        Bitmap bitmapBob;

        // Bob starts off not moving
        boolean isMoving = false;

        // He can walk at 150 pixels per second
        float walkSpeedPerSecond = 150;

        // He starts 10 pixels form the left
        float bobXPosition = 10;

        // When the we initialize (call new()) on gameView
        // This special constructor method runs
        public GameView(Context context) {
            // The next line of code asks the
            // SurfaceView class to set up our object
            // How kind.
            super(context);

            // Initialize ourHolder and paint objects
            ourHolder = getHolder();
            paint = new Paint();

            // Load Bob from his .png file
            bitmapBob = BitmapFactory.decodeResource(this.getResources(), R.drawable.bob);
        }

        // GameView class will go here
        @Override
        public void run() {

        }
    }
}
