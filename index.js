import { NativeModules, Platform } from "react-native";

const { RNEnhance } = NativeModules;

const TAG = "[Enhance]";
export class Enhance {
  static logEvent(event, key = "", value = "") {
    __DEV__ && console.debug(TAG, "logEvent", event, key, value);
    if (Platform.OS !== "android") {
      __DEV__ && console.warn(TAG, "not supported on", Platform.OS);
      return;
    }
    return RNEnhance.logEvent(event, key, value);
  }

  static hideOverlayAd() {
    __DEV__ && console.debug(TAG, "hideOverlayAd");
    if (Platform.OS !== "android") {
      __DEV__ && console.warn(TAG, "not supported on", Platform.OS);
      return;
    }
    return RNEnhance.hideOverlayAd();
  }

  static showOverlayAdWithPosition(position) {
    __DEV__ && console.debug(TAG, "showOverlayAdWithPosition", position);
    if (Platform.OS !== "android") {
      __DEV__ && console.warn(TAG, "not supported on", Platform.OS);
      return;
    }
    return RNEnhance.showOverlayAdWithPosition(position);
  }

  static showInterstitialAd() {
    __DEV__ && console.debug(TAG, "showInterstitialAd");
    if (Platform.OS !== "android") {
      __DEV__ && console.warn(TAG, "not supported on", Platform.OS);
      return;
    }
    return RNEnhance.showInterstitialAd();
  }

  static showSpecialOffer() {
    __DEV__ && console.debug(TAG, "showSpecialOffer");
    if (Platform.OS !== "android") {
      __DEV__ && console.warn(TAG, "not supported on", Platform.OS);
      return;
    }
    return RNEnhance.showSpecialOffer();
  }
}
