'use strict';

import React from 'react';
import {
  AppRegistry,
  StyleSheet,
  Text,
  View
} from 'react-native';

import TitleViewComponent from './commonjs/TitleViewComponent';

class HelloWorldApp extends React.Component {
  render() {
    return (
      <View style={styles.container}>
        <TitleViewComponent title='TitleViewCC'/>
      
      </View>
    )
  }
}

//<Text>Hello world!</Text>

var styles = StyleSheet.create({
  container: {
    flexDirection: 'column',
    justifyContent: 'center',
  },
  hello: {
    fontSize: 20,
    textAlign: 'center',
    margin: 10,
  },
});

AppRegistry.registerComponent('helloas', () => HelloWorldApp);