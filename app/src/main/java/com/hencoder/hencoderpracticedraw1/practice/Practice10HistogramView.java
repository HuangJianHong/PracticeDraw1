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
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(Color.WHITE);
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
        path.moveTo(100, 100);
        path.rLineTo(0, 500);
        path.rLineTo(800, 0);

        canvas.drawPath(path, paint);
        paint.setTextSize(20);
        canvas.drawText("froyo", 120, 630, paint);
        canvas.drawText("GB", 150, 630, paint);
        canvas.drawText("ICS", 180, 630, paint);
        canvas.drawText("JB", 210, 630, paint);
        canvas.drawText("KitKat", 240, 630, paint);
        canvas.drawText("L", 270, 630, paint);
        canvas.drawText("M", 280, 630, paint);
//        canvas.drawText();

    }
}
