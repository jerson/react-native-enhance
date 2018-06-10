
package me.jerson.mobile.ads.enhance;

import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.module.annotations.ReactModule;
import com.fgl.enhance.connector.FglEnhance;

public class RNEnhanceModule extends ReactContextBaseJavaModule
    implements MainApplication.ServiceListener, LifecycleEventListener {

  private static final String TAG = "RNEnhance";
  private ReactApplicationContext context;
  private boolean isLoaded;

  public RNEnhanceModule(ReactApplicationContext reactContext) {
    super(reactContext);
    this.reactContext = reactContext;
    this.reactContext.addLifecycleEventListener(this);
  }

  @Override
  public String getName() {
    return "RNEnhance";
  }

  @ReactMethod
  public void logEvent(String event, String key, String value) {
    FglEnhance.logEvent(event, key, value);
  }

  @ReactMethod
  public void hideOverlayAd() {
    FglEnhance.hideOverlayAd();

  }

  @ReactMethod
  public void showOverlayAdWithPosition(String adPosition) {
    FglEnhance.showOverlayAdWithPosition(getAdPositionFromString(adPosition));

  }

  @ReactMethod
  public void showInterstitialAd() {
    if (FglEnhance.isInterstitialReady()) {
      FglEnhance.showInterstitialAd();
    }
  }

  @ReactMethod
  public void showSpecialOffer() {
    if (FglEnhance.isSpecialOfferReady()) {
      FglEnhance.showSpecialOffer();
    }
  }

  private FglEnhance.Position getAdPositionFromString(String adPosition) {
    switch (adPosition) {
    case "top":
      return FglEnhance.Position.TOP;
    case "bottom":
    default:
      return FglEnhance.Position.BOTTOM;
    }
  }

  @Override
  public void onHostResume() {

  }

  @Override
  public void onHostPause() {

  }

  @Override
  public void onHostDestroy() {

  }

}
