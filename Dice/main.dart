import 'dart:math';
import 'package:flutter/material.dart';

void main() {
  return (runApp(MaterialApp(
    home: Scaffold(
      backgroundColor: Colors.blueAccent,
      appBar: AppBar(
        title: const Text('Dice'),
      ),
      body: DicePage(),
    ),
  )));
}

class DicePage extends StatefulWidget {
  @override
  _DicePageState createState() => _DicePageState();
}

class _DicePageState extends State<DicePage> {
  int left = 1;
  int right = 1;

  void changeFace() {
    setState(() {
      left = Random().nextInt(6) + 1;
      right = Random().nextInt(6) + 1;
    });
  }

  @override
  Widget build(BuildContext context) {
    return Center(
      child: Row(
        children: <Widget>[
          Expanded(
            child: TextButton(
              child: Image.asset('images/dice$left.png'),
              onPressed: () {
                changeFace();
              },
            ),
          ),
          Expanded(
            child: TextButton(
              child: Image.asset('images/dice$right.png'),
              onPressed: () {
                changeFace();
              },
            ),
          ),
        ],
      ),
    );
  }
}
