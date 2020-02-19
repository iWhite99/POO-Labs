package storage;


import dataprocessing.BasicStepCountStrategy;
import dataprocessing.StepCountStrategy;
import dataprocessing.StepCountStrategyFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * Persists sensor data. Observable, its observers are notified when data is added it to.
 */
public class DataRepository extends java.util.Observable { // TODO make this an Observable
    List<SensorData> sensorData = new ArrayList<SensorData>();
    ConsoleLogger consoleLogger = new ConsoleLogger();
    ServerCommunicationController serverCommunicationController = new ServerCommunicationController();
    DataAggregator dataAggregator;

    public DataRepository(String strategyType) {
        dataAggregator = new DataAggregator(strategyType);
    }

    public void addData(SensorData dataRecord){
        sensorData.add(dataRecord);
        consoleLogger.update(this, dataRecord);
        serverCommunicationController.update(this, dataRecord);
        dataAggregator.update(this, dataRecord);
        // TODO
        // store data (e.g. in a List)
        // notifiy observers
    }

    public List<SensorData> getSensorData() {
        return sensorData;
    }

// TODO implement a method to get the stored data (needed by the strategies)
}


