package com.runkevich8.gmail.test.homework.hw4;


import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

import java.util.Date;

public class CustomViewClock extends View {
    private Paint paintCustomViewClock;
    private float radius;
    private float cx;
    private float cy;

    public CustomViewClock(Context context) {
        super(context);
        init();
    }

    public CustomViewClock(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public CustomViewClock(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public CustomViewClock(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init();
    }

    private void init(){
        paintCustomViewClock = new Paint();
        paintCustomViewClock.setColor(Color.GRAY);
        paintCustomViewClock.setAntiAlias(true);//плавные края делает

    }

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);

        cx = w/2;
        cy = h/2;
        radius = w>h ?cx/2 : cy/2;

    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        canvas.drawCircle(cx,cy,radius, paintCustomViewClock);

        paintCustomViewClock.setColor(Color.BLACK);
        paintCustomViewClock.setStrokeWidth(10);

        for (int i = 0; i < 12; i++) {
            canvas.rotate(30, cx, cy);
            canvas.drawLine(cx / 4, cy, cx / 6, cy, paintCustomViewClock);
            paintCustomViewClock.setTextSize(60);
//            if (i == 2) {
//               canvas.drawText("0",cx/4,cy,paintCustomViewClock);
//            }
//            if (i == 5) {
//                canvas.drawText("3",cx/4,cy,paintCustomViewClock);
//            }
//            if (i == 8) {
//               canvas.drawText("6",cx/4,cy,paintCustomViewClock);
//            }
//            if (i == 11) {
//                canvas.drawText("9",cx/4,cy,paintCustomViewClock);
//            }
        }

        canvas.drawText("9",cx/4,cy,paintCustomViewClock);
        canvas.drawText("3",(radius+(cx/2)+(cx/3)+(cx/15)),cy,paintCustomViewClock);
        canvas.drawText("12",cx,cy-(cy/3)-(cy/12),paintCustomViewClock);
        canvas.drawText("6",cx,cy+(cy/3)+(cy/10),paintCustomViewClock);

        canvas.save();
        Date currentTime = new Date();

        canvas.rotate(30*currentTime.getHours()+currentTime.getMinutes()/3,cx,cy);
        canvas.drawLine(cx,cy,cx,cy-(radius*0.6f),paintCustomViewClock);
        canvas.restore();

    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {

        switch (event.getAction()){

            case MotionEvent.ACTION_DOWN:{
                break;
            }
            case MotionEvent.ACTION_UP:{
                break;
            }
            case MotionEvent.ACTION_MOVE:{

                return false;
            }
        }
        return true;
    }
}
