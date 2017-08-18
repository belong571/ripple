package com.imall.react_native_ripple.manager;

import android.util.Log;
import android.view.View;

import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.imall.react_native_ripple.R;
import com.imall.react_native_ripple.view.RippleView;

/**
 * Created by belong71 on 2017/1/10.
 */
public class RippleManager extends ViewGroupManager<RippleView> {

    private RippleView rippleView;

    @Override
    public String getName() {
        return "RCTRipple";
    }

    @Override
    protected RippleView createViewInstance(final ThemedReactContext reactContext) {
        Log.e("TAG", "createViewInstance");
        View view = View.inflate(reactContext, R.layout.ripple, null);
        rippleView = (RippleView) view.findViewById(R.id.rect);
        rippleView.setOnRippleCompleteListener(new RippleView.OnRippleCompleteListener() {
            @Override
            public void onComplete(RippleView rippleView) {
                Log.e("TAG","水波纹动画完成");
                reactContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class).emit("RIPPLE_COMPLETE","RIPPLE_COMPLETE");
            }
        });
        return rippleView;
    }


    /**
     * 设置水波纹的透明度,默认值90
     * @param rippleAlpha
     */
    @ReactProp(name = "rippleAlpha")
    public void setRippleAlpha(RippleView rippleView, int rippleAlpha) {
        Log.e("TAG", "setRippleAlpha");
        rippleView.setRippleAlpha(rippleAlpha);
    }

    /**
     * 设置水波纹的颜色
     * @param rippleColor
     * @param
     */
    @ReactProp(name = "rippleColor")
    public void setRippleColor(RippleView rippleView, String rippleColor) {
        Log.e("TAG", "setRippleColor");
        Log.e("TAG","rippleColor   "+rippleColor);
        //rippleView.setRippleColor(Color.parseColor(rippleColor));
    }

    /**
     * 设置水波纹的类型
     * @param rippleType
     * @param
     */
    @ReactProp(name = "rippleType")
    public void setRippleType(RippleView rippleView, String rippleType) {
        Log.e("TAG", "setRippleType");
        if ("DOUBLE".equals(rippleType))
            rippleView.setRippleType(RippleView.RippleType.DOUBLE);
        else if("SIMPLE".equals(rippleType))
            rippleView.setRippleType(RippleView.RippleType.SIMPLE);
        else if("RECTANGLE".equals(rippleType))
            rippleView.setRippleType(RippleView.RippleType.RECTANGLE);
    }

    /**
     * 设置水波纹是否在中间显示,默认为false
     * @param centered
     */
    @ReactProp(name = "centered")
    public void setCentered(RippleView rippleView, boolean centered) {
        Log.e("TAG", "setCentered");
        rippleView.setCentered(centered);
    }

    /**
     * 设置水波纹的内边距，默认值为0
     * @param ripplePadding
     */
    @ReactProp(name = "ripplePadding")
    public void setRipplePadding(RippleView rippleView, int  ripplePadding) {
        Log.e("TAG", "setRipplePadding");
        rippleView.setRipplePadding(ripplePadding);
    }

    /**
     * 设置水波纹的子view是否要进行缩放
     * @param zooming
     */
    @ReactProp(name = "zooming")
    public void setZooming(RippleView rippleView, boolean zooming) {
        Log.e("TAG", "setZooming");
        rippleView.setZooming(zooming);
    }


    /**
     * 设置水波纹的子view缩放的比例
     * @param zoomScale
     */
    @ReactProp(name = "zoomScale")
    public void setZoomScale(RippleView rippleView, float zoomScale) {
        Log.e("TAG", "setZoomScale");
        rippleView.setZoomScale(zoomScale);
    }

    /**
     * 设置水波纹的子view缩放的持续时间
     * @param zoomDuration
     */
    @ReactProp(name = "zoomDuration")
    public void setZoomDuration(RippleView rippleView, int zoomDuration) {
        Log.e("TAG", "setZoomDuration");
        rippleView.setZoomDuration(zoomDuration);
    }


    /**
     * 设置水波纹的持续时间
     * @param rippleDuration
     */
    @ReactProp(name = "rippleDuration")
    public void setRippleDuration(RippleView rippleView, int rippleDuration) {
        Log.e("TAG", "setRippleDuration");
        rippleView.setRippleDuration(rippleDuration);
    }

    /**
     * 设置水波纹动画的速率
     * @param frameRate
     */
    @ReactProp(name = "frameRate")
    public void setFrameRate(RippleView rippleView, int  frameRate) {
        Log.e("TAG", "setFrameRate");
        rippleView.setFrameRate(frameRate);
    }
}
