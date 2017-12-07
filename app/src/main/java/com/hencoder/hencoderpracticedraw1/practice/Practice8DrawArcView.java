package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.view.View;

public class Practice8DrawArcView extends View {

    private Paint paint;

    public Practice8DrawArcView(Context context) {
        super(context);
    }

    public Practice8DrawArcView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        paint = new Paint(Paint.ANTI_ALIAS_FLAG);

    }

    public Practice8DrawArcView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawArc() 方法画弧形和扇形
        //startAngle: 起始角度， sweepAngle扫过的角度; useCenter：是否连接圆心
        paint.setStyle(Paint.Style.FILL);
        //画扇形
        canvas.drawArc(200, 300, 800, 500, 0, -110, true, paint);

        //画弧形
        canvas.drawArc(200, 300, 800, 500, 30, 100, false, paint);

        //画弧线；
        paint.setStyle(Paint.Style.STROKE);
        canvas.drawArc(200, 300, 800, 500, -130, -60, false, paint);


    }
}
