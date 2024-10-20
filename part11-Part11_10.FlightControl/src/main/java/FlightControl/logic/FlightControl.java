package FlightControl.logic;

import java.util.Collection;
import java.util.HashMap;

import FlightControl.domains.Airplane;
import FlightControl.domains.Flight;
import FlightControl.domains.Place;

public class FlightControl {
      private HashMap<String, Airplane> airplanes;
    private HashMap<String, Place> places;
    private HashMap<String, Flight> flights;

    public FlightControl(HashMap<String, Airplane> airplanes, HashMap<String, Place> places, HashMap<String, Flight> flights) {
        this.airplanes = airplanes;
        this.places = places;
        this.flights = flights;
    }

    public void addPlane(String ID, int Capacity) {
        Airplane airplane = new Airplane(ID, Capacity);
        airplanes.put(ID, airplane);
    }

    public void addFlight(Airplane airplane, String departureID, String targetID) {
        Place departure = new Place(departureID);
        Place target = new Place(targetID);
        Flight flight = new Flight(airplane, departure, target);

        flights.put(flight.toString(), flight);
        places.putIfAbsent(departureID, departure);
        places.putIfAbsent(targetID, target);
    }

    public HashMap<String, Airplane> getAirplanes() {
        return airplanes;
    }

    public HashMap<String, Place> getPlaces() {
        return places;
    }

    public Collection<Flight> getFlights() {
        return flights.values();
    }

    public Airplane getAirplane(String ID) {
        return this.airplanes.get(ID);
    }
}
