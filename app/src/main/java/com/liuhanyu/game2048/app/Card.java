package com.liuhanyu.game2048.app;

import android.content.Context;
import android.view.Gravity;
import android.widget.FrameLayout;
import android.widget.TextView;

/**
 * Created by liuhanyu on 14-5-3.
 */
public class Card extends FrameLayout {

    public static String[] cardName = {"〇","一","二","三","四","五","六","七","八","九","十"};

    public Card(Context context){
        super(context);

        label = new TextView(getContext());
        label.setTextSize(32);
        label.setBackgroundColor(0x33ffffff);
        label.setGravity(Gravity.CENTER);

        LayoutParams lp = (LayoutParams) new LayoutParams(-1,-1);
        lp.setMargins(10, 10, 0, 0);
        addView(label, lp);

        setNum(0);
    }

    private int num = 0;

    public int getNum(){
        return num;
    }

    public void setNum(int num){
        this.num = num;

        if (num <= 0){
            label.setText("");
        }else {
            label.setText(cardName[(int)(Math.log((double) num)/Math.log((double) 2))]);
        }
    }

    public boolean equals(Card o){
        return getNum() == o.getNum();
    }

    private TextView label;
}
