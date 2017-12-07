package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice10HistogramView extends View {

    private Paint paint;
    private Path path;

    public Practice10HistogramView(Context context) {
        super(context);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        paint = new Paint(Paint.ANTI_ALIAS_FLAG);
        path = new Path();
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画直方图
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(Color.WHITE);
        path.moveTo(100, 100);
        path.rLineTo(0, 500);
        path.rLineTo(1200, 0);
        canvas.drawPath(path, paint);    //画坐标轴

        int lefMargin = 120;
        int dx = 100;                       //直方图宽度
        int divider = 30;                   //直方图的间隔

        paint.setTextSize(40);
        String title[] ={"froyo", "GB", "ICS", "JB", "KitKat" , "L", "M"};
        for (int i = 0; i < title.length; i++) {
            canvas.drawText(title[i], i*dx+ (i+1)*divider + lefMargin, 630, paint);
        }
        canvas.drawText( "直方图", 400,700, paint);                   //画横坐标


        paint.setColor(Color.GREEN);             //画直方图
        paint.setStyle(Paint.Style.FILL);
        int height[] = {300,500,100,200,480,460,570};
        for (int i = 0; i < height.length; i++) {
            canvas.drawRect(i*dx+ (i+1)*divider + lefMargin, height[i], (i+1)*(dx+divider) + lefMargin, 600, paint);
        }
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(Color.WHITE);
    }
}
