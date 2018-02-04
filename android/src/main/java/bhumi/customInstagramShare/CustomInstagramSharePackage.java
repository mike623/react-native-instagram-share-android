package bhumi.customInstagramShare;

import android.app.Activity;

import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CustomInstagramSharePackage implements ReactPackage {

    private Activity mActivity = null;

    public CustomInstagramSharePackage(Activity activity) {
        mActivity = activity;
    }

    
    public List<NativeModule> createNativeModules(
                              ReactApplicationContext reactContext) {
        List<NativeModule> modules = new ArrayList<>();

        modules.add(new CustomInstagramShareModule(reactContext, mActivity));

        return modules;
      }


    public List<Class<? extends JavaScriptModule>> createJSModules() {
  	return Collections.emptyList();
  }

    public List<ViewManager> createViewManagers(
                            ReactApplicationContext reactContext) {
  	return Collections.emptyList();
  }
}
