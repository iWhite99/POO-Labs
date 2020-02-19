package storage;

import communication.ServerMessage;
import main.Utils;

import java.util.Observable;

public class ServerCommunicationController implements java.util.Observer {
  @Override
  public void update(Observable observable, Object o) {
//    ServerMessage serverMessage = new ServerMessage(0, 0, 0);
    SensorData sensorData = (SensorData) o;
    ServerMessage serverMessage = new ServerMessage(sensorData.getStepsCount(),
            Utils.getClientId(), sensorData.getTimestamp());
    System.out.println("Message " + serverMessage.toString() + " has been sent to the server");
  }
}
