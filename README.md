
# react-native-enhance

Enhance support for **Android**

## Getting started

`$ npm install react-native-enhance --save`

### Mostly automatic installation

`$ react-native link react-native-enhance`

### Manual installation


#### Android

1. Open up `android/app/src/main/java/[...]/MainActivity.java`
  - Add `import me.jerson.mobile.ads.enhance.RNEnhancePackage;` to the imports at the top of the file
  - Add `new RNEnhancePackage()` to the list returned by the `getPackages()` method
2. Append the following lines to `android/settings.gradle`:
  	```
  	include ':react-native-enhance'
  	project(':react-native-enhance').projectDir = new File(rootProject.projectDir, 	'../node_modules/react-native-enhance/android')
  	```
3. Insert the following lines inside the dependencies block in `android/app/build.gradle`:
  	```
      compile project(':react-native-enhance')
  	```
4. Add `FGL-Enhance-Connector.jar` to your `android/app/libs/enhance` dir

 
## Usage
```javascript
import Enhance from 'react-native-enhance';

  Enhance.logEvent(event, key = "", value = "");
  Enhance.hideOverlayAd();
  Enhance.showOverlayAdWithPosition(position);
  Enhance.showInterstitialAd();
  Enhance.showSpecialOffer();

```
  