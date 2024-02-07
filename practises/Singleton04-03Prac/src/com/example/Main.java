package com.example;

public class Main {
  public static void main(String[] args) {
    
      //create a peersingleton ref and initialize it using the getinstance method
      PeerSingleton peerList01 = PeerSingleton.getInstance();
      PeerSingleton peerList02 = PeerSingleton.getInstance();
      
      for (String hostName:peerList01.getHostNames()){
          System.out.println("Host name: " + hostName);
      }
      
      System.out.println();
      for (String hostName:peerList02.getHostNames()){
          System.out.println("Host name: " + hostName);
      }
  }  
}
