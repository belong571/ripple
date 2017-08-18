import React, { PropTypes, Component } from 'react';
import { requireNativeComponent, View,Platform } from 'react-native';

var iface = {
  name: 'RCTRipple',
  propTypes: {
    rippleAlpha: PropTypes.number,
    rippleColor: PropTypes.string,
    rippleType: PropTypes.string,
    centered: PropTypes.bool,
    ripplePadding: PropTypes.number,
    zooming: PropTypes.bool,
    zoomScale: PropTypes.number,
    zoomDuration: PropTypes.number,
    rippleDuration: PropTypes.number,
    frameRate: PropTypes.number,
    ...View.propTypes // 包含默认的View的属性
  },
  
};
var MyRCTRipple = requireNativeComponent('RCTRipple', iface);

class MyView extends Component {

  render() {
    const {  style  } = this.props;
    return (
      <MyRCTRipple style={style}>
        {this.props.children}
      </MyRCTRipple>
    );
  }
}

// var MYRipple;

// if(Platform.OS === 'ios') {
// } else {
//   MYRipple=AndroidRipple;
// }

module.exports = MyView;






module.exports = MyView;