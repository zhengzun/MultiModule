import React, {Component} from 'react';
import {View, Image, Text, StyleSheet} from 'react-native';

class TitleView extends Component{
	static defaultProps = {
		title: 'TitleView'
	};

	render() {
		return (
			<View style={styles.container}>
				<Image source={{uri: 'ic_back'}} style={{width:20, height:20}} />
				<Text style={styles.titleView}> {this.props.title} </Text>
				<Text style={styles.titleView}> 我 </Text>
			</View>
		)
	}


				//<Text style={styles.titleView}> {this.props.title} </Text>
				// <Image source={{uri: 'ic_back'}} style={{width:20, height:20}} />

}

var styles = StyleSheet.create({
  container: {
  	flexDirection: 'row',
  	justifyContent: 'space-between',
  	alignItems: 'center',
    height : 60,
    backgroundColor:'#007aff',
    paddingLeft: 12,
    paddingRight: 12,
  },
  titleView: {
    fontSize: 15,
    textAlign: 'center',
  },
});

export default TitleView;