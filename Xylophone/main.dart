import 'package:flutter/material.dart';
import 'package:audioplayers/audioplayers.dart';

void main() {
  runApp(MaterialApp(
      home: Scaffold(
        appBar: AppBar(
          title: const Text('XYLOPHONE'),
          centerTitle: true,
        ),
        body: const XyloPhone(),
      )
  ));
}

class XyloPhone extends StatelessWidget {
  const XyloPhone({Key? key}) : super(key: key);
  void playAudio(int noteNumber) {
    final player = AudioCache();
    player.play("note$noteNumber.wav");
  }

  Expanded buildKey({required int sno, required Color color}) {
    return Expanded(
      child: TextButton(
        style: TextButton.styleFrom(backgroundColor: color),
        onPressed: () {
          playAudio(sno);
        },
        child: Text(
          '$sno',
          style: const TextStyle(
            color: Colors.black,
          ),
        ),
      ),
    );
  }

  @override
  Widget build(BuildContext context) {
    return Column(
      crossAxisAlignment: CrossAxisAlignment.stretch,
      children: [
        buildKey(sno: 1, color: Colors.red),
        buildKey(sno: 2, color: Colors.blue),
        buildKey(sno: 3, color: Colors.yellow),
        buildKey(sno: 4, color: Colors.orange),
        buildKey(sno: 5, color: Colors.pink),
        buildKey(sno: 6, color: Colors.brown),
        buildKey(sno: 7, color: Colors.green),
      ],
    );
  }
}
