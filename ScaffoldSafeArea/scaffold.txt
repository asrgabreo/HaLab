import 'package:flutter/material.dart';

void main() {
  runApp(MaterialApp(
    home: Scaffold(
      appBar: AppBar(
        title: const Text('Safe area and Scaffold'),
        centerTitle: true,
      ),
      backgroundColor: Colors.blueAccent,
      body: const Center(
        child: SafeArea(
            child: Text('With safe area and Scaffold',
              style: TextStyle(color: Colors.black, fontSize: 30),
            )
        ),
      ),
    ),
  ));
}