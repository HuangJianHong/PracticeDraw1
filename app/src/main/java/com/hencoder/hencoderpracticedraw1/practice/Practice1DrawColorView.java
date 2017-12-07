package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.view.View;

public class Practice1DrawColorView extends View {

    private Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
    private Path path = new Path();

    public Practice1DrawColorView(Context context) {
        super(context);
    }

    public Practice1DrawColorView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        paint.setStyle(Paint.Style.STROKE);
    }

    public Practice1DrawColorView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawColor() 方法把 View 涂成黄色
//        黄色： Color.YELLOW
        canvas.drawColor(Color.YELLOW);

        path.moveTo(1,1);        //TODO
        path.lineTo(100, 100); //从坐标原点开始画，ViewPager切换会出现多画一笔; 所以添加了上面一句moveTo;
//////        path.rLineTo(200, 0);
        path.moveTo(200, 100);
        path.lineTo(200, 0);

//        path.moveTo(1,1);
//        path.lineTo(100, 100);
//        // 强制移动到弧形起点（无痕迹）
//        path.arcTo(100, 100, 300, 300, -90,
//                90, true);

        canvas.drawPath(path,paint);
    }
}
