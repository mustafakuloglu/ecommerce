//package gm.com.ecommerce.utils;
//
//import android.app.Activity;
//import android.os.Build;
//import android.view.View;
//import android.widget.ImageView;
//import android.widget.TextView;
//
//import butterknife.BindView;
//import butterknife.ButterKnife;
//import gm.com.ecommerce.R;
//
///**
// * Created by musta on 28.07.2016.
// */
//public class ViewClick {
//    Activity ac;
//@BindView(R.id.a_l_1)TextView a1;
//@BindView(R.id.a_l_2)TextView a2;
//@BindView(R.id.a_l_3)TextView a3;
//@BindView(R.id.a_l_4)TextView a4;
//@BindView(R.id.a_l_5)TextView a5;
//@BindView(R.id.circle_1)ImageView circle1;
//@BindView(R.id.circle_2)ImageView circle2;
//@BindView(R.id.circle_3)ImageView circle3;
//@BindView(R.id.circle_4)ImageView circle4;
//@BindView(R.id.circle_5)ImageView circle5;
//@BindView(R.id.check_l_1)ImageView check1;
//@BindView(R.id.check_l_2)ImageView check2;
//@BindView(R.id.check_l_3)ImageView check3;
//@BindView(R.id.check_l_4)ImageView check4;
//    public  ViewClick(Activity activity)
//    {
//        ButterKnife.bind(activity);
//ac=activity;
//    }
//    public void click(int id)
//    {
//        if(id==1)
//        {
//            if(circle1.getVisibility()== View.GONE)
//            {
//                circle1.setVisibility(View.VISIBLE);
//                circle2.setVisibility(View.GONE);
//                circle3.setVisibility(View.GONE);
//                circle4.setVisibility(View.GONE);
//                circle5.setVisibility(View.GONE);
//                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
//                    a1.setTextColor(ac.getColor(R.color.md_white_1000));
//                    a2.setTextColor(ac.getColor(R.color.black_text));
//                    a3.setTextColor(ac.getColor(R.color.black_text));
//                    a4.setTextColor(ac.getColor(R.color.black_text));
//                    a5.setTextColor(ac.getColor(R.color.black_text));
//                }
//            }
//        }
//        if(id==2)
//        {
//            if(circle2.getVisibility()== View.GONE)
//            {
//                circle2.setVisibility(View.VISIBLE);
//                circle1.setVisibility(View.GONE);
//                circle3.setVisibility(View.GONE);
//                circle4.setVisibility(View.GONE);
//                circle5.setVisibility(View.GONE);
//                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
//                    a2.setTextColor(ac.getColor(R.color.md_white_1000));
//                    a1.setTextColor(ac.getColor(R.color.black_text));
//                    a3.setTextColor(ac.getColor(R.color.black_text));
//                    a4.setTextColor(ac.getColor(R.color.black_text));
//                    a5.setTextColor(ac.getColor(R.color.black_text));
//                }
//            }
//        }
//        if(id==3)
//        {
//            if(circle3.getVisibility()== View.GONE)
//            {
//                circle3.setVisibility(View.VISIBLE);
//                circle2.setVisibility(View.GONE);
//                circle1.setVisibility(View.GONE);
//                circle4.setVisibility(View.GONE);
//                circle5.setVisibility(View.GONE);
//                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
//                    a3.setTextColor(ac.getColor(R.color.md_white_1000));
//                    a2.setTextColor(ac.getColor(R.color.black_text));
//                    a1.setTextColor(ac.getColor(R.color.black_text));
//                    a4.setTextColor(ac.getColor(R.color.black_text));
//                    a5.setTextColor(ac.getColor(R.color.black_text));
//                }
//            }
//        }
//        if(id==4)
//        {
//            if(circle4.getVisibility()== View.GONE)
//            {
//                circle4.setVisibility(View.VISIBLE);
//                circle2.setVisibility(View.GONE);
//                circle3.setVisibility(View.GONE);
//                circle1.setVisibility(View.GONE);
//                circle5.setVisibility(View.GONE);
//                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
//                    a4.setTextColor(ac.getColor(R.color.md_white_1000));
//                    a2.setTextColor(ac.getColor(R.color.black_text));
//                    a3.setTextColor(ac.getColor(R.color.black_text));
//                    a1.setTextColor(ac.getColor(R.color.black_text));
//                    a5.setTextColor(ac.getColor(R.color.black_text));
//                }
//            }
//        }
//        if(id==5)
//        {
//            if(circle5.getVisibility()== View.GONE)
//            {
//                circle5.setVisibility(View.VISIBLE);
//                circle2.setVisibility(View.GONE);
//                circle3.setVisibility(View.GONE);
//                circle4.setVisibility(View.GONE);
//                circle1.setVisibility(View.GONE);
//                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
//                    a5.setTextColor(ac.getColor(R.color.md_white_1000));
//                    a2.setTextColor(ac.getColor(R.color.black_text));
//                    a3.setTextColor(ac.getColor(R.color.black_text));
//                    a4.setTextColor(ac.getColor(R.color.black_text));
//                    a1.setTextColor(ac.getColor(R.color.black_text));
//                }
//            }
//        }
//        if(id==6)
//        {
//            if(check1.getVisibility()== View.GONE)
//            {
//                check1.setVisibility(View.VISIBLE);
//                check2.setVisibility(View.GONE);
//                check3.setVisibility(View.GONE);
//                check4.setVisibility(View.GONE);
//
//            }
//        }
//        if(id==7)
//        {
//            if(check2.getVisibility()== View.GONE)
//            {
//                check2.setVisibility(View.VISIBLE);
//                check1.setVisibility(View.GONE);
//                check3.setVisibility(View.GONE);
//                check4.setVisibility(View.GONE);
//
//            }
//        }
//        if(id==8)
//        {
//            if(check3.getVisibility()== View.GONE)
//            {
//                check3.setVisibility(View.VISIBLE);
//                check2.setVisibility(View.GONE);
//                check1.setVisibility(View.GONE);
//                check4.setVisibility(View.GONE);
//
//            }
//        }
//        if(id==9)
//        {
//            if(check4.getVisibility()== View.GONE)
//            {
//                check4.setVisibility(View.VISIBLE);
//                check2.setVisibility(View.GONE);
//                check3.setVisibility(View.GONE);
//                check1.setVisibility(View.GONE);
//
//            }
//        }
//    }
//
//
//}
