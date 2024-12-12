
// CustomView.java (Étape 2 : Vue personnalisée)
package com.example.finalexam;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

public class CustomView extends View {
    public CustomView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawColor(Color.CYAN);

        Paint paint = new Paint();
        paint.setColor(Color.BLACK);
        paint.setTextSize(50f);
        canvas.drawText("Vue personnalisée!", 50f, 50f, paint);
    }
}
