import core.Line;
import core.Station;
import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RouteCalculatorTest extends TestCase {

    List<Station> route = new ArrayList<>();


    public void testRouteCalculatorDirect() {
        Line line1 = new Line(1, "Линия №1");
        route.add(new Station("Первая", line1));
        route.add(new Station("Вторая", line1));
        double actual = RouteCalculator.calculateDuration(route);
        double expected = 2.5;
        assertEquals(expected, actual);
    }

    public void testRouteCalculatorOneChange() {
        Line line1 = new Line(1, "Линия №1");
        Line line2 = new Line(2, "Линия №2");
        route.add(new Station("Первая", line1));
        route.add(new Station("Вторая", line2));
        double actual = RouteCalculator.calculateDuration(route);
        double expected = 3.5;
        assertEquals(expected, actual);
    }

    public void testRouteCalculatorStandStill() {
        Line line1 = new Line(1, "Линия №1");
        route.add(new Station("Первая", line1));
        double actual = RouteCalculator.calculateDuration(route);
        double expected = 0;
        assertEquals(expected, actual);
    }

    public void testGetRouteOnTheLine() {
        RouteCalculator calculator = new RouteCalculator(new StationIndex());
        Line line1 = new Line(1, "Линия №1");
        Station one = new Station("Первая", line1);
        Station two = new Station("Вторая", line1);
        Station three = new Station("Третья", line1);
        line1.addStation(one);
        line1.addStation(two);
        line1.addStation(three);
        route.add(one);
        route.add(two);
        route.add(three);
        List<Station> actual = calculator.getShortestRoute(one, three);
        List<Station> expected = route;
        assertEquals(expected, actual);
    }

    public void testGetRouteAnotherLine() {
        StationIndex stationIndex;
        RouteCalculator calculator = new RouteCalculator(stationIndex = new StationIndex());
        List<Station> connectionStations = new ArrayList<>();
        Line line1 = new Line(1, "Линия №1");
        Line line2 = new Line(2, "Линия №2");
        Station one = new Station("Первая", line1);
        Station two = new Station("Вторая", line1);
        Station three = new Station("Третья", line2);
        Station four = new Station("Четвертая", line2);
        line1.addStation(one);
        line1.addStation(two);
        line2.addStation(three);
        line2.addStation(four);
        route.add(one);
        route.add(two);
        route.add(three);
        route.add(four);
        connectionStations.add(two);
        connectionStations.add(three);
        stationIndex.addConnection(connectionStations);
        List<Station> actual = calculator.getShortestRoute(one, four);
        List<Station> expected = route;
        assertEquals(expected, actual);
    }

    public void testGetRouteAnotherLineTwoConnections() {
        StationIndex stationIndex;
        RouteCalculator calculator = new RouteCalculator(stationIndex = new StationIndex());
        List<Station> connectionStations1 = new ArrayList<>();
        List<Station> connectionStations2 = new ArrayList<>();
        Line line1 = new Line(1, "Линия №1");
        Line line2 = new Line(2, "Линия №2");
        Line line3 = new Line(3, "Линия №3");
        Station one = new Station("Первая", line1);
        Station two = new Station("Вторая", line1);
        Station three = new Station("Третья", line1);
        Station A = new Station("A", line2);
        Station B = new Station("B", line2);
        Station C = new Station("C", line2);
        Station I = new Station("I", line3);
        Station II = new Station("II", line3);
        Station III = new Station("III", line3);
        line1.addStation(one);
        line1.addStation(two);
        line1.addStation(three);
        line2.addStation(A);
        line2.addStation(B);
        line2.addStation(C);
        line3.addStation(I);
        line3.addStation(II);
        line3.addStation(III);
        route.add(one);
        route.add(two);
        route.add(three);
        route.add(A);
        route.add(B);
        route.add(C);
        route.add(I);
        route.add(II);
        route.add(III);
        connectionStations1.add(three);
        connectionStations1.add(A);
        connectionStations2.add(C);
        connectionStations2.add(I);
        stationIndex.addConnection(connectionStations1);
        stationIndex.addConnection(connectionStations2);
        List<Station> actual = calculator.getShortestRoute(one, III);
        List<Station> expected = route;
        assertEquals(expected, actual);
    }

    public void testGetRouteAnotherLineTwoConnectionsRevers() {
        StationIndex stationIndex;
        RouteCalculator calculator = new RouteCalculator(stationIndex = new StationIndex());
        List<Station> connectionStations1 = new ArrayList<>();
        List<Station> connectionStations2 = new ArrayList<>();
        Line line1 = new Line(1, "Линия №1");
        Line line2 = new Line(2, "Линия №2");
        Line line3 = new Line(3, "Линия №3");
        Station one = new Station("Первая", line1);
        Station two = new Station("Вторая", line1);
        Station three = new Station("Третья", line1);
        Station A = new Station("A", line2);
        Station B = new Station("B", line2);
        Station C = new Station("C", line2);
        Station I = new Station("I", line3);
        Station II = new Station("II", line3);
        Station III = new Station("III", line3);
        line1.addStation(one);
        line1.addStation(two);
        line1.addStation(three);
        line2.addStation(A);
        line2.addStation(B);
        line2.addStation(C);
        line3.addStation(I);
        line3.addStation(II);
        line3.addStation(III);
        route.add(one);
        route.add(two);
        route.add(three);
        route.add(A);
        route.add(B);
        route.add(C);
        route.add(I);
        route.add(II);
        route.add(III);
        Collections.reverse(route);
        connectionStations1.add(three);
        connectionStations1.add(A);
        connectionStations2.add(C);
        connectionStations2.add(I);
        stationIndex.addConnection(connectionStations1);
        stationIndex.addConnection(connectionStations2);
        List<Station> actual = calculator.getShortestRoute(III, one);
        List<Station> expected = route;
        assertEquals(expected, actual);
    }
}
