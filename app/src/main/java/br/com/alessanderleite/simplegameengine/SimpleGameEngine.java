package br.com.alessanderleite.simplegameengine;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.SurfaceView;

public class SimpleGameEngine extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    // Here is our implementation of GameView
    // It is an inner class.
    // Note how the final closing curly brace }
    // is inside SimpleGameEngine
    class GameView extends SurfaceView implements Runnable {

        public GameView(Context context) {
            super(context);
        }

        @Override
        public void run() {

        }
    }
}
