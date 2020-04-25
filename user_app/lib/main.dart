import 'package:flutter/material.dart';
import 'package:http/http.dart' as http;

void main() => runApp(MyApp());

class MyApp extends StatelessWidget {
  // This widget is the root of your application.
  @override
  Widget build(BuildContext context) {
    final appBar = AppBar(
      title: Text(
        'Unit Converter',
        style: TextStyle(fontSize: 30.0, color: Colors.black),
      ),
      elevation: 0.0,
      backgroundColor: Colors.green[100],
      centerTitle: true,
    );

    return MaterialApp(
      title: 'Flutter Demo',
      theme: ThemeData(
        primarySwatch: Colors.blue,
      ),
      home: Container(
        child: FlatButton(
          color: Colors.blue,
          textColor: Colors.white,
          disabledColor: Colors.grey,
          disabledTextColor: Colors.black,
          padding: EdgeInsets.all(8.0),
          splashColor: Colors.blueAccent,
          onPressed: () {
            print("OKKKK");
            http.post(
              'http://localhost:8083/order',
              headers: <String, String>{
                'Content-Type': 'application/json; charset=UTF-8',
              }
            ).then((http.Response response) {
              print("Response status: ${response.statusCode}");
              print("Response body: ${response.contentLength}");
              print(response.headers);
              print(response.request);
              print(response.body);
            });
          },
          child: Text(
            "Flat Button",
            style: TextStyle(fontSize: 20.0),
          ),
        ),
      ),
    );
  }
}
