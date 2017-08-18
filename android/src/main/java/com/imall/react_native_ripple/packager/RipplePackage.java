package com.imall.react_native_ripple.packager;

import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;
import com.imall.react_native_ripple.manager.RippleManager;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by belong71 on 2017/1/10.
 */
public class RipplePackage implements ReactPackage {
    @Override
    public List<NativeModule> createNativeModules(ReactApplicationContext reactContext) {
        return Collections.emptyList();
    }

    @Override
    public List<Class<? extends JavaScriptModule>> createJSModules() {
        return Collections.emptyList();
    }

    @Override
    public List<ViewManager> createViewManagers(ReactApplicationContext reactContext) {
        List<ViewManager> list=new ArrayList<>();
        list.add(new RippleManager());
        return list;
    }
}
