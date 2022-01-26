import core.Line;
import core.Station;
import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RouteCalculatorTest extends TestCase {

    List<Station> test1 = new ArrayList<>();
    List<Station> test2 = new ArrayList<>();
    List<Station> test3 = new ArrayList<>();
    List<Station> test4 = new ArrayList<>();
    List<Station> test4act = new ArrayList<>();
    List<Station> test5 = new ArrayList<>();
    List<Station> test5act = new ArrayList<>();
    List<Station> test6 = new ArrayList<>();
    List<Station> test6act = new ArrayList<>();
    List<Station> test7 = new ArrayList<>();
    List<Station> test7act = new ArrayList<>();

    @Override
    protected void setUp() throws Exception {
        Line line1 = new Line(1, "Линия №1");
        Line line2 = new Line(2, "Линия №2");
        Line line3 = new Line(3, "Линия №3");
        test1.add(new Station("Первая", line1));
        test1.add(new Station("Вторая", line1));

        test2.add(new Station("Первая", line1));
        test2.add(new Station("Вторая", line2));

        test3.add(new Station("Первая", line1));
        Station one = new Station("Первая", line1);
        Station two = new Station("Вторая", line1);
        Station three = new Station("Третья", line1);
        line1.addStation(one);
        line1.addStation(two);
        line1.addStation(three);

        test4.add(one);
        test4.add(two);
        test4.add(three);
        RouteCalculator calculator4 = new RouteCalculator(new StationIndex());
        test4act = calculator4.getShortestRoute(one, three);

        StationIndex stationIndex5;
        RouteCalculator calculator5 = new RouteCalculator(stationIndex5 = new StationIndex());
        List<Station> connectionStations = new ArrayList<>();
        Station three5 = new Station("Третья", line2);
        Station four5 = new Station("Четвертая", line2);
        line2.addStation(three5);
        line2.addStation(four5);
        test5.add(one);
        test5.add(two);
        test5.add(three5);
        test5.add(four5);
        connectionStations.add(two);
        connectionStations.add(three5);
        stationIndex5.addConnection(connectionStations);
        test5act = calculator5.getShortestRoute(one, four5);

        StationIndex stationIndex6;
        RouteCalculator calculator = new RouteCalculator(stationIndex6 = new StationIndex());
        List<Station> connectionStations1 = new ArrayList<>();
        List<Station> connectionStations2 = new ArrayList<>();
        Station A = new Station("A", line2);
        Station B = new Station("B", line2);
        Station C = new Station("C", line2);
        Station I = new Station("I", line3);
        Station II = new Station("II", line3);
        Station III = new Station("III", line3);
        line2.addStation(A);
        line2.addStation(B);
        line2.addStation(C);
        line3.addStation(I);
        line3.addStation(II);
        line3.addStation(III);
        test6.add(one);
        test6.add(two);
        test6.add(three);
        test6.add(A);
        test6.add(B);
        test6.add(C);
        test6.add(I);
        test6.add(II);
        test6.add(III);
        connectionStations1.add(three);
        connectionStations1.add(A);
        connectionStations2.add(C);
        connectionStations2.add(I);
        stationIndex6.addConnection(connectionStations1);
        stationIndex6.addConnection(connectionStations2);
        test6act = calculator.getShortestRoute(one, III);

        StationIndex stationIndex7;
        RouteCalculator calculator7 = new RouteCalculator(stationIndex7 = new StationIndex());
        List<Station> connectionStations7 = new ArrayList<>();
        List<Station> connectionStations72 = new ArrayList<>();
        test7.add(one);
        test7.add(two);
        test7.add(three);
        test7.add(A);
        test7.add(B);
        test7.add(C);
        test7.add(I);
        test7.add(II);
        test7.add(III);
        Collections.reverse(test7);
        connectionStations7.add(three);
        connectionStations7.add(A);
        connectionStations72.add(C);
        connectionStations72.add(I);
        stationIndex7.addConnection(connectionStations7);
        stationIndex7.addConnection(connectionStations72);
        test7act = calculator7.getShortestRoute(III, one);
    }


    public void testRouteCalculatorDirect() {
        double actual = RouteCalculator.calculateDuration(test1);
        double expected = 2.5;
        System.out.println(actual + " - " + expected);
        assertEquals(expected, actual);
    }

    public void testRouteCalculatorOneChange() {
        double actual = RouteCalculator.calculateDuration(test2);
        double expected = 3.5;
        System.out.println(actual + " - " + expected);
        assertEquals(expected, actual);
    }

    public void testRouteCalculatorStandStill() {
        double actual = RouteCalculator.calculateDuration(test3);
        double expected = 0;
        System.out.println(actual + " - " + expected);
        assertEquals(expected, actual);
    }

    public void testGetRouteOnTheLine() {
        List<Station> actual = test4act;
        List<Station> expected = test4;
        System.out.println(actual + " - " + expected);
        assertEquals(expected, actual);
    }

    public void testGetRouteAnotherLine() {
        List<Station> actual = test5act;
        List<Station> expected = test5;
        System.out.println(actual + " - " + expected);
        assertEquals(expected, actual);
    }

    public void testGetRouteAnotherLineTwoConnections() {
        List<Station> actual = test6act;
        List<Station> expected = test6;
        System.out.println(actual + " - " + expected);
        assertEquals(expected, actual);
    }

    public void testGetRouteAnotherLineTwoConnectionsRevers() {
        List<Station> actual = test7act;
        List<Station> expected = test7;
        System.out.println(actual + " - " + expected);
        assertEquals(expected, actual);
    }
}
