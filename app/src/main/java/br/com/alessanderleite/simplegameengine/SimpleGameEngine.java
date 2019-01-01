package br.com.alessanderleite.simplegameengine;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
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

        public GameView(Context context) {
            super(context);
        }

        // GameView class will go here
        @Override
        public void run() {

        }
    }
}
