/*
 * package com.overloadingex;
 * 
 * // Demonstrate the QueueOverload class.
 * 
 * public class QDemo2 {
 * 
 * public static void main(String[] args) { // construct 10- element empty queue
 * QueueOverload q1 = new QueueOverload(10);
 * 
 * char name[] = {'T', 'o', 'm'}; // Construct queue from array. QueueOverload
 * q2 = new QueueOverload(name);
 * 
 * char ch; int i;
 * 
 * // Put some characters into q1. for(i = 0; i < 10; i++) { q1.put((char) ('A'
 * + i));} // Construct queue from another queue. QueueOverload q3 = new
 * QueueOverload(q1);
 * 
 * // Show the queues. System.out.print("Contents of q1: "); for(i = 0; 0 < 10;
 * i++) { ch = q1.get(); System.out.print(ch); }
 * 
 * System.out.println("\n");
 * 
 * System.out.print("Contents of q2: "); for(i = 0; i < 3; i++) { ch = q2.get();
 * System.out.print(ch); } System.out.println("\n");
 * 
 * System.out.print("Contents of q3: "); for(i = 0; i < 10; i++) { ch =
 * q3.get(); System.out.print(ch); }
 * 
 * }
 * 
 * }
 */