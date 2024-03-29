package ricoh.opengljava;

import android.app.Activity;
import android.opengl.GLSurfaceView;
import android.os.Bundle;
import android.util.Log;


public class MainActivity extends Activity {
    private GLSurfaceView mGLSurfaceView;
    private GLSurfaceView mGLSurfaceView2;
    private static final String TAG = "ooopppp";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init() {
        mGLSurfaceView = (GLSurfaceView) findViewById(R.id.main_gl);
        mGLSurfaceView.setEGLContextClientVersion(2);
        mGLSurfaceView.setRenderer(new MyRender());
//        mGLSurfaceView.setRenderMode(GLSurfaceView.RENDERMODE_WHEN_DIRTY);

        mGLSurfaceView2 = (GLSurfaceView) findViewById(R.id.main_gl2);
        mGLSurfaceView2.setEGLContextClientVersion(2);
        mGLSurfaceView2.setRenderer(new NativeRender());
//        mGLSurfaceView2.setRenderMode(GLSurfaceView.RENDERMODE_WHEN_DIRTY);
    }
}
