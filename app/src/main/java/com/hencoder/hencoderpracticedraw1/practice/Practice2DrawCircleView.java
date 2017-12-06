package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

public class Practice2DrawCircleView extends View {

    private Paint paint;
    private int count;

    public Practice2DrawCircleView(Context context) {
        super(context);
    }

    public Practice2DrawCircleView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        paint = new Paint();
        paint.setAntiAlias(true);

    }

    public Practice2DrawCircleView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        count++;
        Log.i(Practice2DrawCircleView.class.getSimpleName(), "Count" + count);

//        练习内容：使用 canvas.drawCircle() 方法画圆
//        一共四个圆：1.实心圆 2.空心圆 3.蓝色实心圆 4.线宽为 20 的空心圆
          paint.setColor(Color.BLACK);
          paint.setStyle(Paint.Style.FILL);
          canvas.drawCircle(200, 150, 100, paint);

          paint.setStyle(Paint.Style.STROKE);
          paint.setStrokeWidth(2);
          canvas.drawCircle(500, 150, 100,  paint);

          paint.setColor(Color.BLUE);
          paint.setStyle(Paint.Style.FILL);
          paint.setStrokeWidth(2);
          canvas.drawCircle(200, 400, 100, paint);

          paint.setColor(Color.BLACK);
          paint.setStrokeWidth(40);
          paint.setStyle(Paint.Style.STROKE);
          canvas.drawCircle(500, 400, 100, paint);

    }
}
