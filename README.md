# react-native-ripple-android
在ReactNative使用水波纹效果(仅限android) 

# preview
![](http://upload-images.jianshu.io/upload_images/6722970-3d51bbae8e86ae88.gif?imageMogr2/auto-orient/strip%7CimageView2/2/w/1080/q/50)

# installation
```
npm install react-native-ripple-android --save
```
```
react-native link
```
# example
```
'use strict';
import React, { Component, PropTypes } from "react";
import {
  View,
  Text,
  StyleSheet,
  Button
} from "react-native";
import Ripple from "react-native-ripple-android";

class RCTRipple extends Component {

  back() {
    setTimeout(() => {
      //执行跳转页面的逻辑
      const { navigator } = this.props;
      if (navigator) {
        navigator.pop();
      }
    }, 600);
  }

  render() {
    return (
      <View style={styles.container}>
        <Ripple style={{ width: 150, height: 40 }}>
          <Button
            title="Button"
            color="gray"
            onPress={()=>{}}
          />
        </Ripple>

        <Ripple
          style={{
            width: 150,
            height: 40,
            backgroundColor: "red",
            marginTop: 10
          }}
        >
          <View
            style={{
              flex: 1,
              justifyContent: "center",
              alignItems: "center",
              backgroundColor: "transparent"
            }}
          >
            <Text 
                style={{ 
                    color: "white", 
                    fontSize: 16, 
                    fontWeight: "bold" 
                }}
                >
              我是Text
            </Text>
          </View>
        </Ripple>

        <Ripple style={{ width: 150, height: 40, marginTop: 10 }}>
          <Button 
            color="blue" 
            title="返回上一页" 
            onPress={this.back.bind(this)} 
          />
        </Ripple>
      </View>
    );
  }
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    justifyContent: "center",
    alignItems: "center",
    backgroundColor: "#F5FCFF"
  },
});
```


# At last, 祝玩得愉快。


