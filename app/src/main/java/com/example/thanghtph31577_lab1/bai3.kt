package com.example.thanghtph31577_lab1

fun main() {
    var a = 0.0
    var b = 0.0
    println("Nhập a: ");
    var s = readln();
    if (s !=null) a = s.toDouble();

    println("Nhập b: ");
    s = readln();
    if (s !=null) b = s.toDouble();

    println("Tổng: " + (a+b));
    println("Hiệu: " + (a-b));
    println("Tích: " + (a*b));
    println("Thương: " + (a/b));



}